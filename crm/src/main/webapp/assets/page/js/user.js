layui.use(['table','form','laydate' ,'util'],function(){
		var $ = layui.$;
		//var layer = layui.layer;
		var table = layui.table;
		var form = layui.form;
		var laydate = layui.laydate;
		var util = layui.util;
		//页面渲染成功后，调用加载table数据。
		initTableData();
		
		// 绑定新增按钮事件
		$('#btn_add').on('click',function(){
			openBaseForm();
		});
		//弹窗 （新增+修改的表单）
		function openBaseForm(){
			return $.ajax({
				url:'user/form',
				type:'get',
				success:function(formHtml){
					//console.log(formHtml);
					layer.open({
						type:1,//0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）。
						title:'用户表单',
						content:formHtml,
						area: ['600px', '380px'],
						success: function(layero, index){
							//弹窗成功后的回调,
								//执行一个laydate实例
							  	laydate.render({
							    	elem: '#userBirthday' //指定元素
							  	});
						   		//让form表单 渲染一下。
								form.render();
						   		//绑定表单的提交事件
								buildFormSubmit();
								//绑定表单校验
								buildFormVerify();
						  }
					});
				}
			});
		}
		//绑定表单的提交事件
		function buildFormSubmit(){
			form.on('submit(submit_user_filter)',function(data){
				//console.log(data);
				var type='post';
				//如果form中隐藏域的主键 有值，则走修改通道，默认是新增通道。
				if($('#rowId').val()!=null && $('#rowId').val()!=''){
					type='put';
				}
				$.ajax({
					url:'user',
					type:type,
					data:$(data.form).serialize(),
					success:function(result){
						//console.log(result);
						if(result){
							//关闭弹窗
							//如果你想关闭最新弹出的层，直接获取layer.index即可
                            layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
							//加载数据
							initTableData();
						}
					}
				});
				return false;
			});
		}
		//绑定表单的校验
		function buildFormVerify(){
			//自定义表单校验
			form.verify({
				checkusercode:function(value, item){ //value：表单的值、item：表单的DOM对象
					//console.log(value);
					//console.log(item);
					var msg ='';
					//判断 当前的 input是否有 data-old数据，如果有这个数据和文本框中的数据是否一致。
					var $item = $(item);
					var oldVal = $item.data('old');
					// 如果满足 下列条件，则不需要做唯一性的校验
					if(oldVal!=null && oldVal!='' && oldVal==value){
						return msg;
					}else{ //否则需要做唯一性的校验
						$.ajax({
							type:'get',
							async:false,//(默认: true) 默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false。注意，同步请求将锁住浏览器，用户其它操作必须等待请求完成才可以执行。
							url:'user/checkusercode',
							data:{"userCode":value},
							success:function(result){
								if(result.code == 1){
									msg = result.msg;
								}
							}
						});
					}
					// 如果return 是有数据，则layui认为校验不同通过。
					// 如果return 为数据，或为空，layui会认为校验通过。
					return msg;
				}
			});
		}
		//加载table的数据
		function initTableData(){
			table.render({
			    elem: '#list_table'
			    //,height: auto
				//,toolbar: '#form_search_bar'
			    ,url: 'user/list' //数据接口 layui会自动的在URL的后追加 ?page=1&limit=10。
			    ,page: true //开启分页
				,limit:2 //每页显示的条数，默认值 10
			    ,cols: [[ //表头
			      {field: 'rowId', title: 'ID', width:80, sort: true, fixed: 'left'}
			      ,{field: 'userName', title: '用户名', width:80}
			      ,{field: 'userCode', title: '用户账号', width:180, sort: true}
			      ,{field: 'userSex', title: '性别', width:80,templet: '#userSexTpl'} 
			      ,{field: 'userBirthday', title: '用户生日', width: 177,templet:function(d){return util.toDateString(d.userBirthday, 'yyyy-MM-dd');}}
			      ,{field: '', title: '操作',toolbar:'#actionBar'}
			    ]]
			  });
		}
		
		//监听工具条
		////注：tool 是工具条事件名，table_user_filter 是 table 原始容器的属性 lay-filter="对应的值"
		table.on('tool(table_user_filter)',function(obj){
			var data = obj.data; //获得当前行数据
			//console.log(data);
  			var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
			//console.log(layEvent);
			switch(layEvent){
				case 'edit': //修改
					console.log(data);
					//弹窗
					openBaseForm().done(function(){
						//弹窗成功后，将要修改的数据 data,直接赋值给 form表单
						//给表单赋值
						//form_user_filter 即 class="layui-form" 所在元素属性 lay-filter="" 对应的值
						form.val("form_user_filter",data);
						//对日历重新进行赋值。
						$('#userBirthday').val(util.toDateString(data.userBirthday, 'yyyy-MM-dd'));
						//对需要进行唯一性的校验的input提供 data-old的数据
						// <input name="userCode" data-old ="zhangsan"/>
						$('#userCode').data('old',data.userCode);
					});
					break;
				case 'del':
				   layer.confirm('确定要删除吗?', {icon: 3, title:'系统提示'}, function(index){
						layer.close(index);
					    //从当前的行数据中取出主键的信息
						var rowId = data.rowId;
						//console.log(rowId);	
						$.ajax({
							url:'user/'+rowId,
							type:'delete',
							success:function(result){
								if(result){
									initTableData();
								}
							}
						});				  
					});
				   break;
			}
		});
		
	});
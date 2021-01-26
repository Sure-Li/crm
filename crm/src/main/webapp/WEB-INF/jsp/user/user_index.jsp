<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="layadmin-tabsbody-item layui-show" >
	<button type="button" class="layui-btn " id="btn_add">
		<i class="layui-icon">&#xe654;</i>新增
	</button>
</div>
<div class="layadmin-tabsbody-item layui-show" 
	style="margin-top: 30px">
	<table class="layui-hide" id="demo" lay-filter="table_user_filter"></table>
<script type="text/html" id="handleBar">
  <a class="layui-btn layui-btn-xs" lay-event="edit"><i class="layui-icon">&#xe642;</i>编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>
</script>
<script type="text/javascript">
layui.use([ 'util','table', 'form','laydate'], function() {
	var table = layui.table;
	var form = layui.form;
	var util = layui.util;
	var $ = layui.$;
	var laydate = layui.laydate;
	var form_index =null;
	initTableData();
	
	$('#btn_add').off('clcik').on('click', function() {
		opeanBaseForm();
	});
	function opeanBaseForm(){
		return $.ajax({
			url : 'user/form',
			type : 'get',
			success : function(data) {
			form_index = layer.open({
					type : 1,
					title : '用户表单',
					content : data,
					area : [ '500px', '500px' ],
					success : function(layer0,data) {
						laydate.render({
							  elem: '#userBirthdayId' //指定元素
							});
						form.render();
						bindSubmit();
					}
				})
			}
		});
	}
	function bindSubmit(){
		layui.use(['form'], function(){
			  var form = layui.form;
			  var $ = layui.$;
			  //监听提交
			  form.on('submit(formDemo)', function(data){
			    layer.msg(JSON.stringify(data.field));
			    console.log($('#rowId').val());
			    var type = 'post';
			    if($('#rowId').val()!=null&& $('#rowId').val()!=''){
			    	console.log("formDemo");
			    	type='put';
			    }
			    $.ajax({
			    	url:'user',
			    	type:type,
			    	data:$(data.form).serialize(),
			    	success:function(htmldata){
			    		layer.close(form_index);
			    		layer.msg("添加成功");
			    		initTableData();
			    	}
			    })
			    return false;
			  });
			});
	}
	function initTableData(){
		//执行一个 table 实例
		  table.render({
		    elem: '#demo'
		    ,url: 'page' //数据接口
		    ,title: '用户表'
		    ,page: true //开启分页
		    ,cols: [[ //表头
		      {type: 'checkbox', fixed: 'left'}
		      ,{field: 'rowId', title: 'ID', width:80, sort: true, fixed: 'left'}
		      ,{field: 'userName', title: '用户名', width:80}
		      ,{field: 'userLevel', title: '角色等级', width: 160, sort: true}
		      ,{field: 'userCode', title: '用户账号', width:160, sort: true}
		      ,{field: 'score', title: '评分', width: 80, sort: true}
		      ,{field: 'city', title: '城市', width:150} 
		      ,{field: 'sign', title: '签名', width: 200}
		      ,{field: 'classify', title: '职业', width: 100}
		      ,{field: 'wealth', title: '操作', toolbar : '#handleBar'}
		    ]]
		  });
		//监听工具条
			table.on('tool(table_user_filter)',function(obj){
				var data = obj.data; //获得当前行数据
				var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
				var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
				var rowId = data.rowId;
				console.log(data);
				console.log(layEvent);
				switch(layEvent){
					case 'edit':
						console.log('edit');
						opeanBaseForm().done(function(){
							form.val("formTest",data);
							$('#userBirthday').val(util.toDateString(data.userBirthday,'yyyy-MM-dd'));
							//对 data-old进行赋值
							$('#userCode').data('old',data.userCode);
						});
						
						break;
					case 'del':
						console.log('del');
						layer.confirm('真的删除行么', {icon: 3,title:'tips:'},function(index){
						      obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
						      layer.close(index);
						      //向服务端发送删除指令
						      $.ajax({
									url:'user/'+rowId,
									type:'delete',
									success:function(data){
										if(data){
											initTableData();
										}
										
									}
								});
						});
						break;
					default:
						break;
				}
			});
	}
});
</script>
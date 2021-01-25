/**
 * 基于layui的通用的脚本
 */
layui.use(['form','table'], function() {
	var $ = layui.$;
	var form = layui.form;
	var table = layui.table;

	$(document).off('click', '#btn_add').on('click', '#btn_add', function() {
		var url = $('#hide_url').val() + '/form';
		var title = $('#hide_title').val();
		opeanBaseForm(url, title);
	});
	var form_index = null;

	function opeanBaseForm(url, title) {
		return $.ajax({
			url: url,
			type: 'get',
			success: function(data) {
				form_index = layer.open({
					type: 1,
					title: title,
					content: data,
					area: ['500px', '500px'],
					success: function(layer0, data) {
						form.render();
						bindSubmit();
					}
				});
			}
		});
	}

	function bindSubmit() {
		layui.use(['form'], function() {
			var form = layui.form;
			var $ = layui.$;
			//监听提交
			form.on('submit(formDemo)', function(data) {
				layer.msg(JSON.stringify(data.field));
				console.log($('#rowId').val());
				var type = 'post';
				if ($('#rowId').val() != null && $('#rowId').val() != '') {
					console.log("formDemo");
					type = 'put';
				}
				$.ajax({
					url: $('#hide_url').val(),
					type: type,
					data: $(data.form).serialize(),
					success: function(htmldata) {
						layer.close(form_index);
						layer.msg("添加成功");
					}
				})
				return false;
			});
		});
	}
	form.on('submit(button_search)', function(data) {
		layer.msg(JSON.stringify(data.field));
		initTableData();
		return false;
	});
	//监听工具条
	table.on('tool(table_base_filter)', function(obj) {
		var data = obj.data; //获得当前行数据
		var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
		var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
		var rowId = data.rowId;
		console.log(data);
		console.log(layEvent);
		switch (layEvent) {
			case 'edit':
				console.log('edit');
				var url = $('#hide_url').val() + '/form';
		var title = $('#hide_title').val();
				opeanBaseForm(url,title).done(function(){
								form.val("formTest",data);
								//对 data-old进行赋值
								$('#userCode').data('old',data.userCode);
							});;

				break;
			case 'del':
				console.log('del');
				layer.confirm('真的删除行么', {
					icon: 3,
					title: 'tips:'
				}, function(index) {
					obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
					layer.close(index);
					//向服务端发送删除指令
					$.ajax({
						url: 'role/' + rowId,
						type: 'delete',
						success: function(data) {
							if (data) {
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
});

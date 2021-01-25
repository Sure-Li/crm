layui.use([ 'form', 'layer' ], function() {
	var $ = layui.$;
	var form = layui.form;
	var layer = layui.layer;
	// 表单渲染
	form.render();
	//提交
	form.on('submit(but_login_submit)', function(){
		$.ajax({
			type:'post',
			url:'doAdminLogin',
			data:$('#form_login').serialize(),
			success:function(result){
				var code = result.code;
				var user = result.data[0];
				//登录不成功
				if(code ==1){
					layer.msg(result.msg,{icon: 2});
				}else if(code ==0){ //登录成功
					//登入成功的提示与跳转
					window.location.href ="main/"+user.rowId;
				}
			}
		});
		return false;
	  });
});
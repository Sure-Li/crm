<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="layui-fluid">
	<div class="layui-row layui-col-space15">
		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-header">设置我的资料</div>
				<div class="layui-card-body" pad15>
					<div class="layui-form" lay-filter="">
						<div class="layui-form-item">
							<label class="layui-form-label">我的角色</label>
							<div class="layui-input-inline">
								<select name="role" lay-verify="">
									<option value="1" selected>超级管理员</option>
									<option value="2" disabled>普通管理员</option>
									<option value="3" disabled>审核员</option>
									<option value="4" disabled>编辑人员</option>
								</select>
							</div>
							<div class="layui-form-mid layui-word-aux">当前角色不可更改为其它角色</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">用户名</label>
							<div class="layui-input-inline">
								<input type="text" name="username" value="xianxin" readonly class="layui-input">
							</div>
							<div class="layui-form-mid layui-word-aux">不可修改。一般用于后台登入名</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">昵称</label>
							<div class="layui-input-inline">
								<input type="text" name="nickname" value="贤心" lay-verify="nickname" autocomplete="off" placeholder="请输入昵称" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">头像</label>
							<div class="layui-input-inline">
								<input name="avatar" lay-verify="required" id="LAY_avatarSrc" placeholder="图片地址" value="http://cdn.layui.com/avatar/168.jpg" class="layui-input">
							</div>
							<div class="layui-input-inline layui-btn-container" style="width: auto;">
								<button type="button" class="layui-btn layui-btn-primary" id="LAY_avatarUpload">
									<i class="layui-icon">&#xe67c;</i>上传图片
								</button>
								<button class="layui-btn layui-btn-primary" layadmin-event="avartatPreview">查看图片</button>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">手机</label>
							<div class="layui-input-inline">
								<input type="text" name="cellphone" value="" lay-verify="phone" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">邮箱</label>
							<div class="layui-input-inline">
								<input type="text" name="email" value="" lay-verify="email" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item layui-form-text">
							<label class="layui-form-label">备注</label>
							<div class="layui-input-block">
								<textarea name="remarks" placeholder="请输入内容" class="layui-textarea"></textarea>
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit lay-filter="setmyinfo">确认修改</button>
								<button type="reset" class="layui-btn layui-btn-primary">重新填写</button>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<script>
layui.use(['upload'],function(){
	 var $ = layui.jquery;
	 var upload = layui.upload;
	 upload.render({
		    elem: '#LAY_avatarUpload',
		    	field:'avatarFile'//设定文件域的字段名
		    ,url: 'avatarup' //改成您自己的上传接口
		    ,before: function(obj){
		      //预读本地文件示例，不支持ie8
		      obj.preview(function(index, file, result){
		        $('#LAY_avatarUpload').attr('src', result); //图片链接（base64）
		      });
		    }
		    ,done: function(res){
		      //如果上传失败
		      if(res.code > 0){
		        return layer.msg('上传失败');
		      }
		      //上传成功
		    }
		    ,error: function(){
		      //演示失败状态，并实现重传
		      var demoText = $('#demoText');
		      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
		      demoText.find('.demo-reload').on('click', function(){
		        uploadInst.upload();
		      });
		    }
		  });
});
</script>
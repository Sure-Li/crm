<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form表单</title>
<!-- 引入layui的样式表 -->
<link rel="stylesheet" href="assets/layui/css/layui.css">
</head>
<body>
	<form class="layui-form" action="" id="form_test">
		<div class="layui-form-item">
			<label class="layui-form-label">输入框</label>
			<div class="layui-input-block">
				<input type="text" name="title" required lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码框</label>
			<div class="layui-input-inline">
				<input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">辅助文字</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">选择框</label>
			<div class="layui-input-block">
				<select name="city" lay-verify="required" lay-filter="select_city">
					<option value=""></option>
					<option value="0">北京</option>
					<option value="1">上海</option>
					<option value="2">广州</option>
					<option value="3">深圳</option>
					<option value="4">杭州</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">复选框</label>
			<div class="layui-input-block">
				<input type="checkbox" name="likes" value="1" title="写作"> 
				<input type="checkbox" name="likes" value="2" title="阅读" checked> 
				<input type="checkbox" name="likes" value="3" title="发呆">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">开关</label>
			<div class="layui-input-block">
				<input type="checkbox" name="switch" lay-skin="switch">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">单选框</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男"> <input type="radio" name="sex" value="女" title="女" checked>
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">文本域</label>
			<div class="layui-input-block">
				<textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript" src="assets/layui/layui.js"></script>
<script type="text/javascript">
	layui.use(['form'],function(){
		//依赖加载模块：form （请注意：如果不加载form模块，select、checkbox、radio等将无法显示，并且无法使用form相关功能
		var form = layui.form;
		var $ = layui.$;
		//select监听change事件
		form.on('select(select_city)',function(data){
			console.log(data);
			 console.log(data.elem); //得到select原始DOM对象
			 console.log($(data.elem));
			 console.log(data.value); //得到被选中的值
			 console.log(data.othis); //得到美化后的DOM对象
		});
		//绑定表单提交
		form.on('submit(formDemo)',function(data){
			console.log(data);
			$.ajax({
				url:'test',
				type:'post',
				//data:data.field,//当前容器的全部表单字段，名值对形式：{name: value}
				data:$(data.form).serialize(),
				success:function(){
					
				}
			});
			return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
		});
	});
</script>
</html>
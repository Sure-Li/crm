<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<jsp:include page="base.jsp" />
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<!-- 引入layui的样式表 -->
<link rel="stylesheet" href="assets/layui/css/layui.css" media="all">
<!-- 客户自定义的样式表 -->
<link rel="stylesheet" href="assets/layui/admin/login.css">
</head>
<body class="layui-layout-body">
	<div class="layadmin-user-login" id="LAY-user-login">
		<div class="layadmin-user-login-main">
			<div class="layadmin-user-login-box layadmin-user-login-header">
				<h2>CRM管理系统</h2>
				<p></p>
			</div>
			<form id="form_login">
				<div class="layadmin-user-login-box layadmin-user-login-body layui-form">
					<div class="layui-form-item">
						<label class="layadmin-user-login-icon layui-icon layui-icon-username"></label> <input type="text" name="userCode" lay-verify="required" placeholder="登录账号" class="layui-input" value="admin">
					</div>
					<div class="layui-form-item">
						<label class="layadmin-user-login-icon layui-icon layui-icon-password"></label> <input type="password" name="userPassword" lay-verify="required" placeholder="登录密码" class="layui-input" value="123456">
					</div>
					<div class="layui-form-item" style="margin-bottom: 20px;">
						<input type="checkbox" name="remember" value="1" lay-skin="primary" title="记住密码" ${sessionScope.checked}>
					</div>
					<div class="layui-form-item">
						<button class="layui-btn layui-btn-fluid" lay-submit id="btn-login-submit-id" lay-filter="but_login_submit" ">登 入</button>
					</div>
				</div> 
				</div>
			</form>
		</div>

		<div class="layui-trans layadmin-user-login-footer">
			<p>
				© 2021 <a href="#">Sure-Li</a>
			</p>
		</div>
	</div>
</body>
<script type="text/javascript" src="assets/layui/layui.js"></script>
<script charset="utf-8" type="text/javascript" src="assets/app/app_login.js"></script>
</html>
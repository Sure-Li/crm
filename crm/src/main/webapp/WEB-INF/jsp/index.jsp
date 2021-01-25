<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>开始使用layui</title>
  <!-- 引入layui的样式表 -->
  <link rel="stylesheet" href="assets/layui/css/layui.css">
</head>
<body>
	<h1>hello world</h1>
	<a href="user">用户管理</a>
	<a href="role">角色管理</a>
</body>
<!-- 引入layui的核心JS，核心的JS会根据代码按需加载模块， 不建议直接引入layui.all.js -->
<!-- layui不需要显示的引入jquery的开发脚本，因为它已经内置了jquery。 -->
<script type="text/javascript" src="assets/layui/layui.js"></script>
<script type="text/javascript">
	//原来的jQuery的写法
	/* $(document).ready(function(){
		
	}); */
	//layui的写法
	//['layer','form'] 配置当前页面需要加载的模块。
	// jquery,layer 这些模块可以不用显示的用代码加载，就可以直接调用的。
	layui.use(['form'],function(){
		//使用jQuery。
		var $ = layui.$;
		var layer= layui.layer;
		var form = layui.form;
		layer.msg('这是layui的信息弹窗');
		
		var $h1 = $('h1');
		console.log($h1);
	});
</script>
</html>
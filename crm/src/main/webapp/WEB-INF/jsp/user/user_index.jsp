<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户首页</title>
<base href="http://localhost:8080/layui/">
 <!-- 引入layui的样式表 -->
<link rel="stylesheet" href="assets/layui/css/layui.css">
</head>
<body>
<div class="layui-fluid">
	<div class="layui-row layui-col-space15">
		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-header">
					角色管理
					<!-- 使用自定义标签在页面上判断 button或是超链接 是否可以显示 -->
					<!-- 新增按钮 开始 -->
					<button type="button" class="layui-btn layui-btn-sm layui-btn-add" id="btn_add">
						<i class="layui-icon layui-icon-addition"></i>新增
					</button>
					<!-- 新增按钮 结束 -->
				</div>
				<div class="layui-card-body">
					<!-- 搜索表单 开始  -->
					<form class="layui-form" id="form_search" lay-filter="form_search">
						<div class="layui-search-form">
							<div class="layui-inline">
								<select name="roleType">
									<option value=>角色类型</option>
									<option value="1">超级角色</option>
									<option value="0">普通角色</option>
								</select>
							</div>
							<div class="layui-inline">
								<input name="roleName" placeholder="角色名称" autocomplete="off" class="layui-input">
							</div>
							<div class="layui-inline">
								<!-- 搜索按钮 -开始 -->
								<button lay-submit lay-filter="btn_search" title="搜索" class="layui-btn layui-btn-primary layui-btn-sm layui-tips" >
									<i class="layui-icon layui-icon-search"></i>
								</button>
								<!-- 搜索按钮 -结束 -->
								<!-- 重置按钮 - 开始 -->
								<!--想自动弹出tip信息 两个条件  class="layui-tips" title="信息" -->
								<button type="reset" title="重置" class="layui-btn layui-btn-primary layui-btn-sm layui-tips">
									<i class="layui-icon layui-icon-refresh"></i>
								</button>
								<!-- 重置按钮 - 结束 -->
							</div>
						</div>
					</form>
					<!-- 搜索表单 结束  -->
					<!-- 页面表格 开始  -->
					<table id="list_table" lay-filter="table_user_filter"></table>
					<!-- 页面表格 结束  -->
				</div>
			</div>
		</div>
	</div>
</div>
 <!-- layui的templet的 模板 -->
<script type="text/html" id="userSexTpl">
  {{#  if(d.userSex==0){ }}
       <span class="layui-badge layui-bg-orange"> 女</span>
  {{#  } else { }}
       <span class="layui-badge layui-bg-blue">男</span>
  {{#  } }}
</script>
<!-- layui的toolbar的模板 -->
<script type="text/html" id="actionBar">
    <a class="layui-btn layui-btn-xs" lay-event="edit"><i class="layui-icon layui-icon-util"/>修改</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon layui-icon-delete"/>删除</a>
</script>
</body>
<script type="text/javascript" src="assets/layui/layui.js"></script>
<script type="text/javascript" src="assets/page/js/user.js"></script>
</html>
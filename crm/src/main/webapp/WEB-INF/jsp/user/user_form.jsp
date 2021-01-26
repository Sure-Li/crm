<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form class="layui-form" action="" lay-filter="formTest">
<input type="hidden" name="rowId" id="rowId"> 
	<div class="layui-form-item">
		<label class="layui-form-label">用户名称</label>
		<div class="layui-input-block">
			<input type="text" name="userName" required lay-verify="required"
				placeholder="用户名称" autocomplete="off" class="layui-input">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">用户账号</label>
		<div class="layui-input-block">
			<input type="userCode" name="userCode" id="userCode" data-old="" required lay-verify="required|checkUserCode"
				placeholder="账号" autocomplete="off" class="layui-input">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">密码框</label>
		<div class="layui-input-inline">
			<input type="password" name="userPassword" required lay-verify="required"
				placeholder="请输入密码" autocomplete="off" class="layui-input">
		</div>
		<div class="layui-form-mid layui-word-aux">辅助文字</div>
	</div>
	<!-- <div class="layui-form-item">
		<label class="layui-form-label">用户性别</label>
		<div class="layui-input-block">
			<select name="userSex" lay-verify="required">
				<option value=""></option>
				<option value="0">女</option>
				<option value="1">男</option>
			</select>
		</div>
	</div> -->
	<!-- <div class="layui-form-item">
		<label class="layui-form-label">用户生日</label>
		<div class="layui-input-block">
			<input id="userBirthdayId" name="userBirthday" class="layui-input">
		</div>	
	</div> -->
	<div class="layui-form-item">
		<div class="layui-input-block">
			<button class="layui-btn" lay-submit lay-filter="formDemo" >立即提交</button>
			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		</div>
	</div>
</form>

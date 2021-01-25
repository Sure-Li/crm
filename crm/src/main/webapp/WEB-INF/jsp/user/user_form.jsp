<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form class="layui-form"  id="form_test" lay-filter="form_user_filter">
		<input type="hidden" name="rowId" id="rowId"/>
		<div class="layui-form-item">
			<label class="layui-form-label">用户名称</label>
			<div class="layui-input-block">
				<input name="userName" required lay-verify="required" placeholder="请输入用户名称" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">用户账号</label>
			<div class="layui-input-block">
				<input name="userCode" id="userCode" required lay-verify="required|checkusercode" placeholder="请输入用户账号" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">用户密码</label>
			<div class="layui-input-block">
				<input type="password" name="userPass" required lay-verify="required" placeholder="请输入用户账号" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">用户性别</label>
			<div class="layui-input-block">
				<select name="userSex" lay-verify="required" >
					<option value="0">女</option>
					<option value="1">男</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">用户生日</label>
			<div class="layui-input-block">
				<input name="userBirthday" id="userBirthday" required lay-verify="required" placeholder="请输入用户生日" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit lay-filter="submit_user_filter">提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
</form>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assert/layui/css/layui.css">
</head>
<body>
	<fieldset class="layui-elem-field"
		style="width: 45%; border: groove; margin-left: 20px">
		<legend>客户基本信息</legend>
		<div class="layui-field-box">
			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label">客户编号</label>
					<div class="layui-input-block" style="color: red;">
						<label class="layui-form-label">CRMTEST123456</label>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">客户姓名</label>
					<div class="layui-input-block">
						<input type="text" name="title" required lay-verify="required"
							placeholder="请输入客户名称" autocomplete="off" class="layui-input">
					</div>
				</div>
				<c:if test="${!empty dictionaryList}">
					<c:forEach items="${dictionaryList}" var="dictionary">
						<div class="layui-form-item">
							<label class="layui-form-label">${dictionary.dictionaryInfo}</label>
							<div class="layui-input-block">
								<select name="city" lay-verify="required">
									<c:if test="${dictionary.children.size()>0}">
										<option value="">请选择</option>
										<c:forEach items="${dictionary.children}" var="children">
											<option value="1">${children.dictionaryInfo}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
						</div>
					</c:forEach>
				</c:if>
				<div class="layui-form-item">
					<label class="layui-form-label">跟单方式</label>
					<div class="layui-input-block">
						<input type="checkbox" name="like" value="1" title="电话"> <input
							type="checkbox" name="like" value="2" title="微信" checked>
						<input type="checkbox" name="like" value="3" title="email">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">客户性别</label>
					<div class="layui-input-block">
						<input type="radio" name="sex" value="男" title="男"> <input
							type="radio" name="sex" value="女" title="女" checked>
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">客户信息</label>
					<div class="layui-input-block">
						<textarea name="desc" placeholder="请输备注信息" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
	</fieldset>

</body>
<script type="text/javascript" src="assert/layui/layui.js"></script>
<script type="text/javascript">
	//Demo
	layui.use([ 'form' ], function() {
		var form = layui.form;
		var $ = layui.$;
		form.on('select()', function(data) {
			console.log(data.elem); //得到select原始DOM对象
			console.log(data.value); //得到被选中的值
			console.log(data.othis); //得到美化后的DOM对象
		});
		//监听提交
		form.on('submit(formDemo)', function(data) {
			layer.msg(JSON.stringify(data.field));
			$.ajax({
				url : 'test',
				type : 'post',
				data : $(data.form).serialize(),
				success : function(htmldata) {
					console.log(htmldata);
				}
			})
			return false;
		});

	});
</script>
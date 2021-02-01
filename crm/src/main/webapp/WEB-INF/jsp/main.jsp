<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XX管理系统</title>
<jsp:include page="base.jsp" />
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<!-- 引入layui的样式表 -->
<link rel="stylesheet" href="assets/layui/css/layui.css" media="all">
<link rel="stylesheet" href="assets/layui/admin/admin.css">
<!-- 客户自定义的样式表 -->
<link rel="stylesheet" href="assets/layui/admin/custom.css">
</head>
<body class="layui-layout-body">
	<div class="layadmin-tabspage-none layadmin-side-shrink">
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<!-- 头部区域 -开始 -->
				<ul class="layui-nav layui-layout-left">
					<li class="layui-nav-item layadmin-flexible"><a href="javascript:;" title="侧边伸缩"> <i class="layui-icon layui-icon-shrink-right" id="app_flexible"></i>
					</a></li>
					<li class="layui-nav-item"><a href="javascript:;" title="刷新"> <i class="layui-icon layui-icon-refresh-3"></i>
					</a></li>
					<li class="layui-nav-item layui-hide-xs"><input type="text" placeholder="搜索..." autocomplete="off" class="layui-input layui-input-search" layadmin-event="serach" lay-action="template/search/keywords="></li>
				</ul>
				<!-- 头部区域 -结束-->
				<ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">
					<li class="layui-nav-item"><a href="javascript:initMainPage('todolist');"> <i class="layui-icon layui-icon-notice"></i> <c:if test="${todoCount>0}">
								<!-- 如果有新消息，则显示小圆点 -->
								<span class="layui-badge">${todoCount}</span>
							</c:if>
					</a></li>
					<li class="layui-nav-item layui-hide-xs"><a href="javascript:;" id="full_screen_id"> <i class="layui-icon layui-icon-screen-full"></i>
					</a></li>
					<li class="layui-nav-item" style="margin-right: 10px;"><a href="javascript:;"> <img src="//tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" class="layui-nav-img"> <cite>${sessionScope.login_user_admin.userName}</cite> <span class="layui-nav-more"></span></a>
						<dl class="layui-nav-child layui-anim layui-anim-upbit">
							<dd>
								<a id="person">个人资料</a>
							</dd>
							<hr />
							<dd style="text-align: center;" id="loginout_dd">
								<a>退出</a>
							</dd>
						</dl></li>
				</ul>
			</div>
			<!-- 侧边菜单 -->
			<div class="layui-side layui-side-menu" id="menu_left">
				<div class="layui-side-scroll">
					<div class="layui-logo">
						<span>CRM管理系统</span>
					</div>
					<ul class="layui-nav layui-nav-tree" lay-shrink="all">
					<c:forEach items="${resourceList}" var="resource">
					<li class="layui-nav-item layui-nav-itemed"><a href="javascript:;"> <i class="layui-icon layui-icon-home"></i> <cite>${resource.resourceName}</cite> <span class="layui-nav-more"></span></a>
					<c:if test="${resource.children.size()>0}">
					<c:forEach items="${resource.children}" var="resourceChild">
								<dl class="layui-nav-child">
								<dd >
									<a href="" id="btn-dictionary-id">${resourceChild.resourceName}</a>
								</dd>
								</dl>
					</c:forEach>
					</c:if> 
					</li>
					</c:forEach>
						<%-- <li class="layui-nav-item layui-nav-itemed"><a href="javascript:;"> <i class="layui-icon layui-icon-home"></i> <cite>业务管理</cite> <span class="layui-nav-more"></span></a>
							<dl class="layui-nav-child">
								<dd class="layui-this">
									<a href="" id="btn-dictionary-id">数据字典</a>
								</dd>
								<dd>
									<a href="" id="btn-system-setting-id">系统设置</a>
								</dd>
								<dd>
									<a href="" id="btn-resource-id">资源管理</a>
								</dd>
							</dl></li>
						<li class="layui-nav-item"><a href="javascript:;"> <i class="layui-icon layui-icon-set"></i> <cite>系统管理</cite> <span class="layui-nav-more"></span></a>
							<dl class="layui-nav-child">
								<dd>
									<a href="role" id="">角色管理</a>
								</dd>
								<dd>
									<a href="user" id="btn-user-id"">用户管理</a>
								</dd>
							</dl></li> --%>
					</ul>
				</div>
			</div>

			<!-- 页面标签 -->

			<!-- 主体内容 -->
			<div class="layui-body">
				<div class="layadmin-tabsbody-item layui-show" id="layui-body-main" >
				</div>
			</div>

			<!-- 辅助元素，一般用于移动设备下遮罩 -->
			<div class="layadmin-body-shade" layadmin-event="shade"></div>
		</div>
	</div>
</body>
<!-- 引入layui的 开发脚本 -->
<script type="text/javascript" src="assets/layui/layui.js"></script>
<!-- 引入重新后的ajax，目的是使用layui的加载层 -->
<script type="text/javascript" src="assets/app/app_ajax.js"></script>
<!-- 引入系统的通用脚本  -->
<script type="text/javascript" src="assets/app/app_core.js"></script>
<script type="text/javascript" src="assets/app/app_index.js"></script>
<script type="text/javascript">

layui.use([ 'form', 'layer','table' ], function() {
	var $ = layui.$;
	var table = layui.table;
	var layer = layui.layer;
	$('#btn-dictionary-id').off('click').on('click',function(){
		$.ajax({
			type:'get',
			url:'dictionary',
			success:function(result){
				 $('#layui-body-main').html(result); 
			}
		});
		return false;
	});
	$('#btn-system-setting-id').off('click').on('click',function(){
		$.ajax({
			type:'get',
			url:'systemSetting',
			success:function(result){
				 $('#layui-body-main').html(result); 
			}
		});
		return false;
	});
	$('#btn-resource-id').off('click').on('click',function(){
		$.ajax({
			type:'get',
			url:'resource',
			success:function(result){
				 $('#layui-body-main').html(result); 
			}
		});
		return false;
	});
	$('#btn-user-id').off('click').on('click',function(){
		$.ajax({
			type:'get',
			url:'user',
			success:function(result){
				 $('#layui-body-main').html(result); 
			}
		});
		return false;
	});
	
	
});
</script>

</html>
/**
 * 重写jQuery的ajax方法,将一些通用的方法,配置放在此处统一书写。
 * 
 * @param $
 */
layui.use('layer', function() {
	// '严格模式'（strict mode）。顾名思义,这种模式使得Javascript在更严格的条件下运行。
	'use strict';
	// layui是基于jQuery的,启用$符号。
	var $ = layui.$;
	// 备份jquery的ajax方法
	var _ajax = $.ajax;
	// 重写jquery的ajax方法
	$.ajax = function(opt) {
		// 备份opt中error,beforeSend,complete方法
		var fn = {
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			},
			beforeSend : function(XMLHttpRequest) {
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
		};
		if (opt.error) {
			fn.error = opt.error;
		}
		if (opt.beforeSend) {
			fn.beforeSend = opt.beforeSend;
		}
		if (opt.complete) {
			fn.complete = opt.complete;
		}
		var _opt = $.extend({
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			},
			beforeSend : function(XMLHttpRequest) {
				// 请求之前方法增强处理 ,显示遮罩层
				layer.open({
					type : 3
				});
			},
			complete : function(XMLHttpRequest, textStatus) {
				// 请求结束方法增强处理 ,隐藏遮罩层
				layer.closeAll('loading'); //关闭加载层
			},
			statusCode : {
				404 : function(){//进404页面
					initMainPage('404');
				},
				500 : function(){//进500页面
					initMainPage('500');
				},
				700:function(){// 700这个状态码，是自己的定义，表示非登录状态
					window.location.href="login";
				}
			}
		}, opt);
		return _ajax(_opt);
	};
});
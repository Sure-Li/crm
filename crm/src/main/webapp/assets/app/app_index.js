//此处引入treeTable的layui插件 次配置应该在项目中运行一次即可，不可以重复加载。
/*layui.config({
	base : 'assets/layui/treetable/'// 你存放新模块的目录，注意，不是layui的模块目录
});*/
layui.use(['form', 'element', 'layer'], function() {
	var $ = layui.$;
	var form = layui.form;
	var layer = layui.layer;
	//页面上的第一个URL 自动加载
	var first_url = $('#menu_left .layui-nav-child').find('a').eq(0).attr('href');
	if (first_url) {
		//通用的加载main页面的方法
		//initMainPage(first_url);
		$.ajax({
			url: first_url,
			success: function(htmlData) {
				$('#layui-body-main').html(htmlData);
			}
		});
	}
	// 绑定菜单点击
	$('#menu_left .layui-nav-child').off('click', 'a').on('click', 'a', function() {
		//alert("ttt");
		var $this = $(this);
		var url = $this.attr('href');
		//通用的加载main页面的方法
		initMainPage(url);
		return false;
	});

	//绑定 点击 退出
	$('#loginout_dd').on('click', function() {
		layer.confirm('您确定要退出吗?', function() {
			$.ajax({
				url: 'loginadminout',
				success: function(result) {
					if (result.code == 0) {
						window.location.href = "login";
					}
				}
			});
		})
	});
	//进个人资源
	$('#person').on('click', function() {
		//通用的加载main页面的方法
		initMainPage('person');
	});
	// 绑定收起左侧菜单
	$('#app_flexible').on('click', function() {
		var $this = $(this);
		var $tabspage = $('.layadmin-tabspage-none');
		if ($tabspage.hasClass('layadmin-side-shrink')) {
			$tabspage.removeClass('layadmin-side-shrink');
			$this.addClass('layui-icon-spread-right').removeClass('layui-icon-spread-left');
			//解除左侧菜单的mouseenter和mouseleave事件
			$('#menu_left').off('mouseenter').off('mouseleave');
		} else {
			$tabspage.addClass('layadmin-side-shrink');
			$this.addClass('layui-icon-spread-left').removeClass('layui-icon-spread-right');
			//绑定 左侧菜单的mouseenter事件
			buildLeftMnuseEnter();
		}
	});
	//左侧菜单的mouseenter事件
	function buildLeftMnuseEnter() {
		$('#menu_left').off('mouseenter').on('mouseenter', function() {
			var $tabspage = $('.layadmin-tabspage-none');
			if ($tabspage.hasClass('layadmin-side-shrink')) {
				var $layout_body = $('.layui-layout-body');
				$layout_body.addClass('layadmin-side-fixed');
				$('#menu_left').on('mouseleave', function() {
					$layout_body.removeClass('layadmin-side-fixed');
				});
			}
		});
	}
	//初始化页面时 判断 是否 左侧页面已经收起状态，如果是，绑定mouseenter事件
	if ($('.layadmin-tabspage-none').hasClass('layadmin-side-shrink')) {
		//左侧菜单的mouseenter事件
		buildLeftMnuseEnter();
	}
	//绑定 全屏/收起全屏
	$('#full_screen_id').on('click', function() {
		var $i = $(this).find('i');
		//判断需要 全屏
		if ($i.hasClass('layui-icon-screen-full')) {
			$i.removeClass('layui-icon-screen-full').addClass('layui-icon-screen-restore');
			//打开 全屏
			openFullScreen();
		} else {
			$i.removeClass('layui-icon-screen-restore').addClass('layui-icon-screen-full');
			//关闭 全屏
			exitFullScreen();
		}
	});
})
//打开 全屏
function openFullScreen() {
	var element = document.documentElement;
	if (element.requestFullscreen) {
		element.requestFullscreen();
	} else if (element.webkitRequestFullScreen) {
		element.webkitRequestFullScreen();
	} else if (element.mozRequestFullScreen) {
		element.mozRequestFullScreen();
	} else if (element.msRequestFullscreen) {
		// IE11
		element.msRequestFullscreen();
	}
}
//关闭 全屏
function exitFullScreen() {
	if (document.exitFullscreen) {
		document.exitFullscreen();
	} else if (document.webkitCancelFullScreen) {
		document.webkitCancelFullScreen();
	} else if (document.mozCancelFullScreen) {
		document.mozCancelFullScreen();
	} else if (document.msExitFullscreen) {
		document.msExitFullscreen();
	}
}
function handleFullScreen() {
	var element = document.documentElement;
	// 判断是否已经是全屏
	// 如果是全屏，退出
	if (this.fullscreen) {
		if (document.exitFullscreen) {
			document.exitFullscreen();
		} else if (document.webkitCancelFullScreen) {
			document.webkitCancelFullScreen();
		} else if (document.mozCancelFullScreen) {
			document.mozCancelFullScreen();
		} else if (document.msExitFullscreen) {
			document.msExitFullscreen();
		}
		console.log('已还原！');
	} else {    // 否则，进入全屏
		if (element.requestFullscreen) {
			element.requestFullscreen();
		} else if (element.webkitRequestFullScreen) {
			element.webkitRequestFullScreen();
		} else if (element.mozRequestFullScreen) {
			element.mozRequestFullScreen();
		} else if (element.msRequestFullscreen) {
			// IE11
			element.msRequestFullscreen();
		}
		console.log('已全屏！');
	}
}

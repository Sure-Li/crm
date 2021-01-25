<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<div id="test1"></div>
 <script type="text/javascript">
 layui.use('laypage', function(){
	  var laypage = layui.laypage;
	  
	  //执行一个laypage实例
	  laypage.render({
	    elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
	    ,count: 50 //数据总数，从服务端得到
	  });
	});
</script>

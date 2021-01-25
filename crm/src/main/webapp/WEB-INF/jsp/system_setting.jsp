<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<fieldset class="layui-elem-field"
		style="width: 98%; border: groove; margin-left: 20px">
		<legend>系统设置</legend>
		<div class="layui-field-box">
			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label">公海天数</label>
					<div class="layui-input-block">
					<input type="hidden" value="${systemSetting.rowId}" id="rowId">
						<input type="text" name="highSeasday" required lay-verify="required"
							placeholder="请输入公海天数" autocomplete="off" class="layui-input" value="${systemSetting.settingValue}" id="settingValueId">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit id="btn-submit-id">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
</fieldset>
<script type="text/javascript">
	 layui.use([ 'form', 'layer' ], function() {
			var $ = layui.$;
			var layer = layui.layer;
			$('#btn-submit-id').off('click').on('click',function(){
				 $.ajax({
					type:'get',
					url:'updateSystemSetting/'+$('#rowId').val()+"/"+$('#settingValueId').val(),
					success:function(result){
						$.ajax({
							type:'get',
							url:'systemSetting',
							success:function(result){
								 $('#layui-body-main').html(result); 
							}
						});
					}
				}); 
				return false;
			});	
});
</script>
	
	
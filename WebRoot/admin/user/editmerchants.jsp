<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>管理员列表</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />

</head>

<body>
<table border="0" width="600px">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">编辑商家</td>
		</tr>
		<tr>
			<td align="center">
			<!--     <a href="javascript:document.getElementById('saveForm').submit()">保存</a> -->
				&nbsp;&nbsp; 
				
				<a href="javascript:history.go(-1)">返回 </a>
		    </td>
		</tr>
	</table>


	<article class="page-container">
	
	<form class="form form-horizontal" id="form-admin-add" namespace="/">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺ID：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store_id}" placeholder="" id="store_id" name="store_id">
		</div>
	</div>

<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺昵称：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store_name}" placeholder="" id="store_name" name="store_name">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺地址：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store_dress}" placeholder="" id="store_dress" name="store_dress">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺logo路径：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store_logo}" placeholder="" id="store_logo" name="store_logo">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺简介：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store_intro}" placeholder="" id="store_intro" name="store_intro">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">创建时间：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.create_time}" placeholder="" id="create_time" name="create_time">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">经营范围：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.business_scope}" placeholder="" id="business_scope" name="business_scope">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">保证金：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.ensure}" placeholder="" id="ensure" name="ensure">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">是否认证：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.certification}" placeholder="" id="certification" name="certification">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺类型：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.type}" placeholder="" id="type" name="type">
		</div>
	</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去--> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">


$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
 
	$("#form-admin-add").validate({
		rules:{
			name:{
				required:true,
				minlength:1,
				maxlength:16
			},
			pwd:{
				required:true,
			},
			password2:{
				required:true,
				equalTo: "#pwd"
			},
     		phone:{
				required:true,
				isPhone:true,
			}

		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				type: 'post',
				url: "admin_addAdminList.action",
				success: function(data){
					layer.msg('添加成功!',{icon:1,time:1000});
				},
                error: function(XmlHttpRequest, textStatus, errorThrown){
					layer.msg('error!',{icon:1,time:1000});
				}
			});
			window.parent.location.reload(); //刷新父页面

			var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
			parent.layer.close(index);  // 关闭layer
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html> 
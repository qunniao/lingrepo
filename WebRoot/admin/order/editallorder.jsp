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
			<td align="center" style="font-size: 24px; color: #666">编辑产品</td>
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
		<label class="form-label col-xs-4 col-sm-3">订单ID：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.id}" placeholder="" id="id" name="id">
		</div>
	</div>

<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">订单号：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.order_number}" placeholder="" id="name" name="name">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">产品ID：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.product_id}" placeholder="" id="type" name="type">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">产品名称：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.product_name}" placeholder="" id="snote" name="note">
		</div>
			<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">店铺名称：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.store.store_name}" placeholder="" id="snote" name="note">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">产品备注：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.product_note}" placeholder="" id="old_price" name="old_price">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">买家备注：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.buyer_note}" placeholder="" id="new_price" name="new_price">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">原价：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.old_price}" placeholder="" id="freight" name="freight">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">现价：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.new_price}" placeholder="" id="seven_day" name="seven_day">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">运费：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.freight}" placeholder="" id="cash" name="cash">
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">总价：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.total_price}" placeholder="" id="sales" name="sales">
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">加入购物车时间：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.cart_time}" placeholder="" id="pic" name="pic">
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">付款时间：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.pay_time}" placeholder="" id="details" name="details">
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">订单状态：</label>
		<div class="formControls col-xs-8 col-sm-9">
		
		<!-- -->
			<input type="text" class="input-text" value="${model.order_status}" placeholder="" id="details" name="details">
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
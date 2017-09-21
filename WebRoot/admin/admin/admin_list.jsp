<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${basePath}static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${basePath}static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${basePath}lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${basePath}static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${basePath}static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 日期范围：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" placeholder="输入管理员名称" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	<%-- <span class="l"><a href="javascript:;" onClick="datadel()" class="btn btn-danger radius" id="del_model">
	<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> --%>
	 <a href="javascript:;" onclick="admin_add('添加管理员','admin/admin/admin_add.jsp','800','600')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">管理员列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value="" id="allChk"></th>
				<!-- <th width="40">ID</th> -->
				<th width="150">登录名</th>
				<th width="90">姓名</th>
				<th width="150">角色</th>
				<th width="130">加入时间</th>
				<th width="100">状态</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<s:iterator var="vo" value="list">
			<tr class="text-c">
				<td><input type="checkbox"  name="subChk" value="${vo.id}"></td>
				<%-- <td><s:property value="#vo.id"/></td> --%>
				<td><s:property value="#vo.phone"/></td>
				<td><s:property value="#vo.name"/></td>
				<td>
					<s:if test="#vo.level==1">超级管理员</s:if>
	              	 <s:else>普通管理员</s:else>
				</td>
				<td>2014-6-11 11:11:42</td>
				<td class="td-status">
					<s:if test="#vo.status==1"><span class="label label-success radius">正常</span></s:if>
	              	<s:else><span class="label radius">已注销</span></s:else>
				</td>
				<td class="td-manage"> <a title="删除" href="javascript:;" onclick="admin_del(this,'${vo.id}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
		</s:iterator>

		</tbody>
	</table>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加  */ 
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/   
function admin_del(obj,id){
	layer.confirm('确认要注销该账号吗？',function(index){
		 window.location.href="admin_updateStatus.action?id="+id;	
	});
}

/*管理员-编辑*/
function admin_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}

/*管理员批量删除*/

function datadel(){
		// 全选 
		$("#allChk").click(function() { 
		$("input[name='subChk']").prop("checked",this.checked); 
		}); 
		
		// 单选 
		var subChk = $("input[name='subChk']"); 
		subChk.click(function() { 
		$("#allChk").prop("checked", subChk.length == subChk.filter(":checked").length ? true:false); 
		}); 
		
		
		/* 批量删除 */ 

		// 判断是否至少选择一项 
		var checkedNum = $("input[name='subChk']:checked").length; 
		if(checkedNum == 0) { 
		alert("请选择至少一项！"); 
		return; 
		} 
		// 批量选择 
		if(confirm("确定要删除所选项目？")) { 
		var checkedList = new Array(); 
		$("input[name='subChk']:checked").each(function() { 
		checkedList.push($(this).val()); 
		}); 
		$.ajax({ 
		type: "POST", 
		url: "admin_deleteAdminList.action", 
		data: {'delitems':checkedList.toString()}, 
		 success: function(result) { 
		$("[name ='subChk']:checkbox").attr("checked", false); 
	    window.location.reload(); 
		  //  window.location.href="admin_getAdminList.action";
		} 
		}); 
		} 

         } 
/*管理员-停用*/
function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*管理员-启用*/
function admin_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!', {icon: 6,time:1000});
	});
}
</script>
</body>
</html>


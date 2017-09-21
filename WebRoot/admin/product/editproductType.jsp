<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String pid=request.getParameter("pid"); // 已获取pid
System.out.println(pid+"二级菜单");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<title>商家管理</title>
<link  type="text/css" rel="stylesheet"  href="${basePath}css/style.css"/>
<link  type="text/css" rel="stylesheet"  href="${basePath}css/index.css"/>


<script  src="js/jquery.min.js"></script>
<!-- 动态菜单JS -->
<script type="text/javascript"  src="js/menu.js"></script>
<style>
tr {background-color:#F2F2F2; color:#000}
tr:hover {background-color:#E0EEEE; color: #000}
</style>
</head>

<body>
<table border="0" width="600px">
	
		<tr>
			<td align="center">
			<!--     <a href="javascript:document.getElementById('saveForm').submit()">保存</a> -->
				&nbsp;&nbsp; 
				
				<a href="javascript:history.go(-1)">返回 </a>
		    </td>
		</tr>
	</table>
<div class="container">
<div class="right-menu">
  <div class="main-hd">
   <div class="page-teb" >
 <div class="l-tab-content" style="background:#fff;">
     <div class="tab-content-item">
      <div class="home">
      <!--分类管理   开始-->
        <div class="yg-gl">
         <div class="khgl-rg " style="margin-bottom:15px;">
           <a href="javascript:;" onclick="productTypet_add('添加二级菜单','admin/product/productTypet_add.jsp','800','600',${pid})" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加二级菜单</a>
          <a href="javascript:history.go(-1)">返回 </a>
         </div>
         <s:form>
         <div class="yg-tab">
          <div class="wrap-li">
            <table class="gridbar" border="0" cellpadding="0" cellspacing="0">
            <thead>
             <tr>
              <th width="60"><input type="checkbox" ></th>
              <th width="80">二级菜单</th>
               <th width="80">父id</th>
              <th width="80">排序</th>
              <th width="120">操作</th>
             </tr>
             <s:iterator var="vo" value="list">
             <tr>
              <td width="60"><input type="checkbox" name="subChk" value="${vo.id}"></td>
              <td width="280"><s:property value="#vo.name"/></td>
               <td width="280"><s:property value="#vo.pid"/></td>
              <td width="280"><s:property value="#vo.sort"/></td>
              <td width="280">
              <a href="product_getProductById.action?id=<s:property value="#vo.id"/>">修改</a>
              <a href="product_getProductById.action?id=<s:property value="#vo.id"/>">删除</a>
              </td>
            </tr> 
              </s:iterator>
          
            </thead>
            </table>
         </div>
         <br/>
        </div>
         </s:form>
        </div> 
      <!--员工管理   结束-->
      </div>
     </div>
    </div>
   </div>
  </div>
 </div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
 <script type="text/javascript">
  /*管理员-增加  */ 
function productTypet_add(title,url,w,h,pid){
	layer_show(title,url,w,h,pid);
}
  /*管理员-删除*/   
function product_del(obj,id){
	alert(1);
	layer.confirm('确认要下架该商品吗？',function(index){

		window.location.href="product_updateStatus.action?id="+id;	
});
}
  </script>
</body>
</html>


<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
</head>

<body>

<div class="container">
<div class="right-menu">
  <div class="main-hd">
   <div class="page-teb" >
 <div class="l-tab-content" style="background:#fff;">
     <div class="tab-content-item">
      <div class="home">
      <!--员工管理   开始-->
        <div class="con-header">
         <ul class="ui-inline">
          <li>
           <select class="select-txt">
            <option>请选择客户类型</option>
           </select>
          </li>
          <li>
           <input type="text" class="ui-kh" placeholder="请输入客户编号名称/联系人/电话查询">
          </li>
          <li class="chk-list" style="display:list-item;">
           <span class="chk over">
            <input type="checkbox" value="ischecked" name="ischecked" class="chk-in">显示禁用客户
           </span>
          </li>
          <li>
           <a href="#" class="ui-btn11 ui-btn-search">查询</a>
          </li>
         </ul>
        </div>
        
        <div class="yg-gl">
         <div class="khgl-rg " style="margin-bottom:15px;">
          <a href="#" class="xz">新增</a>
          <a href="#" class="ui-bill">禁用</a>
          <a href="#" class="ui-bill">启用</a>
          <a href="#" class="ui-bill">删除</a>
         </div>
         <s:form>
         <div class="yg-tab">
          <div class="wrap-li">
            <table class="gridbar" border="0" cellpadding="0" cellspacing="0">
            <thead>
             <tr>
              <th width="60"><input type="checkbox" ></th>
              <th width="280">图</th>
               <th width="180">商品名称</th>
              <th width="180">订单编号</th> 
               <th width="180">订单店铺</th> 
              <th width="180">总价</th>          
              <th width="180">状态</th>
               <th width="280">操作</th>
           </tr>
             <s:iterator var="vo" value="list">
                  <tr>
               <td width="60"><input type="checkbox"></td>
               <td width="80"><img class="check-pic" src="${basePath}img/pic1.png"></td>
               <td width="180"><s:property value="#vo.product_name"/></td>
               <td width="180"><s:property value="#vo.order_number"/></td> 
               <td width="180"><s:property value="#vo.store.store_name"/></td> 
               <td width="180"><s:property value="#vo.total_price"/></td>          
               <td width="180"><s:property value="#vo.order_status"/></td>
               <td width="380"><a href="order_getOrderById.action?id=<s:property value="#vo.id"/>">查看详细信息</a></td>
            </tr> 
              </s:iterator>
          
            </thead>
            </table>
         </div>
         <br/>
		<table border="0" cellspacing="0" cellpadding="0" width="900px">
		<tr>
			<td align="center">
			<span>
			     第<s:property value="currPage" />/<s:property value="totalPage" />页
			</span>
			&nbsp;&nbsp; 
			<span>
			    总记录数：<s:property value="totalCount" />&nbsp;&nbsp;
			    每页显示:<s:property value="pageSize" /></span>&nbsp;&nbsp; 
			<span>
			   <s:if test="currPage != 1">
					<a href="product_getProductList.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a href="product_getProductList.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
               </s:if> 
               <s:if test="currPage != totalPage">
					<a href="product_getProductList.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                    <a href="product_getProductList.action?currPage=<s:property value="totalPage"/>">[尾页]<s:property value="totalPage"/></a>&nbsp;&nbsp;
               </s:if> 
            </span>
            </td>
		</tr>
	</table>
        </div>
         </s:form>
         <div class="tab-btn">
        <div class="bt-rg">
         <ul>
          <li><button>打印</button></li>
          <li><button>退出</button></li>
         </ul>
        </div>
       </div>
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


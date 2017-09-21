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
<style>
tr {background-color:#F2F2F2; color:#000}
tr:hover {background-color:#E0EEEE; color: #000}
</style>
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
          <a href="javascript:;" onclick="productType_add('添加一级菜单','admin/product/productType_add.jsp','800','600')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加一级菜单</a>
          <a href="javascript:;" onClick="datadel()" class="btn btn-danger radius" id="del_model">
	     <i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
         </div>
         <s:form>
         <div class="yg-tab">
          <div class="wrap-li">
            <table class="gridbar" border="0" cellpadding="0" cellspacing="0">
            <thead>
             <tr>
              <th width="10"><input  type="checkbox" name="" value="" id="allChk" ></th>
              <th width="20">一级菜单</th>
              <th width="20">排序</th>
              <th width="30">操作</th>
             </tr>
             <s:iterator var="vo" value="list">
             <tr >
              <td width="10"><input type="checkbox" name="subChk" value="${vo.id}"></td>
              <td width="20"><s:property value="#vo.name"/></td>
              <td width="20"><s:property value="#vo.sort"/></td>
              <td width="30"><a href="productType_getProductTypeById.action?pid=${vo.id}">查看详细信息</a></td>
            </tr> 
              </s:iterator>
          
            </thead>
            </table>
         </div>
         <br/>
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
 /*管理员-增加  */ 
function productType_add(title,url,w,h){
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
		url: "productType_deleteProductTypeList.action", 
		data: {'delitems':checkedList.toString()}, 
		 success: function(result) { 
		$("[name ='subChk']:checkbox").attr("checked", false); 
	    window.location.reload(); 
		  //  window.location.href="admin_getAdminList.action";
		} 
		}); 
		} 

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


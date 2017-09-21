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
              <th width="80">图</th>
              <th width="120">操作</th>
              <th width="180">店铺ID</th>
              <th width="180">店铺名称</th> 
              <th width="180">店铺地址</th>          
              <th width="280">店铺logo</th>
             <th width="180">店铺类型</th>
              <th width="180">创建时间</th>
              <th width="180">经营范围</th>
              <th width="180">保证金</th>
              <th width="200">是否认证</th>
              <th width="180">查看</th>
           </tr>
           <s:iterator var="vo" value="list">
                   <tr>
              <td width="60"><input type="checkbox" ></td>
              <td width="80"><img class="check-pic" src="${basePath}img/pic1.png"></td>
              <td width="120"> 
                 <a href="#"><img src="${basePath}img/dele.png"></a>
              </td>
              <td width="180"><s:property value="#vo.store_id"/></td>
              <td width="180"><s:property value="#vo.store_name"/></td>
              <td width="180"><s:property value="#vo.store_dress"/></td>
              <td width="280"><s:property value="#vo.store_logo"/></td>
              <td width="180"><s:property value="#vo.type"/></td>
              <td width="180"><s:property value="#vo.create_time"/></td>
              <td width="180"><s:property value="#vo.business_scope"/></td>
              <td width="180"><s:property value="#vo.ensure"/></td>
              <td width="200"><s:property value="#vo.certification"/></td>
              <td width="380"><a href="store_getStoreById.action?store_id=<s:property value="#vo.store_id"/>">查看详细信息</a></td>
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
					<a href="store_getStoreList.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a href="store_getStoreList.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
               </s:if> 
               <s:if test="currPage != totalPage">
					<a href="store_getStoreList.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                    <a href="store_getStoreList.action?currPage=<s:property value="totalPage"/>">[尾页]<s:property value="totalPage"/></a>&nbsp;&nbsp;
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
  
</body>
</html>


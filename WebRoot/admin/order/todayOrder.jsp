<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>订单管理</title>
<link  type="text/css" rel="stylesheet"  href="../../css/style.css"/>
<link  type="text/css" rel="stylesheet"  href="../../css/index.css"/>
<script  src="js/jquery.min.js"></script>
<!-- 动态菜单JS -->
<script type="text/javascript"  src="js/menu.js"></script>
</head>
  
  <body>
     
<body>
<div class="container">
 <div class="left-menu" style="height:949px;">
  <div class="menu-list">
   <ul>
    <li class="menu-list-01" >
     <a href="ck-kffp.html">
     <p class="fumenu">库房管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd5">入库单</p>
      <p class="zcd" id="zcd6">出库单</p>
      <p class="zcd" id="zcd7">库存余额表</p>
     </div>
    </li>
    
    <li class="menu-list-02">
     <a  href="ckgl.html">
     <p class="fumenu">产品管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd5">产品库存</p>
      <p class="zcd" id="zcd6">产品成本</p>
      <p class="zcd" id="zcd7">产品属性管理</p>
     </div>
    </li>
    
    <li class="menu-list-01" >
    <a href="dd-ddgl.html">
     <p class="fumenu">订单管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd8">下单账户</p>
      <p class="zcd" id="zcd9">所属员工</p>
      <p class="zcd" id="zcd10">订单成本</p>
      <p class="zcd" id="zcd1">订单成本费用</p>
      <p class="zcd" id="zcd12">订单总支付金额</p>
      <p class="zcd" id="zcd3">订单商品</p>
      <p class="zcd" id="zcd14">手动增加订单</p>
     </div>
    </li>
    
    <li class="menu-list-02">
     <a href="cj-ckd.html">
     <p class="fumenu">财务管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd15">记录出款和入款</p>
      <p class="zcd" id="zcd16">计算一段时间的利润</p>
     </div>
    </li>
    
    <li class="menu-list-01" >
    <a href="kh-khgl.html">
     <p class="fumenu">客户管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd17">客户基本信息</p>
      <p class="zcd" id="zcd18">客户VIP登记管理</p>
      <p class="zcd" id="zcd19">客户信息管理</p>
      <p class="zcd" id="zcd20">客户订单管理</p>
      <p class="zcd" id="zcd21">转移客户</p>
     </div>
    </li>
    
    <li class="menu-list-02">
    <a href="yg-jbxx.html">
     <p class="fumenu">员工管理</p>
     <img class="xiala" src="../../img/xiala.png" />
     </a>
     <div class="list-p">
      <p class="zcd" id="zcd22">员工基本信息</p>
      <p class="zcd" id="zcd23">员工权限</p>
       <p class="zcd" id="zcd24">开通新客户</p>
      <p class="zcd" id="zcd25">销售额管理</p>
     </div>
    </li>
   </ul>
  </div>
 </div>
 
 <div class="right-menu">
  <div class="main-hd">
   <div class="page-teb" >
    <div class="l-tab-links">
     <ul style="left:0;">
      <li class="l-select">
       <a href="#">订单管理</a>
       <span class="close"></span>
      </li>
     </ul>
    </div>

    <div class="l-tab-content" style="background:#fff;">
     <div class="tab-content-item">
      <div class="home">
      <!--订单管理   开始-->
        <div class="ddgl-box">
         <div class="ddgl-list">
          <div class="dd-fl">进货订单管理</div>
          <div class="dd-rg">
           <div class="rg-01"> 
            过滤
             <select class="dd-sel">
              <option>显示全部</option>
              <option>待付款</option>
              <option>待发货</option>
              <option>待收货</option>
              <option>交易完成</option>
              <option>已评价</option>
              <option>申请退货中</option>
              <option>退货完成</option>
             <option>退货交易失败</option>
             </select>
           </div>
          </div>
         </div>
         <div class="dd-list-top">
          <div class="dd-cart">
           <div class="column t-checkbox">
            <div class="cart-checkbox">
             <input type="checkbox" class="jdcheckbox" >
             全选
            </div>
            
           </div>
           <div class="column t-goods" >商品</div>
           <div class="column tbh" >订单编号</div>
           <div class="column tbh">订单店铺</div>
           <div class="column t-price">原价 </div>
           <div class="column t-quantity">现价</div>
           <div class="column t-sum">总价</div>
           <div class="column t-quantity">订单状态</div>
           <div class="column t-action"> 操作</div>
          </div>
          <div class="cart-list">
           <div class="cart-item-list">
            <div class="cart-tbody">
        
           <div class="item-list">
            <div class="tiem-last">
           <!-- 增加列表数量-->
             <div class="item-form">
              <div class="cell t-checkbox">
               <div class="cart-checkbox">
                <input type="checkbox" class="jdcheckbox">
               </div>
              </div>
              
              <div class="cell p-goods">
               <div class="goods-item">
                <div class="p-img">
                 <a href="#" class="j-aa"><img src="../../img/kf02.png"></a>
                </div>
                <div class="item-msg">
                 <div class="p-name">
                  <a href="#">产品介绍产品介绍产品介绍产品介绍产品介绍</a> 
                 </div>
                </div>
               </div>
              </div>
              <div class="cell tbh">2017052356251 </div>
             <div class="cell tbh">迷你店铺</div>     
              <div class="cell t-price"> ￥256</div>              
              <div class="cell t-quantity"> ×2 </div>
              <div class="cell t-sum">￥256</div>
              <div class="cell t-quantity">交易完成</div>
              <div class="cell t-action">
               <a href="#"><img src="../../img/dele.png"></a>
               <a href="#"><img  src="../../img/xg1.png"></a>
              </div>

             </div>   
             </div>         
             </div>
           </div>           
           </div>
           
           <!--第二个列表-->
           <div class="cart-item-list">
      <div class="item-list">
            <div class="tiem-last">
           <!-- 增加列表数量-->
             <div class="item-form">
              <div class="cell t-checkbox">
               <div class="cart-checkbox">
                <input type="checkbox" class="jdcheckbox">
               </div>
              </div>
              
              <div class="cell p-goods">
               <div class="goods-item">
                <div class="p-img">
                 <a href="#" class="j-aa"><img src="../../img/kf02.png"></a>
                </div>
                <div class="item-msg">
                 <div class="p-name">
                  <a href="#">产品介绍产品介绍产品介绍产品介绍产品介绍</a> 
                 </div>
                </div>
               </div>
              </div>
              <div class="cell tbh">2017052356251 </div>
              <div class="cell tbh">阿佳店铺</div>
              <div class="cell t-price"> ￥256</div>              
              <div class="cell t-quantity"> ×2 </div>
              <div class="cell t-sum">￥256</div>
              <div class="cell t-quantity">交易完成</div>
              <div class="cell t-action">
               <a href="#"><img src="../../img/dele.png"></a>
               <a href="#"><img  src="../../img/xg1.png"></a>
              </div>

             </div>  
             </div>
                </div> 
             <div class="item-form">
              <div class="cell t-checkbox">
               <div class="cart-checkbox">
                <input type="checkbox" class="jdcheckbox">
               </div>
              </div>
              
              <div class="cell p-goods">
               <div class="goods-item">
                <div class="p-img">
                 <a href="#" class="j-aa"><img src="../../img/kf02.png"></a>
                </div>
                <div class="item-msg">
                 <div class="p-name">
                  <a href="#">产品介绍产品介绍产品介绍产品介绍产品介绍</a> 
                 </div>
                </div>
               </div>
              </div>
              
              <div class="cell tbh">
               2017052356251
              </div>
             <div class="cell tbh">阿佳店铺</div>
             <div class="cell t-price">￥256 </div>             
             <div class="cell t-quantity">×2 </div>
             <div class="cell t-sum">￥256</div>
              <div class="cell t-quantity">交易完成</div>
              <div class="cell t-action">
               <a href="#"><img src="../../img/dele.png"></a>
               <a href="#"><img  src="../../img/xg1.png"></a>
              </div>

             </div>  
             </div>
           </div>           
           </div>
          </div>
         </div>
        </div>
        
      <!--订单管理   结束-->
      </div>      
     </div>
    </div>
   </div>
  </div>
  
</body>
</html>

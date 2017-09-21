package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//订单管理

public class Order implements Serializable{
	private  Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private  String order_number;//` int(11) NOT NULL COMMENT '订单号',
    private  String product_id;//` int(11) NOT NULL,
	private  String product_name;//` varchar(50) DEFAULT NULL COMMENT '产品名称',
	private  String product_note;//` varchar(255) DEFAULT NULL COMMENT '产品备注',
	private  String buyer_note;//` varchar(255) DEFAULT NULL COMMENT '买家备注',
	private  String old_price;//` double(9,2) DEFAULT NULL COMMENT '原价',
	private  String new_price;//` double(9,2) NOT NULL COMMENT '现价',
	private  String freight;//` double(4,1) DEFAULT NULL COMMENT '运费',
	private  String total_price;//` double(9,2) NOT NULL COMMENT '订单总价',
	private  String cart_time;//` char(13) DEFAULT NULL COMMENT '加入购物车时间',
	private  String pay_time;//` char(13) DEFAULT NULL COMMENT '付款时间',
	private  String order_status;//` int(1) NOT NULL DEFAULT '0' COMMENT '0待付款，1待发货，2待收货，3交易完成，4已评价，5申请退货中，6退货成功，7退货失败',
	private  String status;//` int(1) NOT NULL DEFAULT '1' COMMENT '0不显示，1显示',
	
	private  Store store;
	
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_note() {
		return product_note;
	}
	public void setProduct_note(String product_note) {
		this.product_note = product_note;
	}
	public String getBuyer_note() {
		return buyer_note;
	}
	public void setBuyer_note(String buyer_note) {
		this.buyer_note = buyer_note;
	}
	public String getOld_price() {
		return old_price;
	}
	public void setOld_price(String old_price) {
		this.old_price = old_price;
	}
	public String getNew_price() {
		return new_price;
	}
	public void setNew_price(String new_price) {
		this.new_price = new_price;
	}
	public String getFreight() {
		return freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getCart_time() {
		return cart_time;
	}
	public void setCart_time(String cart_time) {
		this.cart_time = cart_time;
	}
	public String getPay_time() {
		return pay_time;
	}
	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

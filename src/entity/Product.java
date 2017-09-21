package entity;

import java.io.Serializable;

public class Product implements Serializable{
	private Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private  String store_id;// int(11) NOT NULL,
	private  String name;//varchar(50) DEFAULT NULL COMMENT '产品名称',
	private  String type;// int(4) DEFAULT NULL COMMENT '产品类型',
	private  String note;// varchar(255) DEFAULT NULL COMMENT '产品备注',
	private  String old_price;// double(8,2) DEFAULT NULL COMMENT '原价',
	private  String new_price;// double(8,2) DEFAULT NULL COMMENT '现价',
	private  String freight;// double(4,2) DEFAULT NULL COMMENT '运费',
	private  String seven_day;// int(1) DEFAULT '0' COMMENT '七天退换',
	private  String cash;// int(1) DEFAULT '0' COMMENT '货到付款',
	private  String sales;//int(11) DEFAULT NULL COMMENT '销量',
	private  String pic;// varchar(255) DEFAULT NULL COMMENT '图片',
	private  String details;// text COMMENT '宝贝详情',
	private  String status;//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public String getSeven_day() {
		return seven_day;
	}
	public void setSeven_day(String seven_day) {
		this.seven_day = seven_day;
	}
	public String getCash() {
		return cash;
	}
	public void setCash(String cash) {
		this.cash = cash;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Store implements Serializable{
	private Integer store_id;//` int(11) NOT NULL,
	private String user_id;//` int(11) NOT NULL,
	private String store_name;//` varchar(30) DEFAULT NULL COMMENT '店铺名称',
	private String store_dress;//` varchar(255) DEFAULT NULL COMMENT '店铺地址',
	private String store_logo;//` varchar(255) DEFAULT NULL COMMENT '店铺logo路径',
	private String store_intro;//` text COMMENT '店铺简介',
	private String create_time;//` int(11) DEFAULT NULL COMMENT '创建时间',
	private String business_scope;//` varchar(255) DEFAULT NULL COMMENT '经营范围',
	private String ensure;//` int(4) DEFAULT NULL COMMENT '保证金',
	private String certification;//` 
	private String type;//` 
	private Set<Order> order=new HashSet<Order>();

	public Set<Order> getOrder() {
		return order;
	}
	public void setOrder(Set<Order> order) {
		this.order = order;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_dress() {
		return store_dress;
	}
	public void setStore_dress(String store_dress) {
		this.store_dress = store_dress;
	}
	public String getStore_logo() {
		return store_logo;
	}
	public void setStore_logo(String store_logo) {
		this.store_logo = store_logo;
	}
	public String getStore_intro() {
		return store_intro;
	}
	public void setStore_intro(String store_intro) {
		this.store_intro = store_intro;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getBusiness_scope() {
		return business_scope;
	}
	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}
	public String getEnsure() {
		return ensure;
	}
	public void setEnsure(String ensure) {
		this.ensure = ensure;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
}

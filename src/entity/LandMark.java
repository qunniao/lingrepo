package entity;

public class LandMark {
	private Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private Integer store_id;//int(11) NOT NULL,
	private String name;//varchar(5) NOT NULL COMMENT '地标名称',
	private String pic;// varchar(100) DEFAULT NULL COMMENT '地标图标',
	private String price;// double(6,2) DEFAULT NULL COMMENT '该地标价格',
	private String create_time;// int(11) DEFAULT NULL COMMENT '购买时间',
	private String end_time;// int(11) DEFAULT NULL COMMENT '到期时间',
	private String is_mobile;// int(1) DEFAULT NULL COMMENT '是否移动',
	private String  status;// 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getIs_mobile() {
		return is_mobile;
	}
	public void setIs_mobile(String is_mobile) {
		this.is_mobile = is_mobile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

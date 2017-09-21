package entity;

public class Price {
	private Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private  String en_name;// varchar(50) DEFAULT NULL COMMENT '英文名称',
	private  String ch_name;//varchar(50) DEFAULT NULL COMMENT '中文名称',
	private  String old_price;// double(6,2) DEFAULT NULL COMMENT '原价',
	private  String new_price;// double(6,2) DEFAULT NULL COMMENT '现价',
	private  String type;//int(2) DEFAULT NULL COMMENT '类型',
	private  String start_date;// int(11) DEFAULT NULL COMMENT '开始日期',
	private  String wnd_date;//int(11) DEFAULT NULL COMMENT '截止日期',
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getCh_name() {
		return ch_name;
	}
	public void setCh_name(String ch_name) {
		this.ch_name = ch_name;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getWnd_date() {
		return wnd_date;
	}
	public void setWnd_date(String wnd_date) {
		this.wnd_date = wnd_date;
	}
}

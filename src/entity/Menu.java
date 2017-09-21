package entity;

public class Menu {
	private Integer id;//` int(4) NOT NULL AUTO_INCREMENT,
	private String en_name;//` varchar(10) DEFAULT NULL COMMENT '菜单英文名',
	private String ch_name;//` varchar(10) DEFAULT NULL COMMENT '菜单中文名',
	private String pid;//` int(4) DEFAULT NULL COMMENT '父id',
	private String sort;//` int(2) DEFAULT '0' COMMENT '排序',
	private String status;//`
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

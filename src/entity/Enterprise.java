package entity;


public class Enterprise {
	private Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private Integer store_id;//` int(11) NOT NULL,
	private String name;//` varchar(50) NOT NULL COMMENT '企业注册名称',
	private String address;//` varchar(255) DEFAULT NULL COMMENT '企业联系地址',
	private String webaddress;//` varchar(255) DEFAULT NULL COMMENT '企业网址',
	private String type;//` int(2) DEFAULT NULL COMMENT '企业类型',
	private String people;//` int(6) DEFAULT NULL COMMENT '企业人数',
	private String is_listed;//` int(1) DEFAULT NULL COMMENT '是否上市',
	private String logo;//` varchar(255) DEFAULT NULL COMMENT '企业logo',
	private String intro_pic;//` varchar(255) DEFAULT NULL COMMENT '企业简介图',
	private String intro;//` text COMMENT '企业简介',
	private String license;//` varchar(255) DEFAULT NULL COMMENT '营业执照',
	private String boss;//` varchar(50) DEFAULT NULL COMMENT '法定代表人',
	private String boss_phone;//` int(11) DEFAULT NULL COMMENT '代表人联系电话',
	private String boss_card;//` varchar(20) DEFAULT NULL COMMENT '代表人身份证号码',
	private String boss_card_pic;//`
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebaddress() {
		return webaddress;
	}
	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getIs_listed() {
		return is_listed;
	}
	public void setIs_listed(String is_listed) {
		this.is_listed = is_listed;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getIntro_pic() {
		return intro_pic;
	}
	public void setIntro_pic(String intro_pic) {
		this.intro_pic = intro_pic;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getBoss_phone() {
		return boss_phone;
	}
	public void setBoss_phone(String boss_phone) {
		this.boss_phone = boss_phone;
	}
	public String getBoss_card() {
		return boss_card;
	}
	public void setBoss_card(String boss_card) {
		this.boss_card = boss_card;
	}
	public String getBoss_card_pic() {
		return boss_card_pic;
	}
	public void setBoss_card_pic(String boss_card_pic) {
		this.boss_card_pic = boss_card_pic;
	}

}

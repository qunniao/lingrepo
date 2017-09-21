package entity;

public class User {
	private  Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private String nick;//` char(50) DEFAULT NULL COMMENT '昵称',
	private Integer phone;//` int(11) NOT NULL COMMENT '手机号',
	private String password;//` char(32) NOT NULL COMMENT '登录密码',
	private String signature;//` char(255) DEFAULT NULL COMMENT '签名',
	private Integer age;//年龄
	private Integer gender;//性别
	private String email;//邮箱
	private Integer create_time;//` int(11) NOT NULL COMMENT '注册时间',
	private Integer score;//` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
	private String money;//` double(11,2) NOT NULL DEFAULT '0.00' COMMENT '余额',
	private Integer level;//` int(2) NOT NULL DEFAULT '0' COMMENT '0为普通用户，1为管理员',
	private Integer certification;//` int(2) NOT NULL DEFAULT '0' COMMENT '0为没有认证，1为个人认证，2为企业认证',
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Integer create_time) {
		this.create_time = create_time;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getCertification() {
		return certification;
	}
	public void setCertification(Integer certification) {
		this.certification = certification;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
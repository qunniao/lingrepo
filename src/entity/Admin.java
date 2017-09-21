package entity;

import java.io.Serializable;

public class Admin implements Serializable{
	private  Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private String name;
	private String phone;//` int(11) NOT NULL COMMENT '手机号',
	private String pwd;//` char(32) NOT NULL COMMENT '登录密码',
	private int level;//用户级别
	private int status;//状态
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public int getStatus(){
		return status;
	}
	public void setStatus(int status){
		this.status=status;
	}
	
}

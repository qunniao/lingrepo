package entity;

import java.io.Serializable;
import java.util.List;

public class ProductType implements Serializable{
	private  Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
	private String name;
	private Integer pid;
	private Integer sort;
	private Integer status;//状态
	
	public void toString1(){
		System.out.println(id+".."+name+".."+pid+".."+sort+".."+status);
	}
	
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
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
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
}

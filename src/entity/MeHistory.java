package entity;

public class MeHistory {
	private Integer id;//`` int(11) NOT NULL AUTO_INCREMENT,
	private Integer user_id;//`` int(11) NOT NULL,
	private Integer product_id;//`` int(11) NOT NULL,
	private String date;//`
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}

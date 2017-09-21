package entity;
public class MeFocus {
	private Integer id;//` int(11) NOT NULL AUTO_INCREMENT,
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
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	private Integer user_id;//` int(11) NOT NULL,
	private Integer store_id;//` int(11) NOT NULL,
}

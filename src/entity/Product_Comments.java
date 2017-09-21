package entity;

public class Product_Comments {
	private Integer order_id;//` varchar(15) NOT NULL COMMENT '订单id',
	private String content;//` text COMMENT '评论内容',
	 private String stars;//` int(1) DEFAULT NULL COMMENT '星星'
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
}

package entity;

public class Certification {
	private Integer id;
	private String uid;
	private String card_name;//` varchar(50) DEFAULT NULL COMMENT '真实姓名',
	private String card_number;//` varchar(20) DEFAULT NULL COMMENT '身份证号',
	private String card_dress;//` varchar(255) DEFAULT NULL COMMENT '籍贯信息',
	private String card_photo_front;
	private String card_photo_back;
	private String card_photo_hand;
	//` varchar(255) DEFAULT NULL COMMENT '身份证正面照',
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getCard_dress() {
		return card_dress;
	}
	public void setCard_dress(String card_dress) {
		this.card_dress = card_dress;
	}
	public String getCard_photo_front() {
		return card_photo_front;
	}
	public void setCard_photo_front(String card_photo_front) {
		this.card_photo_front = card_photo_front;
	}
	public String getCard_photo_back() {
		return card_photo_back;
	}
	public void setCard_photo_back(String card_photo_back) {
		this.card_photo_back = card_photo_back;
	}
	public String getCard_photo_hand() {
		return card_photo_hand;
	}
	public void setCard_photo_hand(String card_photo_hand) {
		this.card_photo_hand = card_photo_hand;
	}
	
}

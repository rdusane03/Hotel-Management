package  com.hotel.demo.model;




public class Card {
	
	private String card_username;
	private String cardNumber;
	private String cardType;
	private String expiryDetails;
	
	
	public Card(String card_username, String cardNumber, String cardType, String expiryDetails) {
		super();
		this.card_username = card_username;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryDetails = expiryDetails;
	}
	public String getCard_username() {
		return card_username;
	}
	public void setCard_username(String card_username) {
		this.card_username = card_username;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getExpiryDetails() {
		return expiryDetails;
	}
	public void setExpiryDetails(String expiryDetails) {
		this.expiryDetails = expiryDetails;
	}
	
	

}

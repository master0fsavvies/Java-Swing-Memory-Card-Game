import javax.swing.*;
class Card {
	String picture;
	Boolean faceUp = false;
	JButton button;
	public Card(String picture, JButton button) {
		this.picture = picture;
		this.button = button;
	}
	public void setPicture(String x) {
		this.picture = x;
	}
	public String getPicture() {
		return this.picture;
	}
	public void setFaceUp(Boolean x) {
		this.faceUp = x;
	}
	public Boolean getFaceUp(){
		return this.faceUp;
	}
	public void setButton(JButton x) {
		this.button = x;
	}
	public JButton getButton() {
		return this.button;
	}
	
}

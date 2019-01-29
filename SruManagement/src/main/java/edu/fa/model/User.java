package edu.fa.model;

public class User {
	private int userID;
	private String account;
	private String inNational;
	private String fullName;
	private String email;
	private int telPhone;
	private String facebook;
	public User() {
		super();
	}
	public User(int userID, String account, String inNational, String fullName, String email, int telPhone,
			String facebook) {
		super();
		this.userID = userID;
		this.account = account;
		this.inNational = inNational;
		this.fullName = fullName;
		this.email = email;
		this.telPhone = telPhone;
		this.facebook = facebook;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getInNational() {
		return inNational;
	}
	public void setInNational(String inNational) {
		this.inNational = inNational;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(int telPhone) {
		this.telPhone = telPhone;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	
}

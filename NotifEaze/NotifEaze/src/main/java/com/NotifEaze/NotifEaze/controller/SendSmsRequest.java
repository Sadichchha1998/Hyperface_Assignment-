package com.NotifEaze.NotifEaze.controller;

public class SendSmsRequest {
	 private String phoneNumber;
     private String message;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
     
}

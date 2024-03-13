package com.NotifEaze.NotifEaze.controller;

public class SendPushNotificationRequest {
	 private String fcmToken;
     private String message;
	public String getFcmToken() {
		return fcmToken;
	}
	public void setFcmToken(String fcmToken) {
		this.fcmToken = fcmToken;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

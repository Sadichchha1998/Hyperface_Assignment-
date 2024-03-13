package com.NotifEaze.NotifEaze.controller;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.service.EmailService;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.NotifEaze.NotifEaze.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/communication")
public class CommunicationController {

    private final SmsService smsService;
    private final EmailService emailService;
    private final PushNotificationService pushNotificationService;

    @Autowired
    public CommunicationController(SmsService smsService, EmailService emailService, PushNotificationService pushNotificationService) {
        this.smsService = smsService;
        this.emailService = emailService;
        this.pushNotificationService = pushNotificationService;
    }

    @PostMapping("/send-sms")
    public ResponseEntity<BaseSmsResponse> sendSms(@RequestBody SendSmsRequest request) {
        BaseSmsResponse response = smsService.sendSms(request.getPhoneNumber(), request.getMessage());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/send-email")
    public ResponseEntity<BaseEmailResponse> sendEmail(@RequestBody SendEmailRequest request) {
        BaseEmailResponse response = emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/send-notification")
    public ResponseEntity<BasePushNotificationResponse> sendNotification(@RequestBody SendPushNotificationRequest request) {
        BasePushNotificationResponse response = pushNotificationService.sendNotification(request.getFcmToken(), request.getMessage());
        return ResponseEntity.ok(response);
    }
}

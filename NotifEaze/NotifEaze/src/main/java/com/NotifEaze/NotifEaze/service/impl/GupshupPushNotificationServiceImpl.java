package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import org.springframework.stereotype.Service;

@Service
public class GupshupPushNotificationServiceImpl implements PushNotificationService {

    private final GupshupMock gupshupMock;

    public GupshupPushNotificationServiceImpl() {
        this.gupshupMock = new GupshupMock();
    }

    @Override
    public BasePushNotificationResponse sendNotification(String fcmToken, String message) {
        return gupshupMock.sendPushNotification(fcmToken, message);
    }
}
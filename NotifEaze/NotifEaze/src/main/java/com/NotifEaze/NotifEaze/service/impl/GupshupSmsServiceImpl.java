package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class GupshupSmsServiceImpl implements SmsService {

    private final GupshupMock gupshupMock;

    public GupshupSmsServiceImpl() {
        this.gupshupMock = new GupshupMock();
    }

    @Override
    public BaseSmsResponse sendSms(String phoneNumber, String message) {
        return gupshupMock.sendSms(phoneNumber, message);
    }

    @Override
    public SmsDeliveryStatus checkDeliveryStatus(String messageId) {
        return gupshupMock.checkSmsDeliveryStatus(messageId);
    }
}
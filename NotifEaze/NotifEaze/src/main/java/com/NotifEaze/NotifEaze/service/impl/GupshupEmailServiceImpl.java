package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.service.EmailService;

public class GupshupEmailServiceImpl  implements EmailService {

	    private final GupshupMock gupshupMock;

	    public GupshupEmailServiceImpl() {
	        this.gupshupMock = new GupshupMock();
	    }

	    @Override
	    public BaseEmailResponse sendEmail(String to, String subject, String body) {
	        return gupshupMock.sendEmail(to, subject, body);
	    }
}

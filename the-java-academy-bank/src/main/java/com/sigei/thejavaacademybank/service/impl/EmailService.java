package com.sigei.thejavaacademybank.service.impl;

import com.sigei.thejavaacademybank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}

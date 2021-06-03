package org.pms.sammail.services;

import org.pms.sammail.dto.MailDto;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

@Service
public interface MailService {

    void sendMessage(MailDto mailDto) throws MailException;

}

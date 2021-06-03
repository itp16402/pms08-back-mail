package org.pms.sammail.services;

import lombok.extern.slf4j.Slf4j;
import org.pms.sammail.dto.MailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailServiceImpl implements MailService {

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendMessage(MailDto mailDto) throws MailException {

        log.info("Sending email message to {} started", mailDto.getTo());

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailDto.getFrom());
        message.setTo(mailDto.getTo());
        message.setSubject(mailDto.getSubject());
        message.setText(mailDto.getText());

        emailSender.send(message);

        log.info("Sending email message completed");
    }

}

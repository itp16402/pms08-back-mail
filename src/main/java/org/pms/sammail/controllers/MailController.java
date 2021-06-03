package org.pms.sammail.controllers;

import lombok.extern.slf4j.Slf4j;
import org.pms.sammail.dto.MailDto;
import org.pms.sammail.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@Slf4j
@RequestMapping(value = "/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> sendMail(@RequestBody MailDto mailDto) {

        log.info("Sending email message to {} started", mailDto.getTo());

        mailService.sendMessage(mailDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}

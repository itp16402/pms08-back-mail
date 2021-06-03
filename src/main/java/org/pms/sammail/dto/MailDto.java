package org.pms.sammail.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class MailDto {

    private String from;
    private String to;
    private String subject;
    private String text;
}

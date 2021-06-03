package org.pms.sammail;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pms.sammail.dto.MailDto;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(properties = {"spring.application.name=MailControllerTest",
        "spring.jmx.default-domain=MailControllerTest"})
public class MailControllerTest extends BasicWiremockTest {

//    @Ignore
    @Test
    public void sendMail() throws Exception {

        MailDto mailDto = MailDto.builder()
                .from("apatsimas@solcrowe.gr")
                .to("gliolios@solcrowe.gr")
                .subject("Authentication Succeed")
                .text("You have successfully been authenticated")
                .build();

        this.mockMvc.perform(
                post("/mail")
                        .content(asJsonString(mailDto))
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(print())
                .andExpect(status().isOk());
    }
}

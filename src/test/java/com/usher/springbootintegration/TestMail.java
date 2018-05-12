package com.usher.springbootintegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Usher
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class TestMail {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads(){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("额。。。开会");
        message.setText("时间：午时已到");
        message.setTo("2421993927@qq.com");

        message.setFrom("534096094@qq.com");

        mailSender.send(message);
    }
}

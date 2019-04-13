package com.example.demo.util;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailClient {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailClient(JavaMailSender javaMailSender){
        this.javaMailSender=javaMailSender;
    }

    public void sendEmail(User user)throws MailException{
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setTo("nishithadesilva123@gmail.com");
        mailMessage.setFrom("nishithadesilva123@gmail.com");
        mailMessage.setSubject("Test mail");
        mailMessage.setText("successfully registered");
        javaMailSender.send(mailMessage);

    }
}

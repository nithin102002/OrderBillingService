package com.example.BillingService.Service.Implementation;

import com.example.BillingService.Service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailServiceImplementation implements EmailService {

    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void sendHtmlEmail(String to, String subject, String htmlBody) throws MessagingException {

        MimeMessage  message= javaMailSender.createMimeMessage();
        MimeMessageHelper helper= new MimeMessageHelper(message,true,"UTF-8");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlBody,true);
        javaMailSender.send(message);
    }
}

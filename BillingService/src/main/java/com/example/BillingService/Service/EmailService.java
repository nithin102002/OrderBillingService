package com.example.BillingService.Service;

import jakarta.mail.MessagingException;

public interface EmailService {


    public void sendHtmlEmail(String to, String subject, String htmlBody) throws MessagingException;
}

package com.example.BillingService.Service.Implementation;

import com.example.BillingService.DTO.OrderBillDTO;
import com.example.BillingService.Service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class TableGenerationServiceImplementation {

    @Autowired
    TemplateEngine templateEngine;
   @Autowired
    EmailService emailService;
    public String GenerateReport(OrderBillDTO orderBillDTO ){

        Context context= new Context();
        context.setVariable("orderBill",orderBillDTO);
        String htmlBody=templateEngine.process("report-template",context);

        try{

            emailService.sendHtmlEmail("nithinnageshwaran10@gmail.com","Order Bill Report",htmlBody);
            return "Email Sent Succesfully";

        }
        catch (MessagingException e) {
            e.printStackTrace();
            return "Error Sending email:" + e.getMessage();
        }


    }

}

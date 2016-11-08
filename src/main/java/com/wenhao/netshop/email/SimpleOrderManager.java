package com.wenhao.netshop.email;

import com.wenhao.netshop.domain.Order;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by lw on 2016/11/8.
 */
public class SimpleOrderManager implements OrderManager {
    private JavaMailSender mailSender;
    private SimpleMailMessage templateMessage;

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage) {
        this.templateMessage = templateMessage;
    }

    public void placeOrder(Order order) {
        SimpleMailMessage msg = new SimpleMailMessage(templateMessage);
        msg.setTo("921790476@qq.com");
        msg.setText(
               "cesi");
        try {
            mailSender.send(msg);
            System.out.println(msg);
        } catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
}

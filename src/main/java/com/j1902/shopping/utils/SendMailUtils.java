package com.j1902.shopping.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

@Component
public class SendMailUtils {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    /**
     * 发送简单邮件
     */
    public void sendSimpleMail(String toMail,String yzm) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("EasyBuy商城验证码");
        simpleMailMessage.setText(yzm);
        simpleMailMessage.setFrom("279643903@qq.com");
        simpleMailMessage.setTo(toMail);
        javaMailSender.send(simpleMailMessage);
    }

    /**
     * 发送复杂邮件
     * @param s
     * @param codeCreate
     */
    public void sendMimeMail(String s, String codeCreate) throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //第二个参数 邮件是否要附件
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setSubject("it is also title ");
        //第二个参数 内容是否按html解析
        mimeMessageHelper.setText(" <b> it is a content </a>",true);
        mimeMessageHelper.setFrom("heyongqi279@foxmail.com");
        mimeMessageHelper.setTo("XXXX@qq.com");
        // mimeMessageHelper.addAttachment("banner.png",new File("C:\\Users\\monkey\\Pictures\\banner.png"));

        javaMailSender.send(mimeMessage);
    }
}

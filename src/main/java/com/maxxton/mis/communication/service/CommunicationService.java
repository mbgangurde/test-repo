package com.maxxton.mis.communication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxxton.mis.communication.util.PropertyUtil;

@Service
public class CommunicationService
{

  @Autowired
  private PropertyUtil propertyUtil;

  public List<String> getAllAppliedLeaves()
  {
    List<String> list = new ArrayList<>();
    list.add("mukesh");
    list.add("gangurde");
    return list;
  }

  public void sendmail()
  {

    String m_to = "mbgangurde@hotmail.com";
    String m_subject = "Indoors Readable File: ";
    String m_text = "This message is from Indoor Positioning App. Required file(s) are attached.";
    Properties props = new Properties();
    props.put("mail.smtp.user", propertyUtil.getMailSmtpEmail());
    props.put("mail.smtp.host", propertyUtil.getMailSmtpHost());
    props.put("mail.smtp.port", propertyUtil.getMailSmtpPort());
    props.put("mail.smtp.starttls.enable", propertyUtil.isMailSmtpStarttlsEnable());
    props.put("mail.smtp.debug", propertyUtil.isMailSmtpDebug());
    props.put("mail.smtp.auth", propertyUtil.isMailSmtpAuth());
    props.put("mail.smtp.socketFactory.port", propertyUtil.getMailSmtpSocketFactoryPort());
    props.put("mail.smtp.socketFactory.class", propertyUtil.getMailSmtpSocketFactoryClass());
    props.put("mail.smtp.socketFactory.fallback", propertyUtil.isMailSmtpSocketFactoryFallback());

    Session session = Session.getInstance(props, new javax.mail.Authenticator()
    {
      protected PasswordAuthentication getPasswordAuthentication()
      {
        return new PasswordAuthentication(propertyUtil.getMailSmtpEmail(), propertyUtil.getMailSmtpPassword());
      }
    });
    session.setDebug(true);

    MimeMessage msg = new MimeMessage(session);
    try
    {
      msg.setSubject(m_subject);
      msg.setFrom(new InternetAddress(propertyUtil.getMailSmtpEmail()));
      msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
      msg.addRecipient(Message.RecipientType.CC, new InternetAddress(m_to));
      msg.setText(m_text);

      Transport transport = session.getTransport(propertyUtil.getMailTransportProtocol());
      transport.connect(propertyUtil.getMailSmtpHost(), propertyUtil.getMailSmtpPort(), propertyUtil.getMailSmtpUser(), "SukhkartaDukhharta");
      transport.sendMessage(msg, msg.getAllRecipients());
      transport.close();
    }
    catch (AddressException e)
    {
      e.printStackTrace();
    }
    catch (MessagingException e)
    {
      e.printStackTrace();
    }
  }
}

package com.maxxton.mis.communication.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class PropertyUtil
{

  @Value("${mail.smtp.host}")
  private String mailSmtpHost;

  @Value("${mail.smtp.port}")
  private int mailSmtpPort;

  @Value("${mail.smtp.user}")
  private String mailSmtpUser;

  @Value("${mail.smtp.email}")
  private String mailSmtpEmail;

  @Value("${mail.smtp.password}")
  private String mailSmtpPassword;

  @Value("${mail.smtp.starttls.enable}")
  private boolean mailSmtpStarttlsEnable;

  @Value("${mail.smtp.debug}")
  private boolean mailSmtpDebug;

  @Value("${mail.smtp.auth}")
  private boolean mailSmtpAuth;

  @Value("${mail.smtp.socketFactory.port}")
  private int mailSmtpSocketFactoryPort;

  @Value("${mail.smtp.socketFactory.class}")
  private String mailSmtpSocketFactoryClass;

  @Value("${mail.smtp.socketFactory.fallback}")
  private boolean mailSmtpSocketFactoryFallback;

  @Value("${mail.transport.protocol}")
  private String mailTransportProtocol;

  public PropertyUtil()
  {
  }

  public String getMailSmtpHost()
  {
    return mailSmtpHost;
  }

  public void setMailSmtpHost(String mailSmtpHost)
  {
    this.mailSmtpHost = mailSmtpHost;
  }

  public int getMailSmtpPort()
  {
    return mailSmtpPort;
  }

  public void setMailSmtpPort(int mailSmtpPort)
  {
    this.mailSmtpPort = mailSmtpPort;
  }

  public String getMailSmtpUser()
  {
    return mailSmtpUser;
  }

  public void setMailSmtpUser(String mailSmtpUser)
  {
    this.mailSmtpUser = mailSmtpUser;
  }

  public String getMailSmtpEmail()
  {
    return mailSmtpEmail;
  }

  public void setMailSmtpEmail(String mailSmtpEmail)
  {
    this.mailSmtpEmail = mailSmtpEmail;
  }

  public String getMailSmtpPassword()
  {
    return mailSmtpPassword;
  }

  public void setMailSmtpPassword(String mailSmtpPassword)
  {
    this.mailSmtpPassword = mailSmtpPassword;
  }

  public boolean isMailSmtpStarttlsEnable()
  {
    return mailSmtpStarttlsEnable;
  }

  public void setMailSmtpStarttlsEnable(boolean mailSmtpStarttlsEnable)
  {
    this.mailSmtpStarttlsEnable = mailSmtpStarttlsEnable;
  }

  public boolean isMailSmtpDebug()
  {
    return mailSmtpDebug;
  }

  public void setMailSmtpDebug(boolean mailSmtpDebug)
  {
    this.mailSmtpDebug = mailSmtpDebug;
  }

  public boolean isMailSmtpAuth()
  {
    return mailSmtpAuth;
  }

  public void setMailSmtpAuth(boolean mailSmtpAuth)
  {
    this.mailSmtpAuth = mailSmtpAuth;
  }

  public int getMailSmtpSocketFactoryPort()
  {
    return mailSmtpSocketFactoryPort;
  }

  public void setMailSmtpSocketFactoryPort(int mailSmtpSocketFactoryPort)
  {
    this.mailSmtpSocketFactoryPort = mailSmtpSocketFactoryPort;
  }

  public String getMailSmtpSocketFactoryClass()
  {
    return mailSmtpSocketFactoryClass;
  }

  public void setMailSmtpSocketFactoryClass(String mailSmtpSocketFactoryClass)
  {
    this.mailSmtpSocketFactoryClass = mailSmtpSocketFactoryClass;
  }

  public boolean isMailSmtpSocketFactoryFallback()
  {
    return mailSmtpSocketFactoryFallback;
  }

  public void setMailSmtpSocketFactoryFallback(boolean mailSmtpSocketFactoryFallback)
  {
    this.mailSmtpSocketFactoryFallback = mailSmtpSocketFactoryFallback;
  }
  
  public String getMailTransportProtocol()
  {
    return mailTransportProtocol;
  }

  public void setMailTransportProtocol(String mailTransportProtocol)
  {
    this.mailTransportProtocol = mailTransportProtocol;
  }

}

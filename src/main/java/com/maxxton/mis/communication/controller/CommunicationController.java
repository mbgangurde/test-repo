package com.maxxton.mis.communication.controller;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maxxton.mis.communication.service.CommunicationService;



@RestController
@RequestMapping(value = "/mis/communication")
public class CommunicationController {

  @Autowired  
  CommunicationService communicationService;
  
  @RequestMapping(method = RequestMethod.GET, value = "/types")
  public List<String> getAllAppliedLeaves() {
    return communicationService.getAllAppliedLeaves();
  }
  
  @RequestMapping(method = RequestMethod.PUT, value = "/sendmail")
  public void sendmail() {
    communicationService.sendmail();
  }
  
  @RequestMapping(method = RequestMethod.POST, value = "/sendmail")
  public void send() {
    communicationService.sendmail();
  }
 
}

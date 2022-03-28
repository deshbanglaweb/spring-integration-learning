package com.demo.controller;

import com.demo.service.IntegrationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integrate")
public class IntegrationController {
   @Autowired
    private IntegrationGateway integrationGateway;

    @GetMapping("name/{name}")
    public String getMessageFromIntegrationService(@PathVariable String name){
      return integrationGateway.sendMessage(name);
        //return "hello world";
    }
}

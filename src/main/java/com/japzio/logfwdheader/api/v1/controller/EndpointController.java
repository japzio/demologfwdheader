package com.japzio.logfwdheader.api.v1.controller;

import com.japzio.logfwdheader.api.v1.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

  private final Logger LOG = LoggerFactory.getLogger(EndpointController.class);

  @GetMapping(value = "/greeting", produces = "application/json")
  public Greeting greeting() {
    LOG.info("action=greeting, info=returning greetings");
    return new Greeting("Greetings message body!!");
  }

}

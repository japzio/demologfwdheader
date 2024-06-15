package com.japzio.logfwdheader.api.v1.controller;

import com.japzio.logfwdheader.api.v1.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

  @GetMapping(value = "/greeting", produces = "application/json")
  public Greeting greeting() {
    return new Greeting("Greetings message body!!");
  }

}

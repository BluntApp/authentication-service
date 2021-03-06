package com.blunt.authorization.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authorize")
public class AuthorizeController {

  @GetMapping("test")
  public ResponseEntity<String> testPublish() {
    return new ResponseEntity<>("success", HttpStatus.OK);
  }

}

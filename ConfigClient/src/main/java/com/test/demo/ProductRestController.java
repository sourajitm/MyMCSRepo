package com.test.demo;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
   //Added comment 
@Value("${my.app.title}")
   private String title;
   
private String dummyvar;

//for new branch
private int feature12;

   private String dummyvar2;
   //Added comment 2
   @Value("${my.app.dummyvar3}")

private String dummyvar3;
   //dddd
   @GetMapping("/data")
   public ResponseEntity<String> showProductMsg() {
	   
	   //test
      return new ResponseEntity<String>("Value of title from Config Server: "+title, HttpStatus.OK);
   }
   
}
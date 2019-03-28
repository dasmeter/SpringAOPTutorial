package com.journaldev.spring.aspect;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
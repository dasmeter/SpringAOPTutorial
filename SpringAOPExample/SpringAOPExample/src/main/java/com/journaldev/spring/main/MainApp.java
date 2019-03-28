package com.journaldev.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.journaldev.spring.aspect.HelloWorld;
import com.journaldev.spring.aspect.HelloWorldConfig;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      helloWorld.getMessage();
   }
}
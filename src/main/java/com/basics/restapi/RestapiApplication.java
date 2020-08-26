package com.basics.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		System.out.println("hi");
		ApplicationContext applicationContext = 
				SpringApplication.run(RestapiApplication.class, args);
          	
	    for(String name:applicationContext.getBeanDefinitionNames()) {
	      System.out.println(name);	
	    }
	}
}

//netstat -aon | find "8080"
//taskkill /F /PID 2222


package com.aos.tema2aos;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tema2aosApplication {
	 @RequestMapping(method=RequestMethod.GET)
	    public String method(HttpServletRequest request) {
	        return "Hello " + request.getRequestURI().substring(1);
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(Tema2aosApplication.class, args);
	}
}

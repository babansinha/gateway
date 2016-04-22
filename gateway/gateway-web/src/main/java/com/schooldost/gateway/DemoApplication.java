package com.schooldost.gateway;
 
import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.schooldost.gateway.mongodb.model.User;
import com.schooldost.gateway.user.UserService;
import com.schooldost.service.constants.SchoolDostConstants;
import com.schooldost.service.mongodb.model.ClassDetails;
 
 @SpringBootApplication
 //@RestController
 
 @Configuration
 @ComponentScan
 @EnableAutoConfiguration
 @Controller
 @EnableRedisHttpSession
 @EnableZuulProxy
 public class DemoApplication {
	 
	@Autowired
	private UserService service;
	
	public DemoApplication() {
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public User user(Principal user) {
		return service.findByUsername(user.getName());
	}
	
	@RequestMapping("/login")
	public String login() {
		return "forward:/";
	}

	@RequestMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
 }
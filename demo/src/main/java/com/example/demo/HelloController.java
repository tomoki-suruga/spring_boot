package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DemoService;

@Controller
public class HelloController {

@RequestMapping(value="/hello")
private String hello(){
	return "/index.html";
}
@RequestMapping(value="/demo")
private String callService(){
	DemoService.execute();
	return "/index.html";
}
}

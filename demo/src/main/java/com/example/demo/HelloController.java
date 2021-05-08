package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DemoService;

@Controller
public class HelloController {

@RequestMapping(value="/hello")
private String hello(){
	return "/index.html";
}

@Autowired
DemoService service;
@RequestMapping(value="/demo")
private String callService(){
	service.execute();
//	new DemoService("初期化");
	return "/index.html";
}
}

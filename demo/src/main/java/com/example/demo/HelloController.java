package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;
import com.example.demo.service.DemoService;
import com.example.demo.service.MathServiceImpl;
import com.example.demo.service.MemberService;
import com.example.demo.service.MemberServiceImpl;

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

//@Autowired
//private MemberServiceImpl MemberService;

@RequestMapping(value="/Member")
private String member(){
	//MemberServiceImpl MemberSevice = new MemberServiceImpl();
	//MemberServiceImpl MemberService = MemberServiceImpl.getInstance();
	MemberService MemberService = MemberServiceImpl.getInstance();
	System.out.println(MemberService.greet(2));
	System.out.println(MemberService.getAll());
	ArrayList<Member> list = MemberService.getAll();
	for (Member mem : list) {
		System.out.println(mem.getId()+","+mem.getName()+","+mem.getEmail()+",");
	}
	return "/index.html";
}

@Autowired
private MathServiceImpl MathService;

@RequestMapping(value="/sum")
private String sum(){
	System.out.println(MathService.sumOf(3,5));
	return "/index.html";
}

}

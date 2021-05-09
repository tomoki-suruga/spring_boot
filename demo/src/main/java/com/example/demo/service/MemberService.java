package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;


public interface MemberService {

	String greet(int i);
	
	ArrayList<Member> getAll();
}

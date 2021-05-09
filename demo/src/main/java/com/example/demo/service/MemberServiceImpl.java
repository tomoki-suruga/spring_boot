package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	private static MemberServiceImpl singleton  = new MemberServiceImpl();
	
	private MemberServiceImpl(){}; 
	
	public static MemberServiceImpl getInstance() {
		return singleton;
	}

	@Override
	public String greet(int i) {
		String[] greetings = {"good morning","Hello","good evening"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1,"Linda","Linda@example.com");
		Member mem2 = new Member(2,"James","James@example.com");
		list.add(mem1);
		list.add(mem2);
		return list;
	}

}

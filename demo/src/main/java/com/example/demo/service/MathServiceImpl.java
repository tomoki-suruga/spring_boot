package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

	@Override
	public int sumOf(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y ; i++){
			sum += i;
		}
		return sum;
	}

}

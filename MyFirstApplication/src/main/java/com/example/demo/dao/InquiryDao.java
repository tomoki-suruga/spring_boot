package com.example.demo.dao;

import java.util.List;
import com.example.demo.entity.Inquiry;


public interface InquiryDao {

	void inasertInquiry(Inquiry inquiry);
	
	List<Inquiry> getAll();
}

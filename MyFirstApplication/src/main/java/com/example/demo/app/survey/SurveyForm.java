package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {
	
	@Min(0)
	@Max(150)
	private int age;
	@Min(1)
	@Max(5)
	private int satisfaction;
	@Size(min = 1, max = 200, message = "please input 200characters or less")
	@NotNull
	private String comment;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String commment) {
		this.comment = commment;
	}
}

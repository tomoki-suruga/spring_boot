package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Survey;

@Repository
public class SurveyDaoImpl implements SurveyDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public SurveyDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertSurvey(Survey survey) {
		jdbcTemplate.update("INSERT INTO survey(age, satisfaction, comment, created) VALUES(?, ?, ?, ?)",
				survey.getAge(),survey.getSatisfaction(),survey.getComment(),survey.getCreated());
	}

	@Override
	public List<com.example.demo.entity.Survey> getAll() {
		String sql = "select age, satisfaction, comment, created from survey";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<Survey> list = new ArrayList<Survey>();
		for (Map<String, Object> result:resultList) {
			Survey survey = new Survey();
			survey.setAge((int)result.get("age"));
			survey.setSatisfaction((int)result.get("satisfaction"));
			survey.setComment((String)result.get("comment"));
			survey.setCreated(((Timestamp)result.get("created")).toLocalDateTime());
			list.add(survey);
		}
		return list;
	}

}

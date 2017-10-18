package com.ustb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ustb.dao.ExamRepository;
import com.ustb.model.Exam;
import com.ustb.service.ExamService;

@Controller
public class ExamController {

@Autowired
private	ExamService examService;
	// inject via application.properties
	// @Value("${welcome.message:test}")
	private String xiaoxi = "Hello World!!!!";


	@RequestMapping("/exam")
	public String findAll(Map<String, Object> model) {
	examService.add();
		model.put("qiantai", examService.findAll());
		// validate the user in DB
		return "qiantai";// jsp name
	}



}
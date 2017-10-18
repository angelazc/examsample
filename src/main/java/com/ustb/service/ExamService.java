package com.ustb.service;

import java.awt.List;
import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustb.dao.ExamRepository;
import com.ustb.model.Exam;

@Service
@Transactional
public class ExamService {

	@Autowired
	ExamRepository examRepository;

	public ExamService() {
		this.examRepository = examRepository;
	}

	public ArrayList<Exam> findAll() {
		ArrayList<Exam> result=new ArrayList<Exam>();
		for(Exam exam:examRepository.findAll()){
			result.add(exam);
		}
		return  result;
	}

	public void addExam(Exam exam) {

		examRepository.save(exam);
	}
	public void add(){
		
		Exam exam=new Exam(1,1,"234234");	
		
			addExam(exam);

	}
}

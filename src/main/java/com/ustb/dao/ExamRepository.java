package com.ustb.dao;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ustb.model.Exam;

public interface ExamRepository extends  JpaRepository<Exam, Integer>{

	Exam findByExamId(int examId);
	Exam findByQeustionId(int questionId);
	ArrayList<Exam>  findAll();
	
}

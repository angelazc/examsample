package com.ustb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam_table")
public class Exam implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;
	@Column(nullable = false)
	private int examId;
	@Column(nullable = false)
	private String question;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Exam(int examId, int questionId, String question) {
		super();
		this.examId = examId;
		this.questionId = questionId;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Exam [questionId=" + questionId + ", examId=" + examId + ", question=" + question + "]";
	}

}

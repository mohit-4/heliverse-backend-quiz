package com.heliverse.quiz;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String question;
    private int[]options;
    private int[]rightAnswer;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int[] getOptions() {
		return options;
	}

	public void setOptions(int[] options) {
		this.options = options;
	}

	public int[] getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(int[] rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options)
				+ ", rightAnswer=" + Arrays.toString(rightAnswer) + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + "]";
	}

	public UserEntity(int id, String question, int[] options, int[] rightAnswer, LocalDateTime startDateTime,
			LocalDateTime endDateTime) {
		super();
		this.id = id;
		this.question = question;
		this.options = options;
		this.rightAnswer = rightAnswer;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}

	public UserEntity() {
		super();
		
	}
    
    	}

package com.prudhvi.registration.models;

import org.springframework.web.bind.annotation.RequestParam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pspr_registration")
public class Registration {
	@Id
	@GeneratedValue
	private int regId;
	private String course;
	@OneToOne(mappedBy = "registration")
	private Student student;
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Registration(int regId, String course, Student student) {
		this.regId = regId;
		this.course = course;
		this.student = student;
	}
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Registration [regId=" + regId + ", course=" + course + ", student=" + student + "]";
	}
}

package com.prudhvi.registration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prudhvi.registration.models.Registration;
import com.prudhvi.registration.models.Student;
import com.prudhvi.registration.repos.RegistrationRepo;
import com.prudhvi.registration.repos.StudentRepo;

@Controller
public class Control {
	@Autowired
	private StudentRepo srepo;
	@Autowired
	private RegistrationRepo rrepo;
	@GetMapping("/home")
	public String home() {
		return "register";
	}
	@GetMapping("/getStudents")
	public List<Student> getAll() {
		return srepo.findAll();
	}
	@PostMapping("/register")
	@ResponseBody
	public String register(@RequestParam("course") String course,@RequestParam("sname") String sname) {
		Registration registration=new Registration();
		registration.setCourse(course);
		rrepo.save(registration);
		Student student =new Student();
		student.setSname(sname);
		student.setRegistration(registration);
		srepo.save(student);
		return student.getSname()+" is registered for the course "+registration.getCourse();
	}
}

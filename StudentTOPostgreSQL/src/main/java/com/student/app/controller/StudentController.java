package com.student.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.app.model.Student;
import com.student.app.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/form")
	public String studentForm(Model model) {
		model.addAttribute("student", new Student());
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String studentSubmit(Student student, Model model) {

		studentService.saveStudentData(student);
		return "allStudent";
	}

	@RequestMapping("/allStudent")
	public String showAllStudent(Model model) {

		model.addAttribute("student", studentService.getAllStudentData());
		return "allStudent";
	}

	@RequestMapping("/load")
	public String studentSubmit(@RequestParam("id") long id, Model model) {

		model.addAttribute("student", studentService.findOne(id));

		return "load";
	}

}

//path variable

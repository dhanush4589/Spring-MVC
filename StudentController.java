package com.mvc.sdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mvc.sdb.entity.Student;
import com.mvc.sdb.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	@RequestMapping(value = "/add-student", method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentService.addStudent(student);
	}
}

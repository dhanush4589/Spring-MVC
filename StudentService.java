package com.mvc.sdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.mvc.sdb.entity.Student;
import com.mvc.sdb.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public ModelAndView addStudent(Student student) {
		//Resolving Request
		studentRepository.saveStudent(student);
		
		//Generating Response
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		mav.addObject("message", "Student Added Sucessfully!");
		return mav;
	}
}

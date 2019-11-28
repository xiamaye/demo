package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/querystudent",method=RequestMethod.GET)
	@ResponseBody
	public List<Student> selectStudentById(String id) {
		
		return studentService.selectStudentById(id);
	}
	@RequestMapping(value="/query",method=RequestMethod.GET)
	@ResponseBody
	public String test(String id) {
		
		return "hello";
	}
}

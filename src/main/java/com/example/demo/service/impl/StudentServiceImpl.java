package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentMapper studentMapper;
	
	@Override
	public List<Student> selectStudentById(String id) {
		// TODO Auto-generated method stub
		return studentMapper.selectStudentById(id);
	}

}

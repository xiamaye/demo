package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.Student;

@Mapper
public interface StudentMapper {

	@Select("select id from official_website_audit_log")
	List<Student> selectStudentById(String id);
}

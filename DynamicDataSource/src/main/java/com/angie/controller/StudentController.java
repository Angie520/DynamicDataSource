/**
 * 
 */
package com.angie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angie.entity.Student;
import com.angie.service.StudentService;

/**
 * 
 * @author Angie
 * github:https://github.com/Angie520
 * @date 2017年4月5日 下午2:43:48
 */
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/hello")
	public String AbHello() {
		return "Hello";
	}
	
	@RequestMapping("/getList")
	public List<Student> getList() {
		return studentService.getList();
	}
	
	@RequestMapping("/getListByOne")
	public List<Student> getListByOne() {
		return studentService.getListByDs1();
	}
	
	@RequestMapping("/getListByNameOne")
	public List<Student> likeNameByOne(String name) {
		return studentService.likeName(name);
	}
	
	@RequestMapping("/getListByName")
	public List<Student> likeName(String name) {
		return studentService.likeNameByDefaultDataSource(name);
	}
}

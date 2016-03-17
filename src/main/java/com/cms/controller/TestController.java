package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cms.service.BooksService;
import com.cms.service.StudentService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired 
	private BooksService booksService;
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/testStudent")
	public String getStudentData() {
		
		return null;
	}
	
	
	
}

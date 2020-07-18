package com.study.springbootwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String home() {
		System.out.println("in TestController class");
		return "spring boot is working ;)";
	}
}

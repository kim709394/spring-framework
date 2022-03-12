package com.kim.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjie
 * @description
 * @date 2022-03-12
 */
@RestController
@RequestMapping("/demo")
public class DemoController {



	@GetMapping("/get")
	public String get(){
		return "success";
	}
}

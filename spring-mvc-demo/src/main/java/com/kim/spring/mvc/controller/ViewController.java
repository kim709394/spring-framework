package com.kim.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangjie
 * @description
 * @date 2022-03-15
 */
@Controller
@RequestMapping("/view")
public class ViewController {


	@GetMapping("/render")
	public String render(){

		return "myView";
	}


}

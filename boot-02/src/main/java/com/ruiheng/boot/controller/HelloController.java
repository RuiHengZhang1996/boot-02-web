package com.ruiheng.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/1.jpg")
	public String hello(@RequestParam("username") String name) {
		return "aaaa";
	}
}

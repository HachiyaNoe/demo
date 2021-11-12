package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MemberService;

@Controller
@RequestMapping("/member")

public class MemberController {
	@Autowired
	private MemberService service;

	@RequestMapping("/findAll")
	public String findAll() {
		service.findAll();
		return "finished";
	}
}

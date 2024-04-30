package com.cjc.springbootmvcproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootmvcproject.model.Student;

@Controller
public class HomeControlller {

	@RequestMapping("/")
	public String prelogin() {
		System.out.println("Project");
		return "login";
	}

	@RequestMapping("/openreg")
	public String preRegister() {

		return "register";

	}

	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s, Model m) {
		List<Student> al = new ArrayList<Student>();
		al.add(s);
		m.addAttribute("data", al);
		System.out.println("This is welcome Page");

		return "success";
	}
	@RequestMapping("/log")
	public String LoginPage()
	{
		System.out.println("Hi, This is Login Page");
		return "welcome";
	}
}

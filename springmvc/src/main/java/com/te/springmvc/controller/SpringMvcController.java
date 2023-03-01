package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.springmvc.pojo.Employee;

@Controller
public class SpringMvcController {

	@RequestMapping("/register")
	public String abc() {
		return "register";
	}

//	@RequestMapping("/login")
	@GetMapping("/login")
	public String login() {
		return "login";
	}

//	@RequestMapping("/welcome")
//	public String firstWayOfGettingData(HttpServletRequest request, ModelMap map) {
//		String empName = request.getParameter("empName");
//		String empPass = request.getParameter("empPass");
//		map.addAttribute("a", name);
//		map.addAttribute("b", pass);
//
//		return "/WEB-INF/views/welcome.jsp";
//	}

//	@RequestMapping("/welcome")
//	public String secondWayOfGettingData(@RequestParam String empName,
//			@RequestParam String empPass, ModelMap map) {
//		map.addAttribute("a", empName);
//		map.addAttribute("b", empPass);
//		return "/WEB-INF/views/welcome.jsp";
//	}

//	@RequestMapping("/welcome")
//	public String thirdWayOfGettingData(String empName, String empPass, ModelMap map) {
//		map.addAttribute("a", empName);
//		map.addAttribute("b", empPass);
//		return "/WEB-INF/views/welcome.jsp";
//	}

//	@RequestMapping(path = "/login" , method = RequestMethod.POST)
	@PostMapping("/login")
	public String fourthWayOfGettingData(Employee employee, ModelMap map) {
		map.addAttribute("data", employee);
		return "welcome";
	}
}

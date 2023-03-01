package com.te.empwebapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.empwebapp.entity.Employee;
import com.te.empwebapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/register")
	public String registerForm() {
		return "registrationForm";
	}

	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}

	@PostMapping("/register")
	public String register(ModelMap map, Employee employee) {
		if (service.register(employee)) {
			map.addAttribute("msg", "Registration Successful!!");
		} else {
			map.addAttribute("errMsg", "Something went wrong!!");
		}
		return "registrationForm";
	}

	@PostMapping("/login")
	public String authenticate(ModelMap map, Employee employee, HttpServletRequest request) {
		Employee employee2 = service.authenticate(employee);
		if (employee2 != null) {
//			session creation
			HttpSession session = request.getSession();
			session.setAttribute("loggedIn", employee2);
//			session creation
//			session.setMaxInactiveInterval(3);
			map.addAttribute("data", employee2);
			return "homePage";
		} else {
			map.addAttribute("errMsg", "Invalid credentials!");
			return "loginForm";
		}

	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("errMsg", "Logged out successfully!!");
		return "loginForm";
	}

	@GetMapping("/delete")
	public String deleteForm(HttpSession session, ModelMap map) {
		Employee employee = (Employee) session.getAttribute("loggedIn");
		if (employee != null) {
			return "deleteForm";
		} else {
			map.addAttribute("errMsg", "Please login first!");
			return "loginForm";
		}
	}

	@PostMapping("/delete")
	public String deleteData(String empId, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			if (service.deleteData(empId)) {
				map.addAttribute("msg", "Data successfully deleted!");
			} else {
				map.addAttribute("msg", "Something went wrong!");
			}
			return "deleteForm";
		} else {
			map.addAttribute("errMsg", "Please login first!");
			return "loginForm";
		}
	}

	@GetMapping("/getAll")
	public String getAllEmployee(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			List<Employee> list = service.getAll();
			map.addAttribute("data", list);
			return "getAllPage";
		} else {
			map.addAttribute("errMsg", "Please login first!");
			return "loginForm";
		}
	}

}
package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login");
	}
}

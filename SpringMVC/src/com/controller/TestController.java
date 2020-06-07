package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
@Controller
@RequestMapping("/welcome")

public class TestController extends SimpleFormController {
	
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse res)
	{
		return new ModelAndView("new");
	}

}

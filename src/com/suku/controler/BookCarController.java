package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BookCarController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		if(SendAcknoledgeEmail.sendEmail("borseswati94@gmail.com")){
			return new ModelAndView("UserHome");
		}
		//code for user and dealer by usiing userid and search dealerid from particular Car data
		return new ModelAndView("error");
	}

}

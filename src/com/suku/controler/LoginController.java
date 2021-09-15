package com.suku.controler;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.mapping.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.suku.dao.DealerDao;
import com.suku.dao.UserDao;

public class LoginController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String userName=arg0.getParameter("uname");
		System.out.println(userName);
		if(userName==null)
		{
			arg1.sendRedirect("Login.jsp");
		}
		else
		{
			
			String pass=arg0.getParameter("pass");
			HttpSession session=arg0.getSession();
			session.setAttribute("username",userName );
			ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
			UserDao d=(UserDao) con.getBean("dao");
		
		if(d.isValidUser(userName, pass)==true)
			
		{
		return new ModelAndView("UserHome");
		}
		else
		{
			return new ModelAndView("error");
		}
		}
		return null;
	}

}

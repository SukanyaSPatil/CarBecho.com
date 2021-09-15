package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.suku.pojo.User;
import com.suku.dao.UserDao;

public class RegisterUserController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String username=arg0.getParameter("userName");
		String password=arg0.getParameter("password");
		String firstName=arg0.getParameter("firstName");
		String lastName=arg0.getParameter("lastName");
		String city=arg0.getParameter("city");
		String state=arg0.getParameter("state");
		String contactNo=arg0.getParameter("contactNo");
        String pin=arg0.getParameter("pin");
		User u=new User(username, password, firstName, lastName, city, state, contactNo, pin);
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		UserDao d=(UserDao) con.getBean("dao");
		if(d.insert(u))
		{
		return new ModelAndView("user-login");
		}
		else
		{
			return new ModelAndView("error");
		}
	}

}

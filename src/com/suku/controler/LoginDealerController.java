package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.suku.dao.DealerDao;



public class LoginDealerController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String dealerId=arg0.getParameter("dealerId");
		System.out.println(dealerId);
		if(dealerId==null)
		{
			arg1.sendRedirect("DealerLogin.jsp");
		}
		else
		{
			
			String pass=arg0.getParameter("pass");
			HttpSession session=arg0.getSession();
			session.setAttribute("dealerId",dealerId );
			ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
			DealerDao d=(DealerDao) con.getBean("Ddao");
		
		if(d.isValidDealer(dealerId, pass)==true)
		{
		return new ModelAndView("DealerHome");
		}
		else
		{
			return new ModelAndView("error");
		}
		}
		return null;
	}

}

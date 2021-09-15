package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.suku.dao.CarDao;
import com.suku.dao.DealerDao;
import com.suku.pojo.Car;
import com.suku.pojo.Dealer;

public class RegisterDelalerController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		 String dealerId=arg0.getParameter("dealer");
		 String company=arg0.getParameter("company");
		 String fname=arg0.getParameter("fname");
		 String lname=arg0.getParameter("lname");
		 String state=arg0.getParameter("state");
		 String city=arg0.getParameter("city");
		 String telephone=arg0.getParameter("tel");
		 String email=arg0.getParameter("email");
		 String password=arg0.getParameter("pass");
		 ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
			DealerDao d=(DealerDao) con.getBean("Ddao");
			Dealer d1=new Dealer(dealerId, company, fname, lname, state, city, telephone, email, password);
			if(d.insert(d1))
			{
			return new ModelAndView("dealer-login");
			}
			else
			{
				return new ModelAndView("error");
			}
	}

}

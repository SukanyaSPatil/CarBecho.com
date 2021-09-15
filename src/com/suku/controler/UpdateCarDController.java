package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.suku.dao.CarDao;
import com.suku.pojo.Car;

public class UpdateCarDController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		
	    String chasisNumber=arg0.getParameter("chasisNo");//how to get it
	    System.out.println(chasisNumber);
		String model=arg0.getParameter("model");
		String type=arg0.getParameter("type");
		String color=arg0.getParameter("color");
		String engineNumber=arg0.getParameter("engineNumber");
		String company=arg0.getParameter("company");
		String price=arg0.getParameter("price");
		String description=arg0.getParameter("description");
		String quantity=arg0.getParameter("quantity");
		String paymentOption=arg0.getParameter("payterm");
		String delivery=arg0.getParameter("delivery");
		System.out.println(model+" "+quantity);
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao c=(CarDao) con.getBean("cdao");
		
		if(c.updateCar(chasisNumber, model, type, color, engineNumber, price, description, quantity, paymentOption, delivery))
		{
		return new ModelAndView("DealerHome");
		}
		else
		{
			return new ModelAndView("error");
		}

	}

}

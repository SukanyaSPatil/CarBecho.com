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
public class InsertCarController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=arg0.getSession();
		String dealerId=(String)session.getAttribute("dealerId");
		System.out.println(dealerId);
		String chasisNumber=arg0.getParameter("chasisNumber");
		String model=arg0.getParameter("model");
		String type=arg0.getParameter("type");
		String color=arg0.getParameter("color");
		String engineNumber=arg0.getParameter("engineNumber");
		//String dealer=arg0.getParameter("dealer");
		String company=arg0.getParameter("company");
		String price=arg0.getParameter("price");
		String description=arg0.getParameter("description");
		String image=arg0.getParameter("image");
		int quantity=Integer.parseInt(arg0.getParameter("quantity"));
		String  paymentTerm=arg0.getParameter("paymentopt");
		String delivery=arg0.getParameter("delivery");
		System.out.println(quantity+" "+paymentTerm+" "+delivery);
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao c=(CarDao) con.getBean("cdao");
		Car c1=new Car(chasisNumber, model, type, color, engineNumber, dealerId, company, price, description, image, quantity, paymentTerm, delivery);
		if(c.insert(c1))
		{
		return new ModelAndView("DealerHome");
		}
		else
		{
			return new ModelAndView("error");
		}

	}

}

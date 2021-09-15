package com.suku.controler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.suku.dao.CarDao;
import com.suku.pojo.Car;

public class DetailsOfCarForUserController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session1=arg0.getSession();
	    String chasisNo=arg0.getParameter("chasisNo");
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao car=(CarDao) con.getBean("cdao");
		List<Car> Detaillist=car.fetchCarsDetails(chasisNo);
		HttpSession session=arg0.getSession();
		session.setAttribute("CarsUDetails", Detaillist);
		return new ModelAndView("DetailsUCar");
	}

}

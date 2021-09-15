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

public class SearchByBrandController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
	    String company=(String)arg0.getParameter("brand");
	    System.out.println(company);
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao car=(CarDao) con.getBean("cdao");
		List<Car> list=car.fetchCarsByBrand(company);
		HttpSession session=arg0.getSession();
		session.setAttribute("CarsU", list);
		return new ModelAndView("ShowUCar");
		
	}
	

}

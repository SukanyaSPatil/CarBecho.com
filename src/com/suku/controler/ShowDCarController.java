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
import com.suku.dao.UserDao;
import com.suku.pojo.Car;

public class ShowDCarController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session1=arg0.getSession();
	    String dealerId=(String)session1.getAttribute("dealerId");
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao car=(CarDao) con.getBean("cdao");
		List<Car> list=car.fetchCars(dealerId);
		HttpSession session=arg0.getSession();
		session.setAttribute("Cars", list);
		return new ModelAndView("ShowDCar");
	}

}

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

public class DeleteCarDController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		CarDao car=(CarDao) con.getBean("cdao");
		//how to get chasisNumber
		//String chasisNumber=arg0.getParameter("car");
		HttpSession session=arg0.getSession();
	    String chasisNumber=(String)arg0.getParameter("chasisNo");//how to get it
	    System.out.println(chasisNumber);
		if(car.deleteCar(chasisNumber)){
		//List<Car> list=car.fetchCars(DealerId);
		//session.setAttribute("Cars", list);
		//return new ModelAndView("ShowDCar");
		return new ModelAndView("DealerHome");
			}
		else{
			return new ModelAndView("error");
		}
	}

}

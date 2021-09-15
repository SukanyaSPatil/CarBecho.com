package com.suku.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UpdateAndDeleteCombineController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String action=arg0.getParameter("action");
		
		String chasisNo=arg0.getParameter("chasisNo");
		System.out.println(chasisNo);
		HttpSession session=arg0.getSession();
		session.setAttribute("chasisNo", chasisNo);
		
		if(action.equals("Delete")){
			return new  ModelAndView("DeleteD");
		}
		else{
			
			return new  ModelAndView("UpdateD");
		}
			
		
	}

}

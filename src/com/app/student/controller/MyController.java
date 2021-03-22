package com.app.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.student.model.UserInfo;
import com.app.student.service.MyService;

@RequestMapping("/")
@Component
public class MyController {
	
	@Autowired
	MyService ms;
	
	@Autowired 
	HttpSession session;
	
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute UserInfo dto)
	{
		boolean b=ms.register(dto);
		if(b) {
		return new ModelAndView("login","m","<h3>Registration Successfull</h3>");
		}else {
			return new ModelAndView("register","m","Registration Failed");
		}
	}
	
	  @RequestMapping(value="/login",method=RequestMethod.GET) 
	  public ModelAndView login(@RequestParam String username,String password) { 
		  UserInfo sdto=ms.login(username, password); 
		  if(sdto!=null) {
			  session.setAttribute("username1", sdto.getUsername()); 
	  
	  return new ModelAndView("viewpage","sdto",sdto); 
	  }else { 
		  return new ModelAndView("login","msg","Login Failed");
		  }
		  }
	  
	  @RequestMapping("/view") 
	  public ModelAndView view() {
		  if(session.getAttribute("username1")!=null) {
		 List<UserInfo> list=ms.view();
		  return new ModelAndView("home","list",list);
		  }else {
			  return new ModelAndView("login","msg","Login First");
		  }
	  }
	  
	  @RequestMapping("/delete")
	  public ModelAndView delete(@RequestParam int id) {
		  
		  boolean b=ms.delete(id);
		  if(b) {
		  return new ModelAndView("viewpage","msg","Deleted Successfully");
		  }else {
			  return new ModelAndView("viewpage","msg","Delete Failed");
		  }
	  }
	  
	  @RequestMapping("/logout")
	  public ModelAndView logout() {
		  if(session.getAttribute("username1")!=null) {
		  session.invalidate();
		  return new ModelAndView("login","msg","Logout Success");
		  }else {
			  return new ModelAndView("login","msg","Login First");
		  }
	  }
	  

	  
	

}

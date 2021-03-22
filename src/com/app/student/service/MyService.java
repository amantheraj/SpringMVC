package com.app.student.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.app.student.model.UserInfo;


public interface MyService {
	
	public boolean register(UserInfo dto);
	public UserInfo login(String username,String password);
	public List<UserInfo> view();
	public boolean delete(int id);
}

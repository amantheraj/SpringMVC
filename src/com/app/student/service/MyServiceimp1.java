package com.app.student.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.student.Dao.MyDAO;
import com.app.student.model.UserInfo;

@Component
public class MyServiceimp1 implements MyService {

	@Autowired
	MyDAO md;
	
	@Override
	public boolean register(UserInfo dto) {
		boolean b=md.register(dto);
		return b;
	}
	
	@Override
	public UserInfo login(String username, String password) {
		UserInfo dto=md.login(username, password);
		return dto;
	}
	
	@Override
	public List<UserInfo> view() {
		List<UserInfo> list=md.view();
		return list;
	}
	

	@Override
	public boolean delete(int id) {
		boolean b=md.delete(id);
		return b;
	}
	

	

}

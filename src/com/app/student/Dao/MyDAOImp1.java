package com.app.student.Dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.student.model.UserInfo;
@Component
public class MyDAOImp1 implements MyDAO {

	@Autowired 
	HttpSession session;
	
	@Autowired
	SessionFactory sf;
	
		@Override
		public boolean register(UserInfo sdto) {
			Session ss=sf.openSession();
			Criteria cr=ss.createCriteria(UserInfo.class);
			cr.add(Restrictions.eq("username", sdto.getUsername()));
			UserInfo dto=(UserInfo) cr.uniqueResult();
			if(dto!=null) {
			return false;
			}else {
				
				ss.save(sdto);
				ss.beginTransaction().commit();
				ss.close();
				return true;
			}
		}
		
		@Override
		public UserInfo login(String username, String password) {
			Session ss=sf.openSession();
			Criteria cr=ss.createCriteria(UserInfo.class);
			cr.add(Restrictions.eq("username", username));
			cr.add(Restrictions.eq("password", password));
			UserInfo sdto=(UserInfo) cr.uniqueResult();
			return sdto;
			
		}
		
		@Override
		public List<UserInfo> view() {
			Session ss=sf.openSession();
			Criteria cr=ss.createCriteria(UserInfo.class);
//			String username1=(String) session.getAttribute("username1");
//			cr.add(Restrictions.eq("username",username1));
			List<UserInfo> mlist=cr.list();
			return mlist;
		}
		
		@Override
		public boolean delete(int id) {
			Session ss=sf.openSession();
			Criteria cr=ss.createCriteria(UserInfo.class);
			cr.add(Restrictions.eq("id", id));
			
			UserInfo dto=(UserInfo) cr.uniqueResult();
			if(dto!=null) {
				ss.save(dto);
				ss.delete(dto);
				ss.beginTransaction().commit();
				ss.close();
				return true;
			}else {
			return false;
			}
		}

	

	}



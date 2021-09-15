package com.suku.dao;
import com.suku.pojo.User;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class UserDao {
private HibernateTemplate template;

public HibernateTemplate getTemplate() {
	return template;
}

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public boolean insert(User u)
{
	template.save(u);
	return true;
	}

public List<User> fetchData(String uname)
{
	List<User> list=(List) template.find(uname);
	return list;
	}
public boolean updateUser(User u)
{
	User u1=(User) template.find(u.getUsername());
	return true;
	}

public boolean isValidUser(String uname,String password){
	List<User> user=(List<User>) template.find("from User u where u.username='"+uname+"'");
	System.out.println(user.get(0).getPassword());
	if(user.get(0).getPassword().equals(password)==true)
	{
		return true;
	}
	else{
	return false;
	}

}
}

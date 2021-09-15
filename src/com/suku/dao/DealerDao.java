package com.suku.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.suku.pojo.Dealer;

public class DealerDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public boolean insert(Dealer d)
	{
		template.save(d);
		return true;
		}

	public List<Dealer> fetchCars(String company)
	{
		List<Dealer> list=(List) template.find("from Dealer d where d.company='"+company+"'");
		return list;
		}
	
	
	public boolean deleteDealer(String dealerId)
	{
		Dealer d=(Dealer) template.find("from Dealer d where d.dealerId='"+dealerId+"'");
		template.delete(d);
		return true;
		}
    public boolean isValidDealer(String dealerId,String password){
    	List<Dealer> dealer=(List<Dealer>) template.find("from Dealer d where d.dealerId='"+dealerId+"'");
    	System.out.println(dealer.get(0).getPassword());
		if(dealer.get(0).getPassword().equals(password)==true)
		{
			return true;
		}
		else{
    	return false;
    	}
    }
}

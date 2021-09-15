package com.suku.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.suku.pojo.Car;

public class CarDao {

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public boolean insert(Car c)
	{
		template.save(c);
		return true;
		}

	public List<Car> fetchCars(String dealer)
	{
		List<Car> list=(List) template.find("from Car c where c.dealer='"+dealer+"'");
		return list;
		}
	
	public List<Car> fetchCarsDetails(String chasisNo)
	{
		List<Car> list=(List) template.find("from Car c where c.chasisNumber='"+chasisNo+"'");
		return list;
		}
	
	public List<Car> fetchCarsByBrand(String company)
	{
		List<Car> list=(List) template.find("from Car c where c.company='"+company+"'");
		return list;
		}
	
	public boolean updateCar(String chasisNumber, String model, String type, String color, String engineNumber,
			 String price, String description,String quantity,String Payterm,String delivery)
	{
		System.out.println(chasisNumber);
		ArrayList<Car> cars=(ArrayList<Car>) template.find("from Car c where c.chasisNumber='"+chasisNumber+"'");
		Car c1=cars.get(0);
		if(model.isEmpty()==false)
		{
			c1.setModel(model);
		}
		if(type.isEmpty()==false)
		{
			c1.setType(type);
		}
		if(color.isEmpty()==false)
		{
			c1.setColor(color);
		}
		if(engineNumber.isEmpty()==false)
		{
			c1.setEngineNumber(engineNumber);
		}
		
		if(price.isEmpty()==false)
		{
			c1.setPrice(price);
		}
		if(description.isEmpty()==false)
		{
			c1.setDescription(description);
		}
		if(quantity.isEmpty()==false)
		{
			int q=Integer.parseInt(quantity);
			c1.setQuantity(q);
		}
		if(delivery.isEmpty()==false)
		{
			c1.setDelivery(delivery);;
		}
		if(Payterm.isEmpty()==false)
		{
			c1.setPaymentTerm(Payterm);;
		}
		template.merge(c1);
		return true;
		}
	
	public boolean deleteCar(String chasisNumber)
	{
		System.out.println(chasisNumber+"  in dao");
		ArrayList<Car> cars=(ArrayList<Car>) template.find("from Car c where c.chasisNumber='"+chasisNumber+"'");
		Car c1=cars.get(0);
		System.out.println(c1.getChasisNumber()+" after select");
		template.delete(c1);
		
		return true;
		}
	
}

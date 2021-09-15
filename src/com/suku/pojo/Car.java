package com.suku.pojo;

import java.io.Serializable;

public class Car implements Serializable{
	String chasisNumber;
	String model;
	String type;
	String color;
	String engineNumber;
	String dealer;
	String company;
	String price;
	String description;
	String image;
	int quantity;
	String paymentTerm;
	String delivery;

	public Car() {
		// TODO Auto-generated constructor stub
		//this.dealer = "suku";
	}

	

	public Car(String chasisNumber, String model, String type, String color, String engineNumber, String dealer,
			String company, String price, String description, String image, int quantity, String paymentTerm,
			String delivery) {
		super();
		this.chasisNumber = chasisNumber;
		this.model = model;
		this.type = type;
		this.color = color;
		this.engineNumber = engineNumber;
		this.dealer = dealer;
		this.company = company;
		this.price = price;
		this.description = description;
		this.image = image;
		this.quantity = quantity;
		this.paymentTerm = paymentTerm;
		this.delivery = delivery;
	}



	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getDealer() {
		return dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String discription) {
		this.description = discription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getPaymentTerm() {
		return paymentTerm;
	}



	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}



	public String getDelivery() {
		return delivery;
	}



	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}



	@Override
	public String toString() {
		return "Car [chasisNumber=" + chasisNumber + ", model=" + model + ", type=" + type + ", color=" + color
				+ ", engineNumber=" + engineNumber + ", dealer=" + dealer + ", company=" + company + ", price=" + price
				+ ", description=" + description + ", image=" + image + ", quantity=" + quantity + ", paymentTerm="
				+ paymentTerm + ", delivery=" + delivery + "]";
	}

}

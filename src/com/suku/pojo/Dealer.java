package com.suku.pojo;

public class Dealer {
 private String dealerId;
 private String company;
 private String fname;
 private String lname;
 private String state;
 private String city;
 private String telephone;
 private String email;
 private String password;
 
 public Dealer() {
	// TODO Auto-generated constructor stub
}

public Dealer(String dealerId, String company, String fname, String lname, String state, String city, String telephone,
		String email, String password) {
	super();
	this.dealerId = dealerId;
	this.company = company;
	this.fname = fname;
	this.lname = lname;
	this.state = state;
	this.city = city;
	this.telephone = telephone;
	this.email = email;
	this.password = password;
}

public String getDealerId() {
	return dealerId;
}

public void setDealerId(String dealerId) {
	this.dealerId = dealerId;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Dealer [dealerId=" + dealerId + ", company=" + company + ", fname=" + fname + ", lname=" + lname
			+ ", state=" + state + ", city=" + city + ", telephone=" + telephone + ", email=" + email + ", password="
			+ password + "]";
}
 
 
}

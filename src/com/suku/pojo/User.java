package com.suku.pojo;

public class User {
	String username;
	String password;
	String firstName;
	String lastName;
	
	String city;
	String state;
    String contactNo;
	String pin;
	
	public User() {
		super();
	}

	public User(String username, String password, String firstName, String lastName, String city,
			String state, String contactNo, String pin) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	
		this.city = city;
		this.state = state;
		this.contactNo = contactNo;
		this.pin = pin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", city=" + city + ", state=" + state + ", contactNo=" + contactNo
				+ ", pin=" + pin + "]";
	}

	


}

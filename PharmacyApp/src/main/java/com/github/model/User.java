package com.github.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
		
	@Column(name = "password")
	private String password;
	@Column(name = "username")
	private String userName;

	
		@Column(name = "emailid")
	private String emailId;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "contactnumber")
	private String contactNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "pincode")
	private String pincode;
	
	public User() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public User(long userId, String password, String userName, String emailId, int age, String contactNumber,
			String city, String state, String pincode) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.emailId = emailId;
		this.age = age;
		this.contactNumber = contactNumber;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", emailId=" + emailId
				+ ", age=" + age + ", contactNumber=" + contactNumber + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	}
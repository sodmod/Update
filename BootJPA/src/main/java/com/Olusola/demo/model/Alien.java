package com.Olusola.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{
	//these are the parameters
	private String mName;
	private String UserName;
	private String lName;
	private String fName;
	
	//this is the id i.e the primary key
	@Id
	private String phoneNumber;
	
	//applying a getters and setters to all the parameters... cause we still gonna need them
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//this is to set all the parameters to string once they are called. It's gonna return alien
	@Override
	public String toString() {
		return "Alien [mName=" + mName + ", UserName=" + UserName + ", lName=" + lName + ", fName=" + fName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}

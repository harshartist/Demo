package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class BillModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String address;
	private String email;
	private String mobileNo;
	private String name;
	private double price;
	
	
	public BillModel() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BillModel [id=" + id + ", address=" + address + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", name=" + name + ", price=" + price + "]";
	}
	

}

package com.example.domain;

import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private String img;
	private String gender;
	private java.util.Date hireDate;
	private String mailAddress;
	private String zipCode;
	private String address;
	private String telephone;
	private Integer salary;
	private String characterisitics;
	private Integer departmentCount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public java.util.Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getCharacterisitics() {
		return characterisitics;
	}
	public void setCharacterisitics(String characterisitics) {
		this.characterisitics = characterisitics;
	}
	public Integer getDepartmentCount() {
		return departmentCount;
	}
	public void setDepartmentCount(Integer departmentCount) {
		this.departmentCount = departmentCount;
	}
	
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, String img, String gender, Date hireDate, String mailAddress,
			String zipCode, String address, String telephone, Integer salary, String characterisitics,
			Integer departmentCount) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.gender = gender;
		this.hireDate = hireDate;
		this.mailAddress = mailAddress;
		this.zipCode = zipCode;
		this.address = address;
		this.telephone = telephone;
		this.salary = salary;
		this.characterisitics = characterisitics;
		this.departmentCount = departmentCount;
	}
	
	
	

}

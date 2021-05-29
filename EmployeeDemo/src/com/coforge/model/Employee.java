package com.coforge.model;

public class Employee {
	String empname;
	int empid;
	
	Long mobileNo;
	Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	

	
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobile) {
		this.mobileNo = mobile;
	}
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", mobileNo=" + mobileNo + ", address=" + address
				+ "]";
	}

}

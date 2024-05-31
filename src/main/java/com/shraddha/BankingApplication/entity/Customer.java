package com.shraddha.BankingApplication.entity;

public class Customer {
	private String customerName;
	private int customerAccountNumber;
	private String customerPassword;
	private String customerMobile;
	private int customerBalance;
	private String customerAddress;
	private String customerMail;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public int getCustomerBalance() {
		return customerBalance;
	}
	public void setCustomerBalance(int customerBalance) {
		this.customerBalance = customerBalance;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public Customer(String customerName, int customerAccountNumber, String customerPassword, String customerMobile,
			int customerBalance, String customerAddress, String customerMail) {
		super();
		this.customerName = customerName;
		this.customerAccountNumber = customerAccountNumber;
		this.customerPassword = customerPassword;
		this.customerMobile = customerMobile;
		this.customerBalance = customerBalance;
		this.customerAddress = customerAddress;
		this.customerMail = customerMail;
	}
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAccountNumber=" + customerAccountNumber
				+ ", customerPassword=" + customerPassword + ", customerMobile=" + customerMobile + ", customerBalance="
				+ customerBalance + ", customerAddress=" + customerAddress + ", customerMail=" + customerMail + "]";
	}
	

}

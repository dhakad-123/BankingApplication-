package com.shraddha.BankingApplication.entity;

public class Accountant {
	private String accountantName;
	private String accountantEmail;
	private String accountantPassword;
	public String getAccountantName() {
		return accountantName;
	}
	public void setAccountantName(String accountantName) {
		this.accountantName = accountantName;
	}
	public String getAccountantEmail() {
		return accountantEmail;
	}
	public void setAccountantEmail(String accountantEmail) {
		this.accountantEmail = accountantEmail;
	}
	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accountant(String accountantName, String accountantEmail, String accountantPassword) {
		super();
		this.accountantName = accountantName;
		this.accountantEmail = accountantEmail;
		this.accountantPassword = accountantPassword;
	}
	public String getAccountantPassword() {
		return accountantPassword;
	}
	public void setAccountantPassword(String accountantPassword) {
		this.accountantPassword = accountantPassword;
	}
	@Override
	public String toString() {
		return "Accountant [accountantName=" + accountantName + ", accountantEmail=" + accountantEmail
				+ ", accountantPassword=" + accountantPassword + "]";
	}
	

}

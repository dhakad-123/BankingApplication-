package com.shraddha.BankingApplication.dao;

import com.shraddha.BankingApplication.entity.Accountant;

public interface AccountantDao {

	public Accountant LoginAccountant(String accountantName,String accountantPwd);
	public int addCustomer(String customerName,String customerPassword, String customerMobile,
			 String customerAddress, String customerMail);
	public String addAccount(int cutomerBalance,int cid);
	}


package com.shraddha.BankingApplication.dao;

import com.shraddha.BankingApplication.entity.Accountant;

public interface AccountantDao {

	public Accountant LoginAccountant(String accountantName,String accountantPwd);
	
	}


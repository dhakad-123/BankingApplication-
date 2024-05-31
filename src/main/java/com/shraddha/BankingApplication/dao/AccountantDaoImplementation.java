package com.shraddha.BankingApplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shraddha.BankingApplication.databaseconnection.DatabaseConnection;
import com.shraddha.BankingApplication.entity.Accountant;

public class AccountantDaoImplementation implements AccountantDao{
  public Accountant LoginAccountant(String accountantName,String accountantPwd)
  {
	  Accountant ac=null;
	  try {
		  Connection con=DatabaseConnection.connectionProvider();
		  PreparedStatement ps=con.prepareStatement("select *from accountant where accountantName=? and accountantPassword=?");
		  ps.setString(1, accountantName);
		  ps.setString(2, accountantPwd);
		  ResultSet rs=ps.executeQuery();
		  String n=null;       //accountant name
		  String p=null;       //accountant password
		  String e=null;       //accountant email
		  while(rs.next())
		  {
			 n=rs.getString("accountantName");
			 e=rs.getString("accountantEmail");
			 p=rs.getString("accountantPassword");
			
		  }
		  ac=new Accountant(n,e,p);
		  }
	  catch(Exception e) {
		  
	  }
	  
	  return ac;
  }

@Override
public int addCustomer(String customerName, String customerPassword, String customerMobile,
		 String customerAddress, String customerMail) {
	// TODO Auto-generated method stub
	int cid=-1;
	try {
		Connection con=DatabaseConnection.connectionProvider();
		PreparedStatement ps=con.prepareStatement("insert into customerInformation(customerName,customerPassword ,customerMobile ,customerAddress  ,customerMail) values(?,?,?,?,?)");
		ps.setString(1,customerName);
		ps.setString(2,customerPassword);
		ps.setString(3,customerMobile);
		ps.setString(4,customerAddress);
		ps.setString(5, customerMail);
		int x =ps.executeUpdate();
		if(x>0)
		{
			System.out.println("customer added successfully");
			PreparedStatement ps2=con.prepareStatement("select cid from customerInformation where customerMobile=? and  customerMail=? ");
			ps2.setString(1,customerMobile);
			ps2.setString(2, customerMail);
			ResultSet rs=ps2.executeQuery();
			if(rs.next())
			{
				cid=rs.getInt("cid");
			}
		}
		else
		System.out.println("customer not added successfully");
		
	}
	catch(Exception e)
	{
		System.out.println("exception occur");	
        System.out.println("Exception occurred: " + e.getMessage());

	}
	
	return cid;
}

@Override
public String addAccount(int customerBalance, int cid) {
	// TODO Auto-generated method stub
	String msg=null;
	try {
		Connection con=DatabaseConnection.connectionProvider();
		PreparedStatement ps=con.prepareStatement("insert into account(accountBalance,cid)values(?,?)");
		ps.setInt(1,customerBalance );
		ps.setInt(2, cid);
		int x=ps.executeUpdate();
		if(x>0) {
			msg="success";
			System.out.println("initial account balance added successfully");
		}
		
	}
	catch(Exception e)
	{
		
	}
	return msg;
}


 
}

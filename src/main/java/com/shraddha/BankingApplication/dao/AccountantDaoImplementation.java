package com.shraddha.BankingApplication.dao;

import java.sql.Connection;
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


 
}

package com.shraddha.BankingApplication;
import java.util.Scanner;

import com.shraddha.BankingApplication.dao.AccountantDao;
import com.shraddha.BankingApplication.dao.AccountantDaoImplementation;
import com.shraddha.BankingApplication.entity.Accountant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("|                 welcome to banking application        |");
        System.out.println("--------------------------------------------------------");
        System.out.println("Select option");
        System.out.println("1.Login as Accountant");
        System.out.println("--------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        String auname=null;
        String apwd=null;
        int cid=-1;
        AccountantDao ad=new AccountantDaoImplementation();
        Accountant ac=new Accountant();
        	switch(sc.nextInt())
        	{
        	case 1:System.out.println("enter username");
        		  	auname=sc.next(); 
        		  	System.out.println("enter password");
        		  	apwd=sc.next(); 
        		  	ac=ad.LoginAccountant(auname,apwd);
        		  	if(ac!=null)
        		  	{
        		  		System.out.println("welcome"+" "+ac.getAccountantName());
        		  		System.out.println("you succesfully login as BankingApplication admin ");
        		  		System.out.println("choose your task");
        		  		int ch=sc.nextInt();
        		  		switch(ch)
        		  		{
        		  		case 1:System.out.println("enter customer name");
        		  				String a1=sc.next();
        		  			   System.out.println("enter customer password");
        		  			 String a2=sc.next();
        		  			 System.out.println("enter customer mobile");
        		  			String a3=sc.next();
        		  			System.out.println("enter customer address");
        		  			String a4=sc.next();
        		  			System.out.println("enter customer mail");
        		  			String a5=sc.next();
        		  			System.out.println("enter customer initial balance in account");
        		  			int bal=sc.nextInt();
        		  			cid=ad.addCustomer(a1, a2, a3, a4, a5);
        		  			ad.addAccount(bal, cid);
        		  		}
        		  	}
        		  	else
        		  	{
        		  		System.out.println("invalid login");
        		  	}
        		  	break;
        		  		
        		  	
        	}
        
       
    }
}

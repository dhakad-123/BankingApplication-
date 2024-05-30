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
        		  	}
        		  	else
        		  	{
        		  		System.out.println("invalid login");
        		  	}
        		  	break;
        		  		
        		  	
        	}
        
       
    }
}

package org.selenium.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public  void linitialization(){
		System.out.println("Invoke Browser");
		System.out.println("Enter URL");	

	}
	
	@BeforeTest
	public void commoncode(){
		System.out.println("Login");
	}
	@Test
	public  void ComposeMail(){
		
		System.out.println("Compose");
		
		}
	
	@Test
	public  void countunreadMails(){
		
		System.out.println("countunreadMails");
		
			}
	@AfterTest
	public void logout(){
		System.out.println("SignOut");
	}
		
	@AfterSuite
	public void tearDown(){
	System.out.println("Close one Browser");
	
		
	}
	
}
			

	



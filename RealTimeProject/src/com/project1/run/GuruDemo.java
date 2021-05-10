package com.project1.run;


import com.project1.baseclass.BaseClass;
import com.project1.pom.LoginPage;

public class GuruDemo extends BaseClass{
	
	public static void main(String[] args) throws Throwable {
		
		toLaunchBrowser("chrome");
		
		toLaunchUrl("http://www.demo.guru99.com/V4/");
		
		LoginPage lp = new LoginPage(driver);
	
		toEnterInputOnElement(lp.getUserid(), "mngr319520");		
		toSleep();
					
		toEnterInputOnElement(lp.getPwd(), "vAzUvEg");
		toSleep();
		
		toClick(lp.getLogin());
		toSleep();
		
	}

}

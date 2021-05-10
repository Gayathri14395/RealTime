package com.run;

import com.baseclass.BaseClass;
import com.pom.LoginPage;

public class GuruDemo extends BaseClass{
	
	public static void main(String[] args) throws Throwable {
		
		toLaunchBrowser("gecko");
		
		toLaunchUrl("http://www.demo.guru99.com/V4/index.php");
		
		LoginPage lp = new LoginPage(driver);
	
		toEnterInputOnElement(lp.getUserid(), "mngr319520");		
		toSleep();
					
		toEnterInputOnElement(lp.getPwd(), "vAzUvEg");
		toSleep();
		
		toClick(lp.getLogin());
		toSleep();
		
		
		
	}

}

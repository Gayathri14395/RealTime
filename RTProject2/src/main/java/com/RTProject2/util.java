package com.RTProject2;

import org.testng.internal.BaseClassFinder;

import com.baseclass.BaseClass;
import com.pom.LoginPage;

public class util extends BaseClass
{

	
		
		public static final String FIREFOX_PATH = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
				
		public static final int WAIT_TIME = 30; 
		
		public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
	
		
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

	

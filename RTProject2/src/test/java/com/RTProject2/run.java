package com.RTProject2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.pom.LoginPage;

public class run extends util {
	
	static WebDriver driver; // Selenium control driver
    private static String baseUrl;
	
	public static void setUp() throws Exception {
		
		File pathToBinary = new File(util.FIREFOX_PATH);
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);

		FirefoxProfile firefoxProfile = new FirefoxProfile();
		driver = new FirefoxDriver();
		
		
		driver.manage().timeouts()
		.implicitlyWait(util.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(baseUrl + "/V4/");
		
	}
	
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
		
		
		    
		  	String actualTitle = driver.getTitle();
			if (actualTitle.contains(util.EXPECT_TITLE)) {
					    System.out.println("Test case: Passed");
			} 
			else {
					    System.out.println("Test case : Failed");
			}
					
		    driver.close();
		    
		

	    }

}

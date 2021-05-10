package com.RTProject2;


import static org.testng.Assert.assertEquals;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginTest 
{
    
    @Test
    @Parameters({"userid","pwd"})
    
    private void loginNavigate(@Optional("mngr319520")String userid,@Optional("vAzUvEg") String pwd)
    {
    	
    
    	String actualid=userid;
    	String expectedid="mngr319520";
    	
     	
    	
    	System.out.println("Userid is "+userid);
    	 assertEquals(actualid, expectedid); 
    		System.out.println("Id Matches");
//		assertNotEquals(actualid, expectedid);  	
//    		System.out.println("Doesn't match");
    	
    	
    	
    	String actualpwd=pwd;
    	String expectedpwd="vAzUvEg";
    	
    	System.out.println("Pwd is "+pwd);	
    	
  		
	assertEquals(actualpwd, expectedpwd);
    		System.out.println("Pwd matches");
//		assertNotEquals(actualpwd, expectedpwd);
//			System.out.println("Pwd Doesn't match");	
    	    	    	
       		
    		
    	if (actualid.equals(expectedid)&&actualpwd.equals(expectedpwd)) {
    		System.out.println("Able to Login");
		}
    	else {
			System.out.println("Invalid Credentials");
		}
    	
    }
      	
    	
 
}

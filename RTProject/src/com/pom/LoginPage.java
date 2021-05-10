package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userid;

	@FindBy(xpath ="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;

	public WebElement getUserid() {
		return userid;
	}

	public void setUserid(WebElement userid) {
		this.userid = userid;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}

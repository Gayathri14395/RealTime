package com.baseclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {

	public static WebDriver driver;

	public static WebDriver toLaunchBrowser(String type) {

		if (type.equalsIgnoreCase("gecko")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//DRIVER//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

} 
		 if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//DRIVER//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		return driver;

	}

	public static void toLaunchUrl(String url) {

		driver.get(url);

	}

	public static void toGetCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void toGetTitle() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void toEnterInputOnElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void toGetAttributeValue(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println("Attribute Vlaue is " + attribute);

	}

	public static void toClick(WebElement element) {

		element.click();

	}

	public static void toClear(WebElement element) {

		element.clear();

	}

	public static void toCheckIsDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println(" Webelement is displayed " + displayed);

	}

	public static void toCheckIsEnabaled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println("ELement is Enabled " + enabled);

	}

	public static void toCheckIsSelected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println("ELement is Selcted "+selected);
			
	}

	public static void toGetText(WebElement element) {

		String text = element.getText();
		System.out.println(" TExt is " + text);

	}

	public static void toHandleSimpleAlert(WebElement element) throws Throwable {

		Alert a = driver.switchTo().alert();

		element.click();
		Thread.sleep(4000);
		a.accept();

	}

	public static void toHandleConfirmAlert(WebElement element) throws Throwable {

		Alert a = driver.switchTo().alert();

		element.click();
		Thread.sleep(4000);
		a.dismiss();

	}

	public static void toHandlePomptAlert(WebElement element1, WebElement element2, String s) throws Throwable {

		Alert a = driver.switchTo().alert();

		element1.click();
		Thread.sleep(4000);
		element2.click();
		Thread.sleep(4000);
		a.sendKeys(s);
		Thread.sleep(4000);
		a.accept();

	}

	public static void toSelectByIndex(WebElement element, int i) {

		Select s = new Select(element);
		s.selectByIndex(i);

	}

	public static void toSelectByValue(WebElement element, String val) {

		Select s = new Select(element);
		s.selectByValue(val);

	}

	public static void toSelectByVisibleText(WebElement element, String val) {

		Select s = new Select(element);
		s.selectByVisibleText(val);

	}

	public static void toCheckIsMultple(WebElement element) {

		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void toGetFirstSelectedOption(WebElement element) {

		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First selected option is " + firstSelectedOption);

	}

	public static void toGetAllSelectedOptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			String attribute = allSelectedOptions.get(i).getAttribute("value");
			System.out.println(attribute);

		}

	}
	
	public static void toGetAllOptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement list : options) {
			String attribute = list.getAttribute("value");
			System.out.println(attribute);
			
		}
		
	}
	
	public static void toSelectFromCheckBox(WebElement element,String s) {

		Select s1 = new Select(element);
		List<WebElement> options = s1.getOptions();
		for (int i = 0; i < options.size(); i++) {
			options.get(i).getAttribute("value").equals(s);
			if (options.get(i).isSelected()) {
				System.out.println(options.get(i).getAttribute("value"));
				
			}
			
		}
			
	}
	
	public static void toSleep() throws Throwable {
		
		Thread.sleep(3000);
	}
	
	
}

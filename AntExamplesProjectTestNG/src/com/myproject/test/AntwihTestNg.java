
package com.myproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AntwihTestNg {
	String testname;
	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.out.println("run setup method");
		testname=this.toString();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sol\\Desktop\\Project_Todo\\broswer\\chromedriver.exe");
		driver=new FirefoxDriver();
		
		
	}
		@Test
     	public void testMethod(){
		driver.get("https://www.google.com.bo");
		ImplicitExplictWaits.ImplicitWait(driver);
		SearchGooglePageObject search=new SearchGooglePageObject(driver);
		search.txtSearch.sendKeys("Selenium");
	    search.btnSearch.click();
	    ImplicitExplictWaits.ImplicitWait(driver);
		search.linkSearch.click();
	    ImplicitExplictWaits.ImplicitWait(driver);	
	    search.btnDownload.click();

	}
	@AfterTest
	public void tearDown(){
		System.out.println("run tearDown method");
		//driver.quit();
	}
	
	
}

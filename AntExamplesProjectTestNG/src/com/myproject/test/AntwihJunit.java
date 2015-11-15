package com.myproject.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AntwihJunit {
	String testname;
	WebDriver driver;
	@Before
	public void setup(){
		System.out.println("run setup method");
		testname=this.toString();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sol\\Desktop\\projetAnt\\AntExamplesProject\\browser\\chromedriver.exe");
		driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		
		
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
	@After
	public void tearDown(){
		System.out.println("run tearDown method");
		//driver.quit();
	}
	
	
}

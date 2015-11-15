package com.myproject.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class AntwithTestNG {
	private WebDriver driver;	


	@Before
	public void SetUp(){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sol\\Desktop\\Project_Todo\\broswer\\chromedriver.exe");
		driver=new FirefoxDriver();
		
		//driver=new ChromeDriver();
		driver.get("http://localhost/cssmenu/");
		ImplicitExplictWaits.ImplicitWait(driver);
	}
	@Test
	public void TestMenu(){
		
		WebElement menu=driver.findElement(By.id("products"));
		Hover(driver,menu);
		WebElement submenu=driver.findElement(By.id("product1"));
		ImplicitExplictWaits.ImplicitWait(driver);
		WebElement subproduct=driver.findElement(By.id("product2"));
		HoverAndClick(driver,submenu,subproduct);	
	}

	public void Hover(WebDriver driver,WebElement elementoMenu){
	    Actions action=new Actions(driver);
		action.moveToElement(elementoMenu).perform();			
	}

	public void HoverAndClick(WebDriver driver,WebElement elementoToHover,WebElement elementToclick){

		Actions action=new Actions(driver);
		action.moveToElement(elementoToHover);
		ImplicitExplictWaits.ImplicitWait(driver);
		action.click(elementToclick);
		action.build().perform();
	}

}

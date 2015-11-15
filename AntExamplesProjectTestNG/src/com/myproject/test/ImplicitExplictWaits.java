package com.myproject.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ImplicitExplictWaits {
		
	public static void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	public static void ExplicitWait(WebDriver driver,WebElement text)
	{
	  (new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(text));
	  
	}
	}



package com.myproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchGooglePageObject {
	
	
	
	public SearchGooglePageObject(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;

	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Selenium - Web Browser Automation")
	public WebElement linkSearch;
	@FindBy(how=How.LINK_TEXT, using="Download")
	public WebElement btnDownload;
	
	
	
	//@FindBy(name=)
 }

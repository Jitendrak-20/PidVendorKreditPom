package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath ="//nav[@class='top-0 left-0 bg-brand-dark w-full z-10 md:flex-row md:flex-nowrap md:justify-start flex items-center px-6 py-3 md:px-3']")
	WebElement displayLoggedInUserName;
	
	@FindBy(xpath ="//span[5]")
	WebElement displayOrganizationName;

	@FindBy(xpath ="//img[contains(@src,'/kreditserve_light.png')]") 
	WebElement IsFooterImageVisble; 
	
	
	
	
	
	//Initializing the Page Objects
	
	public HomePage() { 
		PageFactory.initElements(driver, this); 
		} 
	
	public String validateHomePageTitle() { 
		return driver.getTitle(); 
		} 
	
	
	
}

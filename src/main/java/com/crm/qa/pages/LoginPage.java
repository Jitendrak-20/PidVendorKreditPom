package com.crm.qa.pages; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
import com.crm.qa.base.TestBase; 

public class LoginPage extends TestBase { 
	//Page Factory OR 
	@FindBy(xpath ="//input[@placeholder='Username/Mobile Number/Email Address']") 
	WebElement username; 
	
	@FindBy(xpath ="//input[@placeholder='Password']") 
	WebElement password; 
	
	@FindBy(xpath = "//button[@type='button']") 
	WebElement loginBtn; 
	
	@FindBy(xpath ="//img[contains(@src,'/vendorkredit_dark.png')]") 
	WebElement logo; 
	
	public LoginPage() { 
		PageFactory.initElements(driver, this); 
		} 
	
	public String validateLoginPageTitle() { 
		return driver.getTitle(); 
		} 
	
	public boolean websiteLogo() { 
		return logo.isDisplayed(); 
		} 
	
	public HomePage login(String un, String pwd) { 
		username.sendKeys(un); 
		password.sendKeys(pwd); 
		loginBtn.click(); 
		return new HomePage(); 
		
		} 
	}

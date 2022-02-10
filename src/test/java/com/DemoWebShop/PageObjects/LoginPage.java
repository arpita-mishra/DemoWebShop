package com.DemoWebShop.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoWebSop.testCases.BaseClass;

public class LoginPage extends BaseClass {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()=\"Log in\"]")
	@CacheLookup
	WebElement firstLoginButton;
	
	@FindBy(xpath="//div/h1[text()=\"Welcome, Please Sign In!\"]")
	@CacheLookup
	WebElement welcomeMsg;
	
	
	@FindBy(xpath="//input[@name=\"Email\"]")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value=\"Log in\"]")
	WebElement secondLoginButton;
	
	@FindBy(xpath="//a[text()=\"testdemowebshop@gmail.com\"]")
	WebElement userAccountID;
	
	public void clickFirstLogin() {
		firstLoginButton.click();
	}
	public String getWelcomeMessage() {
		return welcomeMsg.getText();
	}
	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickSecondLogin() {
		secondLoginButton.click();
	}
	public String getUserAccountID() {
		return userAccountID.getText();
	}


}

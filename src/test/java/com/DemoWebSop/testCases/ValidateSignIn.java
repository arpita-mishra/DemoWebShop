package com.DemoWebSop.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoWebShop.PageObjects.LoginPage;



public class ValidateSignIn extends BaseClass {
	
	@Test
	public void verifySignIn() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.clickFirstLogin();
		lp.getWelcomeMessage();
//		lp.setUserName(username);
//		lp.setPassword(password);
//		lp.clickSecondLogin();
		
		
		String actualResult="Welcome, Please Sign In!";
		String ExpectedResult=lp.getWelcomeMessage();
				
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully verified the sign in page");
		}
		else {
			Assert.assertTrue(false);
		}
	}

}

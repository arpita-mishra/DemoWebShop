package com.DemoWebSop.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoWebShop.PageObjects.LoginPage;

public class ValidateUserAccountID extends BaseClass{
	@Test
	public void validateUserAccountID() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.clickFirstLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSecondLogin();
		
		String actualResult="testdemowebshop@gmail.com";
		String ExpectedResult=lp.getUserAccountID();
				
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully verified the user account ID");
		}
		else {
			Assert.assertTrue(false);
		}
	
	}
}

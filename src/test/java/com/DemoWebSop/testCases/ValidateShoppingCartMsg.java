package com.DemoWebSop.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoWebShop.PageObjects.AddToCart;
import com.DemoWebShop.PageObjects.LoginPage;

public class ValidateShoppingCartMsg extends BaseClass {
	@Test
	public void verifyShoppingCartMsg() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		AddToCart lp1=new AddToCart(driver);
		lp.clickFirstLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSecondLogin();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//lp1.verifyShoppingCartIsEmpty();
		lp1.booksMenu();
		lp1.selectBook();
		lp1.enterQuantity();
		lp1.addToCart();
		
		
		String actualResult="The product has been added to shopping cart";
		String ExpectedResult=lp1.prodAddedToCartMsg();
				
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully verified the product has been added to Shopping cart message");
		}
		else {
			Assert.assertTrue(false);
		}
	}

}

package com.DemoWebSop.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoWebShop.PageObjects.AddToCart;
import com.DemoWebShop.PageObjects.Checkout;
import com.DemoWebShop.PageObjects.LoginPage;

public class ValidateCompleteOrder extends BaseClass {
	
	@Test
	public void validateCompleteOrder() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		AddToCart lp1=new AddToCart(driver);
		Checkout lp2=new Checkout(driver);
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
		
		lp2.clickShoppingCart();
		
		
		
		String actualResult="20.00";
		String ExpectedResult=lp2.totalOrderAmount();
				
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully validated the “Sub-Total” Price for selected book");
		}
		else {
			Assert.assertTrue(false);
		}
		
		lp2.clickCheckoutBtn();
		lp2.billingAddress();
		
		lp2.cityBillingAddress();
		lp2.address1BillingAddress();
		lp2.zipcodeBillingAddress();
		lp2.mobileBillingAddress();
		lp2.continueButton();
		lp2.shippingAddress();
		lp2.continueToShippingMethod();
		lp2.selectShippingMethod();
		lp2.continueToPaymentMethod();
		lp2.chooseCOD();
		lp2.continueToPaymentInfo();
		
		String actualResult1="You will pay by COD";
		String ExpectedResult1=lp2.CODconfirmationMsg();
				
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully validated COD confirmation");
		}
		else {
			Assert.assertTrue(false);
		}
		lp2.continueToCheckout();
		lp2.confirmOrder();
		
		String actualResult2="Your order has been successfully processed!";
		String ExpectedResult2=lp2.orderConfirmationMsg();
		if(actualResult.equals(ExpectedResult)) {
			Assert.assertTrue(true);
			System.out.println("Successfully validated order confirmation");
		}
		else {
			Assert.assertTrue(false);
		}
		lp2.continueLast();
		lp2.logout();
	}

}

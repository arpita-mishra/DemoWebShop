package com.DemoWebShop.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.DemoWebSop.testCases.BaseClass;

public class Checkout extends BaseClass {
		
		public WebDriver ldriver;
		public Checkout(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
		@FindBy(xpath="//div[@class=\"header-links\"]//a[@href=\"/cart\"]")
		WebElement shoppingCart;
		
		public void clickShoppingCart() {
			shoppingCart.click();
		}
		
		@FindBy(xpath="//span[@class=\"product-price order-total\"]")
		WebElement totalOrderAmount;
		
		@FindBy(xpath="//button[@id=\"checkout\"]")
		WebElement checkoutBtn;
		
		@FindBy(xpath="//input[@id=\"termsofservice\"]")
		WebElement acceptTermsOfService;

//		@FindBy(xpath="//div[@id=\"billing-buttons-container\"]//input[@title=\"Continue\"]")
//		WebElement continueBtn;
		
		@FindBy(name="New Address")
		WebElement billingAddress;
		
		@FindBy(xpath="//inpu[@id=\"BillingNewAddress_City\"]")
		WebElement cityBillingAddress;
		
		@FindBy(id="BillingNewAddress_Address1")
		WebElement address1BA;
		
		@FindBy(id="BillingNewAddress_ZipPostalCode")
		WebElement zipcodeBA;
		
		@FindBy(id="BillingNewAddress_PhoneNumber")
		WebElement mobileBA;
		
		@FindBy(xpath="//div[@id=\"billing-buttons-container\"]/input[@title=\"Continue\"]")
		WebElement continueBtn;
		
		@FindBy(name="New Address")
		WebElement shippingAddress;
		
		@FindBy(xpath="//div[@id=\"shipping-buttons-container\"]/input[@class=\"button-1 new-address-next-step-button\"]")
		WebElement continueToShippingMethod;
		
		@FindBy(id="shippingoption_1")
		WebElement selectShippingMethod;
		
		@FindBy(xpath="//input[@class=\"button-1 shipping-method-next-step-button\"]")
		WebElement continueToPaymentMethod;
		
		
		@FindBy(id="paymentmethod_0")
		WebElement chooseCOD;
		
		@FindBy(xpath="//input[@class=\"button-1 payment-method-next-step-button\"]")
		WebElement continueToPaymentInfo;
		
		@FindBy(xpath="//p[text()=\"You will pay by COD\"]")
		WebElement CODconfirmationMsg;
		
		@FindBy(xpath="//input[@class=\"button-1 payment-info-next-step-button\"]")
		WebElement continueToCheckout;
		
		@FindBy(xpath="//input[@value=\"Confirm\"]")
		WebElement confirmOrder;
		
		@FindBy(xpath="//strong[text()=\"Your order has been successfully processed!\"]")
		WebElement orderConfirmationMsg;
		
		@FindBy(xpath="//input[@value=\"Continue\"]")
		WebElement continueLast;
		
		@FindBy(xpath="//a[@href=\"/logout\"]")
		WebElement logout;
		
		public String totalOrderAmount() {
			return totalOrderAmount.getText();
		}
		
		
		public void acceptTermsOfService() {
			acceptTermsOfService.click();
		}
		
		public void clickCheckoutBtn() {
			checkoutBtn.click();
		}
		
		public void billingAddress() {
			Select billingAdd=new Select(billingAddress);
			((WebElement) billingAdd).click();
		}
		
//		public void clickContinue() {
//			continueBtn.click();
//		}
		
		public void cityBillingAddress() {
			cityBillingAddress.sendKeys("city-first");
		}
		public void address1BillingAddress() {
			cityBillingAddress.sendKeys("address-first");
		}
		public void zipcodeBillingAddress() {
			cityBillingAddress.sendKeys("12345");
		}
		public void mobileBillingAddress() {
			cityBillingAddress.sendKeys("1234512345");
		}
		public void continueButton() {
			continueBtn.click();	;
		}
		
		public void shippingAddress() {
			Select shippingAdd=new Select(shippingAddress);
			((WebElement) shippingAdd).click();
		}
		
		public void continueToShippingMethod() {
			continueToShippingMethod.click();	;
		}
		public void selectShippingMethod() {
			selectShippingMethod.click();	;
		}
		
		public void continueToPaymentMethod() {
			continueToPaymentMethod.click();
		}
		
		public void chooseCOD() {
			chooseCOD.click();
		}
		
		public void continueToPaymentInfo() {
			continueToPaymentInfo.click();
		}
		
		public String CODconfirmationMsg() {
			return CODconfirmationMsg.getText();
		}
		
		public void continueToCheckout() {
			continueToCheckout.click();
		}
		public void confirmOrder() {
			confirmOrder.click();
		}
		
		public String orderConfirmationMsg() {
			return orderConfirmationMsg.getText();
		}
		
		public void continueLast() {
			continueLast.click();
		}
		public void logout() {
			logout.click();
		}
}

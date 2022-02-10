package com.DemoWebShop.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public WebDriver ldriver;
	public AddToCart(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//div[@class=\"header-links\"]//a[@href=\"/cart\"]")
	WebElement shoppingCart;
	
	@FindBy(xpath="//input[@name=\"removefromcart\"]")
	WebElement removeItemCheckbox;
	
	@FindBy(xpath="//input[@name=\"itemquantity2229408\"]")
	WebElement value;
	
	@FindBy(xpath="//input[@name=\"updatecart\"]")
	WebElement updateCartButton;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	WebElement booksMenu;
	
	@FindBy(xpath="//img[@title=\"Show details for Computing and Internet\"]")
	WebElement selectBook;
	
	@FindBy(xpath="//input[@id=\"addtocart_13_EnteredQuantity\"]")
	WebElement enterQuantity;
	
	@FindBy(xpath="//input[@id=\"add-to-cart-button-13\" and @type=\"button\"]")
	WebElement addToCart;
	
	@FindBy(xpath="//p[@class=\"content\" and contains(text(),\"The product has been added to your\")]")
	WebElement prodAddedToCartMsg;
	
	public void verifyShoppingCartIsEmpty() {
		shoppingCart.click();
//		value.sendKeys("0");
		removeItemCheckbox.click();
		updateCartButton.click();
	}
	
	public void booksMenu() {
		booksMenu.click();
	}
	public void selectBook() {
		selectBook.click();
	}
	
	public void enterQuantity() {
		enterQuantity.sendKeys("3");
	}
	
	public void addToCart() {
		addToCart.click();
	}
	public String prodAddedToCartMsg() {
		return ldriver.switchTo().alert().getText();
		//return prodAddedToCartMsg.getText();
	}

}

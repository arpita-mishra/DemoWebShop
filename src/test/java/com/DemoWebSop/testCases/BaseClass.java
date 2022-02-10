package com.DemoWebSop.testCases;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

import com.DemoWebShop.utilities.ReadConfig;

	public class BaseClass {
		
		ReadConfig readconfig=new ReadConfig();
		public String baseURL=readconfig.getApplicationURL();
		public String username=readconfig.getUserName();
		public String password=readconfig.getPassword();
		public static WebDriver driver;
		
		
	
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","C://Eclipse//Chrome Driver//chromedriver.exe"); 
			driver=new ChromeDriver();
			
			
		}
		@AfterClass
		public void tearDown() {
			//driver.quit();
		}

}

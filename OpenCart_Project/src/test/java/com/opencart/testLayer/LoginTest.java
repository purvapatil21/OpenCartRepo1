package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.Utilities.UtilClass;
import com.opencart.pageLayer.AddressBookPage;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.MyAccountPage;
import com.opencart.testBase.TestBase;

public class LoginTest extends TestBase {
	@Test
	public void validateloggingintotheApplicationusingvalidcredentials() throws InterruptedException
	{
		//String expected_output = "Your address has been successfully added";
		String expected_output = "Account Login";
		HomePage home_obj = new HomePage (driver);
		LoginPage login_obj =new LoginPage(driver);
		//MyAccountPage myaccount_obj = new MyAccountPage(driver);
		//AddressBookPage address_obj = new AddressBookPage(driver);
		UtilClass util_obj  = new UtilClass(driver);
		
		
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnLoginLink();
		logger.info("Open Login Page");
		
		Thread.sleep(2000);
		login_obj.enterEmail("davidmiller1@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		
		//-------------------------------------------------------------------------------------
		//myaccount_obj.clickOnAddressBookLink();
		//address_obj.clickOnNewAddressButton();
		
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_output);	
	}
	
	@Test
	public void validateloggingintotheApplicationusinginvalidcredentials() throws InterruptedException
	{
		String expected_output = "Account Login";
		HomePage homepage_obj = new HomePage(driver);
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
		
		Thread.sleep(2000);
		login_obj.enterEmail("davidmiller1@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_output);
	}



}



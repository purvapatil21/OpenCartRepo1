package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.Utilities.UtilClass;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.RegisterPage;
import com.opencart.testBase.TestBase;

public class RegisterAccountTest extends TestBase{


	@Test
	public void validateRegisterAccountbyprovidingonlyMandatoryFields() throws InterruptedException
	{
		String expected_result ="Your Account Has Been Created!";
		HomePage homepage_obj = new HomePage(driver);
		RegisterPage registerpage_obj = new RegisterPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		homepage_obj.clickOnMyAccountLink();
		Thread.sleep(2000);
		homepage_obj.clickOnRegisterLink();
		Thread.sleep(2000);
		
		registerpage_obj.enterFirstName("David");
		registerpage_obj.enterLastName("Miller");
		registerpage_obj.enterEmail("davidmiller1@gmail.com");
		registerpage_obj.entertelephone("1234567890");
		registerpage_obj.enterPassword("Test@1234");
		registerpage_obj.enterConfirmPassword("Test@1234");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_result);	
	}
}


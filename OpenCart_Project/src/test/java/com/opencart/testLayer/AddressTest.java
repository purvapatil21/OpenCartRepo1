package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.Utilities.UtilClass;
import com.opencart.pageLayer.AddressBookPage;
import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.MyAccountPage;
import com.opencart.testBase.TestBase;

public class AddressTest extends TestBase {

	@Test
	public void validateAddingNewAddressbyProvidingOlyMandatoryField() throws InterruptedException
	{
		String expected_output = "Your address has been successfully added";
		HomePage home_obj = new HomePage (driver);
		LoginPage login_obj =new LoginPage(driver);
		MyAccountPage myaccount_obj = new MyAccountPage(driver);
		AddressBookPage address_obj = new AddressBookPage(driver);
		UtilClass util_obj  = new UtilClass(driver);
		
		//--------------------------------------------------------------------
		
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnLoginLink();
		
		Thread.sleep(2000);
		//---------------------------------------------------------------------
		
		login_obj.enterEmail("davidmiller1@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		
		//----------------------------------------------------------------------
		
		myaccount_obj.clickOnAddressBookLink();
	  
		//-------------------------------------------------------------------------
		
		address_obj.clickOnNewAddressButton();
		address_obj.enterFirstName("David");
		address_obj.enterLastName("Miller");
		address_obj.enterCompany("Wipro");
		address_obj.enterAddress1("Akuradi");
		address_obj.enterAddress2("Pimpari Chinchwad");
		address_obj.enterCity("Pune");
		address_obj.enterPostcode("416001");
		address_obj.selectOptionFromCountryDropdownn("India");
		address_obj.selectOptionFromRegionDropdown("Maharashtra");
		Thread.sleep(2000);
		
		address_obj.clickOnContinueButton();
		//address_obj.selectOptionFrommyAccountDropdown("Logout");
		
		//------------------------------------------------------------------------------------------------------
		
		Assert.assertEquals(address_obj.getStatusMessage(), expected_output);
	}
	
}
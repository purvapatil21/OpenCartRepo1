package com.opencart.pageLayer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	   public MyAccountPage(WebDriver driver)
	   {
		   PageFactory.initElements( driver , this);
	   }
	   
	   
	  // -----------------------------OBJ Repo-------------------------------------------
	   
	   @FindBy(xpath ="//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/address']")
	   private WebElement adress_Book_Link;
	   
	   
	   //---------------------------------------Action methods-------------------------------
	   
	   public void clickOnAddressBookLink()
	   {
		   adress_Book_Link.click();
	   }
}

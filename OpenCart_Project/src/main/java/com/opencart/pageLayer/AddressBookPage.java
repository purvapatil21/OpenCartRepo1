package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage {

	public AddressBookPage(WebDriver driver)
	{
		PageFactory.initElements( driver , this );
	}
	//-------------------------------obj repo-------------------------------------------------
	
	@FindBy(xpath ="//a[contains(text(),'New Address')]")
	private WebElement new_Address_btn;
	
	@FindBy(xpath ="//input[@id='input-firstname']")
	private WebElement firstname_txtbox;
	
	@FindBy(xpath ="//input[@id='input-lastname']")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath ="//input[@id='input-company']")
	private WebElement company_txtbox;
	
	@FindBy(xpath ="//input[@id='input-address-1']")
	private WebElement address1_txtbox;
	
	@FindBy(xpath ="//input[@id='input-address-2']")
	private WebElement address2_txtbox;
	
	@FindBy(xpath ="//input[@id='input-city']")
	private WebElement city_txtbox;
	
	@FindBy(xpath ="//input[@id='input-postcode']")
	private WebElement postcode_txtbox;
	
	@FindBy(xpath ="//select[@id='input-country']")
	private WebElement country_dropdown;
	
	@FindBy(xpath ="//select[@id='input-zone']")
	private WebElement region_dropdown;
	
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continue_btn;
	
	
	@FindBy(xpath ="//div[contains(@class,'alert-success')]")
	private WebElement status_msg;
	
	
//	@FindBy(xpath = "//span[@class='caret']")
//	private WebElement myAccount_dropdown;
	
	//------------------------------------action method---------------------------------------------
	
	public void clickOnNewAddressButton()
	{
		 new_Address_btn.click();
	}
	
	public void enterFirstName(String data)
	{
		 firstname_txtbox.sendKeys(data);
	}
	
	public void enterLastName(String data)
	{
		 lastname_txtbox.sendKeys(data);
	}
	
	public void enterCompany(String data)
	{
		 company_txtbox.sendKeys(data);
	}
	
	public void enterAddress1(String data)
	{
		 address1_txtbox.sendKeys(data);
	}
	
	public void enterAddress2(String data)
	{
		 address2_txtbox.sendKeys(data);
	}
	
	public void enterCity(String data)
	{
		 city_txtbox.sendKeys(data);
	}
	
	public void enterPostcode(String data)
	{
		 postcode_txtbox.sendKeys(data);
	}
	
	public void selectOptionFromCountryDropdownn(String data)
	{
		 Select s = new Select(country_dropdown);
		 s.selectByVisibleText(data);
	}
	
	public void selectOptionFromRegionDropdown(String data)
	{
		Select s = new Select(region_dropdown);
		s.selectByVisibleText(data);
	}
//	
//	public void selectOptionFrommyAccountDropdown(String data)
//	{
//		Select s = new Select(myAccount_dropdown);
//		s.selectByVisibleText(data);
//	}
	
	//-------------------------------------------------------------------------------------
	
	public void clickOnContinueButton()
	{
		continue_btn.click();
	}
	
	public String getStatusMessage()
	{
		return status_msg.getText();
	}
}

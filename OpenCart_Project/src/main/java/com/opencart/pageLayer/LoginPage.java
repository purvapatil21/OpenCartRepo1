package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//----------- Obj repo --------------------
	private By email_txtbox = By.xpath("//input[@id='input-email']");
	private By password_txtbox = By.xpath("//input[@id='input-password']");
	private By login_btn = By.xpath("//input[@value='Login']");
	
	//--------- Action methods ----------------

	public void enterEmail(String email)
	{
		driver.findElement(email_txtbox).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
	
}


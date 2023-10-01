package com.opencart.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {

	static WebDriver driver;
	public UtilClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//--------------------------------
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static  void takeScreenshotOfPage(String filename)
	{
		try {
			LocalDate currentDate = LocalDate.now();
			String currentDateString = currentDate.toString();
		String path = "D:\\Ecllips_2023_03\\Eclipse_2023_03_Workspace\\OpenCart_Project\\ScreenShot\\";
		
		TakesScreenshot ts = (TakesScreenshot )driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File( path + filename +"png");
		FileHandler.copy(src, des);
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
}



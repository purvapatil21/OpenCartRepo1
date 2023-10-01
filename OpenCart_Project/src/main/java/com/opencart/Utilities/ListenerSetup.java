package com.opencart.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testBase.TestBase;

public class ListenerSetup extends TestBase  implements ITestListener   {


	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TestCase execution Started :-"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase execution Passed :-" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("TestCase execution Failed :-" + result.getName());
		UtilClass.takeScreenshotOfPage(result.getName());
		logger.info("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("TestCase execution Skipped :-" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

	
}

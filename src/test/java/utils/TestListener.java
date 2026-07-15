package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;

public class TestListener implements ITestListener {

	ExtentReports extent = ExtentManager.getInstance();

	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("PASSED : " + result.getName());

		test.pass("Test Passed Successfully");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("FAILED : " + result.getName());

		test.fail(result.getThrowable());

		ScreenshotUtil.takeScreenshot(
				BaseTest.driver,
				result.getName());

		test.addScreenCaptureFromPath(
				"Screenshot/" + result.getName() + ".png");

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();

	}
}
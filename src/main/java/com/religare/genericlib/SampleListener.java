package com.religare.genericlib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}
	
	@Override

	public void onTestFailedButWithinSuccessPercentage(ITestResult t) {

		// String failedTestName = t.getMethod().getDescription();
		String res = t.getThrowable().getClass().getName();
		res.replace("org.openqa.selenium.", "");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String datef = dtf.format(now);

		// name = t.getThrowable().getClass().getName();
		EventFiringWebDriver eD = new EventFiringWebDriver(BaseClass.driver);

		File srcFile = eD.getScreenshotAs(OutputType.FILE);

		File destFile = new File(".\\screenShot\\" + res + " Care Module  " + datef + ".png");

		// File destFile = new File(".\\screenShot\\"+failedTestName+".png");

		try {
			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestFailure(ITestResult t) {
		// TODO Auto-generated method stub
		String failedTestName = t.getMethod().getMethodName();

		EventFiringWebDriver eD = new EventFiringWebDriver(BaseClass.driver);

		File srcFile = eD.getScreenshotAs(OutputType.FILE);

		File destFile = new File(".\\screenShot\\" + failedTestName + ".png");

		try {
			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}

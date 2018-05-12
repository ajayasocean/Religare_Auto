package com.religare.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;

	ExcelLib elib = new ExcelLib();

	@BeforeClass

	public void launchBrowser() throws Throwable {

		String url = elib.getExcelData("commonData", 0, 1);

		String browser = elib.getExcelData("commonData", 1, 1);

		System.out.println("==launch browser=");

		if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		// else if (browser.equalsIgnoreCase("MobileBrowser")) {
		//
		// // System.setProperty("webdriver.chrome.driver",
		// //// ".//resouRces//chromedriver.exe");
		// //
		// // Set the Desired Capabilities
		// DesiredCapabilities caps = new DesiredCapabilities();
		//
		// caps.setCapability("deviceName", "My Phone");
		//
		// caps.setCapability("udid", "HKL3L9AX"); // Give Device ID of your mobile
		// phone
		//
		// caps.setCapability("platformName", "Android");
		//
		// caps.setCapability("platformVersion", "7.1.1");
		//
		// caps.setCapability("browserName", "Chrome");
		//
		// // caps.setCapability("appPackage",
		//
		// // "com.android.chrome:privileged_process0.ignor_multidex");
		//
		// // caps.setCapability("appActivity",
		//
		// // "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		//
		// caps.setCapability("noReset", "true");
		//
		// System.setProperty("webdriver.chrome.driver",
		// ".//resouRces//chromedriver.exe");
		//
		// AppiumDriver<MobileElement> driver = null;
		//
		// // Instantiate Appium Driver
		// try {
		// driver = new AndroidDriver<MobileElement>(new
		// URL("http://127.0.0.1:4723/wd/hub"), caps);
		//
		// } catch (MalformedURLException e) {
		// System.out.println(e.getMessage());
		// }

		//
		// DesiredCapabilities capabilities = DesiredCapabilities.android();
		// System.setProperty("webdriver.chrome.driver",
		// ".//resouRces//chromedriver.exe");
		//
		// capabilities.setCapability
		// (MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		// capabilities.setCapability (MobileCapabilityType.PLATFORM,Platform.ANDROID);
		// capabilities.setCapability (MobileCapabilityType.PLATFORM_NAME,"Android");
		// capabilities.setCapability (MobileCapabilityType.DEVICE_NAME,"XT1902-3");
		// capabilities.setCapability (MobileCapabilityType.VERSION,"7.1.1");
		//
		// capabilities.setCapability("appPackage",
		// "com.android.chrome:privileged_process0.ignor_multidex");
		//
		// capabilities.setCapability("appActivity",
		// "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		// URL ul = new URL("http://127.0.0.1:4723/wd/hub");
		// WebDriver driver=new AndroidDriver(ul,capabilities);

		// }

		else if (browser.equalsIgnoreCase("Chrome")) {
			// C:\Users\meankur\eclipse-workspace\ReligareHealthInsuranceFrameWork\resouRces\chromedriver.exe
			System.setProperty("webdriver.chrome.driver", ".//resouRces//chromedriver.exe");
			// driver.manage().window().maximize();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else {

			System.setProperty("webdriver.ie.driver", "./resouRces/IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

//	@AfterClass
//
//	public void closeBrowser() {
//
//		driver.close();
//	}

}

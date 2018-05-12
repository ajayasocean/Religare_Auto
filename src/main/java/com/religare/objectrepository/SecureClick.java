package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class SecureClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Personal Accident Insurance']")

	WebElement moveToSecure;

	@FindBy(xpath = "//a[contains(@onclick, 'Secure') and @class='planBoxOutScroll']")

	WebElement clickOnSecure;

	public void clickOnSecure() {

		// Actions act = new Actions(BaseClass.driver);
		// WebElement ele =
		// BaseClass.driver.findElement(By.xpath("//div[@class='greenTxtBox' and
		// text()='Personal Accident Insurance']"));
		// act.moveToElement(ele);
		// BaseClass.driver.findElement(By.xpath("//a[@class='planBoxOutScroll' and
		// contains(@onclick, 'Secure')]")).click();
		//
		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToSecure);

		clickOnSecure.click();

	}

}

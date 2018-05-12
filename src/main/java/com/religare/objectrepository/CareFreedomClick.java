package com.religare.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.BaseClass;

public class CareFreedomClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Health Insurance without Medical Check-ups']")

	WebElement moveToEnhance;

	@FindBy(xpath = "//a[contains(@onclick, 'Care Freedom') and @class='planBoxOutScroll']")

	WebElement clickOnEnhance;

	public void clickOnCareFreedom() {

		Actions act = new Actions(BaseClass.driver);

		WebElement ele1 = BaseClass.driver.findElement(
				By.xpath("//div[@class='greenTxtBox' and text()='Health Insurance without Medical Check-ups']"));

		act.moveToElement(ele1).perform();

		BaseClass.driver.findElement(By.xpath("//a[contains(@onclick, 'Care Freedom') and @class='planBoxOutScroll']"))
				.click();

		// driver.findElement(By.xpath("//a[@href='https://rhicluat.religarehealthinsurance.com/policy-buy-senior-

	}

}

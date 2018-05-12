package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class ExploreClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='International Travel Insurance']")

	WebElement moveToExplore;

	@FindBy(xpath = "//a[contains(@onclick, 'Explore') and @class='planBoxOutScroll']")

	WebElement clickOnExplore;

	public void moveToExplore() {

		WebDriverCommonLib commLib = new WebDriverCommonLib();

		commLib.moveMouseToElement(moveToExplore);

		clickOnExplore.click();

	}

}

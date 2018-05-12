package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class StudentExploreClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='International Travel & Health Insurance for Students']")

	WebElement moveToStudentExplore;

	@FindBy(xpath = "//a[contains(@onclick, 'Student Explore') and @class='planBoxOutScroll']")

	WebElement clickOnStudentExplore;

	public void clickOnStudentExplore() {

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToStudentExplore);

		clickOnStudentExplore.click();

	}

}

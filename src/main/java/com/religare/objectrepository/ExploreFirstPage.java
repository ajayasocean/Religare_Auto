package com.religare.objectrepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class ExploreFirstPage {
	
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);

	JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;

	WebDriverCommonLib clib = new WebDriverCommonLib();

	ExcelLib elib = new ExcelLib();

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	// For Trip Type

	@FindBy(id = "tripType")

	WebElement tripTypeDropDown;

	// For traveling

	@FindBy(id = "travellingTo")

	WebElement travellingToDropDown;

	// For maximumTriPduration

	@FindBy(id = "maximumtripduration")

	WebElement maximumTripDuration;

	// Date from

	@FindBy(id = "from")

	WebElement fromDate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")

	WebElement monthPicker;

	@FindBy(xpath = "//select[@class='ui-datepicker-yeat']")

	WebElement yearPicker;

	// String day1 =elib.getExcelData("testSpecificData", 4, 1);
	// For 31 days in a month
	@FindBy(xpath = "//a[contains(text(), '1') and @class ='ui-state-default']")

	WebElement day1;

	@FindBy(xpath = "//a[contains(text(), '2') and @class ='ui-state-default']")

	WebElement day2;

	@FindBy(xpath = "//a[contains(text(), '3') and @class ='ui-state-default']")

	WebElement day3;

	@FindBy(xpath = "//a[contains(text(), '4') and @class ='ui-state-default']")

	WebElement day4;

	@FindBy(xpath = "//a[contains(text(), '5') and @class ='ui-state-default']")

	WebElement day5;

	@FindBy(xpath = "//a[contains(text(), '6') and @class ='ui-state-default']")

	WebElement day6;

	@FindBy(xpath = "//a[contains(text(), '7') and @class ='ui-state-default']")

	WebElement day7;

	@FindBy(xpath = "//a[contains(text(), '8') and @class ='ui-state-default']")

	WebElement day8;

	@FindBy(xpath = "//a[contains(text(), '9') and @class ='ui-state-default']")

	WebElement day9;

	@FindBy(xpath = "//a[contains(text(), '10') and @class ='ui-state-default']")

	WebElement day10;

	@FindBy(xpath = "//a[contains(text(), '11') and @class ='ui-state-default']")

	WebElement day11;

	// @FindBy(xpath ="//a[contains(text(), '12') and @class ='ui-state-default']")
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a[@class='ui-state-default' and text()=12]")

	WebElement day12;

	@FindBy(xpath = "//a[contains(text(), '13') and @class ='ui-state-default']")

	WebElement day13;

	@FindBy(xpath = "//a[contains(text(), '14') and @class ='ui-state-default']")

	WebElement day14;

	@FindBy(xpath = "//a[contains(text(), '15') and @class ='ui-state-default']")

	WebElement day15;

	@FindBy(xpath = "//a[contains(text(), '16') and @class ='ui-state-default']")

	WebElement day16;

	@FindBy(xpath = "//a[contains(text(), '17') and @class ='ui-state-default']")

	WebElement day17;

	@FindBy(xpath = "//a[contains(text(), '18') and @class ='ui-state-default']")

	WebElement day18;

	@FindBy(xpath = "//a[contains(text(), '19') and @class ='ui-state-default']")

	WebElement day19;

	@FindBy(xpath = "//a[contains(text(), '20') and @class ='ui-state-default']")

	WebElement day20;

	@FindBy(xpath = "//a[contains(text(), '21') and @class ='ui-state-default']")

	WebElement day21;

	@FindBy(xpath = "//a[contains(text(), '22') and @class ='ui-state-default']")

	WebElement day22;

	@FindBy(xpath = "//a[contains(text(), '23') and @class ='ui-state-default']")

	WebElement day23;

	@FindBy(xpath = "//a[contains(text(), '24') and @class ='ui-state-default']")

	WebElement day24;

	@FindBy(xpath = "//a[contains(text(), '25') and @class ='ui-state-default']")

	WebElement day25;

	@FindBy(xpath = "//a[contains(text(), '26') and @class ='ui-state-default']")

	WebElement day26;

	@FindBy(xpath = "//a[contains(text(), '27') and @class ='ui-state-default']")

	WebElement day27;

	@FindBy(xpath = "//a[contains(text(), '28') and @class ='ui-state-default']")

	WebElement day28;

	@FindBy(xpath = "//a[contains(text(), '29') and @class ='ui-state-default']")

	WebElement day29;

	@FindBy(xpath = "//a[contains(text(), '30') and @class ='ui-state-default']")

	WebElement day30;

	@FindBy(xpath = "//a[contains(text(), '31') and @class ='ui-state-default']")

	WebElement day31;

	@FindBy(id = "to")

	WebElement toDate;

	@FindBy(id = "age1")

	WebElement fromAgeDropDownMember1;

	@FindBy(id = "age2")

	WebElement fromAgeDropDownMember2;

	@FindBy(id = "age3")

	WebElement fromAgeDropDownMember3;

	@FindBy(id = "age4")

	WebElement fromAgeDropDownMember4;

	@FindBy(id = "age5")

	WebElement fromAgeDropDownMember5;

	@FindBy(id = "age6")

	WebElement fromAgeDropDownMember6;

	@FindBy(id = "mobile")

	WebElement enterMobileNumberTextbox;

	@FindBy(id = "txtIconPlus_id") // txtIconPlus_id

	WebElement totalNumberIncrease;

	@FindBy(id = "txtIconMinus_id")

	WebElement totalNumberMinus;

	@FindBy(id = "pedQuestion-1")

	WebElement pedRadioBtnYes;

	@FindBy(id = "pedQuestion-2")

	WebElement pedRadioBtnNo;

	@FindBy(id = "goldplan-1")

	WebElement premiumBtn1;

	@FindBy(id = "goldplan-2")

	WebElement premiumBtn2;

	@FindBy(id = "checkn")

	WebElement ReadAgreeCheckbox;

	@FindBy(id = "carebuynowimage")

	WebElement careBuyNowBtn;

	@FindBy(xpath = "//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]")

	WebElement slider;

	@FindBy(xpath = "//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]")

	WebElement moveLeftSlider;

	// >Asia</option>
	// <option value="2">Africa</option>
	// <option value="3">Europe</option>
	// <option value="5">Worldwide</option>
	// <option value="4">Worldwide Excl. US</option>
	// <option value="6">WW-Excl. US / Canada

	public void multiTripType() throws Throwable {
		String tripType = elib.getExcelData("testSpecificData", 1, 1); // tripType

		String travelingTo = elib.getExcelData("testSpecificData", 2, 1); // travellingTo

		String maximumTripDuration1 = elib.getExcelData("testSpecificData", 3, 1); // maximumTripDuration
		try {
			clib.select(tripTypeDropDown, tripType);

			//clib.waitForElementPresent(travellingToDropDown);
	//		WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, 10);
	//		wait2.until(ExpectedConditions.visibilityOf(travellingToDropDown));
			
			Thread.sleep(2100);

			if (travelingTo.equalsIgnoreCase("WW-Excl. US / Canada")) { //
				clib.select(travellingToDropDown, "WW-Excl. US / Canada");
			} else if (travelingTo.equalsIgnoreCase("Africa")) { //
				clib.select(travellingToDropDown, "Africa");
			} else if (travelingTo.equalsIgnoreCase("Europe")) { //
				clib.select(travellingToDropDown, "Europe");
			} else if (travelingTo.equalsIgnoreCase("Worldwide")) { //
				clib.select(travellingToDropDown, "Worldwide");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		if (maximumTripDuration1.equalsIgnoreCase("sixty")) {
			jse.executeScript("arguments[0].value='60'", maximumTripDuration);
		}
	}

	public void month() throws Throwable {

		String month = elib.getExcelData("testSpecificData", 5, 1); // forMonths
		
//		WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, 10);
//		wait3.until(ExpectedConditions.visibilityOf(fromDate));

	//	clib.waitForElementPresent(fromDate);
		
		Thread.sleep(2100);

		fromDate.click();
		
//		WebDriverWait wait4 = new WebDriverWait(BaseClass.driver, 10);
//		wait4.until(ExpectedConditions.visibilityOf(monthPicker));
		
		Thread.sleep(2100);

		//clib.waitForElementPresent(monthPicker);

		monthPicker.click();

		if (month.equalsIgnoreCase("Jan")) {
			clib.select(monthPicker, "Jan");
		} else if (month.equalsIgnoreCase("Feb")) {
			clib.select(monthPicker, "Feb");
		} else if (month.equalsIgnoreCase("Mar")) {
			clib.select(monthPicker, "Mar");
		} else if (month.equalsIgnoreCase("Apr")) {
			clib.select(monthPicker, "Apr");
		} else if (month.equalsIgnoreCase("May")) {
			clib.select(monthPicker, "May");
		} else if (month.equalsIgnoreCase("Jun")) {
			clib.select(monthPicker, "Jun");
		} else if (month.equalsIgnoreCase("Jul")) {
			clib.select(monthPicker, "Jul");
		} else if (month.equalsIgnoreCase("Aug")) {
			clib.select(monthPicker, "Aug");
		} else if (month.equalsIgnoreCase("Sep")) {
			clib.select(monthPicker, "Sep");
		} else if (month.equalsIgnoreCase("Oct")) {
			clib.select(monthPicker, "Oct");
		} else if (month.equalsIgnoreCase("Nov")) {
			clib.select(monthPicker, "Nov");
		} else if (month.equalsIgnoreCase("Dec")) {
			clib.select(monthPicker, "Dec");
		}
	}

	public void day() throws Throwable {

		String day = elib.getExcelData("testSpecificData", 4, 1); // forDaysbetween 1 - 31

		if (day.equalsIgnoreCase("one")) {
			day1.click();
		} else if (day.equalsIgnoreCase("two"))
			day2.click();
		else if (day.equalsIgnoreCase("three"))
			day3.click();
		else if (day.equalsIgnoreCase("four"))
			day4.click();
		else if (day.equalsIgnoreCase("five"))
			day5.click();
		else if (day.equalsIgnoreCase("six"))
			day6.click();
		else if (day.equalsIgnoreCase("seven"))
			day7.click();
		else if (day.equalsIgnoreCase("eight"))
			day8.click();
		else if (day.equalsIgnoreCase("nine"))
			day9.click();
		else if (day.equalsIgnoreCase("ten"))
			day10.click();
		else if (day.equalsIgnoreCase("eleven"))
			day11.click();
		else if (day.equalsIgnoreCase("twelve"))
			day12.click();
		else if (day.equalsIgnoreCase("thirteen"))
			day13.click();
		else if (day.equalsIgnoreCase("fourteen"))
			day14.click();
		else if (day.equalsIgnoreCase("fifteen"))
			day15.click();
		else if (day.equalsIgnoreCase("sixteen"))
			day16.click();
		else if (day.equalsIgnoreCase("seventeen"))
			day17.click();
		else if (day.equalsIgnoreCase("eighteen"))
			day18.click();
		else if (day.equalsIgnoreCase("nineteen"))
			day19.click();
		else if (day.equalsIgnoreCase("twenty"))
			day20.click();
		else if (day.equalsIgnoreCase("twenty one"))
			day21.click();
		else if (day.equalsIgnoreCase("twenty two"))
			day22.click();
		else if (day.equalsIgnoreCase("twenty three"))
			day23.click();
		else if (day.equalsIgnoreCase("twenty four"))
			day24.click();
		else if (day.equalsIgnoreCase("twenty five"))
			day25.click();
		else if (day.equalsIgnoreCase("twenty six"))
			day26.click();
		else if (day.equalsIgnoreCase("twent seven"))
			day27.click();
		else if (day.equalsIgnoreCase("twenty eight"))
			day28.click();
		else if (day.equalsIgnoreCase("twenty nine"))
			day29.click();
		else if (day.equalsIgnoreCase("thirty"))
			day30.click();
		else if (day.equalsIgnoreCase("thirty one"))
			day31.click();

	}

	public void totalMember() throws Throwable {

		String totalMember = elib.getExcelData("testSpecificData", 8, 1);

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (totalMember.equalsIgnoreCase("one")) {
			wait.until(ExpectedConditions.visibilityOf(totalNumberMinus));
		//	clib.waitForElementPresent(totalNumberMinus);
			totalNumberMinus.click();
		} else if (totalMember.equalsIgnoreCase("two")) {
			System.out.println("Total members are two");
		} else if (totalMember.equalsIgnoreCase("three")) {
			wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
		} else if (totalMember.equalsIgnoreCase("four")) {
			Thread.sleep(2100);
			
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
			//clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
			Thread.sleep(2100);
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
		} else if (totalMember.equalsIgnoreCase("five")) {
			//wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
			//clib.waitForElementPresent(totalNumberIncrease);
			Thread.sleep(2100);
			totalNumberIncrease.click();
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			Thread.sleep(2100);
			totalNumberIncrease.click();
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
			//clib.waitForElementPresent(totalNumberIncrease);
			Thread.sleep(2100);
			totalNumberIncrease.click();
		} else if (totalMember.equalsIgnoreCase("six")) {
			Thread.sleep(2100);
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
			Thread.sleep(2100);
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
			Thread.sleep(2100);
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			totalNumberIncrease.click();
		//	wait.until(ExpectedConditions.visibilityOf(totalNumberIncrease));
		//	clib.waitForElementPresent(totalNumberIncrease);
			Thread.sleep(2100);
			totalNumberIncrease.click();
		}

	}

	public void phoneNumber(String number) {

		clib.waitForPageToLoad();

		enterMobileNumberTextbox.sendKeys(number);

	}

	public void pedRadioBtn() throws Throwable {

		String pedRadioButton = elib.getExcelData("testSpecificData", 6, 1);

		if (pedRadioButton.equalsIgnoreCase("Yes")) {
			pedRadioBtnYes.click();
		}

		else if (pedRadioButton.equalsIgnoreCase("No")) {
			pedRadioBtnNo.click();
		}

	}

	public void premiumBtn() throws Throwable {

		String premiumRadioButton = elib.getExcelData("testSpecificData", 7, 1);
		try {
			if (premiumRadioButton.equalsIgnoreCase("GoldPlan")) {
				premiumBtn1.click();
			} else if (premiumRadioButton.equalsIgnoreCase("Platinum Plan")) {
				premiumBtn2.click();
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void slider() {

		org.openqa.selenium.Dimension dim = slider.getSize();
		int x = dim.getWidth();
		Actions actions = new Actions(BaseClass.driver);
		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();

		// Actions act = new Actions(BaseClass.driver);
		//
		// act.dragAndDrop(moveRightSlider, moveLeftSlider).perform();
		//
		// act.dragAndDrop(moveLeftSlider, moveRSlider).perform(ight);

	}

	public void agreeCheckBox() {

		ReadAgreeCheckbox.click();
	}

	public void careBuyBtn() {

		careBuyNowBtn.click();
	}

	public void ageOfMember1() throws Throwable {

		// String totalMember = elib.getExcelData("testSpecificData", 8, 1);
		// //forTotalMember = 1

		String age1 = elib.getExcelData("testSpecificData", 9, 1); // forAgeofMember1DropDown.
		
	//	wait.until(ExpectedConditions.visibilityOf(fromAgeDropDownMember1));

	//	clib.waitForElementPresent(fromAgeDropDownMember1);
		
		Thread.sleep(2100);

		if (age1.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember1);
		} else if (age1.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember1);
		}

		else if (age1.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember1);
		}

		else if (age1.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember1);
		}
	}

	public void ageOfMember2() throws Throwable {

		String age2 = elib.getExcelData("testSpecificData", 10, 1); // forAgeofMember2DropDown.

		if (age2.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember2);
		} else if (age2.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember2);
		}

		else if (age2.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember2);
		}

		else if (age2.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember2);
		}
	}

	public void ageOfMember3() throws Throwable {

		String age3 = elib.getExcelData("testSpecificData", 11, 1); //// forAgeofMember3DropDown.

		if (age3.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember3);
		} else if (age3.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember3);
		}

		else if (age3.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember3);
		}

		else if (age3.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember3);
		}
	}

	public void ageOfMember4() throws Throwable {

		String age4 = elib.getExcelData("testSpecificData", 12, 1); //// forAgeofMember3DropDown.

		if (age4.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember4);
		} else if (age4.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember4);
		}

		else if (age4.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember4);
		}

		else if (age4.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember4);
		}
	}

	public void ageOfMember5() throws Throwable {

		String age5 = elib.getExcelData("testSpecificData", 13, 1); //// forAgeofMember3DropDown.

		if (age5.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember5);
		} else if (age5.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember5);
		}

		else if (age5.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember5);
		}

		else if (age5.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember5);
		}
	}

	public void ageOfMember6() throws Throwable {

		String age6 = elib.getExcelData("testSpecificData", 14, 1); //// forAgeofMember3DropDown.

		if (age6.equalsIgnoreCase("one")) {
			jse.executeScript("arguments[0].value='41-60'", fromAgeDropDownMember6);
		} else if (age6.equalsIgnoreCase("two")) {
			jse.executeScript("arguments[0].value='61-70'", fromAgeDropDownMember6);
		}

		else if (age6.equalsIgnoreCase("three")) {
			jse.executeScript("arguments[0].value='71-80'", fromAgeDropDownMember6);
		}

		else if (age6.equalsIgnoreCase("four")) {
			jse.executeScript("arguments[0].value='81-99'", fromAgeDropDownMember6);
		}
	}

}

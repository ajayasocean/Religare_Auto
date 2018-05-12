package com.religare.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class EnhanceFirstPage {

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;
	ExcelLib elib = new ExcelLib();
	WebDriverCommonLib clib = new WebDriverCommonLib();

	@FindBy(id = "txtIconMinus_id")

	WebElement totalMemberMinus;

	@FindBy(id = "txtIconPlus_id")

	WebElement totalMemberPlus;

	@FindBy(id = "select_skin_demo_enhance_8")

	WebElement ageDropDown;

	@FindBy(id = "select_skin_demo_enhance_9")

	WebElement ageDropDown9;

	@FindBy(id = "mobile")

	WebElement mobileNumber;

	@FindBy(id = "carebuynowimage")

	WebElement careBuyNowButton;

	@FindBy(id = "tenure1")

	WebElement tenure1;

	@FindBy(id = "tenure2")

	WebElement tenure2;

	@FindBy(id = "tenure3")

	WebElement tenure3;

	@FindBy(id = "ValidPanCard")

	WebElement panCard;

	@FindBy(xpath = "//div[@id='enhance_proposer_details']/div[1]/div[1]/label[1]")

	// @FindBy(id ="maleIcon")
	//// div[@id='enhance_proposer_details']/div[1]/div[1]/label[1]

	WebElement maleIcon;

	// @FindBy(xpath="//label[@class = 'femaleIcon' and @for =
	// 'ValidTitle-2']")//label[@class='maleIcon']

	// @FindBy(xpath =".//*[@id='proposer_details_divid']/div[1]/div[1]/label[2]")

	@FindBy(xpath = "//div[@id='enhance_proposer_details']/div[1]/div[1]/label[2]")
	//// div[@id='enhance_proposer_details']/div[1]/div[1]/label[2]
	// @FindBy(id ="femaleIcon")

	WebElement femaleIcon;

	@FindBy(id = "ValidFName")

	WebElement fillFirstNameTextBox;

	@FindBy(id = "ValidLName")

	WebElement fillLastNameTextBox;

	@FindBy(id = "datepicker")

	WebElement datePicker;

	@FindBy(xpath = "//select[@class ='ui-datepicker-month']")

	WebElement monthPickerDropDown;

	@FindBy(xpath = "//select[@class ='ui-datepicker-year']")

	WebElement yearPickerDropDown;

	// @FindBy(xpath = "//a[@class='ui-state-default' and text()='20']")
	//
	// WebElement pickDate;

	@FindBy(id = "ValidEmail")

	WebElement emailTextBox;

	@FindBy(id = "NomineeName")

	WebElement nomineeNameTextBox;

	@FindBy(id = "nomineeRelation")

	WebElement nomineeRelationDropDown;

	@FindBy(id = "ValidAddressOne")

	WebElement validAddressOneTextBox;

	@FindBy(id = "ValidAddressTwo")

	WebElement validAdressTwoTextBox;

	@FindBy(id = "landmark")

	WebElement landmarkTextBox;

	@FindBy(id = "ValidPinCode")

	WebElement validpinCodeTextBox;

	@FindBy(id = "ValidCityName")

	WebElement validCityNameDropDown;

	@FindBy(id = "submit_proposer_details")

	WebElement submitBtn;

	public void scroll() {

		WebElement element = BaseClass.driver.findElement(By.tagName("header"));

		// JavascriptExecutor js = (JavascriptExecutor)BaseClass.driver;

		jse.executeScript("arguments[0].scrollIntoView();", totalMemberMinus);
	}

	public void clickOnTotalMemberMinus() {

		totalMemberMinus.click();
	}

	public void clickOnTotalMemberPlus() {

		totalMemberPlus.click();
	}

	public void ageDropDown() throws Throwable {

		String age = elib.getExcelData("EnhanceFillDetails", 1, 1);
		// jse.executeScript("arguments[0].value='60'", age);

		clib.select(ageDropDown9, age);

	}

	public void ageDropDown8() throws Throwable {

		String age = elib.getExcelData("EnhanceFillDetails", 1, 1);
		// jse.executeScript("arguments[0].value='60'", age);

		clib.select(ageDropDown, age);

	}

	public void enterMobileNumber() throws Throwable {

		String mobNumber = elib.getExcelData("testSpecificData", 0, 1);

		mobileNumber.sendKeys(mobNumber);

	}

	public void next() {

		careBuyNowButton.click();
	}

	public void slider() throws Throwable {

		WebElement slider = BaseClass.driver.findElement(By.xpath("//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]"));

		Dimension dim = slider.getSize();

		int x = dim.getWidth();

		Actions actions = new Actions(BaseClass.driver);

		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();

	}

	public void slider1() throws Throwable {

		WebElement slider1 = BaseClass.driver
				.findElement(By.xpath("//div[@class='selector' and contains(@style, '247')]"));

		Dimension dim1 = slider1.getSize();

		int y = dim1.getWidth();

		Actions actions1 = new Actions(BaseClass.driver);

		actions1.clickAndHold(slider1).moveByOffset(y - 350, 0).release().build().perform();
	}

	public void tenure() throws Throwable {

		String tenure = elib.getExcelData("EnhanceFillDetails", 2, 1);

		if (tenure.equalsIgnoreCase("one"))

			tenure1.click();

		else if (tenure.equalsIgnoreCase("two"))

			tenure2.click();

		else if (tenure.equalsIgnoreCase("three"))

			tenure3.click();
	}

	public void fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation() throws Throwable {

		String genderIcon = elib.getExcelData("fillExploreDetails", 0, 1);

		String firstName = elib.getExcelData("fillExploreDetails", 1, 1);

		String lastName = elib.getExcelData("fillExploreDetails", 2, 1);

		String datePick = elib.getExcelData("fillExploreDetails", 3, 1);

		String emailId = elib.getExcelData("fillExploreDetails", 4, 1);

		String nomineeName = elib.getExcelData("fillExploreDetails", 5, 1);

		String nomineeRelation = elib.getExcelData("fillExploreDetails", 6, 1);
		
	//	Thread.sleep(2100);
		
//		WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, 10);
//		wait2.until(ExpectedConditions.visibilityOf(maleIcon));

		//clib.waitForElementPresent(maleIcon);
		//
		// clib.waitForElementPresent(femaleIcon);

		 clib.waitForPageToLoad();

		if (genderIcon.equals("male")) {
			Thread.sleep(2000);

			jse.executeScript("arguments[0].click();", maleIcon);
		}

		else if (genderIcon.equalsIgnoreCase("female")) {
			Thread.sleep(2000);


			femaleIcon.click();
		}

		// log.debug("selecting the Gender ");

		fillFirstNameTextBox.sendKeys(firstName);

		// log.debug("Entering the first name as " + firstName);

		fillLastNameTextBox.sendKeys(lastName);

		// log.debug("Entering the last name as " + lastName);

		datePicker.sendKeys(datePick);

		// log.debug("selecting the DOB " + datePick);

		emailTextBox.sendKeys(emailId);

		// log.debug("entering the emailID as " +emailId);

		nomineeNameTextBox.sendKeys(nomineeName);

		// log.debug("entering the NoimeeName as " +nomineeName);

		if (nomineeRelation.equalsIgnoreCase("wife")) {

			jse.executeScript("arguments[0].value='WIFE'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("mother")) {

			jse.executeScript("arguments[0].value='MOTH'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("daughter")) {

			jse.executeScript("arguments[0].value='UDTR'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("son")) {

			jse.executeScript("arguments[0].value='SONM'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("father")) {

			jse.executeScript("arguments[0].value='FATH'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("bother")) {

			jse.executeScript("arguments[0].value='BOTH'", nomineeRelationDropDown);
		}

		else if (nomineeRelation.equalsIgnoreCase("sister")) {

			jse.executeScript("arguments[0].value='SIST'", nomineeRelationDropDown);
		}
		// log.debug("Selecting the Relation" );
	}

	public void fillDetailsAddress() throws Throwable {

		String addressOne = elib.getExcelData("fillExploreDetails", 7, 1);

		String addressTwo = elib.getExcelData("fillExploreDetails", 8, 1);

		String landmark = elib.getExcelData("fillExploreDetails", 9, 1);

		String pincode = elib.getExcelData("fillExploreDetails", 10, 1);

		String city = elib.getExcelData("fillExploreDetails", 11, 1);

		validAddressOneTextBox.sendKeys(addressOne);

		// log.debug("entering the Addressone as " +addressOne);

		validAdressTwoTextBox.sendKeys(addressTwo);

		// log.debug("entering the Addresstwo as " +addressTwo);

		landmarkTextBox.sendKeys(landmark);

		// log.debug("entering the landmark as " +landmark);

		validpinCodeTextBox.sendKeys(pincode);

		// log.debug("entering the pincode as " +pincode);

		Thread.sleep(2500);
/*
		if (city.equalsIgnoreCase("Bangalore North")) {

			jse.executeScript("arguments[0].value='Bangalore North'", validCityNameDropDown);
		}

		else if (city.equalsIgnoreCase("Bangalore")) {

			jse.executeScript("arguments[0].value='Bangalore'", validCityNameDropDown);
		}

		else if (city.equalsIgnoreCase("BANGALORE NORTH")) {

			jse.executeScript("arguments[0].value='BANGALORE NORTH'", validCityNameDropDown);
		}*/
		
		//jse.executeScript("arguments[0].selectedIndex=" + 1 + ";",validCityNameDropDown);
		List<WebElement> Ele=BaseClass.driver.findElements(By.xpath("//Select[@id='ValidCityName']/option"));
        for(WebElement t:Ele){
            
            
           System.out.println(t.getText());
            
       if(t.getText().equals(city))
            {
                System.out.println(t.getText()); 
                t.click();
                
            }             
            
            else{
               System.out.println("Not found"); 
            }
        }

	}

	public void nextClick() {
		// clib.waitForElementPresent(submitBtn);
		// clib.waitForPageToLoad();
		// submitBtn.click();

		BaseClass.driver.findElement(By.id("enhanceproposal")).click();
		// log.debug("clicking on the submit button" );
	}
	// log.debug("Selecting the Tenure as " + tenure );
	// public void getAttribute() throws Throwable {
	// //Thread.sleep(5000);
	//
	// WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
	//
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("enhancePremiumResultOne")));

	// String ncb =
	// BaseClass.driver.findElement(By.id("enhancePremiumResultOne")).getAttribute("innerHTML");

	// elib.setExcelData("EnhanceFillDetails", 0, 2, ncb);
	// log.debug("Your Premium is " + ncb );
}
// WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 20);
//
// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
// }}

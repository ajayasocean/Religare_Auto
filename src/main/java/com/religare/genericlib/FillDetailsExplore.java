package com.religare.genericlib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillDetailsExplore {

	WebDriverCommonLib clib = new WebDriverCommonLib();

	ExcelLib elib = new ExcelLib();

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	@FindBy(id = "ValidPanCard")

	WebElement panCard;

	// @FindBy(xpath = "//div[@id='proposer_details_divid']/div[1]/div[1]/label[1]")

	@FindBy(className = "maleIcon ")

	WebElement maleIcon;

	// @FindBy(xpath="//label[@class = 'femaleIcon' and @for =
	// 'ValidTitle-2']")//label[@class='maleIcon']

	// @FindBy(xpath =".//*[@id='proposer_details_divid']/div[1]/div[1]/label[2]")

	// @FindBy(xpath = "//div[@id='proposer_details_divid']/div[1]/div[1]/label[2]")
	@FindBy(className = "femaleIcon ")

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

	public void fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation() throws Throwable {

		String genderIcon = elib.getExcelData("fillExploreDetails", 0, 1);

		String firstName = elib.getExcelData("fillExploreDetails", 1, 1);

		String lastName = elib.getExcelData("fillExploreDetails", 2, 1);

		String datePick = elib.getExcelData("fillExploreDetails", 3, 1);

		String emailId = elib.getExcelData("fillExploreDetails", 4, 1);

		String nomineeName = elib.getExcelData("fillExploreDetails", 5, 1);

		String nomineeRelation = elib.getExcelData("fillExploreDetails", 6, 1);
		
//		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(maleIcon));

//		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 10);
//		wait1.until(ExpectedConditions.visibilityOf(femaleIcon));
//		clib.waitForElementPresent(maleIcon);
//		clib.waitForElementPresent(femaleIcon);

		clib.waitForPageToLoad();

		if (genderIcon.equals("male")) {
			Thread.sleep(2000);

			jse.executeScript("arguments[0].click();", maleIcon);
		}

		else if (genderIcon.equalsIgnoreCase("female")) {

			femaleIcon.click();
		}

		fillFirstNameTextBox.sendKeys(firstName);

		fillLastNameTextBox.sendKeys(lastName);

		datePicker.sendKeys(datePick);

		emailTextBox.sendKeys(emailId);

		nomineeNameTextBox.sendKeys(nomineeName);

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

	}

	public void fillDetailsAddress() throws Throwable {

		String addressOne = elib.getExcelData("fillExploreDetails", 7, 1);

		String addressTwo = elib.getExcelData("fillExploreDetails", 8, 1);

		String landmark = elib.getExcelData("fillExploreDetails", 9, 1);

		String pincode = elib.getExcelData("fillExploreDetails", 10, 1);

		String city = elib.getExcelData("fillExploreDetails", 11, 1);

		validAddressOneTextBox.sendKeys(addressOne);

		validAdressTwoTextBox.sendKeys(addressTwo);

		landmarkTextBox.sendKeys(landmark);

		validpinCodeTextBox.sendKeys(pincode);

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

	public void nextClick() throws Throwable {
		
//		WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, 10);
//		wait2.until(ExpectedConditions.visibilityOf(submitBtn));
		Thread.sleep(2000);
	//	clib.waitForElementPresent(submitBtn);
		clib.waitForPageToLoad();
		submitBtn.click();
	}

	public void insuredMember1() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 0, 1);

		// String firstName = elib.getExcelData("InsuredDetails", 21, 1);
		//
		// String lastName = elib.getExcelData("InsuredDetails", 28, 1);
		//
		// String dob = elib.getExcelData("InsuredDetails", 35, 1);

		// BaseClass.driver.findElement(By.id("firstNamecd-1")).sendKeys(firstName);
		//
		// BaseClass.driver.findElement(By.id("lastNamecd-1")).sendKeys(lastName);
		//
		// BaseClass.driver.findElement(By.id("datepickerCD-1")).sendKeys(dob);

		try {

			Thread.sleep(1500);

			BaseClass.driver.findElement(By.id("passport-1")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void insuredMember2() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 1, 1);

		String firstName = elib.getExcelData("InsuredDetails", 22, 1);

		String lastName = elib.getExcelData("InsuredDetails", 29, 1);

		String dob = elib.getExcelData("InsuredDetails", 36, 1);

		String relation = elib.getExcelData("InsuredDetails", 15, 1);

		WebElement relation2 = BaseClass.driver.findElement(By.id("relationCd-2"));

		Select sel = new Select(relation2);

		sel.selectByValue(relation);

		BaseClass.driver.findElement(By.id("firstNamecd-2")).sendKeys(firstName);

		clib.waitForPageToLoad();

		BaseClass.driver.findElement(By.id("lastNamecd-2")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-2")).sendKeys(dob);

		try {
			Thread.sleep(1500);
			BaseClass.driver.findElement(By.id("passport-2")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void insuredMember3() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 2, 1);

		String firstName = elib.getExcelData("InsuredDetails", 23, 1);

		String lastName = elib.getExcelData("InsuredDetails", 30, 1);

		String dob = elib.getExcelData("InsuredDetails", 37, 1);

		String relation = elib.getExcelData("InsuredDetails", 16, 1);

		WebElement relation3 = BaseClass.driver.findElement(By.id("relationCd-3"));

		Select sel = new Select(relation3);

		sel.selectByValue(relation);

		BaseClass.driver.findElement(By.id("firstNamecd-3")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-3")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-3")).sendKeys(dob);

		try {
			Thread.sleep(1500);
			BaseClass.driver.findElement(By.id("passport-3")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void insuredMember4() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 3, 1);

		String firstName = elib.getExcelData("InsuredDetails", 24, 1);

		String lastName = elib.getExcelData("InsuredDetails", 31, 1);

		String dob = elib.getExcelData("InsuredDetails", 38, 1);

		String relation = elib.getExcelData("InsuredDetails", 17, 1);

		WebElement relation4 = BaseClass.driver.findElement(By.id("relationCd-4"));

		Select sel = new Select(relation4);

		sel.selectByValue(relation);

		BaseClass.driver.findElement(By.id("firstNamecd-4")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-4")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-4")).sendKeys(dob);

		try {
			Thread.sleep(1500);
			BaseClass.driver.findElement(By.id("passport-4")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

		// BaseClass.driver.findElement(By.id("submit_insured_details")).click();

	}

	public void insuredMember5() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 4, 1);

		String firstName = elib.getExcelData("InsuredDetails", 25, 1);

		String lastName = elib.getExcelData("InsuredDetails", 32, 1);

		String dob = elib.getExcelData("InsuredDetails", 39, 1);

		String relation = elib.getExcelData("InsuredDetails", 18, 1);

		WebElement relation5 = BaseClass.driver.findElement(By.id("relationCd-5"));

		Select sel = new Select(relation5);

		sel.selectByValue(relation);

		BaseClass.driver.findElement(By.id("firstNamecd-5")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-5")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-5")).sendKeys(dob);

		try {
			Thread.sleep(1500);
			BaseClass.driver.findElement(By.id("passport-5")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

		// BaseClass.driver.findElement(By.id("submit_insured_details")).click();

	}

	public void insuredMember6() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 5, 1);

		String firstName = elib.getExcelData("InsuredDetails", 26, 1);

		String lastName = elib.getExcelData("InsuredDetails", 33, 1);

		String dob = elib.getExcelData("InsuredDetails", 40, 1);

		String relation = elib.getExcelData("InsuredDetails", 19, 1);

		WebElement relation6 = BaseClass.driver.findElement(By.id("relationCd-6"));

		Select sel = new Select(relation6);

		sel.selectByValue(relation);

		BaseClass.driver.findElement(By.id("firstNamecd-6")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-6")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-6")).sendKeys(dob);

		try {
			Thread.sleep(1500);
			BaseClass.driver.findElement(By.id("passport-6")).sendKeys(passport);
		} catch (Exception e) {
			e.getMessage();
		}

		// BaseClass.driver.findElement(By.id("submit_insured_details")).click();}
		// catch(Exception e) {e.getMessage();}

	}

	public void next() {
		BaseClass.driver.findElement(By.id("submit_insured_details")).click();
	}

	public void panCard() throws Throwable {

		String pancard = elib.getExcelData("fillExploreDetails", 12, 1);

		panCard.sendKeys(pancard);
	}

}

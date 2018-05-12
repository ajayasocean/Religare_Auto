package com.religare.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class StudentExplorePolicyplan {
	ExcelLib elib = new ExcelLib();

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	WebDriverCommonLib clib = new WebDriverCommonLib();
	@FindBy(id = "geographicalscope-1")
	WebElement TravellingToYes;
	@FindBy(id = "geographicalscope-2")
	WebElement TravellingToNo;
	@FindBy(id = "mobile")
	WebElement Mobile;
	@FindBy(id = "pedQuestion-1")
	WebElement PEDyes;
	@FindBy(id = "pedQuestion-2")
	WebElement PEDno;
	@FindBy(id = "carebuynowimage")
	private WebElement Buy;

	@FindBy(id = "ValidPanCard")

	WebElement panCard;

	@FindBy(xpath = "//div[@id='proposer_details_divid']/div[1]/div[1]/label[1]")

	// @FindBy(id ="maleIcon")
	//// div[@id='enhance_proposer_details']/div[1]/div[1]/label[1]

	WebElement maleIcon;
	//// div[@id='proposer_details_divid']/div[1]/div[1]/label[1]

	// @FindBy(xpath="//label[@class = 'femaleIcon' and @for =
	// 'ValidTitle-2']")//label[@class='maleIcon']

	// @FindBy(xpath =".//*[@id='proposer_details_divid']/div[1]/div[1]/label[2]")

	@FindBy(xpath = "//div[@id='proposer_details_divid']/div[1]/div[1]/label[2]")
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

	@FindBy(id = "from")

	WebElement froMdatePicker;

	public void travellingTo() throws Throwable {
		String Region = elib.getExcelData("StudentExplorepolicyplan", 0, 1);
		String a = "Yes";

		if (a.equals(Region)) {
			TravellingToYes.click();
		} else {
			TravellingToNo.click();
		}
		// log.debug("Selecting Travelling to US/Canada option as " +Region);
	}

	public void policyTensure() throws Throwable {
		String PTMonth = elib.getExcelData("StudentExplorepolicyplan", 2, 1);
		WebElement lis = BaseClass.driver.findElement(By.id("policyTerm"));
		Select select = new Select(lis);
		select.selectByVisibleText(PTMonth);
		// log.debug("Selecting the Policy Tenure Months as " + PTMonth );
	}

	public void mobile() throws Throwable {
		Thread.sleep(1500);
		String mobilenumber = elib.getExcelData("StudentExplorepolicyplan", 4, 1);
		Mobile.sendKeys(mobilenumber);
		Thread.sleep(1500);
	}

	public void PED() throws Throwable {
		String Ped = elib.getExcelData("StudentExplorepolicyplan", 6, 1);
		String a = "Yes";
		if (a.equals(Ped)) {
			PEDyes.click();
		} else {
			PEDno.click();
		}
	}

	public void slider() {
		WebElement slider = BaseClass.driver.findElement(By.xpath(
				"//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]"));
		Dimension dim = slider.getSize();
		int x = dim.getWidth();
		Actions actions = new Actions(BaseClass.driver);
		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();
		// log.debug("Moving the slider ");
		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
	}

	public void totalpremium() throws Throwable {
		Thread.sleep(3000);
		try {
			String expstrt = BaseClass.driver.findElement(By.id("ExploreStart")).getAttribute("innerHTML");
			// log.debug("Your Premium for explore start is " + expstrt );
		} catch (Exception e) {
		}
		try {
			String explus = BaseClass.driver.findElement(By.id("ExplorePlus")).getAttribute("innerHTML");
			// log.debug("Your Premium for explore plus is " + explus );
		} catch (Exception e) {

		}
		try {
			String expsup = BaseClass.driver.findElement(By.id("ExploreSuper")).getAttribute("innerHTML");
			// log.debug("Your Premium for Care Freedom exploreSuper is " + expsup);
			String expult = BaseClass.driver.findElement(By.id("ExploreUltra")).getAttribute("innerHTML");
			// log.debug("Your Premium for Care Freedom for ExploreUltra is " + expult);
		} catch (Exception e) {
		}
	}

	public void submit() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 20);
	//	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
		Thread.sleep(2100);
		Buy.click();
		// log.debug("clicking on the buy now button");
	}

	public void fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation() throws Throwable {

		String genderIcon = elib.getExcelData("fillExploreDetails", 0, 1);

		String firstName = elib.getExcelData("fillExploreDetails", 1, 1);

		String lastName = elib.getExcelData("fillExploreDetails", 2, 1);

		String datePick = elib.getExcelData("fillExploreDetails", 3, 1);

		String emailId = elib.getExcelData("fillExploreDetails", 4, 1);

		String nomineeName = elib.getExcelData("fillExploreDetails", 5, 1);

		String nomineeRelation = elib.getExcelData("fillExploreDetails", 6, 1);

		String fromDate = elib.getExcelData("fillExploreDetails", 13, 1);

		// clib.waitForElementPresent(maleIcon);
		//
		// clib.waitForElementPresent(femaleIcon);

		// clib.waitForPageToLoad();

		if (genderIcon.equals("male")) {

			jse.executeScript("arguments[0].click();", maleIcon);
		}

		else if (genderIcon.equalsIgnoreCase("female")) {

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

		;
		Thread.sleep(3000);
		froMdatePicker.sendKeys(fromDate);

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

		/*if (city.equalsIgnoreCase("Bangalore North")) {

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

		BaseClass.driver.findElement(By.id("studentproposal")).click();
		// log.debug("clicking on the submit button" );
	}
}

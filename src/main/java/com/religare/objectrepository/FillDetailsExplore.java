package com.religare.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;

public class FillDetailsExplore {

	WebDriverCommonLib clib = new WebDriverCommonLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();
	
	//WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);
	ExcelLib elib = new ExcelLib();
	
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	@FindBy(id = "ValidPanCard")

	WebElement panCard;

	// @FindBy(xpath ="//div[@id='proposer_details_divid']/div[1]/div[1]/label[1]")

	@FindBy(id = "maleIcon")

	WebElement maleIcon;

	// @FindBy(xpath="//label[@class = 'femaleIcon' and @for =
	// 'ValidTitle-2']")//label[@class='maleIcon']

	// @FindBy(xpath =".//*[@id='proposer_details_divid']/div[1]/div[1]/label[2]")

	// @FindBy (xpath =
	// "//div[@id='proposer_details_divid']/div[1]/div[1]/label[2]")

	@FindBy(id = "femaleIcon")

	WebElement femaleIcon;

	@FindBy(id = "ValidFName")

	WebElement fillFirstNameTextBox;

	@FindBy(id = "ValidLName")

	WebElement fillLastNameTextBox;

	@FindBy(id = "datepicker") // joytomorrowinsured

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

	@FindBy(id = "enhanceproposal")
	WebElement EnchanceNext;

	@FindBy(id = "joytomorrowproposal")
	WebElement joyTomorrow;

	@FindBy(id = "joyproposal") // studentinsured
	WebElement joyToday;

	@FindBy(id = "proposal")
	WebElement SecureNext;

	@FindBy(id = "studentproposal")
	WebElement StudentexploreNext;

	/////////////////////////////////////////////////////////
	@FindBy(id = "assurecare")
	WebElement TotalassurePremium;

	@FindBy(id = "enhancePremiumResultOne")
	WebElement TotalPremium;

	@FindBy(id = "travelPremium")
	WebElement TotalExplorePremium;

	@FindBy(id = "joyprimiumone")
	WebElement TotaljoyPremium;

	@FindBy(id = "secure_premium_val")
	WebElement TotalsecurePremium;

	@FindBy(id = "enhancePremiumResultRroposalOne")
	WebElement TotalstudentPremium;

	@FindBy(id = "enhanceinsured")
	WebElement Nextenchanceinsuredscreen;

	@FindBy(id = "joytomorrowinsured")
	WebElement Nextjoytomorrowinsuredscreen;

	@FindBy(id = "joyinsured")
	WebElement Nextjoytodayinsuredscreen;

	@FindBy(id = "studentinsured")
	WebElement studentInsuredNext;

	public void Nextjoytodayinsuredscreen() {
		Nextjoytodayinsuredscreen.click();
	}

	public void Nextjoytomorrowinsuredscreen() {
		Nextjoytomorrowinsuredscreen.click();
	}

	public void Nextenchanceinsuredscreen() {
		Nextenchanceinsuredscreen.click();
	}

	public void Submitenchance() {
		wait.until(ExpectedConditions.visibilityOf(EnchanceNext));
	//	clib.waitForElementPresent(EnchanceNext);
		clib.waitForPageToLoad();
		EnchanceNext.click();

	}

	public void submitjoytomorrow() {
		wait.until(ExpectedConditions.visibilityOf(joyTomorrow));
		//clib.waitForElementPresent(joyTomorrow);
		clib.waitForPageToLoad();
		joyTomorrow.click();
		// log.debug("clicking on the submit button" );
	}

	public void submitjoytoday() {
		wait.until(ExpectedConditions.visibilityOf(joyToday));
		//clib.waitForElementPresent(joyToday);
		clib.waitForPageToLoad();
		joyToday.click();
		// log.debug("clicking on the submit button" );
	}

	public void sumbitsecure() {
		wait.until(ExpectedConditions.visibilityOf(SecureNext));
		//clib.waitForElementPresent(SecureNext);
		clib.waitForPageToLoad();
		SecureNext.click();
		// log.debug("clicking on the submit button" );
	}

	public void submitstudentexplore() {
		wait.until(ExpectedConditions.visibilityOf(StudentexploreNext));
		//clib.waitForElementPresent(StudentexploreNext);
		clib.waitForPageToLoad();
		StudentexploreNext.click();
		// log.debug("clicking on the submit button" );

	}

	public void submitsecure() {
		wait.until(ExpectedConditions.visibilityOf(SecureNext));
	//	clib.waitForElementPresent(SecureNext);
		clib.waitForPageToLoad();
		SecureNext.click();
		// log.debug("clicking on the submit button" );
	}

	public void totalpremiumassure() throws Throwable {
		Thread.sleep(1500);
		String prmscreen2 = TotalassurePremium.getAttribute("innerHTML");
		// log.debug("The total primium one is " + prmscreen2);
	}

	public void totalpremium() throws Throwable {
		Thread.sleep(1500);
		String prmscreen2 = TotalPremium.getAttribute("innerHTML");
		// log.debug("The total primium one is " + prmscreen2);
	}

	public void totaljoypremium() throws Throwable {
		Thread.sleep(1500);
		String prmscreen2 = TotaljoyPremium.getAttribute("innerHTML");
		// log.debug("The total primium one is " + prmscreen2);
	}

	public void totalsecurepremium() throws InterruptedException {
		Thread.sleep(1500);
		String prmscreen2 = TotalsecurePremium.getAttribute("innerHTML");
		// log.debug("The total primium one is " + prmscreen2);
	}

	public void totalstudentpremium() throws Throwable {
		Thread.sleep(1500);
		String prmscreen2 = TotalstudentPremium.getAttribute("innerHTML");
		// log.debug("The total primium one is " + prmscreen2);
	}

	public void fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation() throws Throwable {

		String genderIcon = elib.getExcelData("fillExploreDetails", 0, 1);

		String firstName = elib.getExcelData("fillExploreDetails", 1, 1);

		String lastName = elib.getExcelData("fillExploreDetails", 2, 1);

		String datePick = elib.getExcelData("fillExploreDetails", 3, 1);

		String emailId = elib.getExcelData("fillExploreDetails", 4, 1);

		String nomineeName = elib.getExcelData("fillExploreDetails", 5, 1);

		String nomineeRelation = elib.getExcelData("fillExploreDetails", 6, 1);
		wait.until(ExpectedConditions.visibilityOf(maleIcon));

	//	clib.waitForElementPresent(maleIcon);
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
		
		
	
		jse.executeScript("arguments[0].selectedIndex=" + 1 + ";",validCityNameDropDown);
		
		}
	

			


	public void nextClick() {
		wait.until(ExpectedConditions.visibilityOf(submitBtn));
		//clib.waitForElementPresent(submitBtn);
		clib.waitForPageToLoad();
		submitBtn.click();
		// log.debug("clicking on the submit button" );
	}

	public void insuredMember1() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 0, 1);

		// String weight = elib.getExcelData("InsuredDetails", 42, 1);
		// String height = elib.getExcelData("InsuredDetails", 49, 1);
		// String inches = elib.getExcelData("InsuredDetails", 56, 1);
		//
		// BaseClass.driver.findElement(By.id("firstNamecd-1")).sendKeys(firstName);
		//
		// BaseClass.driver.findElement(By.id("lastNamecd-1")).sendKeys(lastName);
		//
		// BaseClass.driver.findElement(By.id("datepickerCD-1")).sendKeys(dob);
		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-1"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		// // log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-1"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// // log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-1")).sendKeys(weight);
		// //log.debug("Entering the weight as" +weight);

		BaseClass.driver.findElement(By.id("passport-1")).sendKeys(passport);
		// log.debug("Entering the passportNumber as" +passport);

	}

	public void insuredMember2() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 1, 1);

		String firstName = elib.getExcelData("InsuredDetails", 22, 1);

		String lastName = elib.getExcelData("InsuredDetails", 29, 1);

		String dob = elib.getExcelData("InsuredDetails", 36, 1);

		String relation = elib.getExcelData("InsuredDetails", 15, 1);
		// String weight = elib.getExcelData("InsuredDetails", 43, 1);
		// String height = elib.getExcelData("InsuredDetails", 50, 1);
		// String inches = elib.getExcelData("InsuredDetails", 57, 1);
		//
		WebElement relation2 = BaseClass.driver.findElement(By.id("relationCd-2"));

		Select sel = new Select(relation2);

		sel.selectByValue(relation);
		// log.debug("Selecting the relation as" +relation);
		BaseClass.driver.findElement(By.id("firstNamecd-2")).sendKeys(firstName);

		clib.waitForPageToLoad();
		// log.debug("Entering the firstName " +firstName );
		BaseClass.driver.findElement(By.id("lastNamecd-2")).sendKeys(lastName);
		// log.debug("Entering the lastName " +lastName );
		BaseClass.driver.findElement(By.id("datepickerCD-2")).sendKeys(dob);
		// log.debug("Entering the DOB " +dob );

		BaseClass.driver.findElement(By.id("passport-2")).sendKeys(passport);
		// log.debug("Entering the passport2 number " +passport );
		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-2"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		// // log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-2"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// //log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-2")).sendKeys(weight);
		// //log.debug("Entering the weight as" +weight);
		//

	}

	public void insuredMember3() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 2, 1);

		String firstName = elib.getExcelData("InsuredDetails", 23, 1);

		String lastName = elib.getExcelData("InsuredDetails", 30, 1);

		String dob = elib.getExcelData("InsuredDetails", 37, 1);
		// String weight = elib.getExcelData("InsuredDetails", 44, 1);
		// String height = elib.getExcelData("InsuredDetails", 51, 1);
		// String inches = elib.getExcelData("InsuredDetails", 58, 1);
		String relation = elib.getExcelData("InsuredDetails", 16, 1);

		WebElement relation3 = BaseClass.driver.findElement(By.id("relationCd-3"));

		Select sel = new Select(relation3);

		sel.selectByValue(relation);
		// log.debug("Selecting the relation as" +relation);
		BaseClass.driver.findElement(By.id("firstNamecd-3")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-3")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-3")).sendKeys(dob);

		BaseClass.driver.findElement(By.id("passport-3")).sendKeys(passport);

		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-3"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		// //log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-3"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// //log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-3")).sendKeys(weight);
		// //log.debug("Entering the weight as" +weight);
	}

	public void insuredMember4() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 3, 1);

		String firstName = elib.getExcelData("InsuredDetails", 24, 1);

		String lastName = elib.getExcelData("InsuredDetails", 31, 1);

		String dob = elib.getExcelData("InsuredDetails", 38, 1);
		// String weight = elib.getExcelData("InsuredDetails", 45, 1);
		// String height = elib.getExcelData("InsuredDetails", 52, 1);
		// String inches = elib.getExcelData("InsuredDetails", 59, 1);
		//
		String relation = elib.getExcelData("InsuredDetails", 17, 1);

		WebElement relation4 = BaseClass.driver.findElement(By.id("relationCd-4"));

		Select sel = new Select(relation4);

		sel.selectByValue(relation);
		// log.debug("Selecting the relation as" +relation);
		BaseClass.driver.findElement(By.id("firstNamecd-4")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-4")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-4")).sendKeys(dob);

		BaseClass.driver.findElement(By.id("passport-4")).sendKeys(passport);

		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-4"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		// // log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-4"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// // log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-4")).sendKeys(weight);
		// log.debug("Entering the weight as" +weight);
		// BaseClass.driver.findElement(By.id("submit_insured_details")).click();

	}

	public void insuredMember5() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 4, 1);

		String firstName = elib.getExcelData("InsuredDetails", 25, 1);

		String lastName = elib.getExcelData("InsuredDetails", 32, 1);

		String dob = elib.getExcelData("InsuredDetails", 39, 1);
		// String weight = elib.getExcelData("InsuredDetails", 46, 1);
		// String height = elib.getExcelData("InsuredDetails", 53, 1);
		// String inches = elib.getExcelData("InsuredDetails", 60, 1);
		String relation = elib.getExcelData("InsuredDetails", 18, 1);

		WebElement relation5 = BaseClass.driver.findElement(By.id("relationCd-5"));

		Select sel = new Select(relation5);

		sel.selectByValue(relation);
		// log.debug("Selecting the relation as" +relation);
		BaseClass.driver.findElement(By.id("firstNamecd-5")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-5")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-5")).sendKeys(dob);

		BaseClass.driver.findElement(By.id("passport-5")).sendKeys(passport);

		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-5"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		//// log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-5"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// // log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-5")).sendKeys(weight);
		// // log.debug("Entering the weight as" +weight);
		// //BaseClass.driver.findElement(By.id("submit_insured_details")).click();

	}

	public void insuredMember6() throws Throwable {

		String passport = elib.getExcelData("InsuredDetails", 5, 1);

		String firstName = elib.getExcelData("InsuredDetails", 26, 1);

		String lastName = elib.getExcelData("InsuredDetails", 33, 1);

		String dob = elib.getExcelData("InsuredDetails", 40, 1);
		//
		// String weight = elib.getExcelData("InsuredDetails", 47, 1);
		// String height = elib.getExcelData("InsuredDetails", 54, 1);
		// String inches = elib.getExcelData("InsuredDetails", 61, 1);
		String relation = elib.getExcelData("InsuredDetails", 19, 1);

		WebElement relation6 = BaseClass.driver.findElement(By.id("relationCd-6"));

		Select sel = new Select(relation6);

		sel.selectByValue(relation);
		// log.debug("Selecting the relation as" +relation);
		BaseClass.driver.findElement(By.id("firstNamecd-6")).sendKeys(firstName);

		BaseClass.driver.findElement(By.id("lastNamecd-6")).sendKeys(lastName);

		BaseClass.driver.findElement(By.id("datepickerCD-6")).sendKeys(dob);

		BaseClass.driver.findElement(By.id("passport-6")).sendKeys(passport);

		// WebElement heights = BaseClass.driver.findElement(By.id("heightFeet-6"));
		// Select h = new Select(heights);
		// h.selectByVisibleText(height);
		// // log.debug("Entering the Height as" +height);
		// WebElement inche = BaseClass.driver.findElement(By.id("heightInches-6"));
		// Select i = new Select(inche);
		// i.selectByVisibleText(inches);
		// //log.debug("Entering the inches as" +inches);
		// BaseClass.driver.findElement(By.id("weight-6")).sendKeys(weight);
		// // log.debug("Entering the weight as" +weight);
		// BaseClass.driver.findElement(By.id("submit_insured_details")).click();}
		// catch(Exception e) {e.getMessage();}

	}

	public void next() {
		BaseClass.driver.findElement(By.id("submit_insured_details")).click();
	}

	public void panCard() throws Throwable {

		String pancard = elib.getExcelData("fillExploreDetails", 12, 1);
		panCard.sendKeys(pancard);
		// log.debug("entering the pancard number as " +pancard );
	}

	public void secureinsuredpage() throws Throwable {
		String ocp = elib.getExcelData("InsuredDetails", 63, 1);
		WebElement oc = BaseClass.driver.findElement(By.id("ValidOccupationAddClass-1"));
		Select op = new Select(oc);
		op.selectByVisibleText(ocp);
		// log.debug("The occupation as " + ocp);
		if (ocp.equals("Other")) {
			BaseClass.driver.findElement(By.id("customerOccupation")).sendKeys("business");
		} else {

		}
		BaseClass.driver.findElement(By.id("insured")).click();
		// log.debug("Clicking on the Submit button ");
	}

	public void studentExploreInsuredpage() throws Throwable {

		// String prm2 =
		// BaseClass.driver.findElement(By.id("enhancePremiumResultRroposalOne")).getAttribute("innerHTML");
		// log.debug("The Enhance Premium Resultone on Screen3 is " + prm2);
		// try {
		// BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		String clg = elib.getExcelData("InsuredDetails", 65, 1);
		String course = elib.getExcelData("InsuredDetails", 66, 1);
		String clgmail = elib.getExcelData("InsuredDetails", 67, 1);
		String Nation = elib.getExcelData("InsuredDetails", 68, 1);
		String spr = elib.getExcelData("InsuredDetails", 69, 1);
		String sponserYear = elib.getExcelData("InsuredDetails", 70, 1);
		String sponsermonth = elib.getExcelData("InsuredDetails", 71, 1);
		String Sponserday = elib.getExcelData("InsuredDetails", 72, 1);
		String relation = elib.getExcelData("InsuredDetails", 73, 1);

		BaseClass.driver.findElement(By.id("NameofEducationalInstitute")).sendKeys(clg);
		// log.debug("Name of Educational Institute is " + clg);
		BaseClass.driver.findElement(By.id("EducationalCourseDetails")).sendKeys(course);
		// log.debug("Educational Course is " + course);
		BaseClass.driver.findElement(By.id("EducationalInstituteAddress")).sendKeys(clgmail);
		// log.debug("Educational Institute Mail ID is " + clgmail);
		BaseClass.driver.findElement(By.id("Country")).sendKeys(Nation);
		// log.debug("Country is " + Nation);

		BaseClass.driver.findElement(By.id("SponsorsName")).sendKeys(spr);
		// log.debug("Sponsors Name is " + spr);

		WebElement selectDate = BaseClass.driver.findElement(By.id("SponsorDob"));
		selectDate.click();
		WebElement selyear = BaseClass.driver.findElement(By.className("ui-datepicker-year"));
		Select sel7 = new Select(selyear);
		sel7.selectByVisibleText(sponserYear);
		WebElement selmnth = BaseClass.driver.findElement(By.className("ui-datepicker-month"));
		Select sel8 = new Select(selmnth);
		sel8.selectByVisibleText(sponsermonth);
		BaseClass.driver.findElement(By.xpath("//a[text()='" + Integer.parseInt(Sponserday) + "']")).click();
		// log.debug("Sponsor date of birth " );

		WebElement sprln = BaseClass.driver.findElement(By.id("sponserrelation"));
		Select sel3 = new Select(sprln);
		sel3.selectByVisibleText(relation);
		// log.debug("Selecting the Sponsor Relation is " + relation);
		Thread.sleep(1000);
		BaseClass.driver.findElement(By.id("studentAdditional")).click();
		// log.debug("Clicking on the next button ");
		
		scr.captureScreenshot(BaseClass.driver, "StudentExplore Insured Details Page");

	}

	public void studentInsuredNext() {

		studentInsuredNext.click();
	}

}

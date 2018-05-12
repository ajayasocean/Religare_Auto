package com.religare.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class CareFirstPage {

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	WebDriverCommonLib clib = new WebDriverCommonLib();

	ExcelLib elib = new ExcelLib();

	// @FindBy(xpath = "//a[@id='txtIconPlus_id']/img")

	@FindBy(id = "txtIconPlus_id")

	WebElement totalMemberPlus;

	// @FindBy(xpath = "//a[@id='txtIconMinus_id']/img']")

	@FindBy(id = "txtIconMinus_id")

	WebElement totalMemberMinus;

	@FindBy(xpath = "//form[@id='select_skin_form_9']/div[1]/div[1]/div[2]/div/div[2]/span/p[2]/a[1]")

	WebElement totalChildPlus;

	@FindBy(xpath = "//form[@id='select_skin_form_9']/div[1]/div[1]/div[2]/div/div[2]/span/p[2]/a[2]/img")

	WebElement totalChildMinus;

	@FindBy(id = "ageGroupOfEldestMember")

	private WebElement ageOfEledestGroupMemberDropDown;

	@FindBy(id = "mobile")

	WebElement mobileNumber;

	@FindBy(id = "tenure2")

	WebElement tenureRadioBtn2;

	@FindBy(id = "tenure3")

	WebElement tenureBtn3;

	@FindBy(xpath = "//div[@id='caresecondrow']/div/div[1]/label[@for='roundedTwo1']")

	WebElement careWithUnlimited;

	@FindBy(id = "//div[@id='carefirstrow']/div/div[1]/label[@for='roundedTwo2']")

	WebElement claimSuperBonusRadioBtn;

	@FindBy(id = "//div[@id='caresecondrow']/div/div[1]/label[@for='roundedTwo0']")

	WebElement careRadioBtn;

	@FindBy(id = "carebuynowimage")

	WebElement nextBtn;

	@FindBy(id = "label-id1-0") // label-id1-0

	WebElement preExistingDisease;

	@FindBy(id = "label-id2-0")

	WebElement previousInsurer;

	@FindBy(id = "label-id3-0")

	WebElement higherPremium;

	@FindBy(id = "label-id4-0")

	WebElement healthInsurance;

	@FindBy(id = "validTermCondition-1")

	WebElement termsAndConditions;

	@FindBy(id = "SICREDITCARD")

	WebElement renewalPremium;

	@FindBy(id = "submit_medical_history")

	WebElement nextBtnSubmit;

	@FindBy(id = "ageGroupOfEldestMember1")

	WebElement ageDropDown1;

	@FindBy(id = "ageGroupOfEldestMember1")

	WebElement ageOfEldestMember1DropDown;

	public void selectTotalNumberPlus() {

		totalMemberPlus.click();
	}

	public void selectTotalMemberMinus() {

		totalMemberMinus.click();
	}

	public void totalMember() throws Throwable {

		String totalMember = elib.getExcelData("CareSpecificData", 2, 1);
		// String totalMember="one";

		if (totalMember.equalsIgnoreCase("one")) {

			totalMemberPlus.click();

			totalMemberPlus.click();

			totalMemberPlus.click();
		}
		if (totalMember.equalsIgnoreCase("two")) {

			totalMemberPlus.click();

			totalMemberPlus.click();

		}

		if (totalMember.equalsIgnoreCase("three")) {

			totalMemberPlus.click();

		}

		if (totalMember.equalsIgnoreCase("four")) {
			System.out.println("Four Members");
			;
		}

		if (totalMember.equalsIgnoreCase("five")) {

			totalMemberMinus.click();
		}

		if (totalMember.equalsIgnoreCase("six")) {

			totalMemberMinus.click();

			totalMemberMinus.click();

		}

	}

	public void totalChildPlus() {

		totalChildPlus.click();
	}

	public void totalChildMinus() {

		totalChildMinus.click();
	}

	public void ageOfEldestMember1() throws Throwable {

		String ageOfEldestMember = elib.getExcelData("CareSpecificData", 0, 1);

		clib.select(ageOfEldestMember1DropDown, ageOfEldestMember);

		// jse.executeScript("arguments[0].value='"+ageOfEldestMember+"';",
		// ageOfEledestGroupMemberDropDown);
		// clib.select(ageOfEledestGroupMemberDropDown, ageOfEldestMember1);
	}

	public void ageOfEldestMember() throws Throwable {

		String ageOfEldestMember = elib.getExcelData("CareSpecificData", 0, 1);

		// jse.executeScript("arguments[0].value='"+ageOfEldestMember+"';",

		// ageOfEledestGroupMemberDropDown);

		clib.select(ageOfEledestGroupMemberDropDown, ageOfEldestMember);
	}

	public void enterMobileNumber() throws Throwable {

		String mobileNbr = elib.getExcelData("CareSpecificData", 1, 1);

		mobileNumber.sendKeys(mobileNbr);
	}

	public void tenure2() {
		tenureRadioBtn2.click();
	}

	public void tenure3() {
		tenureBtn3.click();
	}

	public void careUnlimted() {
		careWithUnlimited.click();
	}

	public void careBtn() {
		careRadioBtn.click();
	}

	public void claimSuperBonus() {

		claimSuperBonusRadioBtn.click();
	}

	public void next() throws Throwable {

		org.openqa.selenium.support.ui.WebDriverWait wait3 = new org.openqa.selenium.support.ui.WebDriverWait(

				BaseClass.driver, 20);
		
		Thread.sleep(2000);

	//	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));

		BaseClass.driver.findElement(By.id("carebuynowimage")).click();

		// jse.executeScript("[arguments[0].click();", nextBtn);
		// nextBtn.click();
	}

	public void slider() throws Throwable {

		Thread.sleep(1500);

		WebElement slider = BaseClass.driver
				.findElement(By.xpath("//*[@id='select_skin_form_9']/div[2]/div[2]/span[3]"));

		org.openqa.selenium.Dimension dim = slider.getSize();

		int x = dim.getWidth();

		org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(
				BaseClass.driver);

		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();

		// log.debug("Moving the slider ");
		Thread.sleep(2000);
	}

	public void payment() {

		jse.executeScript("arguments[0].click();", preExistingDisease);

		jse.executeScript("arguments[0].click();", previousInsurer);

		jse.executeScript("arguments[0].click();", higherPremium);

		jse.executeScript("arguments[0].click();", healthInsurance);

		jse.executeScript("arguments[0].click();", termsAndConditions);

		jse.executeScript("arguments[0].click();", renewalPremium);

		jse.executeScript("arguments[0].click();", nextBtnSubmit);

	}

	public void totalMembers() throws Throwable {
		String totalmemInt = elib.getExcelData("CareSpecificData", 2, 1);

		if (totalmemInt.equalsIgnoreCase("four")) {

		} else if (totalmemInt.equalsIgnoreCase("five")) {
			BaseClass.driver.findElement(By.id("txtIconMinus_id")).click();
			// totalMemberMinus.click();

		} else if (totalmemInt.equalsIgnoreCase("six")) {
			for (int i = 0; i <= 1; i++)
				// totalMemberMinus.click();
				BaseClass.driver.findElement(By.id("txtIconMinus_id")).click();
		} else if (totalmemInt.equalsIgnoreCase("three") || totalmemInt.equalsIgnoreCase("two")
				|| totalmemInt.equalsIgnoreCase("one")) {
			for (int i = 3; i >= totalmemInt.length(); i--) {

				BaseClass.driver.findElement(By.id("txtIconPlus_id")).click();

			}
		}
	}
}

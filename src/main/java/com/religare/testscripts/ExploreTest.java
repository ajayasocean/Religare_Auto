package com.religare.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.FillDetailsExplore;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.ExploreClick;
import com.religare.objectrepository.ExploreFirstPage;
import com.religare.objectrepository.MedicalHistoryPage;
import com.religare.objectrepository.PayU;

@Listeners(com.religare.genericlib.SampleListener.class)

public class ExploreTest extends BaseClass {

	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	@Test

	public void clickOnCareTest() throws IOException {

		ExploreClick home = PageFactory.initElements(BaseClass.driver, ExploreClick.class);
		
		scr.captureScreenshot(driver, "Religare Home Page");

		home.moveToExplore();

	}

	@Test
	public void explorePageTestMultiTest() throws Throwable {

		clib.waitForPageToLoad();

		ExploreFirstPage exp = PageFactory.initElements(BaseClass.driver, ExploreFirstPage.class);

		exp.slider();

		exp.multiTripType();

		exp.month();

		Thread.sleep(1500);

		exp.day();

		Thread.sleep(1500);

		exp.totalMember();

		exp.ageOfMember1();

		try {

			exp.ageOfMember2();

			exp.ageOfMember3();

			exp.ageOfMember4();

			exp.ageOfMember5();

			exp.ageOfMember6();
		}

		catch (Exception e) {

			e.getMessage();
		}

		String number = elib.getExcelData("testSpecificData", 0, 1);
		;

		exp.phoneNumber(number);

		Thread.sleep(2000);

		exp.pedRadioBtn();

		try {

			exp.premiumBtn();

			Alert al = BaseClass.driver.switchTo().alert();

			al.accept();
		}

		catch (Exception e) {

			e.getMessage();

		}

		exp.agreeCheckBox();

		exp.agreeCheckBox();
		
		scr.captureScreenshot(driver, "Explore first page");


		Thread.sleep(2000);

		try {

			exp.careBuyBtn();

			Alert al = BaseClass.driver.switchTo().alert();

			al.accept();

			Thread.sleep(2000);

			clib.waitForPageToLoad();

			exp.careBuyBtn();
		}

		catch (Exception e) {

			e.getMessage();
		}

	}

	@Test

	public void proposerDetail() throws Throwable {

		clib.waitForPageToLoad();

		FillDetailsExplore pdp = PageFactory.initElements(BaseClass.driver, FillDetailsExplore.class);

		pdp.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();
		
		Thread.sleep(1500);

		pdp.fillDetailsAddress();

		// Thread.sleep(3500);
		
		Thread.sleep(1500);

		try {

			pdp.panCard();

		} catch (NoSuchElementException e) {

			e.getMessage();

		}
		Thread.sleep(1500);
		
		scr.captureScreenshot(driver, "Explore Proposer's Details page");
		pdp.nextClick();

		Thread.sleep(7000);

		FillDetailsExplore idp = PageFactory.initElements(BaseClass.driver, FillDetailsExplore.class);

		idp.insuredMember1();

		try {

			idp.insuredMember2();
			idp.insuredMember3();
			idp.insuredMember4();
			idp.insuredMember5();
			idp.insuredMember6();

		}

		catch (Exception e) {

			e.getMessage();
		}

		clib.waitForPageToLoad();
		
		scr.captureScreenshot(driver, "Explore Insured Details Page");

		idp.next();

		Thread.sleep(2500);

		try {

			BaseClass.driver.findElement(By.id("premiumPopupOk")).click();
		}

		catch (Exception e) {

			e.getMessage();
		}

		clib.waitForPageToLoad();

		MedicalHistoryPage emh = PageFactory.initElements(BaseClass.driver, MedicalHistoryPage.class);

		String totalMember = elib.getExcelData("testSpecificData", 8, 1);

		if (totalMember.equalsIgnoreCase("one")) {

			Thread.sleep(3000);

			emh.medHist();
		}

		else if (totalMember.equalsIgnoreCase("two")) {

			clib.waitForPageToLoad();

			Thread.sleep(10000);

			emh.preExistingDiseaseYesMember();
			;

			emh.diagnosedAndhospitalizedMember1();

			emh.diagnosedAndhospitalizedMember2();

			emh.travelPloicyMember1();

			emh.travelPloicyMember2();

			emh.next();
		}

		else if (totalMember.equalsIgnoreCase("three")) {

			emh.medHist();

		} else if (totalMember.equalsIgnoreCase("four")) {

			emh.medHist();
		} else if (totalMember.equalsIgnoreCase("five")) {

			emh.medHist();
		} else if (totalMember.equalsIgnoreCase("six")) {

			emh.medHist();
		}

		Thread.sleep(5000);

		
		
		clib.waitForPageToLoad();

		PayU pay = PageFactory.initElements(BaseClass.driver, PayU.class);

		pay.gateway();
		scr.captureScreenshot(driver, "Explore Thankyou Page");
	}

}

package com.religare.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.FillDetailsExplore;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.CareClick;
import com.religare.objectrepository.CareFirstPage;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;

@Listeners(com.religare.genericlib.SampleListener.class)

public class CareTest extends BaseClass

{

	// Logger log = Logger.getLogger(getClass());

	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();
	
	ScreenshotPAGE scr =new ScreenshotPAGE();

	@Test

	public void clickOnCare() throws IOException {

		CareClick care = PageFactory.initElements(BaseClass.driver, CareClick.class);
		
		scr.captureScreenshot(driver, "Religare Home Page");

		care.clickOnCare();

	}

	@Test

	public void fillInsurance() throws Throwable {

		clib.waitForPageToLoad();

		CareFirstPage plan = PageFactory.initElements(BaseClass.driver, CareFirstPage.class);

		plan.totalMember();

		// String totalMember="one";

		String totalMember = elib.getExcelData("CareSpecificData", 2, 1);

		if (totalMember.equalsIgnoreCase("one")) {

			plan.ageOfEldestMember1();

		} else {

			plan.ageOfEldestMember();
		}

		try {

			plan.enterMobileNumber();

			Alert al = BaseClass.driver.switchTo().alert();

			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);

			wait.until(ExpectedConditions.alertIsPresent());

			al.accept();
		}

		catch (Exception e) {

			e.getMessage();
		}

		Thread.sleep(1500);

		plan.slider();

		String tenure = elib.getExcelData("CareSpecificData", 3, 1);

		if (tenure.equalsIgnoreCase("two")) {
			plan.tenure2();
		}

		else if (tenure.equalsIgnoreCase("three")) {

			plan.tenure3();

		} else {

			System.out.println("two tenure");
		}

		plan.tenure2();
		
		scr.captureScreenshot(driver, "Care first page");
		
		Thread.sleep(2000);

		;
		plan.next();

		try {

			plan.next();

			Alert al = BaseClass.driver.switchTo().alert();

			al.accept();

			plan.next();

		} catch (Exception e) {

			e.getMessage();
		}
	}

	@Test

	public void fillProposalAndInsuredDetailsExploreTest() throws Throwable {

		clib.waitForPageToLoad();

		FillDetailsExplore fdx = PageFactory.initElements(BaseClass.driver, FillDetailsExplore.class);

		fdx.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();

		fdx.fillDetailsAddress();

		Thread.sleep(3500);

		try {

			fdx.panCard();

		} catch (NoSuchElementException e) {

			e.getMessage();

		}
		
		scr.captureScreenshot(driver, "Care Proposer's Details page");

		fdx.nextClick();

		Thread.sleep(7000);

		InsuredDetailsPage idp = PageFactory.initElements(BaseClass.driver, InsuredDetailsPage.class);

		idp.insuredMember1();

		try {

			idp.insuredMember2();

			idp.insuredMember3();

			Thread.sleep(1500);

			idp.insuredMember4();

			Thread.sleep(1500);

			idp.insuredMember5();

			Thread.sleep(1500);

			idp.insuredMember6();

		}

		catch (Exception e) {

			e.getMessage();
		}
		
		scr.captureScreenshot(driver, "Care Insured Details Page");

		idp.next();

		clib.waitForPageToLoad();

		Thread.sleep(2000);

		try {

			BaseClass.driver.findElement(By.id("premiumPopupOk")).click();
		} catch (Exception e) {
			e.getMessage();
		}

		clib.waitForPageToLoad();
	}

	@Test

	public void medHist() throws Throwable {

		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);

		mp.careMedicalhistory();

		Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);

		Thread.sleep(2000);

		// payment.ApplicationNocarecarefreedom();

		payment.Addonpremium();

	//	payment.caresbumit();

		Thread.sleep(2000);

		// payment.ApplicationNocarecarefreedom();
		//
		// payment.totalcarepremium();

		payment.proceedcare();
		//
		// // payment.Totalpremiumcarefreedom();
		//
		// // payment.proceedcare();();
		//
		// clib.waitForPageToLoad();
		//
		// Thread.sleep(3000);
		//
		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);
		//
		payu.gateway();
		
		scr.captureScreenshot(driver, "Care Thankyou Page");

	}

}

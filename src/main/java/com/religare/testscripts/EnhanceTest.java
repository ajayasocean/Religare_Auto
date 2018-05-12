package com.religare.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.EnhanceClick;
import com.religare.objectrepository.EnhanceFirstPage;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;

@Listeners(com.religare.genericlib.SampleListener.class)

public class EnhanceTest extends BaseClass {

	ExcelLib elib = new ExcelLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	WebDriverCommonLib clib = new WebDriverCommonLib();

	@Test

	public void clickOnEnhance() throws Throwable {

		EnhanceClick enhance = PageFactory.initElements(BaseClass.driver, EnhanceClick.class);
		
		scr.captureScreenshot(driver, "Religare Home Page");

		enhance.clickOnEnhance();

	}

	@Test

	public void fillEnhanceDetails() throws Throwable {

		EnhanceFirstPage efd = PageFactory.initElements(BaseClass.driver, EnhanceFirstPage.class);

		String totalMember = elib.getExcelData("EnhanceFillDetails", 0, 1);

		clib.waitForPageToLoad();

		if (totalMember.equalsIgnoreCase("one")) {

			efd.clickOnTotalMemberMinus();
		}

		else if (totalMember.equalsIgnoreCase("three")) {

			efd.clickOnTotalMemberPlus();
		}

		else if (totalMember.equalsIgnoreCase("four")) {

			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();
		}

		else if (totalMember.equalsIgnoreCase("five")) {
			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();
		}

		else if (totalMember.equalsIgnoreCase("six")) {

			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();

			efd.clickOnTotalMemberPlus();
		}

		clib.waitForPageToLoad();

		// efd.scroll();

		efd.clickOnTotalMemberMinus();

		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
		if (totalMember.equalsIgnoreCase("one")) {

			efd.ageDropDown8();

		} else {

			efd.ageDropDown();
		}

		try {

			efd.enterMobileNumber();

			Alert al = BaseClass.driver.switchTo().alert();

			al.accept();
		}

		catch (Exception e) {

			e.getMessage();
		}
		
		

	//	efd.slider();
		
		scr.captureScreenshot(driver, "Enhance first page");

		Thread.sleep(3000);

		// efd.slider1();

		efd.next();

		clib.waitForPageToLoad();

		Thread.sleep(5000);

		efd.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();

		efd.fillDetailsAddress();
		
		scr.captureScreenshot(driver, "Enhance Proposer's Details page");

		Thread.sleep(5000);

		efd.nextClick();

		InsuredDetailsPage idp = PageFactory.initElements(BaseClass.driver, InsuredDetailsPage.class);

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
		
		scr.captureScreenshot(driver, "Enhance Insured Details Page");

		BaseClass.driver.findElement(By.id("enhanceinsured")).click();

		clib.waitForPageToLoad();

		Thread.sleep(2500);

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

		mp.enchanceMedicalHistory();

		clib.waitForPageToLoad();

		BaseClass.driver.findElement(By.id("proceed_to_pay_enhance")).click();

		clib.waitForPageToLoad();

		Thread.sleep(2300);

		// Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);
		//
		// payment.ApplicationNocarecarefreedom();
		//
		// payment.Totalpremiumcarefreedom();
		//
		// payment.proceedcarefreedom();
		//
		// clib.waitForPageToLoad();
		//
		// Thread.sleep(3000);
		//
		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);

		payu.gateway();
		
		scr.captureScreenshot(driver, "Enhance Thankyou Page");

	}
}
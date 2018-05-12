package com.religare.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.CareFreedomClick;
import com.religare.objectrepository.CarefreedomPoliPlan;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;

@Listeners(com.religare.genericlib.SampleListener.class)

public class CareFreedomTest extends BaseClass {

	WebDriverCommonLib clib = new WebDriverCommonLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	@Test

	public void moveToCareFreedomTest() throws Throwable {
		
		

		CareFreedomClick click = PageFactory.initElements(BaseClass.driver, CareFreedomClick.class);
		scr.captureScreenshot(driver, "Religare Home Page");

		click.clickOnCareFreedom();

		clib.waitForPageToLoad();

		CarefreedomPoliPlan plan = PageFactory.initElements(BaseClass.driver, CarefreedomPoliPlan.class);

		clib.waitForPageToLoad();

		Thread.sleep(5000);

		plan.TotalMembersAge();

		try {

			plan.mobile();

			Alert al = BaseClass.driver.switchTo().alert();

			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);

			wait.until(ExpectedConditions.alertIsPresent());

			al.accept();
		}

		catch (Exception e) {
			e.getMessage();
		}

		plan.slider();
		
		scr.captureScreenshot(driver, "Carefreedom first page");
  
		plan.tensure();

		// plan.totalpremium();

		Thread.sleep(6000);

		clib.waitForPageToLoad();

		plan.buy();

		// plan.buy();
		// }
		//

		// @Test
		//
		// public void fillProposalAndInsuredDetailsExploreTest() throws Throwable {

		clib.waitForPageToLoad();

		Thread.sleep(3000);

		com.religare.genericlib.FillDetailsExplore fdx = PageFactory.initElements(BaseClass.driver,
				com.religare.genericlib.FillDetailsExplore.class);

		fdx.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();

		fdx.fillDetailsAddress();

		Thread.sleep(3500);

		try {

			fdx.panCard();

		} catch (NoSuchElementException e) {

			e.getMessage();

		}
		
		scr.captureScreenshot(driver, "Carefreedom Proposer's Details page");

		fdx.nextClick();

		clib.waitForPageToLoad();

		InsuredDetailsPage idp = PageFactory.initElements(BaseClass.driver, InsuredDetailsPage.class);

		idp.insuredMember1();
		
		try {
			
			clib.waitForPageToLoad();
			idp.insuredMember2();
			clib.waitForPageToLoad();
			clib.waitForPageToLoad();
			clib.waitForPageToLoad();
			idp.insuredMember3();
			clib.waitForPageToLoad();
			idp.insuredMember4();
			clib.waitForPageToLoad();
			idp.insuredMember5();
			clib.waitForPageToLoad();
			idp.insuredMember6();

		}

		catch (Exception e) {

			e.getMessage();
		}
		
		scr.captureScreenshot(driver, "Carefreedom Insured Details Page");

		idp.next();

		clib.waitForPageToLoad();

		//
		// @Test
		//
		// public void medHist() throws Throwable {
		//
		clib.waitForPageToLoad();

		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);

		clib.waitForPageToLoad();

		Thread.sleep(4000);
		

		mp.carefreedomMedicalhistory();
		
	

		Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);
//
//		payment.ApplicationNocarecarefreedom();
//
//		payment.Totalpremiumcarefreedom();

		payment.proceedCareFreedom();

		clib.waitForPageToLoad();

		Thread.sleep(3000);
	}

	// PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);
	//
	// payu.gateway();
	//

	// }

	@Test

	public void paymentGateWayTest() throws Throwable {

//		System.out.println(BaseClass.driver.getCurrentUrl());
//
//		WebElement wb = BaseClass.driver.findElement(By.xpath("//p[contains(text(), 'Service response')]"));
//
//		System.out.println(wb.getText());
		
		clib.waitForPageToLoad();

		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);
       
		payu.gateway();
		
		scr.captureScreenshot(driver, "Carefreedom Thankyou Page");
		
		
	}

}

package com.religare.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.FillDetailsExplore;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.AssureClick;
import com.religare.objectrepository.AssureFirstPage;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;

@Listeners(com.religare.genericlib.SampleListener.class)

public class AssureTest extends BaseClass {

	WebDriverCommonLib clib = new WebDriverCommonLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	

	@Test

	public void moveToassureTest() throws Throwable {
		AssureClick click = PageFactory.initElements(BaseClass.driver, AssureClick.class);
		scr.captureScreenshot(driver, "Religare Home Page");

		click.clickOnAssure();



		Thread.sleep(6000);
		// }
		//
		// @Test
		//
		// public void assureTest() throws Throwable {

		clib.waitForPageToLoad();

		Thread.sleep(2500);

		AssureFirstPage page = PageFactory.initElements(BaseClass.driver, AssureFirstPage.class);

		page.assurePolicyPlan();

		page.slider();

		page.tenure();
		
		scr.captureScreenshot(driver, "Assure first page");

		page.next();



	}

	@Test

	public void proposerDetailAndInsuredDetailsAssureTest() throws Throwable {

		clib.waitForPageToLoad();

		FillDetailsExplore pdp = PageFactory.initElements(BaseClass.driver, FillDetailsExplore.class);

		pdp.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();

		pdp.fillDetailsAddress();

		 Thread.sleep(3500);

		try {

			pdp.panCard();

		} catch (NoSuchElementException e) {

			e.getMessage();

		}
		
		scr.captureScreenshot(driver, "Assure Proposer's Details page");

		pdp.nextClick();



		Thread.sleep(7000);

		InsuredDetailsPage idp = PageFactory.initElements(BaseClass.driver, InsuredDetailsPage.class);

		idp.insuredMember1();
		
		scr.captureScreenshot(driver, "Assure Insured Details Page");

		idp.next();

	

		Thread.sleep(2500);

		try {

			BaseClass.driver.findElement(By.id("premiumPopupOk")).click();
		} catch (Exception e) {
			e.getMessage();
		}

		clib.waitForPageToLoad();

		Thread.sleep(5000);
		// }
		//
		// @Test
		//
		// public void medHistPage() throws Throwable {
		//
		// clib.waitForPageToLoad();
		//
		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);
		//
		// clib.waitForPageToLoad();

		mp.assureMedicalhistory();



		Thread.sleep(2000);

		clib.waitForPageToLoad();
	
//		@Test
//		
//		public void paymentAssureTest() throws Throwable {

		Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);

		payment.Applicationno();

		payment.Totalpremiumassure();

		payment.proceedassure();



		clib.waitForPageToLoad();

		Thread.sleep(3000);

		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);

		payu.gateway();
		
		scr.captureScreenshot(driver, "Assure Thankyou Page");


	}

}
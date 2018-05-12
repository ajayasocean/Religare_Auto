package com.religare.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.FillDetailsExplore;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;
import com.religare.objectrepository.SecureClick;
import com.religare.objectrepository.SecurePloicyplan;

@Listeners(com.religare.genericlib.SampleListener.class)

public class SecureTest extends BaseClass {

	WebDriverCommonLib clib = new WebDriverCommonLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();
	
	

	@Test

	public void moveToSecureTest() throws Throwable {

		SecureClick click = PageFactory.initElements(BaseClass.driver, SecureClick.class);
		
		scr.captureScreenshot(driver, "Religare Home Page");

		click.clickOnSecure();

	}

	@Test

	public void secureTest() throws Throwable {
		SecurePloicyplan plan = PageFactory.initElements(BaseClass.driver, SecurePloicyplan.class);

		clib.waitForPageToLoad();

		Thread.sleep(5000);

		plan.age();

		plan.income();

		Thread.sleep(2500);

		plan.mobile();

		// plan.income();

		plan.typeofemployement();

		// plan.sliders();

		plan.tensure();

		// plan.totalpremium();
		
		scr.captureScreenshot(driver, "Secure first page");
		
		Thread.sleep(2000);

		plan.buy();
		// }
		//
		// @Test
		//
		// public void fillProposalAndInsuredDetailsExploreTest() throws Throwable {

		clib.waitForPageToLoad();

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
		
		scr.captureScreenshot(driver, "Secure Proposer's Details page");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		BaseClass.driver.findElement(By.id("proposal")).click();

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

		FillDetailsExplore fd = PageFactory.initElements(BaseClass.driver, FillDetailsExplore.class);

		clib.waitForPageToLoad();
		

		fd.secureinsuredpage();
		
		scr.captureScreenshot(driver, "Secure Insured Details Page");

		// fd.Nextjoytomorrowinsuredscreen();

		clib.waitForPageToLoad();

		//
		// @Test
		//
		// public void medHist() throws Throwable {
		//
		// clib.waitForPageToLoad();

		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);

		Thread.sleep(4000);

		mp.secureMedicalHistory();

		Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);

		payment.Applicationno();

		payment.Totalsecurepremium();

		payment.proceedsecure();

		clib.waitForPageToLoad();

		Thread.sleep(3000);

		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);

		payu.gateway();
		
		scr.captureScreenshot(driver, "Secure Thankyou Page");

	}
}

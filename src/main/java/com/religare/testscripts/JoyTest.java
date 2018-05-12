package com.religare.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.FillDetailsExplore;
import com.religare.objectrepository.InsuredDetailsPage;
import com.religare.objectrepository.JoyClick;
import com.religare.objectrepository.Joypolicyplan;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;

@Listeners(com.religare.genericlib.SampleListener.class)

public class JoyTest extends BaseClass {

	WebDriverCommonLib clib = new WebDriverCommonLib();

	@Test

	public void moveToJoy() throws Throwable {

		JoyClick click = PageFactory.initElements(BaseClass.driver, JoyClick.class);

		click.clickOnJoy();

		Thread.sleep(3000);

		Joypolicyplan plan = PageFactory.initElements(BaseClass.driver, Joypolicyplan.class);

		clib.waitForPageToLoad();

		Thread.sleep(5000);

		plan.joytype();

		plan.totalmember();

		plan.age();

		Thread.sleep(3000);

		// try {
		plan.mobile();
		//
		// Alert al = BaseClass.driver.switchTo().alert();
		// WebDriverWait wdWait= new WebDriverWait(BaseClass.driver, 10);
		// wdWait.until(ExpectedConditions.alertIsPresent());
		// al.accept();
		//
		// }
		// catch(Exception e) {
		// e.toString();
		// }
		 plan.slider();

		plan.tensure();

		// plan.totalpremium();

		clib.waitForPageToLoad();

		try {

			WebElement wb = BaseClass.driver.findElement(By.id("carebuynowimage"));
			Thread.sleep(2100);
		//	clib.waitForElementPresent(wb);

			wb.click();
		}

		catch (Exception e) {
		} // plan.buy();

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

		BaseClass.driver.findElement(By.id("joytomorrowproposal")).click();

		Thread.sleep(7000);

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

		fd.Nextjoytomorrowinsuredscreen();

		clib.waitForPageToLoad();

		//
		// @Test
		//
		// public void medHist() throws Throwable {
		//
		// clib.waitForPageToLoad();

		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);

		Thread.sleep(4000);

		mp.joyMedicalHistory();

		 Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);
		
//		 payment.Addonpremium();
//		
//		 payment.Applicationno();
		
		 payment.proceedTomorrow();
		//
		clib.waitForPageToLoad();

		Thread.sleep(5000);
	
//	}
//	// @Te}st
//	//
//	// public void paymentGateWay() {
//	// ]
//	// }
//
//	@Test
//
//	public void paymentPageCheckServiceResponseJoyFreedomTest() throws Throwable {

//		WebElement wb = BaseClass.driver.findElement(By.xpath("//p[contains(text(), 'Service response')]"));
//
//		System.out.println(wb.getText());
		
		//Thread.sleep(4500);
		
		clib.waitForPageToLoad();

		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);

		clib.waitForPageToLoad();
		
		payu.gateway();
		
		Thread.sleep(1500);
		
		//button[@class='btn btn-success mb-10']
		
		//BaseClass.driver.findElement(By.xpath("//button[@class='btn btn-success mb-10']")).click();

//	}
}}

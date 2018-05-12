package com.religare.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;
import com.religare.objectrepository.MedistPage;
import com.religare.objectrepository.PayU;
import com.religare.objectrepository.Payment;
import com.religare.objectrepository.StudentExploreClick;
import com.religare.objectrepository.StudentExplorePolicyplan;

@Listeners(com.religare.genericlib.SampleListener.class)

public class StudentExploreTest extends BaseClass {

	WebDriverCommonLib clib = new WebDriverCommonLib();

	ExcelLib elib = new ExcelLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();


	@Test

	public void clickOnStudentExploreTest() throws IOException {

		StudentExploreClick spc = PageFactory.initElements(BaseClass.driver, StudentExploreClick.class);
		
		scr.captureScreenshot(driver, "Religare Home Page");

		spc.clickOnStudentExplore();

	}

	@Test

	public void fillDetails() throws Throwable {

		StudentExplorePolicyplan plan = PageFactory.initElements(BaseClass.driver, StudentExplorePolicyplan.class);

		plan.travellingTo();

		plan.policyTensure();

		plan.mobile();

		plan.PED();

		plan.slider();

		plan.totalpremium();
		
		scr.captureScreenshot(driver, "StudentExplore first page");


		plan.submit();

		plan.fillDetailsGenderNameDateEmailNomineeNameAndNomineeRelation();

		plan.fillDetailsAddress();
		
		scr.captureScreenshot(driver, "StudentExplore Proposer's Details page");

		plan.nextClick();

		com.religare.objectrepository.FillDetailsExplore idp = PageFactory.initElements(BaseClass.driver,
				com.religare.objectrepository.FillDetailsExplore.class);
		

		idp.insuredMember1();
		
		
		
		idp.studentInsuredNext();
		
		
		
		// }
		//
		// @Test
		//
		// public void additionalInformation() throws Throwable {
		clib.waitForPageToLoad();

		com.religare.objectrepository.FillDetailsExplore explore = PageFactory.initElements(BaseClass.driver,
				com.religare.objectrepository.FillDetailsExplore.class);

		clib.waitForPageToLoad();

		explore.studentExploreInsuredpage();
	}

	@Test

	public void medHistTest() throws Throwable {

		clib.waitForPageToLoad();

		MedistPage mp = PageFactory.initElements(BaseClass.driver, MedistPage.class);

		clib.waitForPageToLoad();

		Thread.sleep(4000);

		mp.studenteEploreMedicalHistory();

		clib.waitForPageToLoad();

		Thread.sleep(4000);

		// }
		// @Test
		// //
		// public void proceedToPay() throws Throwable {
		//
		Payment payment = PageFactory.initElements(BaseClass.driver, Payment.class);

		payment.studentExploreProceedToBuy();
	}
	//
	// payment.ApplicationNocarecarefreedom();
	//
	// payment.Totalstudentexplore();
	//
	// payment.proceedcarefreedom();
	//

	//
	// }

	@Test

	public void paymentPageCheckServiceResponseCareFreedomTest() throws Throwable {

		// String url = BaseClass.driver.getCurrentUrl();
		//
		// SoftAssert sa = new SoftAssert();
		//
		// sa.assertEquals(url, expected);
		//
		//
		// WebElement wb = BaseClass.driver.findElement(By.xpath("//p[contains(text(),
		// 'Service response')]"));
		//
		// System.out.println(wb.getText());

		PayU payu = PageFactory.initElements(BaseClass.driver, PayU.class);

		payu.gateway();
		
		scr.captureScreenshot(driver, "StudentExplore Thankyou Page");

	}
}

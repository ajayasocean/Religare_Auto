package com.religare.objectrepository;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;

public class MedistPage {

	ExcelLib elib = new ExcelLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	@FindBy(id = "label-id1-0")
	WebElement option1;

	@FindBy(id = "label-id2-0")
	WebElement option2;

	@FindBy(id = "label-id3-0")
	WebElement option3;

	@FindBy(id = "label-id4-0")
	WebElement option4;

	@FindBy(id = "label-id5-0")
	WebElement option5;

	@FindBy(id = "label-id6-0")
	WebElement option6;

	@FindBy(id = "label-id7-0")
	WebElement option7;

	@FindBy(id = "label-id8-0")
	WebElement option8;

	@FindBy(id = "label-id9-0")
	WebElement option9;

	@FindBy(id = "label-id10-0")
	WebElement option10;

	@FindBy(id = "label-id11-0")
	WebElement option11;

	@FindBy(id = "label-id12-0")
	WebElement option12;

	@FindBy(id = "validTermCondition-1")
	WebElement validTermCondition;

	@FindBy(id = "SICREDITCARD")
	WebElement SICREDITCARD;

	@FindBy(id = "submit_medical_history")
	WebElement submitbutton;

	@FindBy(id = "submit_medical_history1")
	WebElement caresubmitbutton;

	@FindBy(id = "enhancemedical")
	WebElement enhancesubmitbutton;

	@FindBy(id = "joytomorrowmedical")
	WebElement submitjoytomorrow;

	@FindBy(id = "joymedical")
	WebElement submitjoytoday;

	@FindBy(id = "label-id2-1")
	WebElement option2Yesexplore;

	@FindBy(id = "medicalhistory")
	WebElement submitsecurebutton;

	@FindBy(id = "TripStartIndia")
	WebElement TripStartIndia;

	@FindBy(id = "ASU")
	WebElement ASU;

	@FindBy(id = "studentmedical")
	WebElement submitstudentexplorebutton;

	public void careMedicalhistory() throws IOException, InterruptedException {

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-500);");

		String prm2 = BaseClass.driver.findElement(By.id("enhancePremiumResultOne")).getAttribute("innerHTML");

		// log.debug("The Enhance Premium Resultone on Screen3 is " + prm2);

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");

		option1.click();

		option2.click();

		try {
			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {

			// System.out.println(e.getMessage());

		}
		option3.click();

		option4.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");

		validTermCondition.click();

		SICREDITCARD.click();
		
		scr.captureScreenshot(BaseClass.driver, "Care Medical History Page");

		caresubmitbutton.click();
		
	    Thread.sleep(5000);
	
		
		scr.captureScreenshot(BaseClass.driver, "Care Proposal Summary Page");
	}

	public void carefreedomMedicalhistory() throws IOException, InterruptedException {
		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");
		// String prm2 =
		// BaseClass.driver.findElement(By.id("enhancePremiumResultOne")).getAttribute("innerHTML");
		// log.debug("The Enhance Premium Resultone on Screen3 is " + prm2);

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
		option1.click();

		option2.click();

		try {

			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}
		option3.click();

		option4.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");
		validTermCondition.click();

		SICREDITCARD.click();
		
		scr.captureScreenshot(BaseClass.driver, "Carefreedom Medical History Page");

		submitbutton.click();
		
		Thread.sleep(5000);
	
		
		scr.captureScreenshot(BaseClass.driver, "Carefreedom Proposal Summary Page");
	}

	public void assureMedicalhistory() throws IOException, InterruptedException {

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");

		// String prm2 =
		// BaseClass.driver.findElement(By.id("assurecare")).getAttribute("innerHTML");
		// log.debug("The Assure Premium on Screen3 is " + prm2);
		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
		option1.click();
		option2.click();
		try {
			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}
		option3.click();

		option4.click();
		try {
			BaseClass.driver.findElement(By.id("label-subid1-0")).click();

			BaseClass.driver.findElement(By.id("label-subid2-0")).click();

			BaseClass.driver.findElement(By.id("label-subid3-0")).click();

			BaseClass.driver.findElement(By.id("label-subid4-0")).click();

			Thread.sleep(1500);

			BaseClass.driver.findElement(By.id("label-subid5-0")).click();

			Thread.sleep(1500);

			// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
			BaseClass.driver.findElement(By.id("label-subid6-0")).click();

			Thread.sleep(1500);

			BaseClass.driver.findElement(By.id("label-subid7-0")).click();

			Thread.sleep(1500);

			BaseClass.driver.findElement(By.id("label-subid8-0")).click();

			Thread.sleep(1500);

			BaseClass.driver.findElement(By.id("label-subid9-0")).click();

			try {

				BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

			} catch (Exception e) {
				// System.out.println(e.getMessage());
			}
		} catch (Exception e) {
		}
		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
		// option5.click();
		option6.click();

		option7.click();

		option8.click();

		option9.click();

		try {
			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}
		option10.click();

		option11.click();

		option12.click();
		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,1000);");

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		validTermCondition.click();

		SICREDITCARD.click();
		
		scr.captureScreenshot(BaseClass.driver, "Assure Medical History Page");

		submitbutton.click();
		
	    Thread.sleep(5000);
		
		scr.captureScreenshot(BaseClass.driver, "Assure Proposal Summary Page");
	}

	public void enchanceMedicalHistory() throws Throwable {

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");

		String prm2 = BaseClass.driver.findElement(By.id("enhancePremiumResultOne")).getAttribute("innerHTML");
		// log.debug("The Enhance Premium Resultone on Screen3 is " + prm2);

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,500);");

		Thread.sleep(2000);

		option1.click();

		option2.click();

		try {

			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {

			// System.out.println(e.getMessage());
		}
		option3.click();

		option4.click();

		option5.click();

		validTermCondition.click();

		SICREDITCARD.click();
		
		scr.captureScreenshot(BaseClass.driver, "Enhance Medical History Page");

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");

		enhancesubmitbutton.click();
		
		Thread.sleep(5000);
		
		scr.captureScreenshot(BaseClass.driver, "Enhance Proposal Summary Page");
	}

	public void joyMedicalHistory() throws Throwable {
		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");
		// String prm2 =
		// BaseClass.driver.findElement(By.id("joyprimiumone")).getAttribute("innerHTML");
		// log.debug("The Joy Premium on Screen3 is " + prm2);

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");

		option1.click();

		option2.click();

		try {

			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {

			// System.out.println(e.getMessage());
		}
		option3.click();

		option4.click();

		option5.click();

		Thread.sleep(1000);

		option6.click();

		option7.click();

		option8.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");

		Thread.sleep(1500);

		validTermCondition.click();

		SICREDITCARD.click();

		try {

			submitjoytomorrow.click();

		} catch (Exception e) {
		}
		try {

			submitjoytoday.click();

		} catch (Exception e) {

		}

	}

	public void studenteEploreMedicalHistory() throws Throwable {

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");

		Thread.sleep(1000);

		String prmyh = BaseClass.driver.findElement(By.id("enhancePremiumResultRroposalOne")).getAttribute("innerHTML");

		// log.debug("The Enhance Premium Resultone on Screen2 is " + prmyh);

		option1.click();

		option2.click();
		try {

			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {

			// System.out.println(e.getMessage());
		}
		try {

			option5.click();

			option6.click();

			option7.click();

			option8.click();

		} catch (Exception e) {
		}

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");

		String a = "Yes";

		String Ped = elib.getExcelData("StudentExplorepolicyplan", 6, 1);

		if (a.equals(Ped)) {

			BaseClass.driver.findElement(By.id("label-id1-1")).click();

			BaseClass.driver.findElement(By.xpath("//*[@id=\"id1\"]/div[7]/div/div[2]/div/label")).click();

		} else {

			BaseClass.driver.findElement(By.id("label-id1-0")).click();

		}
		option2.click();

		validTermCondition.click();

		TripStartIndia.click();

		ASU.click();
		
		scr.captureScreenshot(BaseClass.driver, "StudentExplore Medical History Page");

		submitstudentexplorebutton.click();
		
		 Thread.sleep(5000);
			
		scr.captureScreenshot(BaseClass.driver, "StudentExplore Proposal Summary Page");
	}

	public void secureMedicalHistory() throws InterruptedException, IOException {

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");

		String prm2 = BaseClass.driver.findElement(By.id("secure_premium_val")).getAttribute("innerHTML");

		// log.debug("The Secure Premium on Screen3 is " + prm2);

		option1.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,500);");

		option2.click();

		try {

			BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();

		} catch (Exception e) {

			// System.out.println(e.getMessage());
		}
		option3.click();

		option4.click();

		option5.click();

		option6.click();

		validTermCondition.click();

		SICREDITCARD.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");

		Thread.sleep(1500);
		
		scr.captureScreenshot(BaseClass.driver, "Secure Medical History Page");

		submitsecurebutton.click();
		
	    Thread.sleep(5000);
		
		scr.captureScreenshot(BaseClass.driver, "Secure Proposal Summary Page");
	}

	// public void StudentexploreMedicalHistory() throws Throwable {
	//
	// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,-250);");
	// Thread.sleep(1000);
	// String prmyh =
	// BaseClass.driver.findElement(By.id("enhancePremiumResultRroposalOne")).getAttribute("innerHTML");
	// // log.debug("The Enhance Premium Resultone on Screen2 is " + prmyh);
	// option3.click();
	// option4.click();
	// try {
	// BaseClass.driver.findElement(By.id("lhc_need_help_close")).click();
	//
	// } catch (Exception e) {
	// System.out.println(e.getMessage());
	// }
	// try {
	// option5.click();
	// option6.click();
	// option7.click();
	// option8.click();}catch(Exception e) {}
	// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,750);");
	// String a = "Yes";
	// String Ped = elib.getExcelData("StudentExplorepolicyplan", 6, 1);
	// if(a.equals(Ped)) {
	// BaseClass.driver.findElement(By.id("label-id1-1")).click();
	// BaseClass.driver.findElement(By.xpath("//*[@id=\"id1\"]/div[7]/div/div[2]/div/label")).click();
	// }else {
	// BaseClass.driver.findElement(By.id("label-id1-0")).click();
	//
	// }
	// option2.click();
	// validTermCondition.click();
	// TripStartIndia.click();
	// ASU.click();
	// submitstudentexplorebutton.click();
	// }

}

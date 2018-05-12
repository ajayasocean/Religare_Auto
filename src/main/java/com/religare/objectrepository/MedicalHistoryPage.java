package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;

public class MedicalHistoryPage {

	ExcelLib elib = new ExcelLib();
	ScreenshotPAGE scr =new ScreenshotPAGE();

	WebDriverCommonLib clib = new WebDriverCommonLib();

	// Does any person(s) to be insured has any Pre-existing diseases if user tap
	// yes

	@FindBy(id = "clck1")

	WebElement clickHealthQuestionnaire1;

	// Liver Disease? * checkbox 1

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-1']")

	WebElement liverDiseaseCheckBox1;

	// Liver Disease? * checkbox 2

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-2']")

	WebElement liveDiseaseCheckBox2;

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-3']")

	WebElement liveDiseaseCheckBox3;

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-4']")

	WebElement liveDiseaseCheckBox4;

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-5']")

	WebElement liveDiseaseCheckBox5;

	@FindBy(xpath = "//label[@class='label_checkbox' and @for='insuredCdQuestionOne-128-6']")

	WebElement liveDiseaseCheckBox6;

	// for cancer tumor

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-1']")

	WebElement cancerOrTumorCheckBox1;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-2']")

	WebElement cancerOrTumorCheckBox2;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-3']")

	WebElement cancerOrTumorCheckBox3;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-4']")

	WebElement cancerOrTumorCheckBox4;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-5']")

	WebElement cancerOrTumorCheckBox5;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-114-6']")

	WebElement cancerOrTumorCheckBox6;

	// for heart disease

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-1']")

	WebElement heartDiseaseCheckBox1;

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-2']")

	WebElement heartDiseaseCheckBox2;

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-3']")

	WebElement heartDiseaseCheckBox3;

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-4']")

	WebElement heartDiseaseCheckBox4;

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-5']")

	WebElement heartDiseaseCheckBox5;

	@FindBy(xpath = "//label[@for ='insuredCdQuestionOne-143-6']")

	WebElement heartDiseaseCheckBox6;

	// kidney disease

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-1']")

	WebElement kidneyDiseaseCheckobx1;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-2']")

	WebElement kidneyDiseaseCheckobx2;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-3']")

	WebElement kidneyDiseaseCheckobx3;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-4']")

	WebElement kidneyDiseaseCheckobx4;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-5']")

	WebElement kidneyDiseaseCheckobx5;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-129-6']")

	WebElement kidneyDiseaseCheckobx6;

	// for paralysis or stroke

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-1']")

	WebElement paralysisOrStrokeCheckbox1;

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-2']")

	WebElement paralysisOrStrokeCheckbox2;

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-3']")

	WebElement paralysisOrStrokeCheckbox3;

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-4']")

	WebElement paralysisOrStrokeCheckbox4;

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-5']")

	WebElement paralysisOrStrokeCheckbox5;

	@FindBy(xpath = "//label[@for='insuredCdQuestionOne-164-6']")

	WebElement paralysisOrStrokeCheckbox6;

	// other disease checkboxs

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-1']")

	WebElement otherDiseaseCheckBox1;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-2']")

	WebElement otherDiseaseCheckBox2;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-3']")

	WebElement otherDiseaseCheckBox3;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-4']")

	WebElement otherDiseaseCheckBox4;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-5']")

	WebElement otherDiseaseCheckBox5;

	@FindBy(xpath = "//label[@for = 'insuredCdQuestionOne-210-6']")

	WebElement otherDiseaseCheckBox6;

	// other disease descriptionTextbox

	@FindBy(id = "otherdisease-210-1")

	WebElement otherDiseaseTextBox1;

	@FindBy(id = "otherdisease-210-2")

	WebElement otherDiseaseTextBox2;

	@FindBy(id = "otherdisease-210-3")

	WebElement otherDiseaseTextBox3;

	@FindBy(id = "otherdisease-210-4")

	WebElement otherDiseaseTextBox4;

	@FindBy(id = "otherdisease-210-5")

	WebElement otherDiseaseTextBox5;

	@FindBy(id = "otherdisease-210-6")

	WebElement otherDiseaseTextBox6;

	// Has anyone been diagnosed / hospitalized / or under any treatment for any
	// illness / injury during the last 48 months?

	@FindBy(id = "clck2")

	WebElement clickHealthQuestionnaire2;

	@FindBy(id = "clck3")

	// Have you ever claimed under any travel policy?

	WebElement clickHealthQuestionnaire3;

	@FindBy(id = "label-id1-0")

	WebElement noCheck1;

	@FindBy(id = "label-id2-0")

	WebElement noCheck2;

	@FindBy(id = "label-id3-0")

	WebElement noCheck3;

	@FindBy(id = "validTermCondition-1")

	WebElement agreeChekc;

	@FindBy(id = "TripStartIndia")

	WebElement tripChkBox;

	@FindBy(id = "submit_medical_history")

	WebElement nextBtn;

	@FindBy(id = "proceed_to_pay_explore")

	WebElement proceedToPayBtn;

	public void medHist() throws Throwable {
		noCheck1.click();
		noCheck2.click();
		noCheck3.click();
		
		

		agreeChekc.click();

		tripChkBox.click();
		nextBtn.click();
		Thread.sleep(5000);
		
		

		 proceedToPayBtn.click();
		
		 Thread.sleep(5000);
			
			
	     scr.captureScreenshot(BaseClass.driver, "Explore Proposal Summary Page");
	}

	public void preExistingDiseaseYesMember() throws Throwable {

		// String liverDisease = elib.getExcelData("MedicalHistory", 1, 1);
		// String cancerOrTumor = elib.getExcelData("MedicalHistory", 2, 1);
		// String coronaryArteryHeartDisease = elib.getExcelData("MedicalHistory", 3,
		// 1);
		// String kidneyDisease = elib.getExcelData("MedicalHistory", 4, 1);
		// String paralysisOrStroke = elib.getExcelData("MedicalHistory", 5, 1);
		// String anyOtherDiseasesOrailmentsnotmentionedabove =
		// elib.getExcelData("MedicalHistory", 6, 1);
		//
		String otherDiseaseDescription = elib.getExcelData("MedicalHistory", 7, 1);
		//
		// BaseClass.driver.findElement(By.id("clck1")).click();

		clib.waitForPageToLoad();

		clickHealthQuestionnaire1.click();

		// if(liverDisease.equalsIgnoreCase("yes")) {
		liverDiseaseCheckBox1.click();
		// }
		// else if(cancerOrTumor.equalsIgnoreCase("yes")) {
		cancerOrTumorCheckBox1.click();
		// }
		// else if(kidneyDisease.equalsIgnoreCase("yes")) {
		kidneyDiseaseCheckobx1.click();

		heartDiseaseCheckBox1.click();
		// }
		// else if(coronaryArteryHeartDisease.equalsIgnoreCase("yes")) {
		kidneyDiseaseCheckobx1.click();
		// }
		// else if(paralysisOrStroke.equalsIgnoreCase("yes")) {
		paralysisOrStrokeCheckbox1.click();
		// }
		// else if(anyOtherDiseasesOrailmentsnotmentionedabove.equalsIgnoreCase("yes"))
		// {
		otherDiseaseCheckBox1.click();
		otherDiseaseTextBox1.sendKeys(otherDiseaseDescription);
		// }

		// clickHealthQuestionnaire1.click();

		// if(liverDisease.equalsIgnoreCase("yes")) {
		liveDiseaseCheckBox2.click();
		// }
		// else if(cancerOrTumor.equalsIgnoreCase("yes")) {
		cancerOrTumorCheckBox2.click();

		heartDiseaseCheckBox2.click();
		// }
		// else if(kidneyDisease.equalsIgnoreCase("yes")) {
		kidneyDiseaseCheckobx2.click();
		// }
		// else if(coronaryArteryHeartDisease.equalsIgnoreCase("yes")) {
		kidneyDiseaseCheckobx1.click();
		// }
		// else if(paralysisOrStroke.equalsIgnoreCase("yes")) {
		paralysisOrStrokeCheckbox2.click();
		// }
		// else if(anyOtherDiseasesOrailmentsnotmentionedabove.equalsIgnoreCase("yes"))
		// {
		otherDiseaseCheckBox2.click();
		otherDiseaseTextBox2.sendKeys(otherDiseaseDescription);
		
	
		// }

	}
	
	

	@FindBy(id = "selectbox_HEDTravelHospitalized_1")

	WebElement reasonForTreatmentdropDown1;

	@FindBy(id = "selectbox_HEDTravelHospitalized_2")

	WebElement reasonForTreatmentdropDown2;

	@FindBy(id = "desc-HEDTravelHospitalized-1")

	WebElement reasonTextBox1;

	@FindBy(id = "desc-HEDTravelHospitalized-2")

	WebElement reasonTextBox2;

	public void diagnosedAndhospitalizedMember1() throws Throwable {
		clickHealthQuestionnaire2.click();

		String dropDownValue1 = elib.getExcelData("MedicalHistory", 10, 1);
		String reason = elib.getExcelData("MedicalHistory", 11, 1);
		if (dropDownValue1.equalsIgnoreCase("yes")) {

			Select sel = new Select(reasonForTreatmentdropDown1);
			sel.selectByValue("YES");

			reasonTextBox1.sendKeys(reason);
		} else {
			Select sel = new Select(reasonForTreatmentdropDown1);
			sel.selectByValue("NO");
			
			scr.captureScreenshot(BaseClass.driver, "Explore Medical History Page1 ");
		}
	}

	public void diagnosedAndhospitalizedMember2() throws Throwable {

		String dropDownValue2 = elib.getExcelData("MedicalHistory", 12, 1);

		String reason = elib.getExcelData("MedicalHistory", 13, 1);

		if (dropDownValue2.equalsIgnoreCase("yes")) {

			Select sel = new Select(reasonForTreatmentdropDown2);

			sel.selectByValue("YES");

			reasonTextBox2.sendKeys(reason);
		} else {
			Select sel = new Select(reasonForTreatmentdropDown2);

			sel.selectByValue("NO");
			
			scr.captureScreenshot(BaseClass.driver, "Explore Medical History Page1 ");
		}
	}

	@FindBy(id = "selectbox_HEDTravelClaimPolicy_1")

	WebElement travelPolicyDropDown1;

	@FindBy(id = "selectbox_HEDTravelClaimPolicy_2")

	WebElement travelPolicyDropDown2;

	@FindBy(id = "desc-HEDTravelClaimPolicy-1")

	WebElement travelPolicyTextBox1;

	@FindBy(id = "desc-HEDTravelClaimPolicy-2")

	WebElement travelPolicyTextBox2;

	public void travelPloicyMember1() throws Throwable {
		// clickHealthQuestionnaire2.click();

		clickHealthQuestionnaire3.click();

		String dropDownValue1 = elib.getExcelData("MedicalHistory", 21, 1);
		String reason = elib.getExcelData("MedicalHistory", 21, 1);
		if (dropDownValue1.equalsIgnoreCase("yes")) {

			Select sel = new Select(travelPolicyDropDown1);
			sel.selectByValue("YES");

			travelPolicyTextBox1.sendKeys(reason);
		} else {
			Select sel = new Select(travelPolicyDropDown1);
			sel.selectByValue("NO");
			
			scr.captureScreenshot(BaseClass.driver, "Explore Medical History Page2 ");
		}
	}

	public void travelPloicyMember2() throws Throwable {

		String dropDownValue2 = elib.getExcelData("MedicalHistory", 23, 1);

		String reason = elib.getExcelData("MedicalHistory", 24, 1);

		if (dropDownValue2.equalsIgnoreCase("yes")) {

			Select sel = new Select(travelPolicyDropDown2);

			sel.selectByValue("YES");

			travelPolicyTextBox2.sendKeys(reason);
		} else {
			Select sel = new Select(travelPolicyDropDown2);

			sel.selectByValue("NO");
			
			scr.captureScreenshot(BaseClass.driver, "Explore Medical History Page2 ");
		}
	}
    

	
 
	public void next() throws Throwable {
		agreeChekc.click();

		tripChkBox.click();
		nextBtn.click();
		Thread.sleep(5000);
		
		

		proceedToPayBtn.click();
	}

}

package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	@FindBy(id = "proposalNumberOnsnapshot")
	WebElement ApplicationNo;

	@FindBy(xpath = "//*[@id=\"submitPMT\"]/div[3]/div/div[1]/strong")
	WebElement Totalpremiumassure;

	@FindBy(id = "proceed_to_pay_assure")
	//proceed_to_pay_assure
	WebElement proceedassure;

	@FindBy(id = "firstshow")
	WebElement Addonpremium;

	@FindBy(id = "submit_medical_history")
	WebElement caresbumit;

	@FindBy(id = "proposalNum")
	WebElement ApplicationNocarecarefreedom;

	@FindBy(id = "care_premium")
	WebElement totalcarepremium;

	@FindBy(id = "proceed_to_pay_care")
	WebElement proceedcare;

	@FindBy(id = "proceed_to_pay_carefreedom")
	WebElement proceedcarefreedom;

	@FindBy(xpath = "//*[@id=\"inline_example3\"]/div/div/div/div[2]/p/strong[2]")
	WebElement Totalpremiumcarefreedom;

	@FindBy(id = "proceed_to_pay_explore")
	WebElement proceedexplore;

	@FindBy(id = "//*[@id=\"inline_example3\"]/div/div/div/div[2]/p/strong[2]")
	WebElement Totalexplorepremium;

	@FindBy(id = "permiumamountValid")
	WebElement Totalpremiumjoy;

	@FindBy(id = "proceed_to_pay_joy_tomorrow")
	WebElement proceedTomorrow;

	@FindBy(id = "proceed_to_pay_joy_today")
	WebElement proceedtoday;

	@FindBy(id = "proceed_to_pay_secure")
	WebElement proceedsecure;

	@FindBy(id = "secure_premium_val")
	WebElement Totalsecurepremium;

	@FindBy(id = "enhancePremiumResultRroposalOne")
	WebElement Totalstudentexplore;

	@FindBy(id = "nextBtnSubmit")
	WebElement Proceedstudentexplore;
	
	@FindBy(id ="proceed_to_pay_studentexplore")
	
	WebElement studentExploreProceed;
	
	@FindBy(id = "proceed_to_pay_carefreedom")
	
	WebElement proceedCareFreedom;
	
	public void proceedCareFreedom() {
		proceedCareFreedom.click();
	}

	public void Applicationno() throws Throwable { // common
		String ap = ApplicationNo.getAttribute("value");
		// log.debug("The Application no is " + ap);
		Thread.sleep(1500);
	}

	public void Totalpremiumassure() { //// assure premium
		String totp = Totalpremiumassure.getAttribute("innerHTML");
		String finalAmount[] = totp.split("</span>");

		// log.debug("The Total Preminum is " + finalAmount[1].trim());
	}

	public void proceedassure() { ////// assure proceed
		proceedassure.click();
		// log.debug("Clicking on the Proceed to pay button ");
	}

	public void Addonpremium() { ///// care 1st page
		String totp = Addonpremium.getAttribute("innerHTML");
		// log.debug("The Total Addons Premium is " + totp);
	}

	public void caresbumit() { //// care sumbit frst page
		caresbumit.click();
		// log.debug("Clicking on the confirm ");
	}

	public void ApplicationNocarecarefreedom() { ///// care and carefreddom application number
		String apl = ApplicationNocarecarefreedom.getAttribute("value");
		// log.debug("The Application Number is " + apl);
	}

	public void totalcarepremium() { //// care premium
		String totp2 = totalcarepremium.getAttribute("value");
		// log.debug("The Total Premium is " + totp2);
	}

	public void proceedcare() { //// care proceed
		proceedcare.click();
		// log.debug("Clicking on the proceed ");
	}

	public void proceedcarefreedom() { /// carefreedom proceed
		proceedcarefreedom.click();
		// log.debug("Clicking on the proceed ");
	}

	public void Totalpremiumcarefreedom() {//// carefreedom total premium
		String totp2 = Totalpremiumcarefreedom.getAttribute("innerHTML");
		// log.debug("The Total Premium is " + totp2);

	}

	public void proceedexplore() {//// explore proceed
		proceedexplore.click();
		// log.debug("Clicking on the proceed ");
	}

	public void Totalexplorepremium() { ///// explore total premium
		String totp = Totalexplorepremium.getAttribute("innerHTML");
		// log.debug("The Total Preminum is " + totp);
	}

	public void Totalpremiumjoy() {///// premium joy
		String totp = Totalpremiumjoy.getAttribute("value");
		// log.debug("The Total Preminum is " + totp);
	}

	public void proceedTomorrow() {////// proceed joy tom
		proceedTomorrow.click();
		// log.debug("Clicking on the proceed ");
	}

	public void proceedtoday() {///// proceed joy today
		proceedtoday.click();
		// log.debug("Clicking on the proceed ");
	}

	public void proceedsecure() {///// proceed secure
		proceedsecure.click();
		// log.debug("Clicking on the proceed ");
	}

	public void Totalsecurepremium() {////// secure primium
		String totp = Totalsecurepremium.getAttribute("innerHTML");
		// log.debug("The Total Preminum is " + totp);
	}

	public void Totalstudentexplore() { ///// premium student explore
		String totp = Totalstudentexplore.getAttribute("innerHTML");
		// log.debug("The Total Preminum is " + totp);

	}

	public void Proceedstudentexplore() {//// proceed student sxplore
		Proceedstudentexplore.click();
		// log.debug("Clicking on the Proceed to pay button ");
	}
	
	public void studentExploreProceedToBuy() {
		
		studentExploreProceed.click();
		
	}
	
	
}

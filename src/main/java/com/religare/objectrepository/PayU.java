package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.ScreenshotPAGE;
import com.religare.genericlib.WebDriverCommonLib;

public class PayU {

	WebDriverCommonLib clib = new WebDriverCommonLib();
	
	ScreenshotPAGE scr =new ScreenshotPAGE();


	@FindBy(name = "ccard_number")
	WebElement cardNumber;

	@FindBy(name = "cname_on_card")
	WebElement nameOnCard;

	@FindBy(name = "ccvv_number")
	WebElement ccvvNumber;

	@FindBy(id = "cexpiry_date_month")
	WebElement cardExpiryMonthDropDown;

	@FindBy(id = "cexpiry_date_year")
	WebElement cardExpiryYearDropDown;

	@FindBy(name = "pay_button")
	WebElement payBtn;

	ExcelLib elib = new ExcelLib();

	public void gateway() throws Throwable {

		try {

			cardNumber.sendKeys("5123456789012346");

			nameOnCard.sendKeys("test");

			ccvvNumber.sendKeys("123");

			clib.selectByValue(cardExpiryMonthDropDown, "03");

			clib.selectByValue(cardExpiryYearDropDown, "2023");

		} catch (Exception e) {

			e.getMessage();
		}
		try {

			ccvvNumber.sendKeys("123");

		} catch (Exception e) {

			e.getMessage();
			
			
		}
		
		payBtn.click();
		
		
	}
	
	
}
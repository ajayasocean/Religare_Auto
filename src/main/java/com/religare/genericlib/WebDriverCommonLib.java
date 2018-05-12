package com.religare.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void select(WebElement selWb, String text) {

		Select sel = new Select(selWb);

		sel.selectByVisibleText(text);
	}

	public void selectByValue(WebElement selWb, String text) {

		Select sel = new Select(selWb);

		sel.selectByValue(text);
	}

	public void moveMouseToElement(WebElement element) {

		Actions act = new Actions(BaseClass.driver);

		act.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement dest) {

		Actions act = new Actions(BaseClass.driver);

		act.dragAndDrop(source, dest).perform();

	}

	public void waitForPageToLoad() {

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	 public void waitForElementPresent(WebElement element) {
	
	 //WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
	
	 //wait.until(ExpectedConditions.visibilityOf(element));
	 }
	public void javaScriptScroll() {

		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
}
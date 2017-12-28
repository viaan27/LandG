package com.pages;

import org.openqa.selenium.By;

import com.LandG.PageObjectRepo;

import junit.framework.Assert;

public class YourQuotePage extends PageObjectRepo{
public void quotePage() {
	Assert.assertEquals("Your Quote", driver.getTitle());
		
	}
public void enterQuoteDetails() {
	driver.findElement(By.name("choose-0-066_0003")).click();
	driver.findElement(By.id("ConfirmAcceptedTerms")).click();
	
}
public void clickOnBeforeYouBuy() {
	driver.findElement(By.name("next_beforeyoubuy")).click();
}
}

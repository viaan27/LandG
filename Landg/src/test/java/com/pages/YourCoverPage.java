package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.LandG.PageObjectRepo;

public class YourCoverPage extends PageObjectRepo{
	public void coverPage() {
		Assert.assertEquals("Your Cover", driver.getTitle());
		
		
	}
	public void allDetailsOfcovering() throws InterruptedException {
		driver.findElement(By.id("CoverLevelCB")).click();
		WebElement ele5 = driver.findElement(By.id("BAndCExtendedDamage"));
		Select damage = new Select(ele5);
		damage.selectByValue("BC");
		driver.findElement(By.id("LegalAndRentYNN")).click();
		driver.findElement(By.id("ClaimsYNN")).click();
		driver.findElement(By.name("next_cover")).click();
		
		
		
	}
	public void clickOnNextToQuoteButton() throws InterruptedException {
		WebElement ele6 = driver.findElement(By.id("PolicyVolXS"));
		Select expenses = new Select(ele6);
		expenses.selectByValue("100");
		driver.findElement(By.name("requote")).click();
		Thread.sleep(2000);
		
		
	}

}

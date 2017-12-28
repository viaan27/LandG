package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.LandG.PageObjectRepo;

import junit.framework.Assert;

public class AboutYouAndYourDetailsPage extends PageObjectRepo {
	public void windowWithDetails() {
		Assert.assertEquals("https://www.securelegalandgeneral.com/landgB2L/quote/landlorddirect/hc/proposerdetails.page", driver.getCurrentUrl());
		
	}
	public void enterAllDetails() {

		WebElement ele = driver.findElement(By.name("qs.ProposerTitle"));
		Select title = new Select(ele);
		title.selectByValue("Mrs");
		driver.findElement(By.id("ProposerForenames")).sendKeys("sru");
		driver.findElement(By.id("ProposerSurname")).sendKeys("batia");
		driver.findElement(By.id("ProposerSexF")).click();
		driver.findElement(By.id("ProposerDOBSplitDD")).sendKeys("10");
		driver.findElement(By.id("ProposerDOBSplitMM")).sendKeys("10");
		driver.findElement(By.id("ProposerDOBSplitYY")).sendKeys("1976");
		WebElement occupation = driver.findElement(By.id("OccupationType"));
		Select type = new Select(occupation);
		type.selectByValue("Plumber");
		driver.findElement(By.id("ProposerEmail")).sendKeys("sru45@gmail.com");
		driver.findElement(By.id("ProposerDayTel")).sendKeys("07443568821");
		driver.findElement(By.id("DriversYNN")).click();
		driver.findElement(By.id("ProposerHouseNo")).sendKeys("2");
		driver.findElement(By.id("ProposerPostcode")).sendKeys("RH1 1HH");
		driver.findElement(By.className("proposerPaflookup")).click();
		driver.findElement(By.id("PolicyIncepDateSplitDD")).sendKeys("15");
		driver.findElement(By.id("PolicyIncepDateSplitMM")).sendKeys("12");
		driver.findElement(By.id("PolicyIncepDateSplitYY")).sendKeys("2017");
		driver.findElement(By.id("PropertyHouseNo")).sendKeys("4");
		driver.findElement(By.id("PropertyPostcode")).sendKeys("Rh10 6TL");
		driver.findElement(By.name("propertyPaflookup")).click();
		driver.findElement(By.id("YearBuilt")).sendKeys("1996");
		WebElement pt = driver.findElement(By.id("PropertyType"));
		Select property = new Select(pt);
		property.selectByValue("DH");
		WebElement pt1 = driver.findElement(By.id("TenantType"));
		Select tenant = new Select(pt1);
		tenant.selectByValue("Retired");
		WebElement pt2 = driver.findElement(By.id("NumberOfBedrooms"));
		Select bedrooms = new Select(pt2);
		bedrooms.selectByValue("3");
		WebElement pt3 = driver.findElement(By.id("WallConstruction"));
		Select material = new Select(pt3);
		material.selectByValue("Concrete");
		WebElement pt4 = driver.findElement(By.id("RoofConstruction"));
		Select roof = new Select(pt4);
		roof.selectByValue("Slate");
		driver.findElement(By.id("PropertyOccupiedY")).click();
		
		
	}
	public void clickOnNextYourCover() {
		driver.findElement(By.name("next_proposerdetails")).click();
		
	}

}

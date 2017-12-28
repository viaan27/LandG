package com.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.LandG.PageObjectRepo;

public class HomePage extends PageObjectRepo {

	public void start() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sruth\\Desktop\\Automation\\Driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.legalandgeneral.com");
		
	}
	public void clickOnInsurance() throws InterruptedException {
		Actions builder = new Actions(driver);
		WebElement pensions = driver.findElement(By.linkText("Insurance"));
		Thread.sleep(2000);
		builder.moveToElement(pensions).moveToElement(driver.findElement(By.linkText("Landlord insurance"))).click().build().perform();
	}
	public void clickOnLandLord() throws InterruptedException {
		
		String parent = driver.getWindowHandle();
		System.out.println("parent handle=" + parent);
		Thread.sleep(1000);
		driver.findElements(By.cssSelector(".opaque-panel-2 a")).get(1).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		int count = handles.size();
		System.out.println("no of handles=" + count);
		for (String child : handles) {
			System.out.println("child handle=" + child);
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
		
			}
		
	}
	}}

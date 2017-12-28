package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.LandG.PageObjectRepo;

public class PayingForYourCoverPage extends PageObjectRepo {
	public void enterCarddetails() {
		driver.findElement(By.id("PaymentTypeDDM")).click();
		driver.findElement(By.id("ConfirmCreditAgreement")).click();
		WebElement ele7 = driver.findElement(By.id("PayDDMPreferredPaymentDay"));
		Select payment = new Select(ele7);
		payment.selectByValue("3");
		driver.findElement(By.id("PayDDMHolder")).sendKeys("srut");
		driver.findElement(By.id("PayDDMBankName")).sendKeys("HSBC");
		driver.findElement(By.id("PayDDMSortCodeSplitFirst")).sendKeys("40");
		driver.findElement(By.id("PayDDMSortCodeSplitSecond")).sendKeys("89");
		driver.findElement(By.id("PayDDMSortCodeSplitThird")).sendKeys("00");
		driver.findElement(By.id("PayDDMAccount")).sendKeys("25557888 ");
		driver.findElement(By.name("next")).click();


		
	}
	public void paymentpage() {
		System.out.println(driver.getTitle());
		
	}

}

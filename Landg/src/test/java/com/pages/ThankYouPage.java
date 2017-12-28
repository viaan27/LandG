package com.pages;

import org.junit.Assert;

import com.LandG.PageObjectRepo;

public class ThankYouPage extends PageObjectRepo{
public void welcome() {
	Assert.assertEquals("Thank You", driver.getTitle());
	
}
}

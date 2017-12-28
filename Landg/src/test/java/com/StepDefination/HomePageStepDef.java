package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.Given;

public class HomePageStepDef extends PageObjectRepo{
	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
	   homepage.start();
	}
	@Given("^I click on insurance$")
	public void i_click_on_insurance() throws Throwable {
	   homepage.clickOnInsurance();
	}
	@Given("^I select landlord insurance$")
	public void i_select_landlord_insurance() throws Throwable {
	   homepage.clickOnLandLord();
	}


}

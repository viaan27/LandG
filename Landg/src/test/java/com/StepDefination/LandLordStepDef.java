package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.When;

public class LandLordStepDef extends PageObjectRepo {
	@When("^I click on get a quote button$")
	public void i_click_on_get_a_quote_button() throws Throwable {
		landLordPage.clickOnGetAQuote();
	   
	}


}

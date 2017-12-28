package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.Then;

public class ThankYouStepDef extends PageObjectRepo {
	@Then("^I sould see thankyou page$")
	public void i_sould_see_thankyou_page() throws Throwable {
		thankYouPage.welcome();
	   
	}


}

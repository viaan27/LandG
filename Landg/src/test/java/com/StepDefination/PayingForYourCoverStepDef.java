package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.When;

public class PayingForYourCoverStepDef extends PageObjectRepo{
	@When("^I should see paymentpage$")
	public void i_should_see_paymentpage() throws Throwable {
		payingForYourCoverPage.paymentpage();
	}

	@When("^I enter all the card details$")
	public void i_enter_all_the_card_details() throws Throwable {
		payingForYourCoverPage.enterCarddetails();
	}

}

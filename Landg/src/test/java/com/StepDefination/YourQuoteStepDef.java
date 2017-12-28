package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.When;

public class YourQuoteStepDef extends PageObjectRepo{
	@When("^I shoud see your quote page$")
	public void i_shoud_see_your_quote_page() throws Throwable {
		 yourQuotePage.quotePage();
	}
	@When("^I enter all the details of quote$")
	public void i_enter_all_the_details_of_quote() throws Throwable {
		 yourQuotePage.enterQuoteDetails();
	}
	@When("^I Click on before you buy button$")
	public void i_Click_on_before_you_buy_button() throws Throwable {
		 yourQuotePage.clickOnBeforeYouBuy();
	}


}

package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.When;

public class YourCoverStepDef extends PageObjectRepo {
	@When("^I shoud see your cover page$")
	public void i_shoud_see_your_cover_page() throws Throwable {
		 yourCoverPage.coverPage();
	}
	@When("^I enter all the details of covering$")
	public void i_enter_all_the_details_of_covering() throws Throwable {
		 yourCoverPage.allDetailsOfcovering();
	}
	@When("^I click on next your quote button$")
	public void i_click_on_next_your_quote_button() throws Throwable {
		 yourCoverPage.clickOnNextToQuoteButton();
	}

}

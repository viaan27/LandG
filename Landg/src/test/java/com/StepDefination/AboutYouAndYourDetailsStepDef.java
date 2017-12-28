package com.StepDefination;

import com.LandG.PageObjectRepo;

import cucumber.api.java.en.When;

public class AboutYouAndYourDetailsStepDef extends PageObjectRepo{
	@When("^I will see a window with details$")
	public void i_will_see_a_window_with_details() throws Throwable {
		aboutYouAndYourDetails.windowWithDetails();
	}
	@When("^I enter all related the details$")
	public void i_enter_all_related_the_details() throws Throwable {
		aboutYouAndYourDetails.enterAllDetails();
	}
	@When("^I click on next your cover button$")
	public void i_click_on_next_your_cover_button() throws Throwable {
		aboutYouAndYourDetails.clickOnNextYourCover();
	}

}

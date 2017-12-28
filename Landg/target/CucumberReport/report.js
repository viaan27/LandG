$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EndToEnd.feature");
formatter.feature({
  "line": 1,
  "name": "EndToEnd",
  "description": "",
  "id": "endtoend",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "LegalAndGeneralPositiveScenario",
  "description": "",
  "id": "endtoend;legalandgeneralpositivescenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on insurance",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I select landlord insurance",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on get a quote button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I will see a window with details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter all related the details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on next your cover button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I shoud see your cover page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter all the details of covering",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on next your quote button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I shoud see your quote page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter all the details of quote",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Click on before you buy button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see paymentpage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter all the card details",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I sould see thankyou page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_in_home_page()"
});
formatter.result({
  "duration": 25617263151,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_click_on_insurance()"
});
formatter.result({
  "duration": 3067179579,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_select_landlord_insurance()"
});
formatter.result({
  "duration": 3579550172,
  "status": "passed"
});
formatter.match({
  "location": "LandLordStepDef.i_click_on_get_a_quote_button()"
});
formatter.result({
  "duration": 217077,
  "status": "passed"
});
formatter.match({
  "location": "AboutYouAndYourDetailsStepDef.i_will_see_a_window_with_details()"
});
formatter.result({
  "duration": 23849784,
  "status": "passed"
});
formatter.match({
  "location": "AboutYouAndYourDetailsStepDef.i_enter_all_related_the_details()"
});
formatter.result({
  "duration": 9127369570,
  "status": "passed"
});
formatter.match({
  "location": "AboutYouAndYourDetailsStepDef.i_click_on_next_your_cover_button()"
});
formatter.result({
  "duration": 452287858,
  "status": "passed"
});
formatter.match({
  "location": "YourCoverStepDef.i_shoud_see_your_cover_page()"
});
formatter.result({
  "duration": 10258065,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Your Cover]\u003e but was:\u003c[About you and your property]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.pages.YourCoverPage.coverPage(YourCoverPage.java:12)\r\n\tat com.StepDefination.YourCoverStepDef.i_shoud_see_your_cover_page(YourCoverStepDef.java:10)\r\n\tat ✽.And I shoud see your cover page(EndToEnd.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "YourCoverStepDef.i_enter_all_the_details_of_covering()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YourCoverStepDef.i_click_on_next_your_quote_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YourQuoteStepDef.i_shoud_see_your_quote_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YourQuoteStepDef.i_enter_all_the_details_of_quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YourQuoteStepDef.i_Click_on_before_you_buy_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PayingForYourCoverStepDef.i_should_see_paymentpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PayingForYourCoverStepDef.i_enter_all_the_card_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ThankYouStepDef.i_sould_see_thankyou_page()"
});
formatter.result({
  "status": "skipped"
});
});
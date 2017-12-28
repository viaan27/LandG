package com.LandG;

import org.openqa.selenium.WebDriver;
import com.pages.AboutYouAndYourDetailsPage;
import com.pages.BeforeYouBuyPage;
import com.pages.HomePage;
import com.pages.LandLordPage;
import com.pages.PayingForYourCoverPage;
import com.pages.ThankYouPage;
import com.pages.YourCoverPage;
import com.pages.YourQuotePage;

public class PageObjectRepo {
	
	public static WebDriver driver;
	
	public static HomePage homepage=new HomePage();
	public static LandLordPage landLordPage=new LandLordPage();
	public static AboutYouAndYourDetailsPage aboutYouAndYourDetails=new AboutYouAndYourDetailsPage();
	public static BeforeYouBuyPage  beforeYouBuyPage=new BeforeYouBuyPage();
	public static PayingForYourCoverPage payingForYourCoverPage=new PayingForYourCoverPage();
	public static ThankYouPage  thankYouPage=new  ThankYouPage();
	public static YourCoverPage yourCoverPage=new YourCoverPage();
	public static YourQuotePage yourQuotePage=new YourQuotePage();
	

}

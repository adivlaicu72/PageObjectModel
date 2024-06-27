package tests;


import org.testng.annotations.Test;

import page.objects.MenuPage;
import selenium.utils.BaseTest;
import testdata.SocialMediaRedirectDataProviderClass;

public class SocialMediaRedirectTest extends BaseTest{

	@Test(dataProviderClass = SocialMediaRedirectDataProviderClass.class, dataProvider = "socialMediaRedirectDataProvider")
	public void searchAndAssertSocialMediaIcon(String socialNetworkName, String iconRedirectUrl) {
		
		MenuPage menu = new MenuPage(driver);
		menu.click(menu.iconFacebook);
		
		
		
	
	}
	
}

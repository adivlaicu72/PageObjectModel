package tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import page.objects.SingleauthorPage;
import selenium.utils.BaseTest;

public class SingleauthorFormTest extends BaseTest {

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	
	@Test
	public void singleauthorTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
			
    	menuPage.click(menuPage.singleauthorLink);
		SingleauthorPage singleauthorPage = new SingleauthorPage(driver);
			
		assertEquals(singleauthorPage.getElementText(singleauthorPage.skillDramaPercent), "95%");
		assertEquals(singleauthorPage.getElementText(singleauthorPage.skillBiographyPercent), "75%");
		assertEquals(singleauthorPage.getElementText(singleauthorPage.skillCookbooksPercent), "82%");
			
			

		}
	
}

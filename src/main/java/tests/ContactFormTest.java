package tests;

import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class ContactFormTest extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	
	@Test
	public void sendMessageTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
		
		menuPage.click(menuPage.contactsLink);
		
		
		
	}
}

package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class LoginTest extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	
	
	@Test
	public void validLoginTest() {
		
		MenuPage menuPage = new MenuPage(driver);
		//menuPage.navigateTo(menuPage.loginLink);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
		
		
		assertTrue(loginPage.checkMsgIsDisplayed(loginPage.successLoginMsg));
		//loginPage.logoutFromApp();
		loginPage.click(loginPage.logoutBtn);
		
	
	}
	
	@Test(priority = 2)
	public void invalidLoginTest() {
		
		MenuPage menuPage = new MenuPage(driver);
		
		//menuPage.navigateTo(menuPage.loginLink);
		menuPage.click(menuPage.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, "122343543");
		
		
		assertTrue(loginPage.checkMsgIsDisplayed(loginPage.errorLoginMsg));
	}
	
	
}

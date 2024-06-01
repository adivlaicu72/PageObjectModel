package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import page.objects.TheWickedKingPage;
import selenium.utils.BaseTest;

public class TheWickedKingSearchBookTest extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	
	@Test
	public void theWickedKingSearchBookTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
	
		menuPage.click(menuPage.searchForm);
		menuPage.sendKeys(menuPage.searchField, "King");
		menuPage.click(menuPage.theWickedKingInPopup);
		
		TheWickedKingPage theWickedKingPage = new TheWickedKingPage(driver);
		
		assertEquals(theWickedKingPage.getElementText(theWickedKingPage.category), "Category: New releases");
		assertEquals(theWickedKingPage.getElementText(theWickedKingPage.productID), "Product ID: 1709");
		
		assertTrue(theWickedKingPage.checkPictureIsDisplayed(theWickedKingPage.theWickedKing1));
		assertTrue(theWickedKingPage.checkPictureIsDisplayed(theWickedKingPage.theWickedKing2));
		assertTrue(theWickedKingPage.checkPictureIsDisplayed(theWickedKingPage.theWickedKing3));
		assertTrue(theWickedKingPage.checkPictureIsDisplayed(theWickedKingPage.theWickedKing4));
		

		}
}

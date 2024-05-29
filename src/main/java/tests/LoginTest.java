package tests;

import org.testng.annotations.Test;

import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void validLoginTest() {
		
		MenuPage menu = new MenuPage(driver);
		
		menu.navigateTo(menu.shopLink);
		menu.navigateTo(menu.loginLink);
		
	}
}

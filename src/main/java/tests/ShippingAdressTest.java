package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.LoginPage;
import page.objects.MenuPage;
import page.objects.ShippingAddressPage;
import selenium.utils.BaseTest;

public class ShippingAdressTest extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	
	@Test
	public void shippingAddressTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.loginLink);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(USER, PASS);
		
		//Navigare catre pagina https://keybooks.ro/account/edit-address/shipping/
		menuPage.hoverElement(menuPage.userPlaceholder);
		menuPage.click(menuPage.userSettings);
		
		ShippingAddressPage shippingAddressPage = new ShippingAddressPage(driver);
		shippingAddressPage.click(shippingAddressPage.shippingbilling);
		shippingAddressPage.click(shippingAddressPage.shippingbillingAddButton);	
	
		Select country = new Select(driver.findElement(By.id("shipping_country")));
		shippingAddressPage.click(shippingAddressPage.countryDropdown);
		country.selectByIndex(41);
		assertEquals(country.getFirstSelectedOption().getText(), "Canada");
		
		Select province = new Select(driver.findElement(By.id("shipping_state")));
		shippingAddressPage.click(shippingAddressPage.provinceDropdown);
		province.selectByValue("NL");
		assertEquals(province.getFirstSelectedOption().getText(), "Newfoundland and Labrador");
		
	}
}

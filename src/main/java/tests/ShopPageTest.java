package tests;

import org.testng.annotations.Test;

import page.objects.MenuPage;
import page.objects.ShopPage;
import selenium.utils.BaseTest;

public class ShopPageTest extends BaseTest{
	
	@Test
	public void shopPageTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.shopLink);
		
		ShopPage shopPage = new ShopPage(driver);
		shopPage.selectByVisibleText("Sort by price: low to high");
		
		
		
	}
	
	

}

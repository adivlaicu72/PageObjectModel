package tests;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
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
		
		List<WebElement> booksList = shopPage.getWebElementList(shopPage.bookPrice);
        
		//citesc textul si scot $
		String firstBookPrice =  booksList.get(1).getText().substring(1);
		String lastBookPrice =  booksList.get(20).getText().substring(1);
		//transform textul in double
		Double firstPrice = Double.parseDouble(firstBookPrice);
		Double lastPrice = Double.parseDouble(lastBookPrice);
		//assertez intr-un ternary
		assertTrue((firstPrice < lastPrice) ? true : false);
		
	}
	
	

}

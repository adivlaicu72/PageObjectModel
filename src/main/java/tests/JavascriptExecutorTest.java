package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class JavascriptExecutorTest extends BaseTest{
	
	//@Test
	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		//driver.get("www.keybooks.ro");
		//driver.navigate().to("url");
		jse.executeScript("window.location='https://keyfood.ro'");
		
		//driver.navigate().back();
		//jse.executeScript("window.history.back()");
		jse.executeScript("window.history.go(-1)");
		
		
		//driver.navigate().forward();
		//jse.executeScript("window.history.forward()");
		jse.executeScript("window.history.go(+1)");
				
		//1
		driver.navigate().refresh();
		//2
		jse.executeScript("window.history.go(0)");
		//3
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5).perform();
		//4
		driver.get(driver.getCurrentUrl());
	}
		
		@Test
		public void example2() throws InterruptedException {
			MenuPage menu = new MenuPage(driver);
		/*	JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			//alternativa pentru click()
			jse.executeScript("arguments[0].click()", menu.getWebElement(menu.iconSearch));
			//alternativa pentru sendKeys()
			jse.executeScript("arguments[0].value='cooking'", menu.getWebElement(menu.searchField));
			//alternativa pentru click()
			jse.executeScript("arguments[0].click()", menu.getWebElement(menu.iconSearch));
			
			Thread.sleep(4000);
			
			jse.executeScript("arguments[0].click();"
					+"arguments[1].value='storm';"
					+"arguments[0].click()", 
					menu.getWebElement(menu.iconSearch), 
					menu.getWebElement(menu.searchField));
					*/
			//alternativa pentru click()
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
			//alternativa pentru sendKeys()
			jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
			//alternativa pentru click()
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
			
			//alternativa pentru isDisplay()
			String visible = jse.executeScript
					("return document.getElementsByClassName('post_title')[0].checkVisibility()").toString();
			
			System.out.println(visible);
			boolean isElementVisible = Boolean.parseBoolean(visible);
			
			assertTrue(isElementVisible);
			
			//alternativa pentru getText()
			String bookTitle = jse.executeScript
					("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText").toString();
			System.out.println(bookTitle);
			
			jse.executeScript("document.getElementsByClassName('post_title')[0].childNodes[0].click()");
			
			String currentUrl = jse.executeScript("return document.URL").toString();
			System.out.println(currentUrl);
			assertEquals(currentUrl, "https://keybooks.ro/shop/a-hundred-and-one-receipes/");
			
			
		}
	

}

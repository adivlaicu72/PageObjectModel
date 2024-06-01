package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class TheWickedKingPage extends SeleniumWrappers{

public WebDriver driver;
	
	public TheWickedKingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori/webelements
		public By category= By.className("posted_in");
		public By productID = By.className("product_id");
		public By theWickedKing1 = By.cssSelector("li>img[src*=TheWickedKing1]");
		public By theWickedKing2 = By.cssSelector("li>img[src*=TheWickedKing2]");
		public By theWickedKing3 = By.cssSelector("li>img[src*=TheWickedKing3]");
		public By theWickedKing4 = By.cssSelector("li>img[src*=TheWickedKing4]");
				
	//metode
		
}

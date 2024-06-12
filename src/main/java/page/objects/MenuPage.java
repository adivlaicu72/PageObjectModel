package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	
	//driver.findElement(By.linkText('Login'));
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");
	public By contactsLink = By.linkText("CONTACTS");
	public By singleauthorLink = By.linkText("SINGLE AUTHOR");
	public By searchForm = By.cssSelector("div>form button");
	//public By searchField = By.cssSelector("input.search_field");
	public By theWickedKingInPopup = By.cssSelector(".post_title>a[href='https://keybooks.ro/shop/the-wicked-king/']");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By userPlaceholder = By.cssSelector("span[class='user_name']");
	public By userSettings = By.cssSelector("a[class='icon icon-cog']");
	public By blogSubMenuPostFormats = By.xpath("//a[contains(text(), 'Post Formats')]");
	public By iconSearch = By.cssSelector("div[class='top_panel_middle'] button[class*='icon-search']");
	public By searchField = By.cssSelector("div[class='top_panel_middle'] input");
	
	
	
/*	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}*/
	
	
	//metode

}
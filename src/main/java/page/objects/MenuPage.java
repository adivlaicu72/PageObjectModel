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
	public By searchField = By.cssSelector("input.search_field");
	public By theWickedKingInPopup = By.cssSelector(".post_title>a[href='https://keybooks.ro/shop/the-wicked-king/']");
	
/*	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}*/
	
	
	//metode

}
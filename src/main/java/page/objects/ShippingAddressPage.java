package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers {

	public WebDriver driver;
	
	public ShippingAddressPage (WebDriver driver) {
		this.driver = driver;
	}
		
		//locatori
		public By shippingbilling = By.xpath("//a[contains(text(), 'shipping and billing addresses')]");
		public By shippingbillingAddButton = By.xpath("//a[contains(@class, 'edit')][contains(text(), 'Add')]");
		public By countryDropdown = By.xpath("//span[@id='select2-shipping_country-container']");
		public By country = By.id("shipping_country");
		public By provinceDropdown = By.xpath("//span[@id='select2-shipping_state-container']");
		public By province = By.id("shipping_state");
	
		
		
		//metode
		
		public void selectByValue(String value) {
			WebElement element = driver.findElement(countryDropdown);
			Select select = new Select(element);
			select.selectByValue(value);	
		}
		
		public void selectByIndex(int index) {
			WebElement element = driver.findElement(countryDropdown);
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		
}

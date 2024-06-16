package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class GalleryFormatPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public GalleryFormatPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori/webelements
	public By comment = By.xpath("//textarea[@id='comment']");
	
	
	
	//metode

}

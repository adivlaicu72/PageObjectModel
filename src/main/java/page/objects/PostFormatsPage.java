package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class PostFormatsPage extends SeleniumWrappers {

public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By playAudioPost = By.cssSelector("div.mejs-button.mejs-play");
	public By musicSliderPosition = By.xpath("//span[@class='mejs-time-total mejs-time-slider']");
	public By volumeSliderPosition = By.xpath("//a[@aria-valuemin='0']");
	
	//metode
}

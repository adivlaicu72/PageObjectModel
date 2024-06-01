package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class SingleauthorPage extends SeleniumWrappers{
public WebDriver driver;
	
	public SingleauthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori/webelements
	public By skillDramaPercent = By.cssSelector("div.sc_skills_total[data-stop='95']");
	public By skillBiographyPercent = By.cssSelector("div.sc_skills_total[data-stop='75']");
	public By skillCookbooksPercent = By.cssSelector("div.sc_skills_total[data-stop='82']");
	
	//metode

	
}

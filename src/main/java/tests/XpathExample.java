package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class XpathExample extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credential.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credential.properties");
	/*
	 * 
	 * CSS : 
	 * 	li[class='menu_user_login']
	 * 
	 * XPATH: 
	 * 	//li[@class='menu_user_login']
	 * 
	 */

	@Test(priority =1)
	public void xpathExample() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		WebElement loginButton = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", loginButton);
		
		loginButton.click();
		
		//logical OR
		WebElement userField = driver.findElement(By.xpath("//ul//input[@id='log' or @name='log']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", userField);
		
		userField.sendKeys(USER);
			
		//logical AND
		WebElement passField = driver.findElement(By.xpath("//ul//input[@type='password' and @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", passField);
		
		passField.sendKeys(PASS);
		//direct child
		WebElement submitButton = driver.findElement(
				By.xpath("//ul//div[@class='popup_form_field submit_field']/input"));
		
		submitButton.click();
		
		Thread.sleep(4000);	
	}
	
	@Test(priority=2)
	public void xpathExample2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		// //span[@class='user_name']
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user_name']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", userName);
		userName.click();
		
		// <a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		
		// text() --> referinta catre textul dintre tag-urile HTML => //a[text()='Settings']
		WebElement textSettings = driver.findElement(By.xpath("//a[text()='Settings']"));
		textSettings.click();
		
		/*
		 *  // <a href="https://keybooks.ro/account/orders/">recent orders</a>
		 *  
		 *  //a[text() = 'recent orders']
		 *  
		 *  //a[contains(text(), 'rece') ]
		 *  
		 *  //a[contains(@href, '/account/orders' )]
		 * 
		 */
		WebElement recentOrders = driver.findElement(By.xpath("//a[contains(text(), 'rece') ]"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", recentOrders);
		recentOrders.click();
		
		// //th[contains(@class, 'header-order-number')]/span
		
		WebElement ordersTabHeader = driver.findElement(By.xpath("//th[contains(@class, 'header-order-number')]/span"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", ordersTabHeader);
		
		// //th[contains(@class, 'header-order-date')]/span[text()='Date']
		WebElement dateTabHeader = driver.findElement(By.xpath("//th[contains(@class, 'header-order-date')]/span[text()='Date']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", dateTabHeader);
		
		// select pe baza de index
		// (//span[@class='nobr'])[3]
		WebElement statusTabHeader = driver.findElement(By.xpath("(//span[@class='nobr'])[3]"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", statusTabHeader);
		
		
	}
	


}

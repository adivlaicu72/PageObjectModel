package tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.objects.GalleryFormatPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class PostGalleryFormatTest extends BaseTest{

	@Test
	public void postGalleryFormatTest() {
		
		MenuPage menu =  new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		menu.hoverElement(menu.blogSubMenuPostFormats);
		menu.click(menu.blogSubMenuPostFormats);
		menu.click(menu.galleryFormat);
		
		GalleryFormatPage galleryFormatPage = new GalleryFormatPage(driver);	
		WebElement addComment = galleryFormatPage.getWebElement(galleryFormatPage.comment);
		
		//scroll to element with JS
		jse.executeScript("arguments[0].scrollIntoView(true)", addComment);
		Actions action = new Actions(driver);
		
		action
		.moveToElement(addComment)
		.click()
		.keyDown(Keys.SHIFT)
		.sendKeys(addComment, "Message")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.TAB, "Subject")
		.sendKeys(Keys.TAB, "email@email.com")
		.sendKeys(Keys.TAB, "test.com")
		.sendKeys(Keys.TAB, Keys.ENTER)
		.perform();	
		
		assertEquals(galleryFormatPage.getElementText(galleryFormatPage.comment), "Message");
		
	
	}
}

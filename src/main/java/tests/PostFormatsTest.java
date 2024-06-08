package tests;

import org.testng.annotations.Test;
import page.objects.MenuPage;
import page.objects.PostFormatsPage;
import selenium.utils.BaseTest;

public class PostFormatsTest extends BaseTest{
	
	@Test
	public void postFormatsTest() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.hoverElement(menuPage.blogLink);
		menuPage.hoverElement(menuPage.blogSubMenuPostFormats);
		menuPage.click(menuPage.blogSubMenuPostFormats);
		
		PostFormatsPage postFormatsPage = new PostFormatsPage(driver);
		postFormatsPage.click(postFormatsPage.playAudioPost);
		postFormatsPage.dragAndDrop(postFormatsPage.musicSliderPosition, 200, 0);
		postFormatsPage.dragAndDrop(postFormatsPage.volumeSliderPosition, 50, 0);
		
		
	}

}

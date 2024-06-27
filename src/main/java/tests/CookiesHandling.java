package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CookiesHandling extends BaseTest{
	
	@Test(priority =1)
	public void addCookie() {
		
	/*	Cookie cookie = new Cookie("My Super Cookie", "My syper cookie value");
		
		driver.manage().addCookie(cookie);
		*/
		
		driver.manage().addCookie(new Cookie("MySuperCookie", "My syper cookie value"));
		
		
	}
	
	@Test(priority =2)
	public void getCookieNamed() {
		
		Cookie cookie = driver.manage().getCookieNamed("PHPSESSID");
		
		System.out.println(cookie);
	}
	
	@Test(priority =3)
	public void getAllCookies() {
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies);		
		
	}
	
	@Test(priority =4)
	public void deleteCookieNamed() {
		
		driver.manage().deleteCookieNamed("MySuperCookie");
		
		System.out.println("-----------------------------------------");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies);	
		
		driver.manage().deleteAllCookies();
		
		System.out.println("-----------------------------------------");
		Set<Cookie> allCookies2 = driver.manage().getCookies();
		System.out.println(allCookies2);
	}
}

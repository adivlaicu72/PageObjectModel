package testdata;

import org.testng.annotations.DataProvider;

public class SocialMediaRedirectDataProviderClass {
	@DataProvider
	public Object[][] socialMediaRedirectDataProvider() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Facebook";
		data[0][1] = "https://www.facebook.com/keytraining.ro";
		
		data[1][0] = "Twitter";
		data[1][1] = "https://x.com/";
		
		data[2][0] = "Instagram";
		data[2][1] = "https://www.instagram.com/";
		
		return data;
		
		
	}
}

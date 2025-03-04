package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ShareWithTwitterSignUpPage;
import utility.Util;

public class VerifyLoginFirstMsg extends BaseTest {

	HomePage homePage;
	ShareWithTwitterSignUpPage shareWithTwitterSignUpPage;

	@Test
	public void verifyLoginFirstMsg() {
		homePage = new HomePage(driver);

		Util.switchToFrame(driver, homePage.getNavFrame());
		Util.selectOptionFromSelectDropdown(homePage.getMoreOptionsDropdwon(), "Share with Twitter");
		Util.switchToDefaultContent(driver);
		String parentWindow = Util.switchToChildWindow(driver);

		shareWithTwitterSignUpPage = new ShareWithTwitterSignUpPage(driver);
		assertEquals(shareWithTwitterSignUpPage.getSetWantToLoginFirstText(), "Want to log in first?",
				"Text is not matching");

		driver.close();

		Util.switchToWindow(driver, parentWindow);

		System.out.println(driver.getTitle());

	}

}

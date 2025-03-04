package testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OnlyForTestingPage;

public class VeirfyOnlyForTestingPageDetails extends BaseTest {

	HomePage homePage;
	OnlyForTestingPage onlyForTestingPage;

	@Test
	public void veirfyOnlyForTestingPageDetails() {
		homePage = new HomePage(driver);
		homePage.getOnlyForTestingLink().click();

		onlyForTestingPage = new OnlyForTestingPage(driver);

		assertTrue(onlyForTestingPage.verifyFirstNameTextFieldEnabled(), "First name text field is enabled");
		assertFalse(onlyForTestingPage.verifyLastNameTextFieldEnabled(), "Last name text field is disabled");

	}

}

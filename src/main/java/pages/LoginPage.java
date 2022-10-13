package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

	/** Constructor */

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/** Web Elements */

	By SignIn = By.xpath("//h2[contains(text(),'Sign In')]");
	By AccountID = By.xpath("//mat-label[contains(text(),'Account ID:')]");
	By Password = By.xpath("//mat-label[contains(text(),'Password')]");
	
	By userNameId = By.name("accountID");
	By passwordId = By.name("password");
	By loginButtonId = By.xpath("//span[contains(text(),'Sign In')]");
	By ForgotPassw = By.xpath("//span[contains(text(),'Forgot Password')]");
	By ForgotId = By.xpath("//span[contains(text(),'Forgot ID')]");
	By InvalidLoginMessage = By.xpath("//span[contains(text(),'Invalid User/Password specified.')]");

	By myprofile = By.xpath("//h2[contains(text(),'My Profile')]");

	/** Page Methods */

	public void AssertEquals_SignIN() {
		
		Assert.assertEquals(readText(SignIn), "Sign In");

		Assert.assertEquals(readText(AccountID), "Account ID:");

		Assert.assertEquals(readText(Password), "Password");

		Assert.assertEquals(readText(loginButtonId), "Sign In");

		Assert.assertEquals(readText(ForgotPassw), "Forgot Password");

		Assert.assertEquals(readText(ForgotId), "Forgot ID");
	}

	public void InvalidCredentials() {
		writeText(userNameId, "Test@test.com");
		writeText(passwordId, "Test123");
		click(loginButtonId);
	}

	public void InvalidLoginMessage() {

		Assert.assertEquals(readText(InvalidLoginMessage), "Invalid User/Password specified.");
	}

	public LoginPage loginToADPER(String username, String password) {
		writeText(userNameId, username);
		writeText(passwordId, password);
		click(loginButtonId);

		return this;
	}

	public LoginPage verifyLogin(boolean expectedResult) {
		if (isDisplayed(myprofile)) {
			//System.out.println("Logged In");
		}
		return this;
	}

}

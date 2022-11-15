package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.Helper.*;

public class HomePage extends BasePage {

	/** Constructor */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/** Variables */
	String baseURL = Config.getInstance().getProperty("app.url");

	/**
	 * Page Methods
	 * 
	 * @return
	 **/

	public HomePage goToADPER() {
		driver.get(baseURL);
		 return this;
		//return new DashboardPage(driver);
	}

	/** WebElements **/
	By home = By.xpath("//h3[contains(text(),'Home')]");
	By publicSearch = By.xpath("//h3[contains(text(),'Public Search')]");
	By myProfile = By.xpath("//h3[contains(text(),'My Profile')]");
	By newCompany = By.xpath("//h3[contains(text(),'New Company')]");
	By myPrograms = By.xpath("//h3[contains(text(),'My Programs')]");
	By applyProgram = By.xpath("//h3[contains(text(),'Apply for a Program')]");
	By signIn = By.xpath("//h3[contains(text(),'Sign In')]");
	By signOff = By.xpath("//h3[contains(text(),'Sign Off')]");
	By newUserRegistration = By.xpath("//h3[contains(text(),'New User Registration')]");
	By help = By.xpath("//h3[contains(text(),'Help')]");

	By welcomeHeader = By.xpath("//h2[contains(text(),'Welcome To IDPH')]");

	By welcomeText = By.xpath("//span[contains(text(),'WELCOME')]");
	By bureauText = By.xpath("//b[contains(text(),'BUREAU')]");
	By bureauEnvText = By.xpath("");
	By bureauRadiText = By.xpath("");

	By noteText = By.xpath("//span[contains(text(),'This application')]");
	By additionalText = By.xpath("//span[contains(text(),'For additional')]");
	By IDPHLinks = By.xpath("//a[contains(text(),'IDPH REGULATORY PROGRAMS')]");

	public void Navhome() {
		click(home);
	}
	
	public PublicSearchPage NavpublicSearch() {
		click(publicSearch);
		return new PublicSearchPage(driver);
	}

	public LoginPage NavSignIn() {
		click(signIn);
		return new LoginPage(driver);
	}

	public void IsDisplayedLeftSideLinks() {
		Assert.assertTrue(isDisplayed(home));
		Assert.assertTrue(isDisplayed(publicSearch));
		Assert.assertTrue(isDisplayed(signIn));
		Assert.assertTrue(isDisplayed(newUserRegistration));
		Assert.assertTrue(isDisplayed(help));
	}

	public void IsDisplayedHomePageWelcomeMes() {
		Assert.assertTrue(isDisplayed(welcomeHeader));
	}
	
	public void IsDisplayedHomePageText() {
		
		Assert.assertTrue(isDisplayed(welcomeHeader));
		Assert.assertTrue(isDisplayed(welcomeText));
		Assert.assertTrue(isDisplayed(bureauText));
		Assert.assertTrue(isDisplayed(noteText));
		Assert.assertTrue(isDisplayed(additionalText));
		Assert.assertTrue(isDisplayed(IDPHLinks));
	}

	public void AssertEquals_HomePageText() {

		Assert.assertEquals(readText(welcomeHeader), "Welcome To IDPH");
		Assert.assertEquals(readText(welcomeText), "WELCOME TO THE ONLINE SERVICES SITE FOR REGULATORY PROGRAMS WITHIN:");
		Assert.assertEquals(readText(bureauText), "BUREAU OF EMERGENCY AND TRAUMA SERVICES\n"
				+ "BUREAU OF ENVIRONMENTAL HEALTH SERVICES\n" + "BUREAU OF RADIOLOGICAL HEALTH");
		Assert.assertEquals(readText(noteText), "This application works best in Chrome and Safari. If you need to use Internet Explorer, you will need to change three settings in order for the portal to function properly. Pop up blocker must be turned off and iowa.gov added to compatibility view and to trusted sites.");
		Assert.assertEquals(readText(additionalText), "For additional assistance, please follow the link below to the Iowa Department of Public Health's Regulatory Page.");
		Assert.assertEquals(readText(IDPHLinks), "IDPH REGULATORY PROGRAMS");
	}

	public void IDPHRegulatoryTab() throws InterruptedException {
		
		click(IDPHLinks);

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String ParentWindowAddress = it.next();
	//	System.out.println("ParentWindow : " + ParentWindowAddress);
		String ChildWindowAddress = it.next();
	//	System.out.println("ChildWindow : " + ChildWindowAddress);
		
		driver.switchTo().window(ChildWindowAddress);
		//System.out.println(CurrentURL);
		Assert.assertEquals(driver.getCurrentUrl(), "https://idph.iowa.gov/regulatory-programs");
		//waitTime();
		driver.switchTo().window(ParentWindowAddress);
		//waitTime();
	}
	
	public void IsDisplayedLoggedInPageLeftSide() {
		
		Assert.assertTrue(isDisplayed(home));
		Assert.assertTrue(isDisplayed(publicSearch));
		Assert.assertTrue(isDisplayed(myProfile));
		Assert.assertTrue(isDisplayed(newCompany));
		Assert.assertTrue(isDisplayed(myPrograms));
		Assert.assertTrue(isDisplayed(applyProgram));
		Assert.assertTrue(isDisplayed(signOff));
		Assert.assertTrue(isDisplayed(help));
	}
}
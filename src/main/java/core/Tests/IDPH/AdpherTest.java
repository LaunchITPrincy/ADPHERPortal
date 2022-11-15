package core.Tests.IDPH;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.NewUserRegistrationPage;
import pages.SignInPage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.ExcelUtil;

public class AdpherTest extends BaseTest{
	
	@BeforeTest
	public void setupTestData() {
		
	}
	
	@Test(priority = 1, description = "Verify the ADPER URL is loaded in the browser.", enabled = true)
    public void load_ADPER_Portal(Method method) throws InterruptedException {

       ExtentTestManager.startTest(method.getName(), "Verify the ADPER URL is loaded in the browser.");
        ExcelUtil.setCurrentRow(1, 4);
    
		homePage.goToADPER();
        ExtentTestManager.endTest();
    } 
	
	 @Test(priority = 2, description = "verying texts for first page") //
	 public void verifyFirstPage(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying texts for first page.");
	        ExcelUtil.setCurrentRow(2, 4);
	        SignInPage page = new SignInPage(driver);
	        page.AssertEquals_firstpage();
	        ExtentTestManager.endTest();		 
	 }
	 
	 @Test(priority = 3, description = "verying texts for signin page")//
	 public void verifySigninPage(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying texts for signin page.");
	        ExcelUtil.setCurrentRow(3, 4);
	        SignInPage page = new SignInPage(driver);
	        page.signin_page_txt_verify();
	        ExtentTestManager.endTest();
	 }
	 
	 @Test(priority = 4, description = "verifying invalid credentials signin")
	 public void verifyInvalidSignin(Method method) {
		 ExtentTestManager.startTest(method.getName(), "verifying invalid credentials signin");
		 ExcelUtil.setCurrentRow(4,4);
		 SignInPage page = new SignInPage(driver);
		 page.invalid_credentials_verify();
		 ExtentTestManager.endTest();
	 }
	 
	 @Test(priority = 5, description = "verifying invalid signin message")
	 public void verifyInvalidMessage(Method method) {
		 ExtentTestManager.startTest(method.getName(), "verifying invalid signin message");
		 ExcelUtil.setCurrentRow(5,4);
		 SignInPage page = new SignInPage(driver);
		 page.invalidSiginMessage();
		 ExtentTestManager.endTest();	
	 }
	 
	 @Test(priority = 5, description = "Signing in to Adpher")
	 public void verifySignin(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Signing in to Adpher");
		 ExcelUtil.setCurrentRow(6,4);
		 SignInPage page = new SignInPage(driver);
		 page.sigininToAdpher();
		 ExtentTestManager.endTest();	
	 }
	 
	 @Test(priority = 6, description = "verify Signing in to Adpher")
	 public void verifySigniningIn(Method method) {
		 ExtentTestManager.startTest(method.getName(), "verify Signing in to Adpher");
		 ExcelUtil.setCurrentRow(7,4);
		 SignInPage page = new SignInPage(driver);
		 page.verify_Signin(false);
		 ExtentTestManager.endTest();	
	 }
	 
	 @Test(priority = 7, description = "Navingating to New user Registeration Page")//
	 public void navigateToNewUserRegistrationPage(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Navingating to New user Registeration Page");
		 ExcelUtil.setCurrentRow(8,4);
		 NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
		 page.navigateToRegPage();
		 ExtentTestManager.endTest();	
	 }
	 
	 @Test(priority = 8, description = "Verifying New user Registeration Page")//
	 public void verifyNewUserRegistrationPage(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying New user Registeration Page");
		 ExcelUtil.setCurrentRow(9,4);
		 NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
		 page.verifyNavigationToRegPage();
		 ExtentTestManager.endTest();
	 }
	 
	 @Test(priority = 9, description = "Verifying New user Registeration Page texts")
	 public void verifyNewUserRegistrationPagetxts(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying New user Registeration Page texts");
		 ExcelUtil.setCurrentRow(10,4);
		 NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
		 page.verifyNewUserRegPage();
		 ExtentTestManager.endTest();
	 }
	 
	 @Test(priority = 10, description = "Verifying New user Registeration Page without Entering any credentials")
	 public void verifyNewUserRegistrationPagewithoutEneteringCredentials(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying New user Registeration Page without Entering any credentials");
		 ExcelUtil.setCurrentRow(11,4);
		 NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
		 page.verifyRegisterWithoutEnteringCredentials();
		 ExtentTestManager.endTest();
	 }
	 
	 @Test(priority = 11, description = "Verifying New user Registeration Page Alert Text")
	 public void verifyNewUserRegistrationPageAlertTxt(Method method) {
		 ExtentTestManager.startTest(method.getName(), "Verifying New user Registeration Page without Alert Text");
		 ExcelUtil.setCurrentRow(11,4);
		 NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
		 page.verifyRegisteAlerttxt();
		 ExtentTestManager.endTest();
	 }
	 
}

	 
	 

package core.Tests.IDPH;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.ApplyProgramPage;
import pages.ProgramPlumbingTemporaryLicensePage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.Config;
import utils.Helper.ExcelUtil;

public class ApplyProgramPlumbingTemporaryLicense extends BaseTest{
	
	@Test(priority = 1, description = "Load ADPER URL in browser successfully")
	public void load_ADPER_Portal(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify ADPER URL is loaded Successfully");
		ExcelUtil.setCurrentRow(1, 3);
		homePage.goToADPER();
		ExtentTestManager.endTest();
	}

	@Test(priority = 2, description = "Login with valid username and password")
	public void ADPER_ValidLoginCredentials(Method method) {

		ExtentTestManager.startTest(method.getName(), "Login with Valid username and password.");
		ExcelUtil.setCurrentRow(28, 3);
		homePage.goToADPER().NavSignIn().loginToADPER(Config.getInstance().getProperty("app.username"),
				Config.getInstance().getProperty("app.password")).verifyLogin(true);
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 3, description = "Verify Program Field Dropdown Values")
	public void VerifyProgramDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Program dropdown values in the Apply Program Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramPlumbingTemporaryLicensePage temporary = new ProgramPlumbingTemporaryLicensePage(driver);
		temporary.AssertEquals_ProgramDropd();	
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 4, description = "Verify Plumbing Temporary License Program Detail Field Dropdown Values", enabled = false)
	public void VerifyPlumbingTemporaryLicenseProgramDetailsDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify Plumbing Temporary License Program Detail dropdown values in the Apply Program Page");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramPlumbingTemporaryLicensePage temporary = new ProgramPlumbingTemporaryLicensePage(driver);
		temporary.PlumbingTemporaryLicense_ProgramDetail();
		ExtentTestManager.endTest();
	}

}

package core.Tests.IDPH;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.ApplyProgramPage;
import pages.CourseSearchPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewUserRegistrationPage;
import pages.ProgramBackflowTesterPage;
import pages.ProgramEMSProviderPage;
import pages.PublicSearchPage;
import pages.SignInPage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.Config;
import utils.Helper.ExcelUtil;

public class AdperPortal extends BaseTest {

	@BeforeTest
	public void setupTestData() {
		ExcelUtil.setExcelFileSheet("TestCases");
	}

	@Test(priority = 1, description = "Verify the ADPER URL is loaded in the browser.", enabled = true)
	public void load_ADPER_Portal(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the ADPER URL is loaded in the browser.");
		ExcelUtil.setCurrentRow(1, 4);
		homePage.goToADPER();
		ExtentTestManager.endTest();
	}

	@Test(priority = 2, description = "To verify that the ADPER portal displays the links", enabled = true)
	public void VerifyHomePageLinks(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify that the ADPER portal displays the links");
		ExcelUtil.setCurrentRow(2, 4);
		HomePage page = new HomePage(driver);
		page.IsDisplayedLeftSideLinks();
		ExtentTestManager.endTest();
	}

	@Test(priority = 3, description = "To verify whether the ADPER home page is displayed or not", enabled = true)
	public void VerifyIsDisplayedLeftSideLinks(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify whether the ADPER home page is displayed or not");
		ExcelUtil.setCurrentRow(3, 4);
		HomePage page = new HomePage(driver);
		page.IsDisplayedHomePageWelcomeMes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 4, description = "To verify the display fields on the Home Page", enabled = true)
	public void VerifyIsDisplayedHomePageText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify the display fields on the Home Page");
		ExcelUtil.setCurrentRow(4, 4);
		HomePage page = new HomePage(driver);
		page.IsDisplayedHomePageText();
		page.AssertEquals_HomePageText();
		ExtentTestManager.endTest();
	}

	@Test(priority = 5, description = "If you click the IDPH REGULATORY PROGRAMS link, the system must proceed to the next tab.", enabled = true)
	public void VerifyIDPHRegulatoryTab(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"If you click the IDPH REGULATORY PROGRAMS link, the system must proceed to the next tab.");
		ExcelUtil.setCurrentRow(5, 4);
		HomePage page = new HomePage(driver);
		page.IDPHRegulatoryTab();
		ExtentTestManager.endTest();
	}

	@Test(priority = 6, description = "Verify in the Public Search Navigation.", enabled = true)
	public void VerifyPublicSearchClick(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify in the Public Search Navigation.");
		ExcelUtil.setCurrentRow(6, 4);
		homePage.goToADPER().NavpublicSearch();
		PublicSearchPage page = new PublicSearchPage(driver);
		page.AssertEquals_SearchCriteria();
		ExtentTestManager.endTest();
	}

	@Test(priority = 7, description = "Verify whether or not the Public Search Fields are displayed.", enabled = true)
	public void VerifyIsDisplayedPublicSearchFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify whether or not the Public Search Fields are displayed.");
		ExcelUtil.setCurrentRow(7, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.AssertEquals_PublicSearchFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 8, description = "Verify for an empty search in the public search page.", enabled = true)
	public void VerifyWithoutInputSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify for an empty search in the public search page.");
		ExcelUtil.setCurrentRow(8, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.ClickSearch();
		page.AssertEquals_EmptySearchMessage();
		ExtentTestManager.endTest();
	}

	@Test(priority = 9, description = "Verify that you have entered a valid licence number and that the search results are correct.", enabled = true)
	public void VerifyValidPublicSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify that you have entered a valid licence number and that the search results are correct.");
		ExcelUtil.setCurrentRow(9, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.EnterLisenseNumber();
		page.ClickSearch();
		page.AssertEquals_SearchResults();
		ExtentTestManager.endTest();
	}

	@Test(priority = 10, description = "Verify to Export Search Results", enabled = true)
	public void VerifySearchResultsExport(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Export Search Results");
		ExcelUtil.setCurrentRow(10, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.ClickCheckBox();
		page.ClickExport();
		ExtentTestManager.endTest();
	}

	@Test(priority = 11, description = "Verify the display fields on the Public Search Detail Page by clicking the 'Details' link in the 'Public details' column.", enabled = true)
	public void VerifyPublicDetails(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the display fields on the Public Search Detail Page by clicking the 'Details' link in the 'Public details' column.");
		ExcelUtil.setCurrentRow(11, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.ClickDetailsLink();
		page.AssertEquals_PublicSearchDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 12, description = "Verify that clicking the Back button takes you to the Search Results Page.", enabled = true)
	public void VerifyPublicDetailsBackButtonNav(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify that clicking the Back button takes you to the Search Results Page.");
		ExcelUtil.setCurrentRow(12, 4);
		PublicSearchPage page = new PublicSearchPage(driver);
		page.ClickBack();
		page.AssertEquals_SearchResults();
		ExtentTestManager.endTest();
	}

	@Test(priority = 13, description = "To verify, click the Reset button to clear the Search Results.", enabled = true)
	public void VerifyResetButton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify, click the Reset button to clear the Search Results.");
		ExcelUtil.setCurrentRow(13, 4);

		PublicSearchPage page = new PublicSearchPage(driver);
		page.ClickReset();
		// page.ClearSearchResults();
		ExtentTestManager.endTest();
	}

	@Test(priority = 14, description = "Verify By entering an invalid licence number and clicking the 'Search' button", enabled = true)
	public void VerifyInvalidSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By entering an invalid licence number and clicking the 'Search' button");
		ExcelUtil.setCurrentRow(14, 4);

		PublicSearchPage page = new PublicSearchPage(driver);
		page.InvalidSearchData();
		page.AssertEquals_InvalidPublicSearchResult();
		page.ClickReset();
		ExtentTestManager.endTest();
	}

	@Test(priority = 15, description = "Verify By entering an invalid search input value and clicking the 'Search' button.", enabled = true)
	public void VerifySecondInvalidSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By entering an invalid search input value and clicking the 'Search' button.");
		ExcelUtil.setCurrentRow(15, 4);

		PublicSearchPage page = new PublicSearchPage(driver);
		page.InvalidSearchInputValue();
		page.AssertEquals_InvalidPublicSearchMessage();
		page.ClickReset();
		ExtentTestManager.endTest();
	}

	@Test(priority = 16, description = "Verify It must navigate to the Course search criteria Page by clicking the 'Course search' button.", enabled = true)
	public void VerifyCourseSearchButtons(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify It must navigate to the Course search criteria Page by clicking the 'Course search' button.");
		ExcelUtil.setCurrentRow(16, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickCourseSearch();
		page.Assert_CourseSearch();
		ExtentTestManager.endTest();
	}

	@Test(priority = 17, description = "Verify the Course Search display fields", enabled = true)
	public void VerifyCourseSearchDropdowns(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Course Search display fields");
		ExcelUtil.setCurrentRow(17, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.AssertEquals_CourseSearchFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 18, description = "Verify the Program dropdown options on the Course Search Page.", enabled = true)
	public void VerifyIsDisplayedCourseSearchProgram(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Program dropdown options on the Course Search Page.");
		ExcelUtil.setCurrentRow(18, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickCourseSearchProgram();
		page.AssertEquals_CourseSearchProgram();
		page.ClickEmptyProgramDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 19, description = "Verify to Click the 'Search' button without selecting any of the Course search options.", enabled = true)
	public void VerifyWithoutInputCourseSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click the 'Search' button without selecting any of the Course search options.");
		ExcelUtil.setCurrentRow(19, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickSearch();
		page.AssertEquals_EmptyCourseSearchMessage();
		page.ClickOK();
		ExtentTestManager.endTest();
	}

	@Test(priority = 20, description = "Verify the search results for a valid Course Search.", enabled = true)
	public void VerifyValidCourseSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the search results for a valid Course Search.");
		ExcelUtil.setCurrentRow(20, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickCourseSearchProgram();
		page.ClickBackFlowTester();
		page.ClickCourseSearchMonth();
		page.ClickMonthValue();
		page.ClickCourseSearchYear();
		page.ClickYearValue();
		page.ClickSearch();
		page.Assert_SearchResults();
		ExtentTestManager.endTest();
	}

	@Test(priority = 21, description = "Verify the Course Search a pop-up", enabled = true)
	public void VerifyEventsReturns(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Course Search a pop-up");
		ExcelUtil.setCurrentRow(21, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickCalender();
		page.CourseNameCheckinPopup();
		page.ClickOK();
		ExtentTestManager.endTest();
	}

	@Test(priority = 22, description = "Verify Course Search Export button", enabled = true)
	public void VerifyCourseSearchExportbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Course Search Export button");
		ExcelUtil.setCurrentRow(22, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickExport();
		ExtentTestManager.endTest();
	}

	@Test(priority = 23, description = "Verify Course Search Reset button", enabled = true)
	public void VerifyCourseSearchReset(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Course Search Reset button");
		ExcelUtil.setCurrentRow(23, 4);
		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickReset();
		// page.ClearSearchResults();
		ExtentTestManager.endTest();
	}

	@Test(priority = 24, description = "Verify Course Search Return button", enabled = true)
	public void VerifyCourseSearchReturn(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify by clicking the Return button should navigate to the Public Search Page");
		ExcelUtil.setCurrentRow(24, 4);

		CourseSearchPage page = new CourseSearchPage(driver);
		page.ClickCourseSearchProgram();
		page.ClickBackFlowTester();
		page.ClickCourseSearchMonth();
		page.ClickMonthValue();
		page.ClickCourseSearchYear();
		page.ClickYearValue();
		page.ClickSearch();
		page.ClickReturnButton();
		PublicSearchPage PublicSearch = new PublicSearchPage(driver);
		PublicSearch.AssertEquals_SearchCriteria();
		ExtentTestManager.endTest();
	}

	@Test(priority = 25, description = "Verify the Sign in Page Display fields", enabled = true)
	public void VerifySignInPage(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify the Sign in Page Display fields");
		ExcelUtil.setCurrentRow(25, 4);
		homePage.goToADPER().NavSignIn();
		LoginPage Login = new LoginPage(driver);
		Login.AssertEquals_SignIN();
		ExtentTestManager.endTest();
	}

	@Test(priority = 26, description = "Verify to Login with Invalid username and password.", enabled = true)
	public void ADPER_InvalidLoginCredentials(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to Login with Invalid username and password.");
		ExcelUtil.setCurrentRow(26, 4);
		homePage.goToADPER().NavSignIn();
		LoginPage Login = new LoginPage(driver);
		Login.InvalidCredentials();
		Login.InvalidLoginMessage();
		ExtentTestManager.endTest();
	}

	@Test(priority = 27, description = "Verify to Login with valid username and password.", enabled = true)
	public void ADPER_ValidLoginCredentials(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to Login with valid username and password.");
		ExcelUtil.setCurrentRow(27, 4);
		homePage.goToADPER().NavSignIn().loginToADPER(Config.getInstance().getProperty("app.username"),
				Config.getInstance().getProperty("app.password")).verifyLogin(true);
		ExtentTestManager.endTest();
	}

	@Test(priority = 28, description = "Verify Apply Program Navigation", enabled = true)
	public void ApplyForProgramNavigation(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Apply Program Navigation");
		ExcelUtil.setCurrentRow(28, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 29, description = "Verify whether the Apply for a Program Fields are displayed or not.", enabled = true)
	public void ApplyForProgramDisplayFields(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify whether the Apply for a Program Fields are displayed or not.");
		ExcelUtil.setCurrentRow(29, 4);

		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplyProgrampage();

		ExtentTestManager.endTest();
	}

	@Test(priority = 30, description = "Verify By clicking the Cancel button in the Apply for a Program section, you should be directed to My Programs.", enabled = true)
	public void ApplyForProgramCancel(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the Cancel button in the Apply for a Program section, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(30, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickCancel();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}

	@Test(priority = 31, description = "Verify the Apply Program without entering any information.", enabled = true)
	public void WithoutValuesApplyforProgram(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify the Apply Program without entering any information.");
		ExcelUtil.setCurrentRow(31, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		ExtentTestManager.endTest();
	}

	@Test(priority = 32, description = "In the Apply Program Page, verify the Program dropdown values.", enabled = true)
	public void VerifyProgramDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(), "In the Apply Program Page, verify the Program dropdown values.");
		ExcelUtil.setCurrentRow(32, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.ClickProgram();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ProgramDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 33, description = "Verify the Apply for a Program without entering a value in the Program Detail", enabled = true)
	public void WithoutProgramDetailApplyforProgram(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Apply for a Program without entering a value in the Program Detail");
		ExcelUtil.setCurrentRow(33, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramBackFlowTester();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		ExtentTestManager.endTest();
	}

	@Test(priority = 34, description = "In the Apply Program Page, verify the BackFlow Tester Program Detail dropdown values.", enabled = true)
	public void VerifyBackFlowProgramDetailsDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"In the Apply Program Page, verify the BackFlow Tester Program Detail dropdown values.");
		ExcelUtil.setCurrentRow(34, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.ClickProgramDetail();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_BackFlow_ProgramDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 35, description = "Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void ApplyforProgramPopup(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(35, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramDetailBackFlow();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 36, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void ApplyforProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(36, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 37, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void ApplyforProgramPopupOKbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(37, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 38, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApplyProgramDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify the alert message if you try to apply for a program without completing the Application Forms.");
		ExcelUtil.setCurrentRow(38, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.Click_Checkbox();
		page.ClickContinue();
		page.Assert_Incomplete_Popup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 39, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyForProgramEdit(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(39, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 40, description = "Verify the display Fields on the Application Form", enabled = true)
	public void ApplicationFormDisplayFields(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(40, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 41, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void ApplicationFormProgramType(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(41, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ApplicationForm_BackFlow();
		ExtentTestManager.endTest();
	}

	@Test(priority = 42, description = "Verify the Backflow Tester program Affirmations.", enabled = true)
	public void BackflowTesterAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Backflow Tester program Affirmations.");
		ExcelUtil.setCurrentRow(42, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 43, description = "Verify Backflow Tester Affirmations Required Fields", enabled = true)
	public void BackflowTester_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Backflow Tester Affirmations Required Fields");
		ExcelUtil.setCurrentRow(43, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 44, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void BackflowTester_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
		ExcelUtil.setCurrentRow(44, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.YesMedicalCondition();
		backflow.YesIllegal();
		backflow.YesMisdemeanor();
		backflow.YesJurisdiction();
		backflow.YesJudgement();
		backflow.YesLicense();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.AffirmationDetails_RequiredPopup();
		page.ClickOk();
		backflow.Affirmations_Text();
		page.ClickAffirmations();
		ExtentTestManager.endTest();
	}

	@Test(priority = 45, description = "Verify the Application Form Third-Party Certification Questions for Backflow Testers", enabled = true)
	public void BackflowTesterThirdPartyCertification(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Third-Party Certification Questions for Backflow Testers");
		ExcelUtil.setCurrentRow(45, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ThirdPartyCertification();
		page.ClickThirdPartyCertification();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ThirdPartyCertification_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 46, description = "Verify Backflow Tester Third Party Certification  Required Fields", enabled = true)
	public void BackflowTester_ThirdPartyCertification_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify Backflow Tester Third Party Certification  Required Fields");
		ExcelUtil.setCurrentRow(46, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.ThridPartyCertification_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 47, description = "Verify If all of the Third Party Certification questions are answered 'yes', then the Third Party Certification text fields must be required.", enabled = true)
	public void BackflowTester_ThridPartyCertification_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the Third Party Certification questions are answered 'yes', then the Third Party Certification text fields must be required.");
		ExcelUtil.setCurrentRow(47, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Yes_ThirdPartyCertification();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.ThridPartyCertification_RequiredPopup();
		page.ClickOk();
		backflow.Select_ThridParty();
		backflow.Enter_CertificationNum();
		ExtentTestManager.endTest();
	}

	@Test(priority = 48, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
	public void ThridPartyCertification_ExpirationDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.");
		ExcelUtil.setCurrentRow(48, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Enter_PastExpirationDate();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.CertificationExpiry_Message();
		page.ClickOk();
		backflow.Select_ExpirationDate();
		page.ClickThirdPartyCertification();
		ExtentTestManager.endTest();
	}

	@Test(priority = 49, description = "Verify Back Flow Tester Out of State Credentials or Training Questions.", enabled = true)
	public void BackflowTesterOutOfStateCredentials(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify Back Flow Tester Out of State Credentials or Training Questions.");
		ExcelUtil.setCurrentRow(49, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Training();
		backflow.ClickOutOfState();
		backflow.AssertEquals_OutofState_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 50, description = "Verify Back Flow Tester Out of State Credentials or Training  Required Fields", enabled = true)
	public void BackflowTester_OutOfStateCredentials_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify Back Flow Tester Out of State Credentials or Training  Required Fields");
		ExcelUtil.setCurrentRow(50, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.OutOfState_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 51, description = "Verify If all of the Back Flow Tester Out of State Credentials or Training questions are answered 'yes', then the Back Flow Tester Out of State Credentials or Training text fields must be required.", enabled = true)
	public void BackflowTester_OutOfStateCredentials_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the Back Flow Tester Out of State Credentials or Training questions are answered 'yes', then the Back Flow Tester Out of State Credentials or Training text fields must be required.");
		ExcelUtil.setCurrentRow(51, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Yes_OutOfState();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.OutOfState_RequiredPopup();
		page.ClickOk();
		backflow.Enter_NamingJuris();
		backflow.Enter_LicenseNum();
		backflow.Enter_CourseName();
		backflow.Enter_CourseNum();
		backflow.Enter_CourseLocation();
		backflow.Enter_CourseSponsor();
		ExtentTestManager.endTest();
	}

	@Test(priority = 52, description = "To Verify an alert message as Certification cannot be expired.", enabled = true)
	public void OutOfStateCredentials_ExpirationDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify an alert message as Certification cannot be expired.");
		ExcelUtil.setCurrentRow(52, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Enter_PastDateOfExpiration();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.CertificationExpiry_Message();
		page.ClickOk();
		backflow.Select_DateOfExpiration();
		ExtentTestManager.endTest();
	}

	@Test(priority = 53, description = "To verify an alert message Out of State Courses must be valid", enabled = true)
	public void OutOfStateCredentials_InvalidCourseDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify an alert message Out of State Courses must be valid");
		ExcelUtil.setCurrentRow(53, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Enter_FutureCourseDate();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.OutOfStateCourse_ValidPopup();
		page.ClickOk();
		backflow.Enter_CourseDate();
		ExtentTestManager.endTest();
	}

	@Test(priority = 54, description = "Verify the attachment display fields and attachment types.", enabled = true)
	public void AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the attachment display fields and attachment types.");
		ExcelUtil.setCurrentRow(54, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.AssertEquals_Attachment();
		page.ClickAttachmentType();
		page.AssertEquals_AttachmentTypes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 55, description = "Verify without submitting a file Try to save an attachment", enabled = true)
	public void UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify without submitting a file Try to save an attachment");
		ExcelUtil.setCurrentRow(55, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 56, description = "Verify the Delete button in the attachments.", enabled = true)
	public void AttachmentsDelete(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Delete button in the attachments.");
		ExcelUtil.setCurrentRow(56, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		// page.IsNotDisplayed_Delete();
		ExtentTestManager.endTest();
	}

	@Test(priority = 57, description = "Verify the upload of attachments with documents.", enabled = true)
	public void UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.ClickAttachmentType();
		page.SelectAttachmentType_CourseMaterials();
		page.Enter_Description();
		page.Click_ChooseFile();
		page.UploadFile();
		page.ClickUploadAttachment();
		page.IsDisplayed_View();
		ExtentTestManager.endTest();
	}

	@Test(priority = 58, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void NavTermsAndConditions(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
		ExcelUtil.setCurrentRow(58, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}

	@Test(priority = 59, description = "Verify Terms and Conditions Page", enabled = true)
	public void TermsAndConditionsText(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(59, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 60, description = "Verify without agreeing to the terms and conditions, try to click the continue button.", enabled = true)
	public void WithoutAgreeTerms(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify without agreeing to the terms and conditions, try to click the continue button.");
		ExcelUtil.setCurrentRow(60, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 61, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void ValidAgreeTerms(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 62, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 63, description = "Verify the BackFlow Tester Program Fees.", enabled = true)
	public void VerifyBackFlowPayment(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the BackFlow Tester Program Fees.");
		ExcelUtil.setCurrentRow(63, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_Backflow_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 64, description = "Verify to Accept the Alert Message by clicking the Pay Later button.", enabled = true)
	public void PayLaterAlertAccept(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Accept the Alert Message by clicking the Pay Later button.");
		ExcelUtil.setCurrentRow(64, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 65, description = "Verify to Dismiss the Alert Message by clicking the Pay Later button.", enabled = true)
	public void PayLaterAlertDismiss(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Dismiss the Alert Message by clicking the Pay Later button.");
		ExcelUtil.setCurrentRow(65, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 66, description = "Verify the Pay Later Options", enabled = true)
	public void PayLaterOptions(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the Pay Later Options");
		ExcelUtil.setCurrentRow(66, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}

	@Test(priority = 67, description = "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and then click Dismiss.", enabled = true)
	public void NavPayLaterDismiss(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and then click Dismiss.");
		ExcelUtil.setCurrentRow(67, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Check();
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 68, description = "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and you must accept it.", enabled = true)
	public void NavPayLaterAccept(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and you must accept it.");
		ExcelUtil.setCurrentRow(68, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}

	@Test(priority = 69, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_Backflow_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 70, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(70, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 71, description = "To verify the Iowa Payment Website.", enabled = true)
	public void PayNowbutton(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To verify the Iowa Payment Website.");
		ExcelUtil.setCurrentRow(71, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_BackFlow_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 72, description = "Verify that you can click the Continue button without entering your payment information.", enabled = true)
	public void InvalidPaymentContinue(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify that you can click the Continue button without entering your payment information.");
		ExcelUtil.setCurrentRow(72, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_RequiredError();
		ExtentTestManager.endTest();
	}

	@Test(priority = 73, description = "Verify to enter Invalid Card Number for the payment information.", enabled = true)
	public void InvalidCardNumPayment(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to enter Invalid Card Number for the payment information.");
		ExcelUtil.setCurrentRow(73, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.InvalidEnter_CardNum();
		page.Click_PaymentContinue();
		page.Assert_InvalidCardNum();
		ExtentTestManager.endTest();
	}

	@Test(priority = 74, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 75, description = "To Review the Payment and Click Confirm to Proceed.", enabled = true)
	public void ReviewPaymentConfirm(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Review the Payment and Click Confirm to Proceed.");
		ExcelUtil.setCurrentRow(75, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_ContinuePayment();
		page.Assert_ReviewPayment();
		page.Click_Confirm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 76, description = "To Verify Payment Confirmation Page", enabled = true)
	public void PaymentConfirmation(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Payment Confirmation Page");
		ExcelUtil.setCurrentRow(76, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 77, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_ReceiptBackFlow();
		ExtentTestManager.endTest();
	}

	@Test(priority = 78, description = "Verify to apply Duplicate BackFlow Tester Program.", enabled = true)
	public void ApplyforProgramDuplicate(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate BackFlow Tester Program.");
		ExcelUtil.setCurrentRow(78, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickMyPrograms();
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramBackFlowTester();
		page.ClickProgramDetail();
		backflow.SelectProgramDetailBackFlow();
		page.ClickContinue();
		page.ClickOk();
		page.ApplyingDuplicateLicese();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 79, description = "Verify EMS Provider program is displaying or Not", enabled = true)
	public void VerifyAEMTProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider program is displaying or Not");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ProgramDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 80, description = "Verify the Apply for a Program without entering a select program in the Program Detail", enabled = true)
	public void WithoutAEMTProgramDetailApplyforProgram(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Apply for a Program without entering a select program in the Program Detail");
		ExcelUtil.setCurrentRow(80, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		ExtentTestManager.endTest();
	}

	@Test(priority = 81, description = "In the Apply Program Page, verify the EMS Provider Program Detail dropdown values.", enabled = true)
	public void VerifyAEMTProgram_ProgramDetailProgramDetailsDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"In the Apply Program Page, verify the EMS Provider Program Detail dropdown values.");
		ExcelUtil.setCurrentRow(81, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.ClickProgramDetail();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMSProgramProgramDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 82, description = "Verify to Apply AEMT Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void ApplyforAEMTProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Apply AEMT Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(82, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_AEMT_ProgramDetail();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 83, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void ApplyforAEMTProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(83, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 84, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void ApplyforAEMTProgramPopupOKbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(84, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 85, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApplyAEMTProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the alert message if you try to apply for a program without completing the Application Forms.");
		ExcelUtil.setCurrentRow(85, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.Click_Checkbox();
		page.ClickContinue();
		page.Assert_Incomplete_Popup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 86, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyForAEMTProgramEdit(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(86, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 87, description = "Verify the display Fields on the Application Form", enabled = true)
	public void AEMTApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(87, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 88, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void AEMTApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderAEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 89, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMSProviderAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(89, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 90, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 91, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
		ExcelUtil.setCurrentRow(91, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.YesMedicalCondition();
		backflow.YesIllegal();
		backflow.YesMisdemeanor();
		backflow.YesJurisdiction();
		backflow.YesJudgement();
		backflow.YesLicense();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.AffirmationDetails_RequiredPopup();
		page.ClickOk();
		backflow.Affirmations_Text();
		page.ClickAffirmations();
		ExtentTestManager.endTest();
	}

	@Test(priority = 92, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(92, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_PersonalInformationTitle();
		ems.Expand_PersonalInformation();
		ems.Assert_PersonalInformation_Gender();
		ems.Assert_PersonalInformation_Veteran();
		ExtentTestManager.endTest();
	}

	@Test(priority = 93, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();

		ExtentTestManager.endTest();
	}

	@Test(priority = 94, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
	public void Enter_PersonalInformation_EMSProvider(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Personal Informations Gender field dropdown Values");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_GenderDropd();
		ems.Assert_GenderDropd();
		ems.Select_FemaleGender();
		ems.Click_Veteran();
		ems.Expand_PersonalInformation();
		ExtentTestManager.endTest();
	}

	@Test(priority = 95, description = "Verify the Application Form Current National Registry Questions for EMS Providers", enabled = true)
	public void EMSProvider_CurrentNationalRegistry(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Current National Registry Questions for EMS Providers");
		ExcelUtil.setCurrentRow(95, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CurrentNationalRegistryTitle();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_CurrentNationalRegistry();
		ExtentTestManager.endTest();
	}

	@Test(priority = 96, description = "Verify Current National Registry dropdown values", enabled = true)
	public void EMSProvider_CurrentNationalRegistryDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Current National Registry dropdown values");
		ExcelUtil.setCurrentRow(96, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CurrentNationaRegistry();
		ems.Assert_CurrentNationalRegistryDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 97, description = "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.", enabled = true)
	public void EMSProvider_CurrentNationalRegistry_NREMTBlank(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.");
		ExcelUtil.setCurrentRow(97, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.select_CurrentNationalRegistryDropd();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_NREMTBlank();
		ExtentTestManager.endTest();
	}

	@Test(priority = 98, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
	public void EMSProvider_CurrentNationalRegistry_NREMTDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.");
		ExcelUtil.setCurrentRow(98, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Enter_NREMTNumberTextbox();
		ems.Enter_PastExpirationDate();
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_NREMTExpiryDate();
		ExtentTestManager.endTest();
	}

	@Test(priority = 99, description = "Verify the Application Form Provider Disaster Questions for EMS Providers", enabled = true)
	public void EMSProvider_ProviderDisaster(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Provider Disaster Questions for EMS Providers");
		ExcelUtil.setCurrentRow(99, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Enter_FutureExpirationDate();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_ProviderDisasterTitle();
		ems.Expand_ProviderDisaster();
		ems.Assert_ProviderDisaster();
		ExtentTestManager.endTest();
	}

	@Test(priority = 100, description = "Verify Application Form Provider Disaster Required Fields", enabled = true)
	public void EMSProvider_ProviderDisaster_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Provider Disaster Required Fields");
		ExcelUtil.setCurrentRow(100, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 101, description = "Verify the Application Form Fee Waiver Request Questions for EMS Providers", enabled = true)
	public void EMSProvider_FeeWaiverRequest(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Fee Waiver Request Questions for EMS Providers");
		ExcelUtil.setCurrentRow(101, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		ems.Assert_FeeWaiverRequestTitle();
		ems.Expand_FeeWaiverRequest();
		ems.Assert_FeeWaiverRequest();
		ExtentTestManager.endTest();
	}

	@Test(priority = 102, description = "Verify Application Form Fee Waiver Request Required Fields", enabled = true)
	public void EMSProvider_FeeWaiverRequest_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Fee Waiver Request Required Fields");
		ExcelUtil.setCurrentRow(102, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.FeeWaiverRequest_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 103, description = "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values", enabled = true)
	public void EMSProvider_FeeWaiverRequest_FederalPovertyDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values");
		ExcelUtil.setCurrentRow(103, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Assert_FederalPovertyDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 104, description = "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.", enabled = true)
	public void EMSProvider_FeeWaiverRequest_HouseHoldIncomeDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.");
		ExcelUtil.setCurrentRow(104, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		ems.Assert_HouseHoldIncomeDropd();

		ExtentTestManager.endTest();
	}

	@Test(priority = 105, description = "Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types", enabled = true)
	public void AEMT_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types");
		ExcelUtil.setCurrentRow(105, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.AssertEquals_Attachment();
		page.ClickAttachmentType();
		page.AssertEquals_AttachmentTypes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 106, description = "Verify to Click Upload attachments without File system must display Popup Message ", enabled = true)
	public void AEMT_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Upload attachments without File system must display Popup Message ");
		ExcelUtil.setCurrentRow(106, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 107, description = "Verify to Click Attachment Delete Functions", enabled = true)
	public void AEMT_EMS_AttachmentsDelete(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Attachment Delete Functions");
		ExcelUtil.setCurrentRow(107, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		// page.IsNotDisplayed_Delete();
		ExtentTestManager.endTest();
	}

	@Test(priority = 108, description = "Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description", enabled = true)
	public void AEMT_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description");
		ExcelUtil.setCurrentRow(108, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.ClickAttachmentType();
		page.SelectAttachmentType_CourseMaterials();
		page.Enter_Description();
		page.Click_ChooseFile();
		page.UploadFile();
		page.ClickUploadAttachment();
		page.IsDisplayed_View();
		ExtentTestManager.endTest();
	}

	@Test(priority = 109, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void AEMT_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
		ExcelUtil.setCurrentRow(109, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}

	@Test(priority = 110, description = "Verify Terms and Conditions Page", enabled = true)
	public void AEMT_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(110, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 111, description = "Verify to Click Continue button without checking the checkbox", enabled = true)
	public void AEMT_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without checking the checkbox");
		ExcelUtil.setCurrentRow(111, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 112, description = "Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.", enabled = true)
	public void AEMT_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.");
		ExcelUtil.setCurrentRow(112, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 113, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void AEMT_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(113, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 114, description = "Verify the EMS Provider program with the AEMT Program Fees.", enabled = true)
	public void Verify_AEMT_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program with the AEMT Program Fees.");
		ExcelUtil.setCurrentRow(114, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 115, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void AEMT_EMS_PayLaterAlertAccept(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(115, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 116, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void AEMT_EMS_PayLaterAlertDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(116, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 117, description = "To Verify Pay Later Options Click Pay Later dropdown", enabled = true)
	public void AEMT_EMS_PayLaterOptions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Pay Later Options Click Pay Later dropdown");
		ExcelUtil.setCurrentRow(117, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}

	@Test(priority = 118, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void AEMT_EMS_NavPayLaterDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(118, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Check();
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 119, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void NavPayLaterAccept_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(119, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}

	@Test(priority = 120, description = "To Verify Pay Now button it must navigate to Another Make Payment page.", enabled = true)
	public void VerifyPayNow_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Another Make Payment page.");
		ExcelUtil.setCurrentRow(120, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 121, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(121, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 122, description = "To Verify Pay Now button it must navigate to Iowa Payment Website.", enabled = true)
	public void PayNowbutton_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(122, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 123, description = "To Verify Click Continue without filling mandatory fields.", enabled = true)
	public void InvalidPaymentContinue_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Click Continue without filling mandatory fields.");
		ExcelUtil.setCurrentRow(123, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_RequiredError();
		ExtentTestManager.endTest();
	}

	@Test(priority = 124, description = "To Verify Invalid Card Number for the payment information and click 'Continue' to proceed.", enabled = true)
	public void InvalidCardNumPayment_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Invalid Card Number for the payment information and click 'Continue' to proceed.");
		ExcelUtil.setCurrentRow(124, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.InvalidEnter_CardNum();
		page.Click_PaymentContinue();
		page.Assert_InvalidCardNum();
		ExtentTestManager.endTest();
	}

	@Test(priority = 125, description = "Verify the payment information and click 'Continue' to proceed.", enabled = true)
	public void ValidPaymentContinue_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the payment information and click 'Continue' to proceed.");
		ExcelUtil.setCurrentRow(125, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 126, description = "To Review the Payment and Click Confirm to Proceed.", enabled = true)
	public void ReviewPaymentConfirm_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Review the Payment and Click Confirm to Proceed.");
		ExcelUtil.setCurrentRow(126, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_ContinuePayment();
		page.Assert_ReviewPayment();
		page.Click_Confirm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 127, description = "To Verify Payment Confirmation Page", enabled = true)
	public void PaymentConfirmation_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Payment Confirmation Page");
		ExcelUtil.setCurrentRow(127, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 128, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(128, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_ReceiptAEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 129, description = "To Verify to Enter Duplicate EMS Provider with AEMT Program.", enabled = true)
	public void ApplyforProgramDuplicate_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify to Enter Duplicate EMS Provider with AEMT Program.");
		ExcelUtil.setCurrentRow(129, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickMyPrograms();
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_AEMT_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.ApplyingDuplicateLicese();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 130, description = "Verify to apply for the program EMS Provider with EMR subtype.", enabled = true)
	public void Verify_EMR_ProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply for the program EMS Provider with EMR subtype.");
		ExcelUtil.setCurrentRow(130, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMR_ProgramDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 131, description = "Verify to Apply EMR Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void Apply_EMR_ProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Apply EMR Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(131, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 132, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void Apply_EMR_ProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(132, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 133, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void Apply_EMR_ProgramPopupOKbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(133, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 134, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApply_EMR_ProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the alert message if you try to apply for a program without completing the Application Forms.");
		ExcelUtil.setCurrentRow(134, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.Click_Checkbox();
		page.ClickContinue();
		page.Assert_Incomplete_Popup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 135, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyFor_EMR_ProgramEdit(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(135, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 136, description = "Verify the display Fields on the Application Form", enabled = true)
	public void EMR_ApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(136, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 137, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMR_ApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(137, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 138, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMR_EMSProviderAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(138, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 139, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMR_EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(139, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 140, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMR_EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
		ExcelUtil.setCurrentRow(140, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.YesMedicalCondition();
		backflow.YesIllegal();
		backflow.YesMisdemeanor();
		backflow.YesJurisdiction();
		backflow.YesJudgement();
		backflow.YesLicense();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.AffirmationDetails_RequiredPopup();
		page.ClickOk();
		backflow.Affirmations_Text();
		page.ClickAffirmations();
		ExtentTestManager.endTest();
	}

	@Test(priority = 141, description = "Verify the Application Form Personal Information Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Personal Information Questions for EMS Providers");
		ExcelUtil.setCurrentRow(141, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_PersonalInformationTitle();
		ems.Expand_PersonalInformation();
		ems.Assert_PersonalInformation_Gender();
		ems.Assert_PersonalInformation_Veteran();
		ExtentTestManager.endTest();
	}

	@Test(priority = 142, description = "Verify EMS Providers Personal Information Required Fields", enabled = true)
	public void EMR_EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Personal Information Required Fields");
		ExcelUtil.setCurrentRow(142, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();

		ExtentTestManager.endTest();
	}

	@Test(priority = 143, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
	public void EMR_Enter_PersonalInformation_EMSProvider(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Personal Informations Gender field dropdown Values");
		ExcelUtil.setCurrentRow(143, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_GenderDropd();
		ems.Assert_GenderDropd();
		ems.Select_FemaleGender();
		ems.Click_Veteran();
		ems.Expand_PersonalInformation();
		ExtentTestManager.endTest();
	}

	@Test(priority = 144, description = "Verify the Application Form Current National Registry Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Current National Registry Questions for EMS Providers");
		ExcelUtil.setCurrentRow(144, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CurrentNationalRegistryTitle();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_CurrentNationalRegistry();
		ExtentTestManager.endTest();
	}

	@Test(priority = 145, description = "Verify Current National Registry dropdown values", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistryDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Current National Registry dropdown values");
		ExcelUtil.setCurrentRow(145, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CurrentNationaRegistry();
		ems.Assert_CurrentNationalRegistryDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 146, description = "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry_NREMTBlank(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.");
		ExcelUtil.setCurrentRow(146, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.select_CurrentNationalRegistryDropd();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_NREMTBlank();
		ExtentTestManager.endTest();
	}

	@Test(priority = 147, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry_NREMTDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.");
		ExcelUtil.setCurrentRow(147, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Enter_NREMTNumberTextbox();
		ems.Enter_PastExpirationDate();
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_NREMTExpiryDate();
		ExtentTestManager.endTest();
	}

	@Test(priority = 148, description = "Verify the Application Form Provider Disaster Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_ProviderDisaster(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Provider Disaster Questions for EMS Providers");
		ExcelUtil.setCurrentRow(148, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Enter_FutureExpirationDate();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_ProviderDisasterTitle();
		ems.Expand_ProviderDisaster();
		ems.Assert_ProviderDisaster();
		ExtentTestManager.endTest();
	}

	@Test(priority = 149, description = "Verify Application Form Provider Disaster Required Fields", enabled = true)
	public void EMR_EMSProvider_ProviderDisaster_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Provider Disaster Required Fields");
		ExcelUtil.setCurrentRow(149, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 150, description = "Verify the Application Form Fee Waiver Request Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Fee Waiver Request Questions for EMS Providers");
		ExcelUtil.setCurrentRow(150, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		ems.Assert_FeeWaiverRequestTitle();
		ems.Expand_FeeWaiverRequest();
		ems.Assert_FeeWaiverRequest();
		ExtentTestManager.endTest();
	}

	@Test(priority = 151, description = "Verify Application Form Fee Waiver Request Required Fields", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Fee Waiver Request Required Fields");
		ExcelUtil.setCurrentRow(151, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.FeeWaiverRequest_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 152, description = "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_FederalPovertyDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values");
		ExcelUtil.setCurrentRow(152, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Assert_FederalPovertyDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 153, description = "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_HouseHoldIncomeDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.");
		ExcelUtil.setCurrentRow(153, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		ems.Assert_HouseHoldIncomeDropd();

		ExtentTestManager.endTest();
	}

	@Test(priority = 154, description = "Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types", enabled = true)
	public void EMR_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types");
		ExcelUtil.setCurrentRow(154, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.AssertEquals_Attachment();
		page.ClickAttachmentType();
		page.AssertEquals_AttachmentTypes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 155, description = "Verify to Click Upload attachments without File system must display Popup Message ", enabled = true)
	public void EMR_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Upload attachments without File system must display Popup Message ");
		ExcelUtil.setCurrentRow(155, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 156, description = "Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description", enabled = true)
	public void EMR_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description");
		ExcelUtil.setCurrentRow(156, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		page.ClickAddNewAttachment();
		page.ClickAttachmentType();
		page.SelectAttachmentType_CourseMaterials();
		page.Enter_Description();
		page.Click_ChooseFile();
		page.UploadFile();
		page.ClickUploadAttachment();
		page.IsDisplayed_View();
		ExtentTestManager.endTest();
	}

	@Test(priority = 157, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void EMR_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
		ExcelUtil.setCurrentRow(157, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}

	@Test(priority = 158, description = "Verify Terms and Conditions Page", enabled = true)
	public void EMR_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(158, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 159, description = "Verify to Click Continue button without checking the checkbox", enabled = true)
	public void EMR_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without checking the checkbox");
		ExcelUtil.setCurrentRow(159, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 160, description = "Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.", enabled = true)
	public void EMR_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.");
		ExcelUtil.setCurrentRow(160, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 161, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void EMR_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(161, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 162, description = "Verify the EMS Provider program with the AEMT Program Fees.", enabled = true)
	public void Verify_EMR_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program with the AEMT Program Fees.");
		ExcelUtil.setCurrentRow(162, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 163, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void EMR_EMS_PayLaterAlertAccept(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(163, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 164, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void EMR_EMS_PayLaterAlertDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(164, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 165, description = "To Verify Pay Later Options Click Pay Later dropdown", enabled = true)
	public void EMR_EMS_PayLaterOptions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Pay Later Options Click Pay Later dropdown");
		ExcelUtil.setCurrentRow(165, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}

	@Test(priority = 166, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void EMR_EMS_NavPayLaterDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(166, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Check();
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 167, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void NavPayLaterAccept_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(167, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}

	@Test(priority = 168, description = "To Verify Pay Now button it must navigate to Another Make Payment page.", enabled = true)
	public void VerifyPayNow_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Another Make Payment page.");
		ExcelUtil.setCurrentRow(168, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 169, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(169, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 170, description = "To Verify Pay Now button it must navigate to Iowa Payment Website.", enabled = true)
	public void PayNowbutton_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(170, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 171, description = "Verify the payment information and click 'Continue' to proceed.", enabled = true)
	public void ValidPaymentContinue_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the payment information and click 'Continue' to proceed.");
		ExcelUtil.setCurrentRow(171, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		page.Click_ContinuePayment();
		page.Click_Confirm();
		page.Assert_Confirmation();
		ExtentTestManager.endTest();
	}

	@Test(priority = 172, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(172, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Receipt_EMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 173, description = "To Verify to Enter Duplicate EMS Provider with EMR Program.", enabled = true)
	public void ApplyforProgramDuplicate_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify to Enter Duplicate EMS Provider with EMR Program.");
		ExcelUtil.setCurrentRow(173, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickMyPrograms();
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMR_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.ApplyingDuplicateLicese();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 174, description = "Verify to apply for the program EMS Provider with EMS Student subtype.", enabled = true)
	public void Verify_EMSStudent_Program(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply for the program EMS Provider with EMS Student subtype.");
		ExcelUtil.setCurrentRow(174, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMSStudent_ProgramDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 175, description = "Verify to Apply EMS Student Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void Apply_EMSStudent_ProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Apply EMS Student Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(175, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 176, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void Apply_EMSStudent_ProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(176, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 177, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void Apply_EMSStudent_ProgramPopupOKbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(177, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 178, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApply_EMSStudent_ProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the alert message if you try to apply for a program without completing the Application Forms.");
		ExcelUtil.setCurrentRow(178, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.Click_Checkbox();
		page.ClickContinue();
		page.Assert_Incomplete_Popup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 179, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyFor_EMSStudent_ProgramEdit(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(179, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 180, description = "Verify the display Fields on the Application Form", enabled = true)
	public void EMSStudent_ApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(180, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 181, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMSStudent_ApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(181, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMSStudent();
		ExtentTestManager.endTest();
	}

	@Test(priority = 182, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMSStudent_EMSProviderAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(182, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 183, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSStudent_EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(183, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 184, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMSStudent_EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
		ExcelUtil.setCurrentRow(184, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.YesMedicalCondition();
		backflow.YesIllegal();
		backflow.YesMisdemeanor();
		backflow.YesJurisdiction();
		backflow.YesJudgement();
		backflow.YesLicense();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		backflow.AffirmationDetails_RequiredPopup();
		page.ClickOk();
		backflow.Affirmations_Text();
		page.ClickAffirmations();
		ExtentTestManager.endTest();
	}

	@Test(priority = 185, description = "Verify the Application Form Personal Information Questions for EMS Providers", enabled = true)
	public void EMSStudent_EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Personal Information Questions for EMS Providers");
		ExcelUtil.setCurrentRow(185, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_PersonalInformationTitle();
		ems.Expand_PersonalInformation();
		ems.Assert_PersonalInformation_Gender();
		ExtentTestManager.endTest();
	}

	@Test(priority = 186, description = "Verify EMS Providers Personal Information Required Fields", enabled = true)
	public void EMSStudent_EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Personal Information Required Fields");
		ExcelUtil.setCurrentRow(186, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 187, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
	public void EMSStudent_Enter_PersonalInformation_EMSProvider(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Personal Informations Gender field dropdown Values");
		ExcelUtil.setCurrentRow(187, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_GenderDropd();
		ems.Assert_GenderDropd();
		ems.Select_FemaleGender();
		ems.Expand_PersonalInformation();
		ExtentTestManager.endTest();
	}

	@Test(priority = 188, description = "Verify the Application Form Course Details Questions for EMS Providers", enabled = true)
	public void EMSStudent_EMSProvider_CourseDetails (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Course Details Questions for EMS Providers");
		ExcelUtil.setCurrentRow(188, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CourseDetailsTitle();
		ems.Expand_CourseDetails();
		ems.Assert_CourseSelection();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 189, description = "Verify EMS Providers Course Details Required Fields", enabled = true)
	public void EMSStudent_EMSProvider_CourseDetails_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Course Details Required Fields");
		ExcelUtil.setCurrentRow(189, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.CourseSelection_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 190, description = "Verify AEMT must have an active EMT License", enabled = true)
	public void EMSStudent_EMSProvider_CourseSelectionDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify AEMT must have an active EMT License");
		ExcelUtil.setCurrentRow(190, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CourseSelectionDropd();
		ems.Assert_CourseSelectionDropd();
		ems.Select_AEMT_ProgramDetail();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_AEMTActive();
		ExtentTestManager.endTest();
	}

	@Test(priority = 191, description = "Verify Paramedic must have an active AEMT or EMT License", enabled = true)
	public void EMSStudent_Paramedic(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Paramedic must have an active AEMT or EMT License");
		ExcelUtil.setCurrentRow(191, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CourseSelectionDropd();
		ems.Select_Paramedic_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_ParamedicsActive();
		ExtentTestManager.endTest();
	}

	@Test(priority = 192, description = "Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types", enabled = true)
	public void EMSStudent_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types");
		ExcelUtil.setCurrentRow(192, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CourseSelectionDropd();
		ems.Select_EMR_ProgramDetail();
		ems.Expand_CourseDetails();
		page.ClickAddNewAttachment();
		page.AssertEquals_Attachment();
		page.ClickAttachmentType();
		page.AssertEquals_AttachmentTypes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 193, description = "Verify to Click Upload attachments without File system must display Popup Message ", enabled = true)
	public void EMSStudent_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Upload attachments without File system must display Popup Message ");
		ExcelUtil.setCurrentRow(193, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 194, description = "Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description", enabled = true)
	public void EMSStudent_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description");
		ExcelUtil.setCurrentRow(194, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		page.ClickAddNewAttachment();
		page.ClickAttachmentType();
		page.SelectAttachmentType_InstructorMaterials();
		page.Enter_InstructorMaterials_Desp();
		page.Click_ChooseFile();
		page.UploadFile();
		page.ClickUploadAttachment();
		page.IsDisplayed_View();
		ExtentTestManager.endTest();
	}

	@Test(priority = 195, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void EMSStudent_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
		ExcelUtil.setCurrentRow(195, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}

	@Test(priority = 196, description = "Verify Terms and Conditions Page", enabled = true)
	public void EMSStudent_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(196, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 197, description = "Verify to Click Continue button without checking the checkbox", enabled = true)
	public void EMSStudent_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without checking the checkbox");
		ExcelUtil.setCurrentRow(197, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 198, description = "Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.", enabled = true)
	public void EMSStudent_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.");
		ExcelUtil.setCurrentRow(198, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 199, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void EMSStudent_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(199, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_NOPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 200, description = "Verify the EMS Provider program with the EMS Student Program Fees.", enabled = true)
	public void Verify_EMSStudent_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program with the EMS Student Program Fees.");
		ExcelUtil.setCurrentRow(200, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_NoFees();
		ExtentTestManager.endTest();
	}

	/*
	 * 
	 * //Eswar testcases
	 * 
	 * @Test(priority = 79, description = "verifying texts for first page") //
	 * public void verifyFirstPage(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Verifying texts for first page."); ExcelUtil.setCurrentRow(2, 4); SignInPage
	 * page = new SignInPage(driver); page.logout(); page.AssertEquals_firstpage();
	 * ExtentTestManager.endTest(); }
	 * 
	 * @Test(priority = 80, description = "verifying texts for signin page")//
	 * public void verifySigninPage(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Verifying texts for signin page."); ExcelUtil.setCurrentRow(3, 4);
	 * SignInPage page = new SignInPage(driver); page.signin_page_txt_verify();
	 * ExtentTestManager.endTest(); }
	 * 
	 * @Test(priority = 81, description =
	 * "Navigating to New user Registration Page")// public void
	 * navigateToNewUserRegistrationPage(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Navingating to New user Registration Page"); ExcelUtil.setCurrentRow(8,4);
	 * NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
	 * page.navigateToRegPage(); ExtentTestManager.endTest(); }
	 * 
	 * @Test(priority = 82, description = "Verifying New user Registeration Page")//
	 * public void verifyNewUserRegistrationPage(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Verifying New user Registration Page"); ExcelUtil.setCurrentRow(9,4);
	 * NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
	 * page.verifyNavigationToRegPage(); ExtentTestManager.endTest(); }
	 * 
	 * @Test(priority = 83, description =
	 * "Verifying New user Registeration Page texts") public void
	 * verifyNewUserRegistrationPagetxts(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Verifying New user Registration Page texts"); ExcelUtil.setCurrentRow(10,4);
	 * NewUserRegistrationPage page = new NewUserRegistrationPage(driver);
	 * page.verifyNewUserRegPage(); ExtentTestManager.endTest(); }
	 * 
	 * @Test(priority = 84, description =
	 * "Verifying New user Registeration Page without Entering any credentials")
	 * public void verifyNewUserRegistrationPagewithoutEneteringCredentials(Method
	 * method) { ExtentTestManager.startTest(method.getName(),
	 * "Verifying New user Registeration Page without Entering any credentials");
	 * ExcelUtil.setCurrentRow(11,4); NewUserRegistrationPage page = new
	 * NewUserRegistrationPage(driver);
	 * page.verifyRegisterWithoutEnteringCredentials(); ExtentTestManager.endTest();
	 * }
	 * 
	 * @Test(priority = 85, description =
	 * "Verifying New user Registeration Page Alert Text") public void
	 * verifyNewUserRegistrationPageAlertTxt(Method method) {
	 * ExtentTestManager.startTest(method.getName(),
	 * "Verifying New user Registeration Page without Alert Text");
	 * ExcelUtil.setCurrentRow(11,4); NewUserRegistrationPage page = new
	 * NewUserRegistrationPage(driver); page.verifyRegisteAlerttxt();
	 * ExtentTestManager.endTest(); }
	 */
}

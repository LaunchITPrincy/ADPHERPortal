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
import pages.ProgramBackflowTesterPage;
import pages.PublicSearchPage;
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

		ExtentTestManager.startTest(method.getName(), "Verify that you have entered a valid licence number and that the search results are correct.");
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

		ExtentTestManager.startTest(method.getName(), "Verify the display fields on the Public Search Detail Page by clicking the 'Details' link in the 'Public details' column.");
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

		ExtentTestManager.startTest(method.getName(), "Verify By entering an invalid licence number and clicking the 'Search' button");
		ExcelUtil.setCurrentRow(14, 4);

		PublicSearchPage page = new PublicSearchPage(driver);
		page.InvalidSearchData();
		page.AssertEquals_InvalidPublicSearchResult();
		page.ClickReset();
		ExtentTestManager.endTest();
	}

	@Test(priority = 15, description = "Verify By entering an invalid search input value and clicking the 'Search' button.", enabled = true)
	public void VerifySecondInvalidSearch(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify By entering an invalid search input value and clicking the 'Search' button.");
		ExcelUtil.setCurrentRow(15, 4);

		PublicSearchPage page = new PublicSearchPage(driver);
		page.InvalidSearchInputValue();
		page.AssertEquals_InvalidPublicSearchMessage();
		page.ClickReset();
		ExtentTestManager.endTest();
	}

	@Test(priority = 16, description = "Verify It must navigate to the Course search criteria Page by clicking the 'Course search' button.", enabled = true)
	public void VerifyCourseSearchButtons(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify It must navigate to the Course search criteria Page by clicking the 'Course search' button.");
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

		ExtentTestManager.startTest(method.getName(),
				"Verify the search results for a valid Course Search.");
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

		ExtentTestManager.startTest(method.getName(), "Verify whether the Apply for a Program Fields are displayed or not.");
		ExcelUtil.setCurrentRow(29, 4);
		
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplyProgrampage();
		
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 30, description = "Verify By clicking the Cancel button in the Apply for a Program section, you should be directed to My Programs.", enabled = true)
	public void ApplyForProgramCancel(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking the Cancel button in the Apply for a Program section, you should be directed to My Programs.");
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

	@Test(priority = 32, description = "In the Apply Program Page, verify the Program dropdown values." , enabled = true)
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

		ExtentTestManager.startTest(method.getName(), "Verify the Apply for a Program without entering a value in the Program Detail");
		ExcelUtil.setCurrentRow(33, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramBackFlowTester();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 34, description = "In the Apply Program Page, verify the BackFlow Tester Program Detail dropdown values.", enabled = true)
	public void VerifyBackFlowProgramDetailsDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"In the Apply Program Page, verify the BackFlow Tester Program Detail dropdown values.");
		ExcelUtil.setCurrentRow(34, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
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

		ExtentTestManager.startTest(method.getName(), "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(36, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 37, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void ApplyforProgramPopupOKbutton(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
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

		ExtentTestManager.startTest(method.getName(), "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
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

		ExtentTestManager.startTest(method.getName(), "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
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

		ExtentTestManager.startTest(method.getName(), "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
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

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Third-Party Certification Questions for Backflow Testers");
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

		ExtentTestManager.startTest(method.getName(), "Verify Backflow Tester Third Party Certification  Required Fields");
		ExcelUtil.setCurrentRow(46, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.ThridPartyCertification_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 47, description = "Verify If all of the Third Party Certification questions are answered 'yes', then the Third Party Certification text fields must be required.", enabled = true)
	public void BackflowTester_ThridPartyCertification_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If all of the Third Party Certification questions are answered 'yes', then the Third Party Certification text fields must be required.");
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

		ExtentTestManager.startTest(method.getName(), "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.");
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

		ExtentTestManager.startTest(method.getName(), "Verify Back Flow Tester Out of State Credentials or Training Questions.");
		ExcelUtil.setCurrentRow(49, 4);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Training();
		backflow.ClickOutOfState();
		backflow.AssertEquals_OutofState_BackFlowTester();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 50, description = "Verify Back Flow Tester Out of State Credentials or Training  Required Fields", enabled = true)
	public void BackflowTester_OutOfStateCredentials_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Back Flow Tester Out of State Credentials or Training  Required Fields");
		ExcelUtil.setCurrentRow(50, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.OutOfState_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 51, description = "Verify If all of the Back Flow Tester Out of State Credentials or Training questions are answered 'yes', then the Back Flow Tester Out of State Credentials or Training text fields must be required.", enabled = true)
	public void BackflowTester_OutOfStateCredentials_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If all of the Back Flow Tester Out of State Credentials or Training questions are answered 'yes', then the Back Flow Tester Out of State Credentials or Training text fields must be required.");
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
		//page.IsNotDisplayed_Delete();
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

		ExtentTestManager.startTest(method.getName(), "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
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

		ExtentTestManager.startTest(method.getName(), "Verify without agreeing to the terms and conditions, try to click the continue button.");
		ExcelUtil.setCurrentRow(60, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 61, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void ValidAgreeTerms(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
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

		ExtentTestManager.startTest(method.getName(), "Verify to Accept the Alert Message by clicking the Pay Later button.");
		ExcelUtil.setCurrentRow(64, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 65, description = "Verify to Dismiss the Alert Message by clicking the Pay Later button.", enabled = true)
	public void PayLaterAlertDismiss(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to Dismiss the Alert Message by clicking the Pay Later button.");
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

		ExtentTestManager.startTest(method.getName(), "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and then click Dismiss.");
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

		ExtentTestManager.startTest(method.getName(), "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and you must accept it.");
		ExcelUtil.setCurrentRow(68, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 69, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
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

		ExtentTestManager.startTest(method.getName(), "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
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

		ExtentTestManager.startTest(method.getName(), "Verify that you can click the Continue button without entering your payment information.");
		ExcelUtil.setCurrentRow(72, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_RequiredError();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 73, description = "Verify to enter Invalid Card Number for the payment information.", enabled = true)
	public void InvalidCardNumPayment(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter Invalid Card Number for the payment information.");
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

		ExtentTestManager.startTest(method.getName(), "To Verify If Payment Successful system must navigate to Payment Receipt Page.");
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
	
}

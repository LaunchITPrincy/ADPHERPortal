package core.Tests.IDPH;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.ApplyProgramPage;
import pages.ProgramBackflowTesterPage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.Config;
import utils.Helper.ExcelUtil;

public class ApplyProgramBackFlowTester extends BaseTest {

	@BeforeTest
	public void setupTestData() {
		
		ExcelUtil.setExcelFileSheet("TestCases");
	}
	
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

	@Test(priority = 3, description = "Verify Apply for Program displayed or Not", enabled = true)
	public void ApplyForProgramNavigation(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify by clicking Apply For a Program Page it's Navigating");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 4, description = "Verify Apply for a Program Display Fields", enabled = true)
	public void ApplyForProgramDisplayFields(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Apply for a Program Fields is displayed or Not");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplyProgrampage();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 5, description = "Verify Apply for a Program Cancel button", enabled = true)
	public void ApplyForProgramCancel(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking Cancel button in Apply for a Program it should Navigate to My Programs");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickCancel();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 6, description = "Verify Apply Program without input values", enabled = true)
	public void WithoutValuesApplyforProgram(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without entering data");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();	
		ExtentTestManager.endTest();
	}

	@Test(priority = 7, description = "Verify Program Field Dropdown Values" , enabled = true)
	public void VerifyProgramDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Program dropdown values in the Apply Program Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.ClickProgram();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ProgramDropd();	
		ExtentTestManager.endTest();
	}

	@Test(priority = 8, description = "Verify Apply Program without Entering Value in ProgramDetail", enabled = true)
	public void WithoutProgramDetailApplyforProgram(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without entering data in ProgramDetail Field");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramBackFlowTester();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 9, description = "Verify BackFlow Tester Program Detail Field Dropdown Values", enabled = true)
	public void VerifyBackFlowProgramDetailsDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify BackFlow Tester Program Detail dropdown values in the Apply Program Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickProgramDetail();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_BackFlow_ProgramDetail();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 10, description = "Verify Apply for a Program Popup Message", enabled = true)
	public void ApplyforProgramPopup(Method method) {

		ExtentTestManager.startTest(method.getName(), "Validating message for applying a Program");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.SelectProgramDetailBackFlow();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 11, description = "Verify Apply for a Program Popup Cancel button", enabled = true)
	public void ApplyforProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By Clicking Cancel button in the Popup should remains the ApplyProgram Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 12, description = "Verify Apply for a Program Popup OK button", enabled = true)
	public void ApplyforProgramPopupOKbutton(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By Clicking OK button in the Popup it should Navigate to Application Form  Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}
	
	
	@Test(priority = 13, description = "Verify Without filling Application Forms ", enabled = true)
	public void VerifyInCompleteApplyProgramDropdownValues(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Continue button in the Terms and Conditions page without filling the Application Forms");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.Click_Checkbox();
		page.ClickContinue();
		page.Assert_Incomplete_Popup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 14, description = "Verify Apply for a Program Edit Page", enabled = true)
	public void ApplyForProgramEdit(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking OK button in Terms Page it should Navigate to My Programs");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}
	
	
	@Test(priority = 15, description = "Verify Application Form Display Fields", enabled = true)
	public void ApplicationFormDisplayFields(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Display Fields");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 16, description = "Verify Application Form Program Type", enabled = true)
	public void ApplicationFormProgramType(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Program Type and Subtype must display based on the ApplyProgram page selection");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ApplicationForm_BackFlow();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 17, description = "Verify Backflow Tester Affirmations Display Fields", enabled = true)
	public void BackflowTesterAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Backflow Tester Affirmation Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 18, description = "Verify Backflow Tester Affirmations Required Fields", enabled = true)
	public void BackflowTester_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Affirmations Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 19, description = "Verify Backflow Tester Affirmations Answering as YES", enabled = true)
	public void BackflowTester_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Affirmations Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 20, description = "Verify Backflow Tester Third Party Certification Display Fields", enabled = true)
	public void BackflowTesterThirdPartyCertification(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Backflow Tester Third Party Certification Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ThirdPartyCertification();
		page.ClickThirdPartyCertification();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_ThirdPartyCertification_BackFlowTester();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 21, description = "Verify Backflow Tester Third Party Certification Required Fields", enabled = true)
	public void BackflowTester_ThirdPartyCertification_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Third Party Certification Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.ThridPartyCertification_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 22, description = "Verify Backflow Tester ThridPartyCertification Answering as YES", enabled = true)
	public void BackflowTester_ThridPartyCertification_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form ThridPartyCertification Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 23, description = "Verify to answer Expiration Date as past Date", enabled = true)
	public void ThridPartyCertification_ExpirationDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Certification cannot be Expired Popup Message");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 24, description = "Verify Backflow Tester Out Of State Credentials Display Fields", enabled = true)
	public void BackflowTesterOutOfStateCredentials(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Back Flow Tester Out of State Credentials or Training Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Training();
		backflow.ClickOutOfState();
		backflow.AssertEquals_OutofState_BackFlowTester();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 25, description = "Verify Backflow Tester Out Of State Credentials Required Fields", enabled = true)
	public void BackflowTester_OutOfStateCredentials_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Out Of State Credentials Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.OutOfState_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 26, description = "Verify Backflow Tester Out Of State Credentials Answering as YES", enabled = true)
	public void BackflowTester_OutOfStateCredentials_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Out Of State Credentials Required Questions");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 27, description = "Verify to answer Expiration Date as past Date", enabled = true)
	public void OutOfStateCredentials_ExpirationDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Certification cannot be Expired Popup Message");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 28, description = "Verify to answer Course Date as Future Date", enabled = true)
	public void OutOfStateCredentials_InvalidCourseDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Out of State Courses must be completed to be valid Popup Message");
		ExcelUtil.setCurrentRow(28, 3);
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

	@Test(priority = 29, description = "Verify attachment display fields", enabled = true)
	public void AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to click add new attachment and display fields");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAddNewAttachment();
		page.AssertEquals_Attachment();
		page.ClickAttachmentType();
		page.AssertEquals_AttachmentTypes();
		ExtentTestManager.endTest();
	}

	@Test(priority = 30, description = "Verify upload attachments without documents", enabled = true)
	public void UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to click upload attachments without filling mandatory questions");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 31, description = "Verify to Delete attachments", enabled = true)
	public void AttachmentsDelete(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to click Delete button in the attachments");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		//page.IsNotDisplayed_Delete();
		ExtentTestManager.endTest();
	}
	
	
	@Test(priority = 32, description = "Verify upload attachments with documents", enabled = true)
	public void UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to click upload attachments with filling mandatory questions");
		ExcelUtil.setCurrentRow(28, 3);
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
	
	@Test(priority = 33, description = "Verify Terms and Conditions Page Navigating", enabled = true)
	public void NavTermsAndConditions(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to click Continue Button it should navigate to Terms and Conditions Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 34, description = "Verify Terms and Conditions Page", enabled = true)
	public void TermsAndConditionsText(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Text");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 35, description = "Verify Agree message Popup", enabled = true)
	public void WithoutAgreeTerms(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to click Continue button without Checking Terms and Conditions CheckBox");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 36, description = "Verify Terms and Conditions Navigating", enabled = true)
	public void ValidAgreeTerms(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to click Continue button with Checking Terms and Conditions CheckBox");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		//page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 37, description = "Verify Make Payment Page Display fields", enabled = true)
	public void VerifyMakePaymentFields(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify Make Payment page display fields");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 38, description = "Verify Make Payment Page Display fields", enabled = true)
	public void VerifyBackFlowPayment(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify BackFlow Tester Make Payment page display fields");
		ExcelUtil.setCurrentRow(28, 3);
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_Backflow_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 39, description = "Verify Alert Message Accept", enabled = true)
	public void PayLaterAlertAccept(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to Alert Message Accept for clicking Pay Later button");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 40, description = "Verify Alert Message Dimiss ", enabled = true)
	public void PayLaterAlertDismiss(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to Alert Message Dimiss for clicking Pay Later button");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 41, description = "Verify Pay Later Options", enabled = true)
	public void PayLaterOptions(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Pay Later Options");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 42, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void NavPayLaterDismiss(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Check();
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 43, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void NavPayLaterAccept(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 44, description = "Verify to Click Pay Now button it should navigate to another Make Payment page.", enabled = true)
	public void VerifyPayNow(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Pay Now button it should navigate to another Make Payment page.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_Backflow_MakePayment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 45, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 46, description = "To Verify Pay Now button it must navigate to Iowa Payment Website.", enabled = true)
	public void PayNowbutton(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Pay Now button it must navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_BackFlow_PaymentWebsite();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 47, description = "To Verify Click Continue without filling mandatory fields.", enabled = true)
	public void InvalidPaymentContinue(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Click Continue without filling mandatory fields.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_RequiredError();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 48, description = "To Verify Invalid Card Number for the payment information and click Continue to proceed.", enabled = true)
	public void InvalidCardNumPayment(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Invalid Card Number for the payment information and click Continue to proceed.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.InvalidEnter_CardNum();
		page.Click_PaymentContinue();
		page.Assert_InvalidCardNum();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 49, description = "Verify the payment information and click Continue to proceed.", enabled = true)
	public void ValidPaymentContinue(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the payment information and click Continue to proceed.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 50, description = "To Review the Payment and Click Confirm to Proceed.", enabled = true)
	public void ReviewPaymentConfirm(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Review the Payment and Click Confirm to Proceed.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_ContinuePayment();
		page.Assert_ReviewPayment();
		page.Click_Confirm();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 51, description = "To Verify Payment Confirmation Page", enabled = true)
	public void PaymentConfirmation(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify Payment Confirmation Page");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 52, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(28, 3);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Assert_ReceiptBackFlow();
		ExtentTestManager.endTest();
	}

	@Test(priority = 53, description = "Verify to Apply Duplicate Licensing Program ", enabled = true)
	public void ApplyforProgramDuplicate(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply Duplicate Program");
		ExcelUtil.setCurrentRow(28, 3);
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

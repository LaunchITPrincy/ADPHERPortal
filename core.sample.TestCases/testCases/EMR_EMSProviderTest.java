package testCases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.ApplyProgramPage;
import pages.ProgramBackflowTesterPage;
import pages.ProgramEMSProviderPage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.Config;
import utils.Helper.ExcelUtil;

public class EMR_EMSProviderTest extends BaseTest {

	@BeforeTest
	public void setupTestData() {

		ExcelUtil.setExcelFileSheet("TestCases");
	}

	@Test(priority = 0, description = "Load ADPER URL in browser successfully")
	public void load_ADPER_Portal(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify ADPER URL is loaded Successfully");
		ExcelUtil.setCurrentRow(78, 4);
		homePage.goToADPER().NavSignIn().loginToADPER(Config.getInstance().getProperty("app.username"),
				Config.getInstance().getProperty("app.password")).verifyLogin(true);
		ExtentTestManager.endTest();
	}

	@Test(priority = 1, description = "Verify to apply for the program EMS Provider with EMR subtype.", enabled = true)
	public void Verify_EMR_ProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply for the program EMS Provider with EMR subtype.");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMR_ProgramDetail();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 2, description = "Verify to Apply EMR Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void Apply_EMR_ProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Apply EMR Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(82, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 3, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void Apply_EMR_ProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(83, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 4, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void Apply_EMR_ProgramPopupOKbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(84, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 5, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApply_EMR_ProgramDropdownValues(Method method) throws InterruptedException {

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

	@Test(priority = 6, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyFor_EMR_ProgramEdit(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(86, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 7, description = "Verify the display Fields on the Application Form", enabled = true)
	public void EMR_ApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(87, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 8, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMR_ApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 9, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMR_EMSProviderAffirmations(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(89, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Affirmation();
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.AssertEquals_Affirmation_BackFlowTester();
		ExtentTestManager.endTest();
	}

	@Test(priority = 10, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMR_EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 11, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMR_EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

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

	@Test(priority = 12, description = "Verify the Application Form Personal Information Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Personal Information Questions for EMS Providers");
		ExcelUtil.setCurrentRow(92, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_PersonalInformationTitle();
		ems.Expand_PersonalInformation();
		ems.Assert_PersonalInformation_Gender();
		ems.Assert_PersonalInformation_Veteran();
		ExtentTestManager.endTest();
	}

	@Test(priority = 13, description = "Verify EMS Providers Personal Information Required Fields", enabled = true)
	public void EMR_EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Personal Information Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();

		ExtentTestManager.endTest();
	}

	@Test(priority = 14, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
	public void EMR_Enter_PersonalInformation_EMSProvider(Method method) throws InterruptedException {

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

	@Test(priority = 15, description = "Verify the Application Form Current National Registry Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Current National Registry Questions for EMS Providers");
		ExcelUtil.setCurrentRow(95, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CurrentNationalRegistryTitle();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_CurrentNationalRegistry();
		ExtentTestManager.endTest();
	}

	@Test(priority = 16, description = "Verify Current National Registry dropdown values", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistryDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Current National Registry dropdown values");
		ExcelUtil.setCurrentRow(96, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CurrentNationaRegistry();
		ems.Assert_CurrentNationalRegistryDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 17, description = "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry_NREMTBlank(Method method) throws InterruptedException {

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

	@Test(priority = 18, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
	public void EMR_EMSProvider_CurrentNationalRegistry_NREMTDate(Method method) throws InterruptedException {

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

	@Test(priority = 19, description = "Verify the Application Form Provider Disaster Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_ProviderDisaster(Method method) throws InterruptedException {

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

	@Test(priority = 20, description = "Verify Application Form Provider Disaster Required Fields", enabled = true)
	public void EMR_EMSProvider_ProviderDisaster_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Provider Disaster Required Fields");
		ExcelUtil.setCurrentRow(100, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 21, description = "Verify the Application Form Fee Waiver Request Questions for EMS Providers", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest(Method method) throws InterruptedException {

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

	@Test(priority = 22, description = "Verify Application Form Fee Waiver Request Required Fields", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Fee Waiver Request Required Fields");
		ExcelUtil.setCurrentRow(102, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.FeeWaiverRequest_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 23, description = "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_FederalPovertyDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values");
		ExcelUtil.setCurrentRow(103, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Assert_FederalPovertyDropd();
		ExtentTestManager.endTest();
	}

	@Test(priority = 24, description = "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.", enabled = true)
	public void EMR_EMSProvider_FeeWaiverRequest_HouseHoldIncomeDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.");
		ExcelUtil.setCurrentRow(104, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		ems.Assert_HouseHoldIncomeDropd();

		ExtentTestManager.endTest();
	}

	@Test(priority = 25, description = "Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types", enabled = true)
	public void EMR_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

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

	@Test(priority = 26, description = "Verify to Click Upload attachments without File system must display Popup Message ", enabled = true)
	public void EMR_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

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

	@Test(priority = 27, description = "Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description", enabled = true)
	public void EMR_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description");
		ExcelUtil.setCurrentRow(108, 4);
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

	@Test(priority = 28, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void EMR_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

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

	@Test(priority = 29, description = "Verify Terms and Conditions Page", enabled = true)
	public void EMR_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(110, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 30, description = "Verify to Click Continue button without checking the checkbox", enabled = true)
	public void EMR_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without checking the checkbox");
		ExcelUtil.setCurrentRow(111, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 31, description = "Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.", enabled = true)
	public void EMR_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.");
		ExcelUtil.setCurrentRow(112, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 32, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void EMR_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(113, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 33, description = "Verify the EMS Provider program with the AEMT Program Fees.", enabled = true)
	public void Verify_EMR_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program with the AEMT Program Fees.");
		ExcelUtil.setCurrentRow(114, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 34, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void EMR_EMS_PayLaterAlertAccept(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(115, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 35, description = "To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void EMR_EMS_PayLaterAlertDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify without select Option but click Pay Later button. System must Display Alert and Click Dismiss.");
		ExcelUtil.setCurrentRow(116, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 36, description = "To Verify Pay Later Options Click Pay Later dropdown", enabled = true)
	public void EMR_EMS_PayLaterOptions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Pay Later Options Click Pay Later dropdown");
		ExcelUtil.setCurrentRow(117, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}

	@Test(priority = 37, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Dismiss.", enabled = true)
	public void EMR_EMS_NavPayLaterDismiss(Method method) throws InterruptedException {

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

	@Test(priority = 38, description = "To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.", enabled = true)
	public void NavPayLaterAccept_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify select a value for Paylater dropdown and click Pay Later button. System must Display Alert and Click Accept.");
		ExcelUtil.setCurrentRow(119, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}

	@Test(priority = 39, description = "To Verify Pay Now button it must navigate to Another Make Payment page.", enabled = true)
	public void VerifyPayNow_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Another Make Payment page.");
		ExcelUtil.setCurrentRow(120, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 40, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(121, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 41, description = "To Verify Pay Now button it must navigate to Iowa Payment Website.", enabled = true)
	public void PayNowbutton_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify Pay Now button it must navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(122, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_PaymentWebsite();
		ExtentTestManager.endTest();
	}

	@Test(priority = 42, description = "Verify the payment information and click 'Continue' to proceed.", enabled = true)
	public void ValidPaymentContinue_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the payment information and click 'Continue' to proceed.");
		ExcelUtil.setCurrentRow(125, 4);
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

	@Test(priority = 43, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(128, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Receipt_EMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 44, description = "To Verify to Enter Duplicate EMS Provider with EMR Program.", enabled = true)
	public void ApplyforProgramDuplicate_EMR_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify to Enter Duplicate EMS Provider with EMR Program.");
		ExcelUtil.setCurrentRow(129, 4);
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

}

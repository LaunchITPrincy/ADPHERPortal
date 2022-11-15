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

public class AEMR_EMSProviderTest extends BaseTest {

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
	
	@Test(priority = 1, description = "Verify EMS Provider program is displaying or Not" , enabled = true)
	public void VerifyProgramDropdownValues(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider program is displaying or Not");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ProgramDropd();	
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 2, description = "Verify the Apply for a Program without entering a select program in the Program Detail", enabled = true)
	public void WithoutProgramDetailApplyforProgram(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Apply for a Program without entering a select program in the Program Detail");
		ExcelUtil.setCurrentRow(80, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_WithoutProgramMessage();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 3, description = "In the Apply Program Page, verify the EMS Provider Program Detail dropdown values.", enabled = true)
	public void VerifyEMSProgram_ProgramDetailProgramDetailsDropdownValues(Method method) throws InterruptedException {

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
	
	@Test(priority = 4, description = "Verify to Apply AEMT Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void ApplyforProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply AEMT Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(82, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_AEMT_ProgramDetail();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 5, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void ApplyforProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(), "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(83, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 6, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void ApplyforProgramPopupOKbutton(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.");
		ExcelUtil.setCurrentRow(84, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 7, description = "Verify the alert message if you try to apply for a program without completing the Application Forms.", enabled = true)
	public void VerifyInCompleteApplyProgramDropdownValues(Method method)  throws InterruptedException  {

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

	@Test(priority = 8, description = "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.", enabled = true)
	public void ApplyForProgramEdit(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify By clicking the OK button in the Incomplete popup on the Terms Page, you should be directed to My Programs.");
		ExcelUtil.setCurrentRow(86, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickOk();
		page.Click_Edit();
		page.AssertEquals_ApplicationFormMenu();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 9, description = "Verify the display Fields on the Application Form", enabled = true)
	public void ApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(87, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 10, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void ApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderAEMT();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 11, description = "Verify the EMS Provider program Affirmations.", enabled = true)
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
	
	@Test(priority = 12, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 13, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.");
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
	
	@Test(priority = 14, description = "Verify the EMS Provider program Affirmations.", enabled = true)
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
	
	@Test(priority = 15, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();
		
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 16, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
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
	
	@Test(priority = 17, description = "Verify the Application Form Current National Registry Questions for EMS Providers", enabled = true)
	public void EMSProvider_CurrentNationalRegistry(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Current National Registry Questions for EMS Providers");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CurrentNationalRegistryTitle();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_CurrentNationalRegistry();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 18, description = "Verify Current National Registry dropdown values", enabled = true)
	public void EMSProvider_CurrentNationalRegistryDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Current National Registry dropdown values");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CurrentNationaRegistry();
		ems.Assert_CurrentNationalRegistryDropd();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 19, description = "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.", enabled = true)
	public void EMSProvider_CurrentNationalRegistry_NREMTBlank(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.select_CurrentNationalRegistryDropd();
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ClickOk();
		ems.Assert_NREMTBlank();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 20, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
	public void EMSProvider_CurrentNationalRegistry_NREMTDate(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.");
		ExcelUtil.setCurrentRow(94, 4);
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

	@Test(priority = 21, description = "Verify the Application Form Provider Disaster Questions for EMS Providers", enabled = true)
	public void EMSProvider_ProviderDisaster (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Provider Disaster Questions for EMS Providers");
		ExcelUtil.setCurrentRow(94, 4);
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
	
	@Test(priority = 22, description = "Verify Application Form Provider Disaster Required Fields", enabled = true)
	public void EMSProvider_ProviderDisaster_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Provider Disaster Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 23, description = "Verify the Application Form Fee Waiver Request Questions for EMS Providers", enabled = true)
	public void EMSProvider_FeeWaiverRequest  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Fee Waiver Request Questions for EMS Providers");
		ExcelUtil.setCurrentRow(93, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		ems.Assert_FeeWaiverRequestTitle();
		ems.Expand_FeeWaiverRequest();
		ems.Assert_FeeWaiverRequest();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 24, description = "Verify Application Form Fee Waiver Request Required Fields", enabled = true)
	public void EMSProvider_FeeWaiverRequest_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Fee Waiver Request Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.FeeWaiverRequest_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 25, description = "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values", enabled = true)
	public void EMSProvider_FeeWaiverRequest_FederalPovertyDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values");
		ExcelUtil.setCurrentRow(93, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Assert_FederalPovertyDropd();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 26, description = "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.", enabled = true)
	public void EMSProvider_FeeWaiverRequest_HouseHoldIncomeDropd (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.");
		ExcelUtil.setCurrentRow(93, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		ems.Assert_HouseHoldIncomeDropd();
		
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 27, description = "Verify the attachment display fields and attachment types.", enabled = true)
	public void AEMT_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the attachment display fields and attachment types.");
		ExcelUtil.setCurrentRow(54, 4);
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

	@Test(priority = 28, description = "Verify without submitting a file Try to save an attachment", enabled = true)
	public void AEMT_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify without submitting a file Try to save an attachment");
		ExcelUtil.setCurrentRow(55, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickUploadAttachment();
		page.WithoutFileUploadAttachment();
		page.ClickOk();
		page.RequiredFields_Attachment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 29, description = "Verify the Delete button in the attachments.", enabled = true)
	public void AEMT_EMS_AttachmentsDelete(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Delete button in the attachments.");
		ExcelUtil.setCurrentRow(56, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Delete();
		//page.IsNotDisplayed_Delete();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 30, description = "Verify the upload of attachments with documents.", enabled = true)
	public void AEMT_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

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
	
	@Test(priority = 31, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void AEMT_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.");
		ExcelUtil.setCurrentRow(58, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 32, description = "Verify Terms and Conditions Page", enabled = true)
	public void AEMT_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(59, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 33, description = "Verify without agreeing to the terms and conditions, try to click the continue button.", enabled = true)
	public void AEMT_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify without agreeing to the terms and conditions, try to click the continue button.");
		ExcelUtil.setCurrentRow(60, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 34, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void AEMT_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 35, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void AEMT_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 36, description = "Verify the EMS Provider with AEMT Program Fees.", enabled = true)
	public void Verify_AEMT_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider with AEMT Program Fees.");
		ExcelUtil.setCurrentRow(63, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 37, description = "Verify to Accept the Alert Message by clicking the Pay Later button.", enabled = true)
	public void AEMT_EMS_PayLaterAlertAccept(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Accept the Alert Message by clicking the Pay Later button.");
		ExcelUtil.setCurrentRow(64, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 38, description = "Verify to Dismiss the Alert Message by clicking the Pay Later button.", enabled = true)
	public void AEMT_EMS_PayLaterAlertDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Dismiss the Alert Message by clicking the Pay Later button.");
		ExcelUtil.setCurrentRow(65, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 39, description = "Verify the Pay Later Options", enabled = true)
	public void AEMT_EMS_PayLaterOptions(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Pay Later Options");
		ExcelUtil.setCurrentRow(66, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLaterOption();
		page.Assert_PaymentLater();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 40, description = "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and then click Dismiss.", enabled = true)
	public void AEMT_EMS_NavPayLaterDismiss(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and then click Dismiss.");
		ExcelUtil.setCurrentRow(67, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Check();
		page.Click_PayLater();
		page.Alert_Dimiss();
		page.AssertEquals_Payment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 41, description = "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and you must accept it.", enabled = true)
	public void NavPayLaterAccept_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify, choose a value from the Paylater dropdown and click the Pay Later button. The system must display an alert and you must accept it.");
		ExcelUtil.setCurrentRow(68, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayLater();
		page.Alert_Accept();
		page.AssertEquals_MyProgram();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 42, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Details();
		page.Click_EditPayment();
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_MakePayment();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 43, description = "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.", enabled = true)
	public void MakePaymentAlert_AEMT_EMS(Method method) throws InterruptedException	{

		ExtentTestManager.startTest(method.getName(), "To Verify Make Payment Alert Popup. Accept Alert it should Navigate to Iowa Payment Website.");
		ExcelUtil.setCurrentRow(70, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.AssertEquals_PaymentWebsite();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 44, description = "To verify the Iowa Payment Website.", enabled = true)
	public void PayNowbutton_AEMT_EMS(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To verify the Iowa Payment Website.");
		ExcelUtil.setCurrentRow(71, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_MakeAPaymentWebsite();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_PaymentWebsite();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 45, description = "Verify that you can click the Continue button without entering your payment information.", enabled = true)
	public void InvalidPaymentContinue_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify that you can click the Continue button without entering your payment information.");
		ExcelUtil.setCurrentRow(72, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PaymentContinue();
		page.Assert_RequiredError();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 46, description = "Verify to enter Invalid Card Number for the payment information.", enabled = true)
	public void InvalidCardNumPayment_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter Invalid Card Number for the payment information.");
		ExcelUtil.setCurrentRow(73, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.InvalidEnter_CardNum();
		page.Click_PaymentContinue();
		page.Assert_InvalidCardNum();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 47, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 48, description = "To Review the Payment and Click Confirm to Proceed.", enabled = true)
	public void ReviewPaymentConfirm_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Review the Payment and Click Confirm to Proceed.");
		ExcelUtil.setCurrentRow(75, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_ContinuePayment();
		page.Assert_ReviewPayment();
		page.Click_Confirm();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 49, description = "To Verify Payment Confirmation Page", enabled = true)
	public void PaymentConfirmation_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify Payment Confirmation Page");
		ExcelUtil.setCurrentRow(76, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 50, description = "To Verify If Payment Successful system must navigate to Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_AEMT_EMS (Method method)  throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify If Payment Successful system must navigate to Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_ReceiptAEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 51, description = "Verify to apply Duplicate EMS Provider Program.", enabled = true)
	public void ApplyforProgramDuplicate_AEMT_EMS (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate EMS Provider Program.");
		ExcelUtil.setCurrentRow(78, 4);
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
	
}

package core.Tests.IDPH;

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

public class EMSProviderTest extends BaseTest {

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
	
	@Test(priority = 1, description = "Verify to Apply EMS Provider Program with the subtype AEMT", enabled = true)
	public void VerifyToApply_AEMT_EMSProvider (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply EMS Provider Program with the subtype AEMT");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ProgramDropd();
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Assert_EMSProgramProgramDetail();
		ems.Select_AEMT_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 2, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void AEMT_EMSProvider_Program (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderAEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 3, description = "Verify to Fill informations in the the EMS Provider program, with the subtype Paramedic", enabled = true)
	public void Verify_AEMT_ApplicationForms (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Fill informations in the the EMS Provider program, with the subtype Paramedic");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.No_Affirmations();
		page.ClickAffirmations();
	}
	
	@Test(priority = 4, description = "Verify the EMS Provider program Affirmations.", enabled = true)
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
	
	@Test(priority = 5, description = "Verify EMS Provider Affirmations Required Fields", enabled = true)
	public void EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();
		
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 6, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
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
	
	@Test(priority = 7, description = "Verify the Application Form Current National Registry Questions for EMS Providers", enabled = true)
	public void EMSProvider_CurrentNationalRegistry(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Application Form Current National Registry Questions for EMS Providers");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CurrentNationalRegistryTitle();
		ems.Expand_CurrentNationalRegistry();
		ems.Assert_CurrentNationalRegistry();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 8, description = "Verify Current National Registry dropdown values", enabled = true)
	public void EMSProvider_CurrentNationalRegistryDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Current National Registry dropdown values");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CurrentNationaRegistry();
		ems.Assert_CurrentNationalRegistryDropd();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 9, description = "If the NREMT Number and Expiration Date are both blank, a verification alert message must be displayed.", enabled = true)
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
	
	@Test(priority = 10, description = "Verify if the expiration date, entered as a date in the past, requires an alert to be displayed or not.", enabled = true)
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

	@Test(priority = 11, description = "Verify the Application Form Provider Disaster Questions for EMS Providers", enabled = true)
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
	
	@Test(priority = 12, description = "Verify Application Form Provider Disaster Required Fields", enabled = true)
	public void EMSProvider_ProviderDisaster_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Provider Disaster Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.ProviderDisaster_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 13, description = "Verify the Application Form Fee Waiver Request Questions for EMS Providers", enabled = true)
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
	
	@Test(priority = 14, description = "Verify Application Form Fee Waiver Request Required Fields", enabled = true)
	public void EMSProvider_FeeWaiverRequest_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Application Form Fee Waiver Request Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.FeeWaiverRequest_RequiredFields();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 15, description = "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values", enabled = true)
	public void EMSProvider_FeeWaiverRequest_FederalPovertyDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Fee Waiver Request Federal Poverty Level Dropdown values");
		ExcelUtil.setCurrentRow(93, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Assert_FederalPovertyDropd();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 16, description = "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.", enabled = true)
	public void EMSProvider_FeeWaiverRequest_HouseHoldIncomeDropd (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Fee Waiver Request House hold Income Dropdown values.");
		ExcelUtil.setCurrentRow(93, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		ems.Assert_HouseHoldIncomeDropd();
		
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 17, description = "Verify the upload of attachments with documents.", enabled = true)
	public void AEMT_UploadAttachments (Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();

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

	@Test(priority = 18, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void Valid_AgreeTerms_AEMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		page.AssertEquals_TermsAndConditionsTexts();
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 19, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields_AEMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 20, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow_AEMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_AEMT_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 21, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue_AEMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.Select_PaymentMethod();
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		page.Click_ContinuePayment();
		page.Click_Confirm();
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 22, description = "To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_AEMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_ReceiptAEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 23, description = "Verify to apply Duplicate EMS Provider Program, with the Subtype Paramedic.", enabled = true)
	public void ApplyforProgramDuplicate_AEMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate EMS Provider Program, with the Subtype Paramedic.");
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
	
	
	
	@Test(priority = 24, description = "Verify to Apply EMS Provider Program with the subtype EMR", enabled = true)
	public void VerifyToApply_EMR_EMSProvider (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply EMS Provider Program with the subtype EMR");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMR_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 25, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMR_EMSProvider_Program (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 26, description = "Verify to Fill informations in the the EMS Provider program, with the subtype EMR", enabled = true)
	public void Verify_EMR_ApplicationForms (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Fill informations in the the EMS Provider program, with the subtype EMR");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.No_Affirmations();
		page.ClickAffirmations();
		
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Expand_PersonalInformation();
		ems.Click_GenderDropd();
		ems.Select_FemaleGender();
		ems.Click_Veteran();
		ems.Expand_PersonalInformation();
		
		ems.Expand_CurrentNationalRegistry();
		ems.Click_CurrentNationaRegistry();
		ems.select_CurrentNationalRegistryDropd();
		ems.Enter_NREMTNumberTextbox();
		ems.Enter_FutureExpirationDate();
		ems.Expand_CurrentNationalRegistry();
		
		ems.Expand_ProviderDisaster();
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		
		ems.Expand_FeeWaiverRequest();
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		
		ExtentTestManager.endTest();
	}

	@Test(priority = 27, description = "Verify the upload of attachments with documents.", enabled = true)
	public void EMR_UploadAttachments (Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();

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

	@Test(priority = 28, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void Valid_AgreeTerms_EMR (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		page.AssertEquals_TermsAndConditionsTexts();
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 29, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields_EMR (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 30, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow_EMR (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMR_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 31, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue_EMR  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		page.Click_ContinuePayment();
		page.Click_Confirm();
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 32, description = "To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_EMR  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Receipt_EMR();
		ExtentTestManager.endTest();
	}

	@Test(priority = 33, description = "Verify to apply Duplicate EMS Provider Program, with the Subtype EMR", enabled = true)
	public void ApplyforProgramDuplicate_EMR  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate EMS Provider Program, with the Subtype EMR.");
		ExcelUtil.setCurrentRow(78, 4);
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

	
	
	@Test(priority = 34, description = "Verify to Apply EMS Provider Program with the subtype EMS Student", enabled = true)
	public void VerifyToApply_EMSStudent_EMSProvider(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply EMS Provider Program with the subtype EMS Student");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMSStudent_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 35, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMSStudent_EMSProvider_Program(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMSStudent();
		ExtentTestManager.endTest();
	}

	@Test(priority = 36, description = "Verify to Fill informations in the the EMS Provider program, with the subtype EMS Student", enabled = true)
	public void Verify_EMSStudent_ApplicationForms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Fill informations in the the EMS Provider program, with the subtype EMS Student");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.No_Affirmations();
		page.ClickAffirmations();

		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Expand_PersonalInformation();
		ems.Click_GenderDropd();
		ems.Select_FemaleGender();
		ems.Expand_PersonalInformation();

		ExtentTestManager.endTest();
	}
	
	@Test(priority = 37, description = "Verify AEMT must have an active EMT License", enabled = true)
	public void EMSStudent_EMSProvider_CourseSelectionDropd(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify AEMT must have an active EMT License");
		ExcelUtil.setCurrentRow(96, 4);
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

	@Test(priority = 38, description = "Verify Paramedic must have an active AEMT or EMT License", enabled = true)
	public void EMSStudent_Paramedic(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Paramedic must have an active AEMT or EMT License");
		ExcelUtil.setCurrentRow(96, 4);
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

	@Test(priority = 39, description = "Verify the upload of attachments with documents.", enabled = true)
	public void EMSStudent_UploadAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);

		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_CourseSelectionDropd();
		ems.Select_EMT_ProgramDetail();
		
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

	@Test(priority = 40, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void Valid_AgreeTerms_EMSStudent (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		page.AssertEquals_TermsAndConditionsTexts();
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 41, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields_EMSStudent (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		page.AssertEquals_NOPayment();
		ems.Assert_NoFees();
		ExtentTestManager.endTest();
	}

	
	@Test(priority = 42, description = "Verify to Apply EMS Provider Program with the subtype EMT", enabled = true)
	public void VerifyToApply_EMT_EMSProvider (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply EMS Provider Program with the subtype EMT");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMT_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 43, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMT_EMSProvider_Program (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 44, description = "Verify to Fill informations in the the EMS Provider program, with the subtype EMT", enabled = true)
	public void Verify_EMT_ApplicationForms (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Fill informations in the the EMS Provider program, with the subtype EMT");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.No_Affirmations();
		page.ClickAffirmations();
		
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Expand_PersonalInformation();
		ems.Click_GenderDropd();
		ems.Select_FemaleGender();
		ems.Click_Veteran();
		ems.Expand_PersonalInformation();
		
		ems.Expand_CurrentNationalRegistry();
		ems.Click_CurrentNationaRegistry();
		ems.select_CurrentNationalRegistryDropd();
		ems.Enter_NREMTNumberTextbox();
		ems.Enter_FutureExpirationDate();
		ems.Expand_CurrentNationalRegistry();
		
		ems.Expand_ProviderDisaster();
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		
		ems.Expand_FeeWaiverRequest();
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		
		ExtentTestManager.endTest();
	}

	@Test(priority = 45, description = "Verify the upload of attachments with documents.", enabled = true)
	public void EMT_UploadAttachments (Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();

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

	@Test(priority = 46, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void Valid_AgreeTerms_EMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		page.AssertEquals_TermsAndConditionsTexts();
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 47, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields_EMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMT_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 48, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow_EMT (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_EMT_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 49, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue_EMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		page.Click_ContinuePayment();
		page.Click_Confirm();
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 50, description = "To Verify If Payment Successful system must navigate to EMT Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_EMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to EMT Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Receipt_EMT();
		ExtentTestManager.endTest();
	}

	@Test(priority = 51, description = "Verify to apply Duplicate EMS Provider Program, with the Subtype EMT.", enabled = true)
	public void ApplyforProgramDuplicate_EMT  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate EMS Provider Program, with the Subtype EMT.");
		ExcelUtil.setCurrentRow(78, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickMyPrograms();
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMT_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.ApplyingDuplicateLicese();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
	
	
	@Test(priority = 52, description = "Verify to Apply EMS Provider Program with the subtype Paramedic", enabled = true)
	public void VerifyToApply_Paramedic_EMSProvider (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply EMS Provider Program with the subtype Paramedic");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_Paramedic_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.AssertEquals_ApplicationFormMenu();
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 53, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void Paramedic_EMSProvider_Program (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderParamedic();
		ExtentTestManager.endTest();
	}

	@Test(priority = 54, description = "Verify to Fill informations in the the EMS Provider program, with the subtype Paramedic", enabled = true)
	public void Verify_Paramedic_ApplicationForms (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Fill informations in the the EMS Provider program, with the subtype Paramedic");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickAffirmations();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.No_Affirmations();
		page.ClickAffirmations();
		
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Expand_PersonalInformation();
		ems.Click_GenderDropd();
		ems.Select_FemaleGender();
		ems.Click_Veteran();
		ems.Expand_PersonalInformation();
		
		ems.Expand_CurrentNationalRegistry();
		ems.Click_CurrentNationaRegistry();
		ems.select_CurrentNationalRegistryDropd();
		ems.Enter_NREMTNumberTextbox();
		ems.Enter_FutureExpirationDate();
		ems.Expand_CurrentNationalRegistry();
		
		ems.Expand_ProviderDisaster();
		ems.ProviderDisaster_No();
		ems.Expand_ProviderDisaster();
		
		ems.Expand_FeeWaiverRequest();
		ems.Click_FeeWaiver_Yes();
		ems.Click_FederalPovertyDropd();
		ems.Select_FederalPvertyLevelDropdNo();
		ems.Click_HouseHoldIncomeDropd();
		
		ExtentTestManager.endTest();
	}

	@Test(priority = 55, description = "Verify the upload of attachments with documents.", enabled = true)
	public void Paramedic_UploadAttachments (Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(), "Verify the upload of attachments with documents.");
		ExcelUtil.setCurrentRow(57, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Select_HouseholdIncomeDropdsMarried();
		ems.Expand_FeeWaiverRequest();

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

	@Test(priority = 56, description = "Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.", enabled = true)
	public void Valid_AgreeTerms_Paramedic (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you agree to the Terms and Conditions and click the Continue button, you must be taken to the Payment Page.");
		ExcelUtil.setCurrentRow(61, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_ConfirmMessage();
		page.ClickOk();
		page.AssertEquals_TermsAndConditions();
		page.AssertEquals_TermsAndConditionsTexts();
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 57, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void VerifyMakePaymentFields_Paramedic (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(62, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_Payment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Paramedic_Payment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 58, description = "Verify If you click the Pay Now button, you must be taken to another Make Payment page.", enabled = true)
	public void VerifyPayNow_Paramedic (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify If you click the Pay Now button, you must be taken to another Make Payment page.");
		ExcelUtil.setCurrentRow(69, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.AssertEquals_MakePayment();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Paramedic_MakePayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 59, description = "Verify to enter valid payment information to proceed", enabled = true)
	public void ValidPaymentContinue_Paramedic  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to enter valid payment information to proceed");
		ExcelUtil.setCurrentRow(74, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_PayNow();
		page.Alert_Accept();
		page.Select_ExpirationMonth();
		page.Select_ExpirationYear();
		page.Enter_PaymentDetails();
		page.Click_PaymentContinue();
		page.Click_ContinuePayment();
		page.Click_Confirm();
		page.Assert_Confirmation();
		page.Click_PaymentContinue();
		ExtentTestManager.endTest();
	}

	@Test(priority = 60, description = "To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.", enabled = true)
	public void NavPaymentReceiptDetails_Paramedic  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"To Verify If Payment Successful system must navigate to Paramedic Payment Receipt Page.");
		ExcelUtil.setCurrentRow(77, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Assert_ReceiptDetails();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_Receipt_Paramedic();
		ExtentTestManager.endTest();
	}

	@Test(priority = 61, description = "Verify to apply Duplicate EMS Provider Program, with the Subtype Paramedic.", enabled = true)
	public void ApplyforProgramDuplicate_Paramedic  (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply Duplicate EMS Provider Program, with the Subtype Paramedic.");
		ExcelUtil.setCurrentRow(78, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickMyPrograms();
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_Paramedic_ProgramDetail();
		page.ClickContinue();
		page.ClickOk();
		page.ApplyingDuplicateLicese();
		page.ClickOk();
		ExtentTestManager.endTest();
	}
	
}

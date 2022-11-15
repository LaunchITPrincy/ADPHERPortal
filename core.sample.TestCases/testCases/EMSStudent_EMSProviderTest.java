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

public class EMSStudent_EMSProviderTest extends BaseTest {

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

	@Test(priority = 1, description = "Verify to apply for the program EMS Provider with EMS Student subtype.", enabled = true)
	public void Verify_EMSStudent_Program(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to apply for the program EMS Provider with EMS Student subtype.");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.SelectEMSProgram();
		page.ClickProgramDetail();
		ems.Select_EMSStudent_ProgramDetail();
		ExtentTestManager.endTest();
	}

	@Test(priority = 2, description = "Verify to Apply EMS Student Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.", enabled = true)
	public void Apply_EMSStudent_ProgramPopup(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Apply EMS Student Subtype as EMS Provider. Verify for valid Program Data and Confirm Message Popup.");
		ExcelUtil.setCurrentRow(82, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.ApplyProgramPopup();
		ExtentTestManager.endTest();
	}

	@Test(priority = 3, description = "Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.", enabled = true)
	public void Apply_EMSStudent_ProgramPopupCancelbutton(Method method) {

		ExtentTestManager.startTest(method.getName(),
				"Verify The ApplyProgram Page must remain after clicking the Cancel button in the Popup.");
		ExcelUtil.setCurrentRow(83, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.PopupClickCancel();
		page.AssertEquals_ApplyProgramMenu();
		ExtentTestManager.endTest();
	}

	@Test(priority = 4, description = "Verify By clicking the OK button in the Popup, users must be taken to the Application Form Page.", enabled = true)
	public void Apply_EMSStudent_ProgramPopupOKbutton(Method method) throws InterruptedException {

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
	public void VerifyInCompleteApply_EMSStudent_ProgramDropdownValues(Method method) throws InterruptedException {

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
	public void ApplyFor_EMSStudent_ProgramEdit(Method method) throws InterruptedException {

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
	public void EMSStudent_ApplicationFormDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the display Fields on the Application Form");
		ExcelUtil.setCurrentRow(87, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_ApplicationForm();
		ExtentTestManager.endTest();
	}

	@Test(priority = 8, description = "Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.", enabled = true)
	public void EMSStudent_ApplicationFormProgramType(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify The Program Type and Subtype must be displayed or not based on the ApplyProgram page selection.");
		ExcelUtil.setCurrentRow(88, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.AssertEquals_ApplicationForm_EMSProviderEMSStudent();
		ExtentTestManager.endTest();
	}

	@Test(priority = 9, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMSStudent_EMSProviderAffirmations(Method method) throws InterruptedException {

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
	public void EMSStudent_EMSProvider_Affirmations_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Provider Affirmations Required Fields");
		ExcelUtil.setCurrentRow(90, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramBackflowTesterPage backflow = new ProgramBackflowTesterPage(driver);
		backflow.Affirmations_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 11, description = "Verify If all of the affirmation questions are answered 'yes', then the affirmation text fields must be required.", enabled = true)
	public void EMSStudent_EMSProvider_Affirmations_YES(Method method) throws InterruptedException {

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
	public void EMSStudent_EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Personal Information Questions for EMS Providers");
		ExcelUtil.setCurrentRow(92, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_PersonalInformationTitle();
		ems.Expand_PersonalInformation();
		ems.Assert_PersonalInformation_Gender();
		ExtentTestManager.endTest();
	}

	@Test(priority = 13, description = "Verify EMS Providers Personal Information Required Fields", enabled = true)
	public void EMSStudent_EMSProvider_PersonalInformation_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Personal Information Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.PersonalInformation_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 14, description = "Verify to Personal Informations Gender field dropdown Values", enabled = true)
	public void EMSStudent_Enter_PersonalInformation_EMSProvider(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Personal Informations Gender field dropdown Values");
		ExcelUtil.setCurrentRow(94, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Click_GenderDropd();
		ems.Assert_GenderDropd();
		ems.Select_FemaleGender();
		ems.Expand_PersonalInformation();
		ExtentTestManager.endTest();
	}

	@Test(priority = 15, description = "Verify the Application Form Course Details Questions for EMS Providers", enabled = true)
	public void EMSStudent_EMSProvider_CourseDetails (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify the Application Form Course Details Questions for EMS Providers");
		ExcelUtil.setCurrentRow(95, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_CourseDetailsTitle();
		ems.Expand_CourseDetails();
		ems.Assert_CourseSelection();
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 16, description = "Verify EMS Providers Course Details Required Fields", enabled = true)
	public void EMSStudent_EMSProvider_CourseDetails_RequiredFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify EMS Providers Course Details Required Fields");
		ExcelUtil.setCurrentRow(93, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.CourseSelection_RequiredFields();
		ExtentTestManager.endTest();
	}

	@Test(priority = 17, description = "Verify AEMT must have an active EMT License", enabled = true)
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

	@Test(priority = 18, description = "Verify Paramedic must have an active AEMT or EMT License", enabled = true)
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

	@Test(priority = 19, description = "Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types", enabled = true)
	public void EMSStudent_EMS_AttchmentDisplayFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Click Add new attachment and Verify Display Fields and Verify Attachment Types");
		ExcelUtil.setCurrentRow(105, 4);
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

	@Test(priority = 20, description = "Verify to Click Upload attachments without File system must display Popup Message ", enabled = true)
	public void EMSStudent_EMS_UploadAttachmentsPopupMessage(Method method) throws InterruptedException {

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

	@Test(priority = 21, description = "Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description", enabled = true)
	public void EMSStudent_EMS_UploadNewAttachments(Method method) throws InterruptedException, IOException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to Upload Files and Click Upload attachments. System must display View button with attachment Description");
		ExcelUtil.setCurrentRow(108, 4);
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

	@Test(priority = 22, description = "Verify If you click the Continue button, you should be taken to the Terms and Conditions page.", enabled = true)
	public void EMSStudent_EMS_NavTermsAndConditions(Method method) throws InterruptedException {

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

	@Test(priority = 23, description = "Verify Terms and Conditions Page", enabled = true)
	public void EMSStudent_EMS_TermsAndConditionsText(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify Terms and Conditions Page");
		ExcelUtil.setCurrentRow(110, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_TermsAndConditionsTexts();
		ExtentTestManager.endTest();
	}

	@Test(priority = 24, description = "Verify to Click Continue button without checking the checkbox", enabled = true)
	public void EMSStudent_EMS_WithoutAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Click Continue button without checking the checkbox");
		ExcelUtil.setCurrentRow(111, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickContinue();
		page.AssertEquals_AgreePopup();
		page.ClickOk();
		ExtentTestManager.endTest();
	}

	@Test(priority = 25, description = "Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.", enabled = true)
	public void EMSStudent_EMS_ValidAgreeTerms(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(),
				"Verify to agree Terms and Conditions and Click Continue button it should Navigate to Payment Page.");
		ExcelUtil.setCurrentRow(112, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.Click_Checkbox();
		page.ClickContinue();
		page.AssertEquals_MakeAPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 26, description = "Verify the Make Payment Page display fields.", enabled = true)
	public void EMSStudent_EMS_VerifyMakePaymentFields(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the Make Payment Page display fields.");
		ExcelUtil.setCurrentRow(113, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.AssertEquals_NOPayment();
		ExtentTestManager.endTest();
	}

	@Test(priority = 27, description = "Verify the EMS Provider program with the EMS Student Program Fees.", enabled = true)
	public void Verify_EMSStudent_EMSPayment(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program with the EMS Student Program Fees.");
		ExcelUtil.setCurrentRow(114, 4);
		ProgramEMSProviderPage ems = new ProgramEMSProviderPage(driver);
		ems.Assert_NoFees();
		ExtentTestManager.endTest();
	}

	

}

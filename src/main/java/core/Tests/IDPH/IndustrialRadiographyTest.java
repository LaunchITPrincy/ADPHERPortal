package core.Tests.IDPH;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import core.Tests.BaseTest;
import pages.ApplyProgramPage;
import pages.ProgramBackflowTesterPage;
import pages.ProgramEMSProviderPage;
import pages.ProgramIndustrialRadiographyPage;
import utils.ExtentReports.ExtentTestManager;
import utils.Helper.Config;
import utils.Helper.ExcelUtil;

public class IndustrialRadiographyTest extends BaseTest{
	
	@Test(priority = 0, description = "Load ADPER URL in browser successfully")
	public void load_ADPER_Portal(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "To Verify ADPER URL is loaded Successfully");
		ExcelUtil.setCurrentRow(78, 4);
		homePage.goToADPER().NavSignIn().loginToADPER(Config.getInstance().getProperty("app.username"),
				Config.getInstance().getProperty("app.password")).verifyLogin(true);
		ExtentTestManager.endTest();
	}
	
	@Test(priority = 1, description = "Verify to Apply Industrial Radiography Program with the subtype AEMT", enabled = true)
	public void VerifyToApply_AEMT_EMSProvider (Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify to Apply Industrial Radiography Program with the subtype AEMT");
		ExcelUtil.setCurrentRow(79, 4);
		ApplyProgramPage page = new ApplyProgramPage(driver);
		page.ClickApplyForAProgram();
		page.ClickProgram();
		ProgramIndustrialRadiographyPage radiography = new ProgramIndustrialRadiographyPage(driver);
		radiography.AssertEquals_ProgramDropd();	
		page.ClickProgramDetail();
		radiography.SelectIndustrialProgram();
		page.ClickProgramDetail();
		radiography.IndustrialProgram_ProgramDetail();
		radiography.SelectPDTrainee();
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
		ProgramIndustrialRadiographyPage radiography = new ProgramIndustrialRadiographyPage(driver);
		radiography.Assert_IndustrialRadiographyTrainee();
		ExtentTestManager.endTest();
	}

	@Test(priority = 4, description = "Verify the EMS Provider program Affirmations.", enabled = true)
	public void EMSProvider_PersonalInformation(Method method) throws InterruptedException {

		ExtentTestManager.startTest(method.getName(), "Verify the EMS Provider program Affirmations.");
		ExcelUtil.setCurrentRow(92, 4);
		ProgramIndustrialRadiographyPage radiography = new ProgramIndustrialRadiographyPage(driver);
		radiography.Expand_AgencyAuthorizedTraining();
		radiography.AssertEquals_AgencyAuthorizedTraining();
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
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramEMSProviderPage extends BasePage {

	public ProgramEMSProviderPage(WebDriver driver) {

		super(driver);
	}

	By EMSProgram = By.xpath("//span[contains(text(),'EMS Provider')]");
	By AEMT = By.xpath("//span[contains(text(),'AEMT')]");
	By EMR = By.xpath("//span[contains(text(),'EMR')]");
	By EMStudent = By.xpath("//span[contains(text(),'EMS Student')]");
	By EMT = By.xpath("(//span[contains(text(),'EMT')])[2]");
	By Paramedic = By.xpath("//span[contains(text(),'Paramedic')]");

	By AEMT_EMSProviderType = By.xpath("//div[contains(text(),'EMS Provider - AEMT')]");
	By EMR_EMSProviderType = By.xpath("//div[contains(text(),'EMS Provider - EMR')]");
	By EMSStudent_EMSProviderType = By.xpath("//div[contains(text(),'EMS Provider - EMS Student')]");
	By EMT_EMSProviderType = By.xpath("//div[contains(text(),'EMS Provider - EMT')]");
	By Paramedic_EMSProviderType = By.xpath("//div[contains(text(),'EMS Provider - Paramedic')]");
	
	// Affirmations added in the Program Backflow Tester Page
	// Personal Information
	By PersonalInformationTitle = By.xpath("//mat-panel-title[contains(text(),'Personal Information')]");

	By Gender = By.xpath("//span[contains(text(),'Gender')]");
	By GenderRequired = By.xpath("//span[@class='isinfotitle-invalid']");
	By GenderDropd = By.xpath("(//mat-select[@role='combobox'])[1]");
	By FemaleGender = By.xpath("//span[contains(text(),'Female')]");
	By MaleGender = By.xpath("//span[contains(text(),'Male')]");
	By OtherGender = By.xpath("//span[contains(text(),'Other')]");

	By AreYouVeteran = By.xpath("//span[contains(text(),'Are you a veteran of the US Armed Forces?')]");
	By AreYouVeteranYes = By.xpath("(//input[@value='Yes'])[7]");
	By AreYouVeteranNo = By.xpath("(//input[@value='No'])[7]");

	// Current National Registry
	By CurrentNationalRegistryTitle = By.xpath("//mat-panel-title[contains(text(),'Current National Registry')]");

	By CurrentNational = By.xpath("//span[contains(text(),'Current National Registry')]");
	By CurrentNationalDropd = By.xpath("(//mat-select[@role='combobox'])[2]");
	By CurrentNationalEMT = By.xpath("(//span[contains(text(),'EMT')])[4]");

	By NREMTNumber = By.xpath("//span[contains(text(),'NREMT Number (Attach a copy of NREMT Card)')]");
	By NREMTNumberTextbox = By.xpath("(//input[@type='text'])[7]");

	By NREMTExpirationDate = By.xpath("//span[contains(text(),'NREMT Expiration Date')]");
	By NREMTDatebox = By.xpath("//input[@type='date']");

	// Course Details
	By CourseDetails = By.xpath("//mat-panel-title[contains(text(),'Course Details')]");
	By CourseSelection = By.xpath("//span[contains(text(),'Course Selection')]");
	By CourseSelectionRequired = By.xpath("//span[@class='isinfotitle-invalid']");
	By CourseSelectionDropd = By.xpath("(//mat-select[@role='combobox'])[2]");

	// Provider Disaster Questions
	By ProviderDisaster = By.xpath("//mat-panel-title[contains(text(),'Provider Disaster Questions')]");

	By DisasterInIowa = By.xpath("//span[contains(text(),'Are you willing to respond to a disaster in Iowa?')]");
	By DisasterInIowaRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1]");
	By DisasterInIowaYes = By.xpath("(//input[@value='Yes'])[8]");
	By DisasterInIowaNo = By.xpath("(//input[@value='No'])[8]");

	By DisasterOutsideIowa = By
			.xpath("//span[contains(text(),'Are you willing to respond to a disaster that occurred')]");
	By DisasterOutsideIowaRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2]");
	By DisasterOutsideIowaYes = By.xpath("(//input[@value='Yes'])[9]");
	By DisasterOutsideIowaNo = By.xpath("(//input[@value='No'])[9]");

	// Fee Waiver Request
	By FeeWaiver = By.xpath("//mat-panel-title[contains(text(),'Fee Waiver Request')]");

	By LicenseRegistration = By.xpath("//span[contains(text(),'Are you applying for this license')]");
	By LicenseRegistrationRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1]");
	By LicenseRegistrationYes = By.xpath("(//input[@value='Yes'])[10]");
	By LicenseRegistrationNo = By.xpath("(//input[@value='No'])[10]");

	By ApplyFeeWaiver = By.xpath("//span[contains(text(),'Do you wish to apply for a fee')]");
	By ApplyFeeWaiverRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2]");
	By ApplyFeeWaiverYes = By.xpath("(//input[@value='Yes'])[11]");
	By ApplyFeeWaiverNo = By.xpath("(//input[@value='No'])[11]");

	By FederalPovertyLevel = By.xpath("//span[contains(text(),'Is your household income less')]");
	By FederalPovertyLevelRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[3]");
	By FederalPvertyLevelDropd = By.xpath("(//mat-select[@role='combobox'])[3]");
	By FederalPvertyLevelDropdNo = By.xpath("(//mat-option//span[contains(text(),'No')])[1]");
	By FederalPvertyLevelDropdNot = By.xpath("//mat-option//span[contains(text(),'Not Applicable:')]");
	By FederalPvertyLevelDropdYes = By.xpath("//mat-option//span[contains(text(),'Yes')]");

	By HouseholdIncome = By.xpath("//span[contains(text(),'I attest that my household income')]");
	By HouseholdIncomeRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[4]");
	By HouseholdIncomeDropd = By.xpath("(//mat-select[@role='combobox'])[4]");
	By HouseholdIncomeDropdsMarried = By.xpath("//span[contains(text(),'If you are married')]");
	By HouseholdIncomeDropdDependent = By
			.xpath("//mat-option//span[contains(text(),'If you were claimed as a dependent')]");
	By HouseholdIncomeDropdNot = By.xpath("//mat-option//span[contains(text(),'Not Applicable: Not')]");
	By HouseholdIncomeDropdOther = By.xpath("//mat-option//span[contains(text(),'Other documentation')]");

	// Validation Messages
	By ErrorMessage = By.xpath("//p[contains(text(),'ERROR')]");

	// Make Payment Page

	By NoFees = By.xpath("//div[contains(text(),'There are no Fees to Pay.')]");

	By Program = By.xpath("(//mat-cell[contains(text(),'EMS Provider')])[1]");
	By SecondProgram = By.xpath("(//mat-cell[contains(text(),'EMS Provider')])[2]");

	By Status = By.xpath("(//mat-cell[contains(text(),'New')])[1]");
	By SecondStatus = By.xpath("(//mat-cell[contains(text(),'New')])[2]");

	By PaidIn = By.xpath("(//mat-cell[contains(text(),'No')])[1]");
	By SecondPaidIn = By.xpath("(//mat-cell[contains(text(),'No')])[2]");

	By FeeAmount = By.xpath("//td[contains(.,'Fee Amount: $80.00')]");
	By PaidAmount = By.xpath("//td[contains(.,'Paid Amount: $00.00')]");
	By FeeDue = By.xpath("//td[contains(.,'Fee Due: $80.00')]");
	
	By EMSIBackgroundFee = By.xpath("//mat-cell[contains(text(),'EMSI Background check fee')]");
	
	By InitialFeeAmount = By.xpath("//mat-cell[contains(text(),'$30.00')]");
	By EMSIBackgroundCheckFee = By.xpath("//mat-cell[contains(text(),'$50.00')]");

	// AEMT Payment
	By ProgramDetail = By.xpath("(//mat-cell[contains(text(),'AEMT')])[1]");
	By SecondProgramDetail = By.xpath("(//mat-cell[contains(text(),'AEMT')])[3]");

	By AEMTInitialFee = By.xpath("//mat-cell[contains(text(),'AEMT Initial Fee')]");

	// EMR Payment
	By EMR_ProgramDetail = By.xpath("(//mat-cell[contains(text(),'EMR')])[1]");
	By EMR_SecondProgramDetail = By.xpath("(//mat-cell[contains(text(),'EMR')])[2]");

	By EMR_EMSIEMRInitialFee = By.xpath("//mat-cell[contains(text(),'EMSI EMR INITIAL FEE')]");

	// EMT Payment

	By EMT_ProgramDetail = By.xpath("(//mat-cell[contains(text(),'EMT')])[1]");
	By EMT_SecondProgramDetail = By.xpath("(//mat-cell[contains(text(),'EMT')])[2]");

	By EMT_EMSIEMRInitialFee = By.xpath("//mat-cell[contains(text(),'EMT Initial Fee')]");
	
	// Paramedic Payment

	By Paramedic_ProgramDetail = By.xpath("(//mat-cell[contains(text(),'Paramedic')])[1]");
	By Paramedic_SecondProgramDetail = By.xpath("(//mat-cell[contains(text(),'Paramedic')])[2]");
		
	By Paramedic_InitialFee = By.xpath("//mat-cell[contains(text(),'PARA Initial Fee')]");
	

	// Second Make Payment Page
	By ProductFeeDescription = By.xpath("//mat-cell[contains(text(),'Emergency Medical Services (EMS)')]");
	By AEMTFeeAmount = By.xpath("//mat-cell[contains(text(),'$80.00')]");

	// Payments Website
	By AmountDue = By.xpath("//span[@id='paymentAmountDue']");
	By Frequency = By.xpath("//span[@id='paymentType']");
	By PaymentAmount = By.xpath("//div[@id='oneTime_grp']//span[contains(text(),'$80.00')]");
	By PaymentDate = By.xpath("//span[contains(text(),'Pay Now')]");

	// Receipt Details
	By RD_EMSIBackgroundFee = By.xpath("//mat-cell[contains(text(),'EMSI Background check fee')]");
	
	By RD_AEMTInitialFee = By.xpath("//mat-cell[contains(text(),'AEMT Initial Fee')]");

	By RD_EMR_AEMTInitialFee = By.xpath("//mat-cell[contains(text(),'EMSI EMR INITIAL FEE')]");

	By RD_EMT_InitialFee = By.xpath("//mat-cell[contains(text(),'EMT Initial Fee')]");
	
	By RD_Paramedic_InitialFee = By.xpath("//mat-cell[contains(text(),'PARA Initial Fee')]");

	By RD_AEMTInitialFeeAmount = By.xpath("//mat-cell[contains(text(),'$30.00')]");
	By RD_EMSIBackgroundFeeAmount = By.xpath("//mat-cell[contains(text(),'$50.00')]");

	By RD_Total = By.xpath("//div[contains(text(),'Total: $80.00')]");

	By Grid = By.xpath(
			"//mat-cell[contains(text(),'Backflow Tester')]/following-sibling::mat-cell//button//span[contains(text(),'Details')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(EMSProgram), "EMS Provider");
	}

	public void SelectEMSProgram() {

		click(EMSProgram);
	}

	public void Assert_EMSProgramProgramDetail() {

		Assert.assertEquals(readText(AEMT), "AEMT");
		Assert.assertEquals(readText(EMR), "EMR");
		Assert.assertEquals(readText(EMStudent), "EMS Student");
		Assert.assertEquals(readText(EMT), "EMT");
		Assert.assertEquals(readText(Paramedic), "Paramedic");
	}

	public void Select_AEMT_ProgramDetail() {

		click(AEMT);
	}

	public void Select_EMR_ProgramDetail() {

		click(EMR);
	}

	public void Select_EMSStudent_ProgramDetail() {

		click(EMStudent);
	}

	public void Select_EMT_ProgramDetail() {

		click(EMT);
	}

	public void Select_Paramedic_ProgramDetail() {

		click(Paramedic);
	}

	public void AssertEquals_ApplicationForm_EMSProviderAEMT() {

		Assert.assertEquals(readText(AEMT_EMSProviderType), "EMS Provider - AEMT");
	}

	public void AssertEquals_ApplicationForm_EMSProviderEMR() {

		Assert.assertEquals(readText(EMR_EMSProviderType), "EMS Provider - EMR");
	}

	public void AssertEquals_ApplicationForm_EMSProviderEMSStudent() {

		Assert.assertEquals(readText(EMSStudent_EMSProviderType), "EMS Provider - EMS Student");
	}
	
	public void AssertEquals_ApplicationForm_EMSProviderEMT() {

		Assert.assertEquals(readText(EMT_EMSProviderType), "EMS Provider - EMT");
	}
	
	public void AssertEquals_ApplicationForm_EMSProviderParamedic() {

		Assert.assertEquals(readText(Paramedic_EMSProviderType), "EMS Provider - Paramedic");
	}

	// Personal Information

	public void Assert_PersonalInformationTitle() {

		Assert.assertEquals(readText(PersonalInformationTitle), "Personal Information");
	}

	public void Expand_PersonalInformation() {

		click(PersonalInformationTitle);
	}

	public void Assert_PersonalInformation_Gender() {

		Assert.assertEquals(readText(Gender), "Gender");
	}

	public void Assert_PersonalInformation_Veteran() {

		Assert.assertEquals(readText(AreYouVeteran), "Are you a veteran of the US Armed Forces?");
	}

	public void PersonalInformation_RequiredFields() {

		Assert.assertTrue(isDisplayed(GenderRequired));
	}

	public void Click_GenderDropd() {

		click(GenderDropd);
	}

	public void Assert_GenderDropd() {

		Assert.assertEquals(readText(FemaleGender), "Female");
		Assert.assertEquals(readText(MaleGender), "Male");
		Assert.assertEquals(readText(OtherGender), "Other");
	}

	public void Select_FemaleGender() {

		click(FemaleGender);
	}

	public void Click_Veteran() {

		click(AreYouVeteranYes);
	}

	// Current National Registry

	public void Assert_CurrentNationalRegistryTitle() {

		Assert.assertEquals(readText(CurrentNationalRegistryTitle), "Current National Registry");
	}

	public void Expand_CurrentNationalRegistry() {

		click(CurrentNationalRegistryTitle);
	}

	public void Assert_CurrentNationalRegistry() {

		Assert.assertEquals(readText(CurrentNational), "Current National Registry");
		Assert.assertEquals(readText(NREMTNumber), "NREMT Number (Attach a copy of NREMT Card)");
		Assert.assertEquals(readText(NREMTExpirationDate), "NREMT Expiration Date");
	}

	public void Click_CurrentNationaRegistry() {

		click(CurrentNationalDropd);
	}

	public void Assert_CurrentNationalRegistryDropd() {

		Assert.assertEquals(readText(AEMT), "AEMT");
		Assert.assertEquals(readText(EMR), "EMR");
		Assert.assertEquals(readText(CurrentNationalEMT), "EMT");
		Assert.assertEquals(readText(Paramedic), "Paramedic");
	}

	public void select_CurrentNationalRegistryDropd() {

		click(CurrentNationalEMT);
	}

	public void Enter_NREMTNumberTextbox() {

		writeText(NREMTNumberTextbox, "Test exc");
	}

	public void Enter_PastExpirationDate() {

		writeText(NREMTDatebox, "05052022");
	}

	public void Enter_FutureExpirationDate() {

		clearText(NREMTDatebox);
		writeText(NREMTDatebox, "05052023");
	}

	public void Assert_NREMTBlank() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500287 - Your NREMT number and/or expiration date should not be blank. Please provide the number and date. (in: defaultinfo_emsi)");
	}

	public void Assert_NREMTExpiryDate() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500204 - NREMT Certification must not be expired. Please Review. (in: defaultinfo_emsi)");
	}

	// Course Details

	public void Assert_CourseDetailsTitle() {

		Assert.assertEquals(readText(CourseDetails), "Course Details");
	}

	public void Expand_CourseDetails() {

		click(CourseDetails);
	}

	public void Assert_CourseSelection() {

		Assert.assertEquals(readText(CourseSelection), "Course Selection");
	}

	public void CourseSelection_RequiredFields() {

		Assert.assertTrue(isDisplayed(CourseSelectionRequired));
	}

	public void Click_CourseSelectionDropd() {

		click(CourseSelectionDropd);
	}

	public void Assert_CourseSelectionDropd() {

		Assert.assertEquals(readText(AEMT), "AEMT");
		Assert.assertEquals(readText(EMR), "EMR");
		Assert.assertEquals(readText(EMT), "EMT");
		Assert.assertEquals(readText(Paramedic), "Paramedic");
	}

	public void Click_AEMT() {

		click(AEMT);
	}

	public void Assert_AEMTActive() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500070 - AEMTs must have an active EMT license. (in: defaultinfo_emsi)");
	}

	public void Assert_ParamedicsActive() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500072 - Paramedics must have an active AEMT or EMT license. (in: defaultinfo_emsi)");
	}

	// Provider Disaster Questions

	public void Assert_ProviderDisasterTitle() {

		Assert.assertEquals(readText(ProviderDisaster), "Provider Disaster Questions");
	}

	public void Expand_ProviderDisaster() {

		click(ProviderDisaster);
	}

	public void Assert_ProviderDisaster() {

		Assert.assertEquals(readText(DisasterInIowa), "Are you willing to respond to a disaster in Iowa?");
		Assert.assertEquals(readText(DisasterOutsideIowa),
				"Are you willing to respond to a disaster that occurred outside of Iowa?");
	}

	public void ProviderDisaster_RequiredFields() {

		Assert.assertTrue(isDisplayed(DisasterInIowaRequired));
		Assert.assertTrue(isDisplayed(DisasterOutsideIowaRequired));
	}

	public void ProviderDisaster_YES() {

		click(DisasterInIowaYes);
		click(DisasterOutsideIowaYes);
	}

	public void ProviderDisaster_No() {

		click(DisasterInIowaNo);
		click(DisasterOutsideIowaNo);
	}

	// Fee Waiver Request

	public void Assert_FeeWaiverRequestTitle() {

		Assert.assertEquals(readText(FeeWaiver), "Fee Waiver Request");
	}

	public void Expand_FeeWaiverRequest() {

		click(FeeWaiver);
	}

	public void Assert_FeeWaiverRequest() {

		Assert.assertEquals(readText(LicenseRegistration),
				"Are you applying for this license/registration/certification for the first time in Iowa?");
		Assert.assertEquals(readText(ApplyFeeWaiver), "Do you wish to apply for a fee waiver?");
		Assert.assertEquals(readText(FederalPovertyLevel),
				"Is your household income less than 200% of the Federal Poverty Level?");
		Assert.assertEquals(readText(HouseholdIncome),
				"I attest that my household income does not exceed 200% of the federal poverty income guidelines and agree to submit documentation of one of the following to verify my household income:");
	}

	public void FeeWaiverRequest_RequiredFields() {

		Assert.assertTrue(isDisplayed(LicenseRegistrationRequired));
		Assert.assertTrue(isDisplayed(ApplyFeeWaiverRequired));
		Assert.assertTrue(isDisplayed(FederalPovertyLevelRequired));
		Assert.assertTrue(isDisplayed(HouseholdIncomeRequired));
	}

	public void Click_FeeWaiver_Yes() {

		click(LicenseRegistrationYes);
		click(ApplyFeeWaiverYes);
	}

	public void Click_FederalPovertyDropd() {

		click(FederalPvertyLevelDropd);
	}

	public void Assert_FederalPovertyDropd() {

		Assert.assertEquals(readText(FederalPvertyLevelDropdNo), "No");
		Assert.assertEquals(readText(FederalPvertyLevelDropdNot), "Not Applicable: Not requesting fee waiver");
		Assert.assertEquals(readText(FederalPvertyLevelDropdYes), "Yes");
	}

	public void Select_FederalPvertyLevelDropdNo() {

		click(FederalPvertyLevelDropdNo);
	}

	public void Click_HouseHoldIncomeDropd() {

		click(HouseholdIncomeDropd);
	}

	public void Assert_HouseHoldIncomeDropd() {

		Assert.assertEquals(readText(HouseholdIncomeDropdsMarried),
				"If you are married and filed separately, you will need to submit a Federal Tax Return for both your spouse and yourself.");
		Assert.assertEquals(readText(HouseholdIncomeDropdDependent),
				"If you were claimed as a dependent on another person tax return, you will need to submit the Federal Tax Return for the tax filer who claimed you as a dependent.");
		Assert.assertEquals(readText(HouseholdIncomeDropdNot), "Not Applicable: Not requesting fee waiver");
		Assert.assertEquals(readText(HouseholdIncomeDropdOther), "Other documentation");
	}

	public void Select_HouseholdIncomeDropdsMarried() {

		click(HouseholdIncomeDropdsMarried);
	}

	// Payment

	public void Assert_NoFees() {

		Assert.assertEquals(readText(NoFees), "There are no Fees to Pay.");
	}

	public void Assert_AEMT_Payment() {

		Assert.assertEquals(readText(Program), "EMS Provider");
		Assert.assertEquals(readText(SecondProgram), "EMS Provider");

		Assert.assertEquals(readText(ProgramDetail), "AEMT");
		Assert.assertEquals(readText(SecondProgramDetail), "AEMT");

		Assert.assertEquals(readText(Status), "New");
		Assert.assertEquals(readText(SecondStatus), "New");

		Assert.assertEquals(readText(AEMTInitialFee), "AEMT Initial Fee");
		Assert.assertEquals(readText(EMSIBackgroundFee), "EMSI Background check fee");

		Assert.assertEquals(readText(InitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(EMSIBackgroundCheckFee), "$50.00");

		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(SecondPaidIn), "No");

		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_AEMT_MakePayment() {

		Assert.assertEquals(readText(ProductFeeDescription), "Emergency Medical Services (EMS)");
		Assert.assertEquals(readText(AEMTFeeAmount), "$80.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_AEMT_PaymentWebsite() {

		Assert.assertEquals(readText(AmountDue), "$80.00");
		Assert.assertEquals(readText(Frequency), "One Time");
		Assert.assertEquals(readText(PaymentAmount), "$80.00");
		Assert.assertEquals(readText(PaymentDate), "Pay Now");
	}

	public void Assert_ReceiptAEMT() {

		Assert.assertEquals(readText(RD_AEMTInitialFee), "AEMT Initial Fee");
		Assert.assertEquals(readText(RD_EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(RD_AEMTInitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(RD_EMSIBackgroundFeeAmount), "$50.00");
		Assert.assertEquals(readText(RD_Total), "Total: $80.00");
	}

	public void Assert_EMR_Payment() {

		Assert.assertEquals(readText(Program), "EMS Provider");
		Assert.assertEquals(readText(SecondProgram), "EMS Provider");

		Assert.assertEquals(readText(EMR_ProgramDetail), "EMR");
		Assert.assertEquals(readText(EMR_SecondProgramDetail), "EMR");

		Assert.assertEquals(readText(Status), "New");
		Assert.assertEquals(readText(SecondStatus), "New");

		Assert.assertEquals(readText(EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(EMR_EMSIEMRInitialFee), "EMSI EMR INITIAL FEE");

		Assert.assertEquals(readText(InitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(EMSIBackgroundCheckFee), "$50.00");

		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(SecondPaidIn), "No");

		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_EMR_MakePayment() {

		Assert.assertEquals(readText(ProductFeeDescription), "Emergency Medical Services (EMS)");
		Assert.assertEquals(readText(AEMTFeeAmount), "$80.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_EMR_PaymentWebsite() {

		Assert.assertEquals(readText(AmountDue), "$80.00");
		Assert.assertEquals(readText(Frequency), "One Time");
		Assert.assertEquals(readText(PaymentAmount), "$80.00");
		Assert.assertEquals(readText(PaymentDate), "Pay Now");
	}

	public void Assert_Receipt_EMR() {

		Assert.assertEquals(readText(RD_EMR_AEMTInitialFee), "EMSI EMR INITIAL FEE");
		Assert.assertEquals(readText(RD_EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(RD_AEMTInitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(RD_EMSIBackgroundFeeAmount), "$50.00");
		Assert.assertEquals(readText(RD_Total), "Total: $80.00");
	}

	public void Assert_EMT_Payment() {

		Assert.assertEquals(readText(Program), "EMS Provider");
		Assert.assertEquals(readText(SecondProgram), "EMS Provider");

		Assert.assertEquals(readText(EMT_ProgramDetail), "EMT");
		Assert.assertEquals(readText(EMT_SecondProgramDetail), "EMT");

		Assert.assertEquals(readText(Status), "New");
		Assert.assertEquals(readText(SecondStatus), "New");

		Assert.assertEquals(readText(EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(EMT_EMSIEMRInitialFee), "EMT Initial Fee");

		Assert.assertEquals(readText(InitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(EMSIBackgroundCheckFee), "$50.00");

		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(SecondPaidIn), "No");

		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_EMT_MakePayment() {

		Assert.assertEquals(readText(ProductFeeDescription), "Emergency Medical Services (EMS)");
		Assert.assertEquals(readText(AEMTFeeAmount), "$80.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_Receipt_EMT() {

		Assert.assertEquals(readText(RD_EMT_InitialFee), "EMT Initial Fee");
		Assert.assertEquals(readText(RD_EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(RD_AEMTInitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(RD_EMSIBackgroundFeeAmount), "$50.00");
		Assert.assertEquals(readText(RD_Total), "Total: $80.00");
	}
	
	public void Assert_Paramedic_Payment() {

		Assert.assertEquals(readText(Program), "EMS Provider");
		Assert.assertEquals(readText(SecondProgram), "EMS Provider");

		Assert.assertEquals(readText(Paramedic_ProgramDetail), "Paramedic");
		Assert.assertEquals(readText(Paramedic_SecondProgramDetail), "Paramedic");

		Assert.assertEquals(readText(Status), "New");
		Assert.assertEquals(readText(SecondStatus), "New");

		Assert.assertEquals(readText(EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(Paramedic_InitialFee), "PARA Initial Fee");

		Assert.assertEquals(readText(InitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(EMSIBackgroundCheckFee), "$50.00");

		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(SecondPaidIn), "No");

		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_Paramedic_MakePayment() {

		Assert.assertEquals(readText(ProductFeeDescription), "Emergency Medical Services (EMS)");
		Assert.assertEquals(readText(AEMTFeeAmount), "$80.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $80.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $80.00");
	}

	public void Assert_Receipt_Paramedic() {

		Assert.assertEquals(readText(RD_Paramedic_InitialFee), "PARA Initial Fee");
		Assert.assertEquals(readText(RD_EMSIBackgroundFee), "EMSI Background check fee");
		Assert.assertEquals(readText(RD_AEMTInitialFeeAmount), "$30.00");
		Assert.assertEquals(readText(RD_EMSIBackgroundFeeAmount), "$50.00");
		Assert.assertEquals(readText(RD_Total), "Total: $80.00");
	}
}
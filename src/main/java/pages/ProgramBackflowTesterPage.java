package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramBackflowTesterPage extends BasePage {

	public ProgramBackflowTesterPage(WebDriver driver) {
		super(driver);
	}

	// Backflow Tester
	By BackFlowProgram = By.xpath("//span[contains(text(),'Backflow Tester')]");
	By ProgramDetailBackFlow = By.xpath("(//span[contains(text(),'Backflow Tester')])[2]");

	By BackFlowTesterType = By.xpath("//div[contains(text(),'Backflow Tester - Backflow Tester')]");

	// Affirmation
	By MedicalCondition = By.xpath("//span[contains(text(),'Do you have a medical')]");
	By MedicalConditionYes = By.xpath("(//input[@value='Yes'])[1]");
	By MedicalConditionNo = By.xpath("(//input[@value='No'])[1]");
	By IfYesMedicalCondition = By.xpath("//span[contains(text(),'If yes, provide a description of your condition')]");
	By MedicalConditionText = By.xpath("(//input[@type='text'])[1]");
	By MedicalConditionRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1]");

	By Illegal = By.xpath("//span[contains(text(),'Have you, within')]");
	By IllegalYes = By.xpath("(//input[@value='Yes'])[2]");
	By IllegalNo = By.xpath("(//input[@value='No'])[2]");
	By IfYesIllegal = By.xpath("//span[contains(text(),'If yes, provide a statement')]");
	By IllegalText = By.xpath("(//input[@type='text'])[2]");
	By IllegalRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2]");

	By Misdemeanor = By.xpath("//span[contains(text(),'Have you ever been convicted')]");
	By MisdemeanorYes = By.xpath("(//input[@value='Yes'])[3]");
	By MisdemeanorNo = By.xpath("(//input[@value='No'])[3]");
	By IfYesMisdemeanor = By.xpath("//span[contains(text(),'If yes, include the date, location, charging orders')]");
	By MisdemeanorText = By.xpath("(//input[@type='text'])[3]");
	By MisdemeanorRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[3]");

	By Jurisdiction = By.xpath("//span[contains(text(),'Has any state or other jurisdiction')]");
	By JurisdictionYes = By.xpath("(//input[@value='Yes'])[4]");
	By JurisdictionNo = By.xpath("(//input[@value='No'])[4]");
	By IfYesJurisdiction = By.xpath("(//span[contains(text(),'If yes, include the date, location, reason')])[1]");
	By JurisdictionText = By.xpath("(//input[@type='text'])[4]");
	By JurisdictionRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[4]");

	By Judgments = By.xpath("//span[contains(text(),'Have there ever been judgments')]");
	By JudgmentsYes = By.xpath("(//input[@value='Yes'])[5]");
	By JudgmentsNo = By.xpath("(//input[@value='No'])[5]");
	By IfYesJudgments = By.xpath("(//span[contains(text(),'If yes, include the date, location, reason')])[2]");
	By JudgmentsText = By.xpath("(//input[@type='text'])[5]");
	By JudgmentsRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[5]");

	By License = By.xpath("//span[contains(text(),'Have you ever had a license, permit')]");
	By LicenseYes = By.xpath("(//input[@value='Yes'])[6]");
	By LicenseNo = By.xpath("(//input[@value='No'])[6]");
	By IfYesLicense = By.xpath("//span[contains(text(),'If yes, provide a description of the circumstances.')]");
	By LicenseText = By.xpath("(//input[@type='text'])[6]");
	By LicenseRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[6]");

	// Third Party Certification
	By CurrentNational = By.xpath("//span[contains(text(),'Current National American')]");
	By CurrentNationalYes = By.xpath("(//input[@value='Yes'])[7]");
	By CurrentNationalNo = By.xpath("(//input[@value='No'])[7]");
	By CurrentNationalRequired = By.xpath("//span[@class='isinfotitle-invalid']");

	By SelectThirdParty = By.xpath("//span[contains(text(),'Select Third Party')]");

	By AnsSelectThirdParty = By.xpath("(//mat-select[@role='combobox'])[1]");

	By ThirdABPA = By.xpath("//mat-option[@role='option']//span[contains(text(),'ABPA')]");
	By ThirdASSE = By.xpath("//mat-option[@role='option']//span[contains(text(),'ASSE')]");

	By CertificationNumber = By.xpath("//span[contains(text(),'Certification Number')]");
	By CertificationNumText = By.xpath("(//input[@type='text'])[7]");

	By ExpirationDate = By.xpath("//span[contains(text(),'Expiration Date')]");
	By DatePick = By.xpath("(//input[@type='date'])[1]");

	// Back Flow Tester Out of State Credentials or Training
	By OutOfStateCredentials = By.xpath("//mat-panel-title[contains(text(),'Back Flow Tester')]");

	By CurrentTesterCredn = By.xpath("//span[contains(text(),'Current tester credentials')]");
	By CurrentTesterRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1]");
	By CurrentTesterYes = By.xpath("(//input[@value='Yes'])[8]");
	By CurrentTesterNo = By.xpath("(//input[@value='No'])[8]");

	By NamingJurisd = By.xpath("//span[contains(text(),'Name of issuing jurisdiction')]");
	By NamingJurisdText = By.xpath("(//input[@type='text'])[8]");

	By LicenseNumber = By.xpath("//span[contains(text(),'License Number')]");
	By LicenseNumberText = By.xpath("(//input[@type='text'])[9]");

	By DateofExpiration = By.xpath("//span[contains(text(),'Date of Expiration')]");
	By DateofExpirationTextbox = By.xpath("(//mat-form-field//div//input[@type='date'])[2]");

	By OutOfState = By.xpath("//span[contains(text(),'Out of State course')]");
	By OutOfStateRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2]");
	By OutOfStateYes = By.xpath("(//input[@value='Yes'])[9]");
	By OutOfStateNo = By.xpath("(//input[@value='No'])[9]");

	By CourseName = By.xpath("//span[contains(text(),'Course Name')]");
	By CourseNameText = By.xpath("(//input[@type='text'])[10]");

	By CourseNumber = By.xpath("//span[contains(text(),'Course Number')]");
	By CourseNumberText = By.xpath("(//input[@type='text'])[11]");

	By CourseDate = By.xpath("//span[contains(text(),'Course Date')]");
	By CourseDateTextbox = By.xpath("(//mat-form-field//div//input[@type='date'])[3]");

	By CourseLocation = By.xpath("//span[contains(text(),'Course Location')]");
	By CourseLocationText = By.xpath("(//input[@type='text'])[12]");

	By CourseSponsor = By.xpath("//span[contains(text(),'Course Sponsor or Provider Name')]");
	By CourseSponsorText = By.xpath("(//input[@type='text'])[13]");

	// Validation Messages
	By ErrorMessage = By.xpath("//p[contains(text(),'ERROR')]");

	// Make Payment Page
	By Program = By.xpath("(//mat-cell[contains(text(),'Backflow Tester')])[1]");
	By ProgramDetail = By.xpath("(//mat-cell[contains(text(),'Backflow Tester')])[2]");
	By Status = By.xpath("//mat-cell[contains(text(),'New')]");
	By FeeDescr = By.xpath("//mat-cell[contains(text(),'Backflow Tester Initial Fee')]");
	By FeeAmou = By.xpath("//mat-cell[contains(text(),'$42.00')]");
	By PaidIn = By.xpath("//mat-cell[contains(text(),'No')]");

	By FeeAmount = By.xpath("//td[contains(.,'Fee Amount: $42.00')]");
	By PaidAmount = By.xpath("//td[contains(.,'Paid Amount: $00.00')]");
	By FeeDue = By.xpath("//td[contains(.,'Fee Due: $42.00')]");

	By BackflowProduct = By.xpath("//mat-cell[contains(text(),'Backflow')]");

	// Payments Website
	By BackflowAmoun = By.xpath("//span[@id='paymentAmountDue']");
	By BackflowPaymentType = By.xpath("//span[@id='paymentType']");
	By BackflowPaymentAmount = By.xpath("//div[@id='oneTime_grp']//span[contains(text(),'$42.00')]");
	By BackFlowPayNow = By.xpath("//span[contains(text(),'Pay Now')]");

	// Receipt Details
	By RDBackflowTesterInitial = By.xpath("//mat-cell[contains(text(),'Backflow Tester Initial Fee')]");
	By RDFeeAmount = By.xpath("//mat-cell[contains(text(),'$42.00')]");
	By RDTotal = By.xpath("//div[contains(text(),'Total: $42.00')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(BackFlowProgram), "Backflow Tester");
	}

	public void SelectProgramBackFlowTester() {

		click(BackFlowProgram);
	}

	public void AssertEquals_BackFlow_ProgramDetail() {

		Assert.assertEquals(readText(ProgramDetailBackFlow), "Backflow Tester");
	}

	public void SelectProgramDetailBackFlow() {

		click(ProgramDetailBackFlow);
	}

	public void AssertEquals_ApplicationForm_BackFlow() {
		Assert.assertEquals(readText(BackFlowTesterType), "Backflow Tester - Backflow Tester");
	}

	public void AssertEquals_Affirmation_BackFlowTester() {

		Assert.assertEquals(readText(MedicalCondition),
				"Do you have a medical condition, which in any way currently impairs or limits your ability to perform the duties of this profession? Medical Condition: means any physiological, mental, or psychological condition, impairment, or disorder, including drug addiction and alcoholism.");

		Assert.assertEquals(readText(IfYesMedicalCondition),
				"If yes, provide a description of your condition and submit a letter from a physician stating how your condition will affect your ability to perform the duties of this profession.");

		Assert.assertEquals(readText(Illegal),
				"Have you, within the past 5 years, engaged in the illegal or improper use of drugs or other chemical substances?");

		Assert.assertEquals(readText(IfYesIllegal),
				"If yes, provide a statement and a copy of relevant documentation including records from a physician or treatment program.");

		Assert.assertEquals(readText(Misdemeanor),
				"Have you ever been convicted of a misdemeanor or felony crime? (You do not need to answer yes if your sole conviction or convictions are for minor traffic violations with fines under $250). In answering this question, note that a conviction means a finding, plea, or verdict of guilt made or returned in a criminal proceeding, even if the adjudication of guilt is deferred, withheld, or not entered. This means you must answer yes if a finding or verdict of guilt was returned against you in a criminal proceeding or if you plead guilty, entered a plea of nolo contendere, or entered an Alford plea in a criminal proceeding, even if the court expunged the matter or the court deferred judgment. You must submit the complaint and judgment of conviction for each offense.");

		Assert.assertEquals(readText(IfYesMisdemeanor),
				"If yes, include the date, location, charging orders, court disposition, and current status (i.e. probation) for each charge.");

		Assert.assertEquals(readText(Jurisdiction),
				"Has any state or other jurisdiction of the United States or any other nation ever limited, restricted, warned, censured, placed on probation, suspended, revoked, or otherwise disciplined a professional license, permit, registration, or certification issued to you?");

		Assert.assertEquals(readText(IfYesJurisdiction), "If yes, include the date, location, reason, and resolution.");

		Assert.assertEquals(readText(Judgments),
				"Have there ever been judgments or settlements paid on your behalf as a result of a professional liability case?");

		Assert.assertEquals(readText(IfYesJudgments), "If yes, include the date, location, reason, and resolution.");

		Assert.assertEquals(readText(License),
				"Have you ever had a license, permit, registration, or certification denied, suspended, revoked, or otherwise disciplined by a certification body?");

		Assert.assertEquals(readText(IfYesLicense), "If yes, provide a description of the circumstances.");
	}

	public void Affirmations_RequiredFields() {

		Assert.assertTrue(isDisplayed(MedicalConditionRequired));
		Assert.assertTrue(isDisplayed(IllegalRequired));
		Assert.assertTrue(isDisplayed(MisdemeanorRequired));
		Assert.assertTrue(isDisplayed(JurisdictionRequired));
		Assert.assertTrue(isDisplayed(JudgmentsRequired));
		Assert.assertTrue(isDisplayed(LicenseRequired));
	}

	public void YesMedicalCondition() {

		click(MedicalConditionYes);
	}

	public void YesIllegal() {

		click(IllegalYes);
	}

	public void YesMisdemeanor() {

		click(MisdemeanorYes);
	}

	public void YesJurisdiction() {

		click(JurisdictionYes);
	}

	public void YesJudgement() {

		click(JudgmentsYes);
	}

	public void YesLicense() {

		click(LicenseYes);
	}

	public void Affirmations_Text() {

		writeText(MedicalConditionText, "Test");
		writeText(IllegalText, "Test");
		writeText(MisdemeanorText, "Test");
		writeText(JurisdictionText, "Test");
		writeText(JudgmentsText, "Test");
		writeText(LicenseText, "Test");
	}

	public void AssertEquals_ThirdPartyCertification_BackFlowTester() {

		Assert.assertEquals(readText(CurrentNational),
				"Current National American Backflow Prevention Assoc. (ABPA) or American Society of Sanitary Engineers (ASSE) Certification. - upload copy of card");
		Assert.assertEquals(readText(SelectThirdParty), "Select Third Party");
		Assert.assertEquals(readText(CertificationNumber), "Certification Number");
		Assert.assertEquals(readText(ExpirationDate), "Expiration Date");
	}

	public void ThridPartyCertification_RequiredFields() {

		Assert.assertTrue(isDisplayed(CurrentNationalRequired));
	}

	public void Yes_ThirdPartyCertification() {

		click(CurrentNationalYes);
	}

	public void Select_ThridParty() {

		click(AnsSelectThirdParty);
		click(ThirdABPA);
	}

	public void Enter_CertificationNum() {

		writeText(CertificationNumText, "45154");
	}

	public void Enter_PastExpirationDate() {

		writeText(DatePick, "28082022");
	}

	public void Select_ExpirationDate() {

		clearText(DatePick);
		writeText(DatePick, "15012023");
	}

	public void AssertEquals_Training() {

		Assert.assertEquals(readText(OutOfStateCredentials), "Back Flow Tester Out of State Credentials or Training");
	}

	public void ClickOutOfState() {

		click(OutOfStateCredentials);
	}

	public void AssertEquals_OutofState_BackFlowTester() {

		Assert.assertEquals(readText(CurrentTesterCredn),
				"Current tester credentials issued by another jurisdiction? - upload copy of card");
		Assert.assertEquals(readText(NamingJurisd), "Name of issuing jurisdiction");
		Assert.assertEquals(readText(LicenseNumber), "License Number");
		Assert.assertEquals(readText(DateofExpiration), "Date of Expiration");
		Assert.assertEquals(readText(OutOfState), "Out of State course approved by Iowa? - upload course information");
		Assert.assertEquals(readText(CourseName), "Course Name");
		Assert.assertEquals(readText(CourseNumber), "Course Number");
		Assert.assertEquals(readText(CourseDate), "Course Date");
		Assert.assertEquals(readText(CourseLocation), "Course Location");
		Assert.assertEquals(readText(CourseSponsor), "Course Sponsor or Provider Name");
	}

	public void OutOfState_RequiredFields() {

		Assert.assertTrue(isDisplayed(CurrentTesterRequired));
		Assert.assertTrue(isDisplayed(OutOfStateRequired));
	}

	public void Yes_OutOfState() {

		click(CurrentTesterYes);
		click(OutOfStateYes);
	}

	public void Enter_NamingJuris() {

		writeText(NamingJurisdText, "New EMP");
	}

	public void Enter_LicenseNum() {

		writeText(LicenseNumberText, "45752");
	}

	public void Enter_PastDateOfExpiration() {

		writeText(DateofExpirationTextbox, "05092022");
	}

	public void Select_DateOfExpiration() {

		writeText(DateofExpirationTextbox, "05062023");
	}

	public void Enter_CourseName() {

		writeText(CourseNameText, "Mech");
	}

	public void Enter_CourseNum() {

		writeText(CourseNumberText, "WGE123");
	}

	public void Enter_FutureCourseDate() {

		writeText(CourseDateTextbox, "23032023");
	}

	public void Enter_CourseDate() {

		writeText(CourseDateTextbox, "05092022");
	}

	public void Enter_CourseLocation() {

		writeText(CourseLocationText, "IA");
	}

	public void Enter_CourseSponsor() {

		writeText(CourseSponsorText, "SGH Company");
	}

	public void AffirmationDetails_RequiredPopup() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500020 - Affirmation Details are required (in: defaultinfo_afcc)");
	}

	public void ThridPartyCertification_RequiredPopup() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500190 - All Third Party details are required. (in: defaultinfo_bfti)");
	}

	public void CertificationExpiry_Message() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500194 - Certifcation cannot be expired. (in: defaultinfo_bfti)");
	}

	public void OutOfState_RequiredPopup() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500192 - All Out of State credentials are required. (in: defaultinfo_bfti)");
	}

	public void OutOfStateCourse_ValidPopup() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500196 - Out of State Courses must be completed to be valid. (in: defaultinfo_bfti)");
	}

	public void Assert_Backflow_Payment() {

		Assert.assertEquals(readText(Program), "Backflow Tester");
		Assert.assertEquals(readText(ProgramDetail), "Backflow Tester");
		Assert.assertEquals(readText(Status), "New");
		Assert.assertEquals(readText(FeeDescr), "Backflow Tester Initial Fee");
		Assert.assertEquals(readText(FeeAmou), "$42.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $42.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $42.00");
	}

	public void Assert_Backflow_MakePayment() {

		Assert.assertEquals(readText(BackflowProduct), "Backflow");
		Assert.assertEquals(readText(FeeAmou), "$42.00");
		Assert.assertEquals(readText(PaidIn), "No");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount: $42.00");
		Assert.assertEquals(readText(PaidAmount), "Paid Amount: $00.00");
		Assert.assertEquals(readText(FeeDue), "Fee Due: $42.00");
	}

	public void Assert_BackFlow_PaymentWebsite() {

		Assert.assertEquals(readText(BackflowAmoun), "$42.00");
		Assert.assertEquals(readText(BackflowPaymentType), "One Time");
		Assert.assertEquals(readText(BackflowPaymentAmount), "$42.00");
		Assert.assertEquals(readText(BackFlowPayNow), "Pay Now");
	}

	public void Assert_ReceiptBackFlow() {

		Assert.assertEquals(readText(RDBackflowTesterInitial), "Backflow Tester Initial Fee");
		Assert.assertEquals(readText(RDFeeAmount), "$42.00");
		Assert.assertEquals(readText(RDTotal), "Total: $42.00");
	}
	
}

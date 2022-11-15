package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramIndustrialRadiographyPage extends BasePage {

	public ProgramIndustrialRadiographyPage(WebDriver driver) {
		super(driver);
	}

	// Apply Industrial Radiography

	By IndustrialProgram = By.xpath("//span[contains(text(),'Industrial Radiography')]");
	By Trainee = By.xpath("//span[contains(text(),'Trainee')]");
	By Trainer = By.xpath("//span[contains(text(),'Trainer (non-Iowa radiography card)')]");
	
	By IndustrialRadiographyTrainee = By.xpath("//div[contains(text(),'Industrial Radiography - Trainee')]");
	By IndustrialRadiographyTrainer = By.xpath("//div[contains(text(),'Industrial Radiography - Trainer (non-Iowa radiography card)')]");
	
	// Agency Authorized Training

	By AgencyAuthorizedTraining = By.xpath("//mat-panel-title[contains(text(),'Agency Authorized Training')]");

	By CompletedtheRequirements = By
			.xpath("//span[contains(text(),'Completed the requirements of 641-45.1(10)a and 641-45.1(10)b.')]");
	By YesComplete = By.xpath("(//input[@value='Yes'])[1]");

	By DateofPracticalExamination = By.xpath("//span[contains(text(),'Date of Practical Examination')]");
	By PracticalExamTextbox = By.xpath("//input[@type='date']");

	By Certificatefrom40hourtraining = By.xpath("//span[contains(text(),'Certificate from 40 hour training')]");
	By YesCertificate = By.xpath("(//input[@value='Yes'])[2]");
	
	//Out of State Trainer
	
	By LicenseNum = By.xpath("//span[contains(text(),'License Number')]");
	By LicenseNumRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1][contains(text(),'License Number')]");
	By LicenseNumTextbox = By.xpath("(//input[@type='text'])[1]");
	
	By StateIssuance = By.xpath("//span[contains(text(),'State of Issuance')]");
	By StateIssuanceRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2][contains(text(),'State of Issuance')]");
	By StateIssuanceDropd = By.xpath("(//mat-select[@role='combobox'])[1]");
	
	By ExpirationDate = By.xpath("//span[contains(text(),'Expiration Date')]");
	By ExpirationDateRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[3][contains(text(),'Expiration Date')]");
	By ExpirationDateTextbox = By.xpath("(//input[@type='date'])[2]");
	
	// Additional Qualification Requirements
	By AdditionalQualificationRequirements = By
			.xpath("//mat-panel-title[contains(text(),'Agency Authorized Training')]");

	By Radiographycompany = By.xpath("//span[contains(text(),'I am working for a radiography company')]");
	By YesRadioGraphCompany = By.xpath("(//input[@value='Yes'])[3]");

	By NameofRSO = By.xpath("//span[contains(text(),'Name of RSO')]");
	By NameofRSOTextbox = By.xpath("(//input[@type='text'])[1]");

	By RadiographyCompanyName = By.xpath("//span[contains(text(),'Radiography Company Name')]");
	By NameTextbox = By.xpath("(//input[@type='text'])[2]");

	By RadiographyCompanyLicense = By.xpath("//span[contains(text(),'Radiography Company License/Registration No')]");
	By LicenseTextbox = By.xpath("(//input[@type='text'])[3]");

	By RadiographyCompanyMailingAddress = By.xpath("//span[contains(text(),'Radiography Company Mailing Address')]");
	By MailingAddressTextbox = By.xpath("(//input[@type='text'])[4]");

	By RadiographyCompanyMailingPhone = By.xpath("//span[contains(text(),'Radiography Company Mailing Phone')]");
	By MailingPhoneTextbox = By.xpath("(//input[@type='text'])[5]");

	By RadiographRequired = By.xpath("//span[@class='isinfotitle-invalid']");

	// Additional Information
	
	By AdditionalInformation = By.xpath("//mat-panel-title[contains(text(),'Additional Information')]");

	By Whataddressdoyouwantthecard = By
			.xpath("//span[contains(text(),'What address do you want the card mailed to?')]");

	By WhatAddressDropd = By.xpath("(//mat-select[@role='combobox'])[1]");
	By WhatAddressRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[1]");

	By Company = By.xpath("(//span[contains(text(),'Company')])[5]");
	By Other = By.xpath("(//span[contains(text(),'Other')])[2]");
	By Personal = By.xpath("//span[contains(text(),'Personal')]");

	By OtherAddress = By.xpath("//span[contains(text(),'Other Address')]");
	By OtherAddressTextbox = By.xpath("(//input[@type='text'])[6]");

	By CurrentRadiographerCard = By.xpath("//span[contains(text(),'Do you hold a current radiographer card?')]");
	By YesCurrentRadioCard = By.xpath("(//input[@value='Yes'])[4]");

	By RadiographerCardRequired = By.xpath("(//span[@class='isinfotitle-invalid'])[2]");

	// Validation Messages
	By ErrorMessage = By.xpath("//p[contains(text(),'ERROR')]");

	//Attachment Types
	By CourtDoc = By.xpath("//span[contains(text(),'Court Documents')]");
	By CrystalReport = By.xpath("//span[contains(text(),'Crystal Report')]");
	By IndustrialRadioCard = By.xpath("//span[contains(text(),'Industrial Radiography Card')]");
	By License = By.xpath("//mat-option//span[contains(text(),'License')]");
	By NonIowaPermit = By.xpath("//span[contains(text(),'Non-Iowa Permit/Certification/Registration')]");
	By Photo = By.xpath("//span[contains(text(),'Photo')]");
	By Proof = By.xpath("//span[contains(text(),'Proof of Certification')]");
	By Signature = By.xpath("//span[contains(text(),'Signature')]");
	By WordMerge = By.xpath("//span[contains(text(),'Word Merge')]");

	// Apply Industrial Radiography

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(IndustrialProgram), "Industrial Radiography");
	}

	public void SelectIndustrialProgram() {

		click(IndustrialProgram);
	}

	public void IndustrialProgram_ProgramDetail() {

		Assert.assertEquals(readText(Trainee), "Trainee");

		Assert.assertEquals(readText(Trainer), "Trainer (non-Iowa radiography card)");
	}

	public void SelectPDTrainee() {
		click(Trainee);
	}

	public void SelectPDTrainer() {
		click(Trainer);
	}
	
	public void Assert_IndustrialRadiographyTrainee() {
		
		Assert.assertEquals(readText(IndustrialRadiographyTrainee), "Industrial Radiography - Trainee");
	}
	
	public void Assert_IndustrialRadiographyTrainer() {
		
		Assert.assertEquals(readText(IndustrialRadiographyTrainer), "Industrial Radiography - Trainer (non-Iowa radiography card)");
	}

	// Agency Authorized Training

	public void Expand_AgencyAuthorizedTraining() {

		click(AgencyAuthorizedTraining);
	}

	public void AssertEquals_AgencyAuthorizedTraining() {

		Assert.assertEquals(readText(AgencyAuthorizedTraining), "Agency Authorized Training");
		Assert.assertEquals(readText(CompletedtheRequirements),
				"Completed the requirements of 641-45.1(10)a and 641-45.1(10)b.");
		Assert.assertEquals(readText(DateofPracticalExamination), "Date of Practical Examination");
		Assert.assertEquals(readText(Certificatefrom40hourtraining), "Certificate from 40 hour training");
	}

	public void Enter_AgencyAuthorizedTraining() {

		click(YesComplete);
		writeText(PracticalExamTextbox, "10112022");
		click(YesCertificate);
	}

	// Additional Qualification Requirements

	public void Expand_AdditionalQualificationRequirements() {

		click(AdditionalQualificationRequirements);
	}

	public void AssertEquals_AdditionalQualificationRequirements() {

		Assert.assertEquals(readText(AdditionalQualificationRequirements), "Agency Authorized Training");
		Assert.assertEquals(readText(Radiographycompany), "I am working for a radiography company");
		Assert.assertEquals(readText(NameofRSO), "Name of RSO");
		Assert.assertEquals(readText(RadiographyCompanyName), "Radiography Company Name");
		Assert.assertEquals(readText(RadiographyCompanyLicense), "Radiography Company License/Registration No");
		Assert.assertEquals(readText(RadiographyCompanyMailingAddress), "Radiography Company Mailing Address");
		Assert.assertEquals(readText(RadiographyCompanyMailingPhone), "Radiography Company Mailing Phone");
	}

	public void AdditionalQualifi_RequiredFields() {

		Assert.assertTrue(isDisplayed(RadiographRequired));
	}

	public void Enter_AdditionalQualification() {

		click(YesRadioGraphCompany);
		writeText(NameofRSOTextbox, "Test 1");
		writeText(NameTextbox, "Test 2");
		writeText(LicenseTextbox, "Test 3");
		writeText(MailingAddressTextbox, "Test 4");
		writeText(MailingPhoneTextbox, "Test 5");
	}

	// Additional Information

	public void Expand_AdditionalInformation() {

		click(AdditionalInformation);
	}

	public void AssertEquals_IndustrialAffirmation() {

		Assert.assertEquals(readText(AdditionalInformation), "Additional Information");
		Assert.assertEquals(readText(Whataddressdoyouwantthecard), "What address do you want the card mailed to?");
		Assert.assertEquals(readText(OtherAddress), "Other Address");
		Assert.assertEquals(readText(CurrentRadiographerCard), "Do you hold a current radiographer card?");
	}

	public void AdditionalInfor_RequiredFields() {

		Assert.assertTrue(isDisplayed(WhatAddressRequired));
		Assert.assertTrue(isDisplayed(RadiographerCardRequired));
	}

	public void Click_WhatAddressDropd() {

		click(WhatAddressDropd);
	}

	public void AssertEquals_WhatAddressDropdown() {

		Assert.assertEquals(readText(Company), "Company");
		Assert.assertEquals(readText(Other), "Other");
		Assert.assertEquals(readText(Personal), "Personal");
	}

	public void Click_Other() {
		click(Other);
	}

	public void Enter_AdditionalInformation() {

		writeText(OtherAddressTextbox, "Test");
		click(YesCurrentRadioCard);
	}

	public void Assert_OtherAddress() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500041 - \"Other\" Address details are required. (in: defaultinfo_irad)");
	}
	
	public void AssertEquals_Industrial_AttachmentTypes() {

		Assert.assertEquals(readText(CourtDoc), "Court Documents");
		Assert.assertEquals(readText(CrystalReport), "Crystal Report");
		Assert.assertEquals(readText(IndustrialRadioCard), "Industrial Radiography Card");
		Assert.assertEquals(readText(License), "License");
		Assert.assertEquals(readText(NonIowaPermit), "Non-Iowa Permit/Certification/Registration");
		Assert.assertEquals(readText(Photo), "Photo");
		Assert.assertEquals(readText(Proof), "Proof of Certification");
		Assert.assertEquals(readText(Signature), "Signature");
		Assert.assertEquals(readText(WordMerge), "Word Merge");
	}

	
	
}

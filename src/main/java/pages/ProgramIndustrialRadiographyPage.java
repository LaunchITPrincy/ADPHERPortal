package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramIndustrialRadiographyPage extends BasePage {

	public ProgramIndustrialRadiographyPage(WebDriver driver) {
		super(driver);
	}

	By IndustrialProgram = By.xpath("//span[contains(text(),'Industrial Radiography')]");
	By Trainee = By.xpath("//span[contains(text(),'Trainee')]");
	By Trainer = By.xpath("//span[contains(text(),'Trainer (non-Iowa radiography card)')]");

	By AgencyAuthorizedTraining = By.xpath("//mat-panel-title[contains(text(),'Agency Authorized Training')]");
	By CompletedtheRequirements = By
			.xpath("//span[contains(text(),'Completed the requirements of 641-45.1(10)a and 641-45.1(10)b.')]");
	By DateofPracticalExamination = By.xpath("//span[contains(text(),'Date of Practical Examination')]");
	By Certificatefrom40hourtraining = By.xpath("//span[contains(text(),'Certificate from 40 hour training')]");

	By AdditionalQualificationRequirements = By
			.xpath("//mat-panel-title[contains(text(),'Agency Authorized Training')]");
	By radiographycompany = By.xpath("//span[contains(text(),'I am working for a radiography company')]");
	By NameofRSO = By.xpath("//span[contains(text(),'Name of RSO')]");
	By RadiographyCompanyName = By.xpath("//span[contains(text(),'Radiography Company Name')]");
	By RadiographyCompanyLicense = By.xpath("//span[contains(text(),'Radiography Company License/Registration No')]");
	By RadiographyCompanyMailingAddress = By.xpath("//span[contains(text(),'Radiography Company Mailing Address')]");
	By RadiographyCompanyMailingPhone = By.xpath("//span[contains(text(),'Radiography Company Mailing Phone')]");

	By AdditionalInformation = By.xpath("//mat-panel-title[contains(text(),'Additional Information')]");
	By Whataddressdoyouwantthecard = By
			.xpath("//span[contains(text(),'What address do you want the card mailed to?')]");
	By Company = By.xpath("(//span[contains(text(),'Company')])[5]");
	By Other = By.xpath("(//span[contains(text(),'Other')])[2]");
	By Personal = By.xpath("//span[contains(text(),'Personal')]");

	By OtherAddress = By.xpath("//span[contains(text(),'Other Address')]");
	By CurrentRadiographerCard = By.xpath("//span[contains(text(),'Do you hold a current radiographer card?')]");

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

	public void Assertion_IndustrialAffirmation() {

		Assert.assertEquals(readText(AgencyAuthorizedTraining), "Agency Authorized Training");
		Assert.assertEquals(readText(CompletedtheRequirements),
				"Completed the requirements of 641-45.1(10)a and 641-45.1(10)b.");
		Assert.assertEquals(readText(DateofPracticalExamination), "Date of Practical Examination");
		Assert.assertEquals(readText(Certificatefrom40hourtraining), "Certificate from 40 hour training");
		Assert.assertEquals(readText(AdditionalQualificationRequirements), "Agency Authorized Training");
		Assert.assertEquals(readText(radiographycompany), "I am working for a radiography company");
		Assert.assertEquals(readText(NameofRSO), "Name of RSO");
		Assert.assertEquals(readText(RadiographyCompanyName), "Radiography Company Name");
		Assert.assertEquals(readText(RadiographyCompanyLicense), "Radiography Company License/Registration No");
		Assert.assertEquals(readText(RadiographyCompanyMailingAddress), "Radiography Company Mailing Address");
		Assert.assertEquals(readText(RadiographyCompanyMailingPhone), "Radiography Company Mailing Phone");
		Assert.assertEquals(readText(AdditionalInformation), "Additional Information");
		Assert.assertEquals(readText(Whataddressdoyouwantthecard), "What address do you want the card mailed to?");
		Assert.assertEquals(readText(Company), "Company");
		Assert.assertEquals(readText(Other), "Other");
		Assert.assertEquals(readText(Personal), "Personal");
		Assert.assertEquals(readText(OtherAddress), "Other Address");
		Assert.assertEquals(readText(CurrentRadiographerCard), "Do you hold a current radiographer card?");
	}

}

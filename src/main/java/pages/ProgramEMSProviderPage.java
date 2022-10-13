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
	
	//Affirmations
	By PersonalInformationTitle = By.xpath("//mat-panel-title[contains(text(),'Personal Information')]");
	By Gender = By.xpath("//span[contains(text(),'Gender')]");
	By GenderDropd = By.xpath("(//mat-select[@role='combobox'])[1]");
	By FemaleGender = By.xpath("//span[contains(text(),'Female')]");
	By MaleGender = By.xpath("//span[contains(text(),'Male')]");
	By OtherGender = By.xpath("//span[contains(text(),'Other')]");
	By AreYouVeteran = By.xpath("//span[contains(text(),'Are you a veteran of the US Armed Forces?')]");
	By AreYouVeteranYes = By.xpath("(//input[@value='Yes'])[7]");
	By AreYouVeteranNo = By.xpath("(//input[@value='No'])[7]");
	
	By CurrentNationalRegistryTitle = By.xpath("//mat-panel-title[contains(text(),'Current National Registry')]");
	By CurrentNational = By.xpath("//span[contains(text(),'Current National Registry')]");
	By CurrentNationalDropd = By.xpath("(//mat-select[@role='combobox'])[2]");
	By CurrentNationalEMT = By.xpath("(//span[contains(text(),'EMT')])[4]");
	
	
	By NREMTNumber = By.xpath("//span[contains(text(),'NREMT Number (Attach a copy of NREMT Card)')]");
	By NREMTNumberTextbox = By.xpath("(//input[@type='text'])[7]");
	By NREMTExpirationDate = By.xpath("//span[contains(text(),'NREMT Expiration Date')]");
	By NREMTDatebox = By.xpath("//input[@type='date']");

	By ProviderDisaster = By.xpath("//mat-panel-title[contains(text(),'Provider Disaster Questions')]");
	By DisasterInIowa = By.xpath("//span[contains(text(),'Are you willing to respond to a disaster in Iowa?')]");
	By DisasterInIowaYes = By.xpath("(//input[@value='Yes'])[8]");
	By DisasterInIowaNo = By.xpath("(//input[@value='No'])[8]");
	
	By DisasterOutsideIowa = By.xpath("//span[contains(text(),'Are you willing to respond to a disaster that occurred')]");
	By DisasterOutsideIowaYes = By.xpath("(//input[@value='Yes'])[9]");
	By DisasterOutsideIowaNo = By.xpath("(//input[@value='No'])[9]");
	
	By FeeWaiver = By.xpath("//mat-panel-title[contains(text(),'Fee Waiver Request')]");
	By LicenseRegistration = By.xpath("//span[contains(text(),'Are you applying for this license')]");
	By LicenseRegistrationYes = By.xpath("(//input[@value='Yes'])[10]");
	By LicenseRegistrationNo = By.xpath("(//input[@value='No'])[10]");
	By ApplyFeeWaiver = By.xpath("//span[contains(text(),'Do you wish to apply for a fee')]");
	By ApplyFeeWaiverYes = By.xpath("(//input[@value='Yes'])[11]");
	By ApplyFeeWaiverNo = By.xpath("(//input[@value='No'])[11]");
	By FederalPovertyLevel = By.xpath("//span[contains(text(),'Is your household income less')]");
	By FederalPvertyLevelDropd = By.xpath("(//mat-select[@role='combobox'])[3]");
	By FederalPvertyLevelDropdNo = By.xpath("(//mat-option//span[contains(text(),'No')])[1]");
	By FederalPvertyLevelDropdNot = By.xpath("//mat-option//span[contains(text(),'Not Applicable:')]");
	By FederalPvertyLevelDropdYes = By.xpath("//mat-option//span[contains(text(),'Yes')]");
	By HouseholdIncome = By.xpath("//span[contains(text(),'I attest that my household income')]");
	By HouseholdIncomeDropd = By.xpath("(//mat-select[@role='combobox'])[4]");
	By HouseholdIncomeDropds = By.xpath("");
	By HouseholdIncomeDropdDependent = By.xpath("//mat-option//span[contains(text(),'If you were claimed as a dependent')]");
	By HouseholdIncomeDropdNot = By.xpath("//mat-option//span[contains(text(),'Not Applicable: Not')]");
	By HouseholdIncomeDropdOther = By.xpath("//mat-option//span[contains(text(),'Other documentation')]");
	
	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(EMSProgram), "EMS Provider");
	}

	public void SelectEMSProgram() {

		click(EMSProgram);
	}

	public void EMSProgram_ProgramDetail() {

		Assert.assertEquals(readText(AEMT), "AEMT");
		Assert.assertEquals(readText(EMR), "EMR");
		Assert.assertEquals(readText(EMStudent), "EMS Student");
		Assert.assertEquals(readText(EMT), "EMT");
		Assert.assertEquals(readText(Paramedic), "Paramedic");
	}

	public void SelectPDAEMT() {
		
		click(AEMT);
	}

	public void SelectPDEMR() {
		
		click(EMR);
	}

	public void SelectPDEMStudent() {
		
		click(EMStudent);
	}

	public void SelectPDEMT() {
		
		click(EMT);
	}

	public void SelectPDParamedic() {
		
		click(Paramedic);
	}
}

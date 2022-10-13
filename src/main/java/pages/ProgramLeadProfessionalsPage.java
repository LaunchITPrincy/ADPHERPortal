package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramLeadProfessionalsPage extends BasePage {

	public ProgramLeadProfessionalsPage(WebDriver driver) {
		super(driver);
	}

	By LeadProfessionals = By.xpath("//span[contains(text(),'Lead Professionals')]");
	By EBLLead = By.xpath("//span[contains(text(),'EBL Lead Inspector/Risk Assessor')]");
	By LeadAbatementContractor = By.xpath("//span[contains(text(),'Lead Abatement Contractor')]");
	By LeadAbatementWorker = By.xpath("//span[contains(text(),'Lead Abatement Worker')]");
	By LeadInspector = By.xpath("(//span[contains(text(),'Lead Inspector/Risk Assessor')])[2]");
	By LeadSafeRenovator = By.xpath("//span[contains(text(),'Lead Safe Renovator')]");
	By ProjectDesigner = By.xpath("//span[contains(text(),'Project Designer')]");
	By SamplingTechnician = By.xpath("//span[contains(text(),'Sampling Technician')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(LeadProfessionals), "Lead Professionals");
	}

	public void SelectLeadProfessionals() {
		click(LeadProfessionals);
	}

	public void LeadProfessionals_ProgramDetail() {

		Assert.assertEquals(readText(EBLLead), "EBL Lead Inspector/Risk Assessor");

		Assert.assertEquals(readText(LeadAbatementContractor), "Lead Abatement Contractor");

		Assert.assertEquals(readText(LeadAbatementWorker), "Lead Abatement Worker");

		Assert.assertEquals(readText(LeadInspector), "Lead Inspector/Risk Assessor");

		Assert.assertEquals(readText(LeadSafeRenovator), "Lead Safe Renovator");

		Assert.assertEquals(readText(ProjectDesigner), "Project Designer");

		Assert.assertEquals(readText(SamplingTechnician), "Sampling Technician");
	}

	public void SelectPDEBLLead() {
		
		click(EBLLead);
	}

	public void SelectPDLeadAbatementContractor() {
		
		click(LeadAbatementContractor);
	}

	public void SelectPDLeadAbatementWorker() {
		
		click(LeadAbatementWorker);
	}

	public void SelectPDLeadInspector() {
		
		click(LeadInspector);
	}

	public void SelectPDLeadSafeRenovator() {
		
		click(LeadSafeRenovator);
	}

	public void SelectPDProjectDesigner() {
		
		click(ProjectDesigner);
	}

	public void SelectPDSamplingTechnician() {
		
		click(SamplingTechnician);
	}
}

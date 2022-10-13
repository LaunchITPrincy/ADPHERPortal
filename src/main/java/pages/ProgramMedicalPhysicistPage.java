package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramMedicalPhysicistPage extends BasePage {

	public ProgramMedicalPhysicistPage(WebDriver driver) {
		super(driver);
	}

	By MedicalPhysicist = By.xpath("//span[contains(text(),'Medical Physicist')]");
	By Mammography = By.xpath("//span[contains(text(),'Mammography')]");
	By RadiationTherapy = By.xpath("//span[contains(text(),'Radiation Therapy')]");
	By Stereotacticallyguidedbreastbiopsy = By
			.xpath("//span[contains(text(),'Stereotactically guided breast biopsy')]");

	public void AssertEquals_ProgramDropd() {
		
		Assert.assertEquals(readText(MedicalPhysicist), "Medical Physicist");
	}

	public void SelectMedicalPhysicist() {
		
		click(MedicalPhysicist);
	}

	public void MedicalPhysicist_ProgramDetail() {

		Assert.assertEquals(readText(Mammography), "Mammography");

		Assert.assertEquals(readText(RadiationTherapy), "Radiation Therapy");

		Assert.assertEquals(readText(Stereotacticallyguidedbreastbiopsy), "Stereotactically guided breast biopsy");
	}

	public void SelectPDMammography() {
		
		click(Mammography);
	}

	public void SelectPDRadiationTherapy() {
		
		click(RadiationTherapy);
	}

	public void SelectPDStereotacticallyguidedbreastbiopsy() {
		
		click(Stereotacticallyguidedbreastbiopsy);
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramRadonIndividualPage extends BasePage {

	public ProgramRadonIndividualPage(WebDriver driver) {
		super(driver);
	}

	By RadonIndividual = By.xpath("//span[contains(text(),'Radon Individual')]");
	By MeasurementSpecialist = By.xpath("//span[contains(text(),'Measurements Specialist')]");
	By MitigationSpecialist = By.xpath("//span[contains(text(),'Mitigation Specialist')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(RadonIndividual), "Radon Individual");
	}

	public void SelectRadonIndividual() {
		
		click(RadonIndividual);
	}

	public void RadonIndividual_ProgramDetail() {

		Assert.assertEquals(readText(MeasurementSpecialist), "Measurements Specialist");

		Assert.assertEquals(readText(MitigationSpecialist), "Mitigation Specialist");
	}

	public void SelectPDMeasurementSpecialist() {
		
		click(MeasurementSpecialist);
	}

	public void SelectPDMitigationSpecialist() {
		
		click(MitigationSpecialist);
	}
}

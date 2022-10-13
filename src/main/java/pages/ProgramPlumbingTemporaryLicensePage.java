package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramPlumbingTemporaryLicensePage extends BasePage {

	public ProgramPlumbingTemporaryLicensePage(WebDriver driver) {
		super(driver);
	}

	By PlumbingTemporaryLicense = By.xpath("//span[contains(text(),'Plumbing Temporary License')]");
	By IndividualTempLicense = By.xpath("//span[contains(text(),'Individual Temp License')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(PlumbingTemporaryLicense), "Plumbing Temporary License");
	}

	public void SelectPlumbingTemporaryLicense() {
		
		click(PlumbingTemporaryLicense);
	}

	public void PlumbingTemporaryLicense_ProgramDetail() {

		Assert.assertEquals(readText(IndividualTempLicense), "Individual Temp License");
	}

	public void SelectPDIndividualTempLicense() {
		
		click(IndividualTempLicense);
	}

}

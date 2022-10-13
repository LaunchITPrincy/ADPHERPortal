package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramPermitToPracticePage extends BasePage {

	public ProgramPermitToPracticePage(WebDriver driver) {
		super(driver);
	}

	By PermitToPractice = By.xpath("//span[contains(text(),'Permit To Practice')]");
	By ProgramDetailPermitToPractice = By.xpath("//span[contains(text(),'Permit to Practice')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(PermitToPractice), "Permit To Practice");
	}

	public void SelectPermitToPractice() {
		
		click(PermitToPractice);
	}

	public void PermitToPractice_ProgramDetail() {

		Assert.assertEquals(readText(ProgramDetailPermitToPractice), "Permit to Practice");
	}

	public void SelectPDProgramDetailPermitToPractice() {
		
		click(ProgramDetailPermitToPractice);
	}
}

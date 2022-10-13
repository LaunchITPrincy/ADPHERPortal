package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramPlumbingandMechanicalSystemsPage extends BasePage {

	public ProgramPlumbingandMechanicalSystemsPage(WebDriver driver) {
		super(driver);
	}

	By PlumbingandMechanicalSystems = By.xpath("//span[contains(text(),'Plumbing and Mechanical Systems')]");
	By Course = By.xpath("//span[contains(text(),'Course')]");
	By ExamCandidate = By.xpath("//span[contains(text(),'Exam Candidate')]");
	By IndividualLicense = By.xpath("//span[contains(text(),'Individual License')]");
	By Instructor = By.xpath("//span[contains(text(),'Instructor')]");

	public void AssertEquals_ProgramDropd() {

		Assert.assertEquals(readText(PlumbingandMechanicalSystems), "Plumbing and Mechanical Systems");
	}

	public void SelectPlumbingandMechanicalSystems() {
		
		click(PlumbingandMechanicalSystems);
	}

	public void PlumbingandMechanicalSystems_ProgramDetail() {

		Assert.assertEquals(readText(Course), "Course");

		Assert.assertEquals(readText(ExamCandidate), "Exam Candidate");

		Assert.assertEquals(readText(IndividualLicense), "Individual License");

		Assert.assertEquals(readText(Instructor), "Instructor");
	}

	public void SelectPDCourse() {
		
		click(Course);
	}

	public void SelectPDExamCandidate() {
		
		click(ExamCandidate);
	}

	public void SelectPDIndividualLicense() {
		
		click(IndividualLicense);
	}

	public void SelectPDInstructor() {
		
		click(Instructor);
	}
}

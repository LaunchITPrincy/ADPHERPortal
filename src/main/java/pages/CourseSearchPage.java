package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CourseSearchPage extends BasePage {

	public CourseSearchPage(WebDriver driver) {
		super(driver);
	}

	By courSearch = By.xpath("//span[contains(text(),'Course Search')]");
	
	By searchCriteria = By.xpath("//h2[contains(text(),'Search Criteria')]");
	By search = By.xpath("//span[contains(text(),'Search')]");
	By reset = By.xpath("//span[contains(text(),'Reset')]");

	By CourseProgramLabel = By.xpath("//mat-label[contains(text(),'Program')]");
	By MonthLabel = By.xpath("//mat-label[contains(text(),'Month')]");
	By CourseYearLabel = By.xpath("//mat-label[contains(text(),'Year')]");
	By ProgramDropd = By.xpath("//mat-select[@name='program']");
	By MonthDropd = By.xpath("//mat-select[@name='month']");
	By YearDropd = By.xpath("//mat-select[@name='year']");
	By ProgramEmptyDropd = By.xpath("(//mat-option[@role='option'])[1]");
	By BackFlowProgram = By.xpath("//span[contains(text(),'Backflow Tester')]");
	By EMSProgram = By.xpath("//span[contains(text(),'EMS Provider')]");
	By IndustrialProgram = By.xpath("//span[contains(text(),'Industrial Radiography')]");
	By LeadProgram = By.xpath("//span[contains(text(),'Lead Professionals')]");
	By SelectMonth = By.xpath("//span[contains(text(),'April')]");
	By SelectYear = By.xpath("//span[contains(text(),'2020')]");
	By EmptyCourseSearchMessage = By.xpath("//p[contains(text(),'Please enter your search criteria.')]");
	
	By SearchResult = By.xpath("//div[contains(text(),'Search Result')]");
	By Export = By.xpath("//span[contains(text(),'Export')]");
	By ReturnButton = By.xpath("//span[contains(text(),'Return')]");
	By EventsReturned = By.xpath("//div[contains(text(),'event(s) returned.')]");
	By CalenderCourse = By.xpath("//div[@class='fc-event-title fc-sticky'][contains(text(),'32 hour initial course')]");
	By OKButton = By.xpath("//span[contains(text(),'Ok')]");
	
	By PopupCourseName = By.xpath("//td[contains(text(),'32 hour initial course')]");	

	public void ClickCourseSearch() {

		click(courSearch);
	}
	
	public void Assert_CourseSearch() {
		
		Assert.assertEquals(readText(searchCriteria), "Search Criteria");
	}

	public void AssertEquals_CourseSearchFields() {

		Assert.assertEquals(readText(CourseProgramLabel), "Program");
		Assert.assertEquals(readText(MonthLabel), "Month");
		Assert.assertEquals(readText(CourseYearLabel), "Year");
		
		Assert.assertEquals(readText(search), "Search");
		Assert.assertEquals(readText(reset), "Reset");
	}

	public void ClickSearch() {

		click(search);
	}

	public void ClickCourseSearchProgram() {

		click(ProgramDropd);
	}

	public void ClickCourseSearchMonth() {

		click(MonthDropd);
	}

	public void ClickCourseSearchYear() {

		click(YearDropd);
	}

	public void AssertEquals_CourseSearchProgram() {

		Assert.assertEquals(readText(BackFlowProgram), "Backflow Tester");
		Assert.assertEquals(readText(EMSProgram), "EMS Provider");
		Assert.assertEquals(readText(IndustrialProgram), "Industrial Radiography");
		Assert.assertEquals(readText(LeadProgram), "Lead Professionals");
	}

	public void AssertEquals_EmptyCourseSearchMessage() {

		Assert.assertEquals(readText(EmptyCourseSearchMessage), "Please enter your search criteria.");
	}

	public void ClickOK() {
		// scrolldown();
		click(OKButton);
	}

	public void ClickEmptyProgramDropd() {

		click(ProgramEmptyDropd);
	}

	public void ClickBackFlowTester() {

		click(BackFlowProgram);
	}

	public void ClickMonthValue() {

		click(SelectMonth);
	}

	public void ClickYearValue() {
		
		click(SelectYear);
	}
	
	public void Assert_SearchResults() {
		
		Assert.assertEquals(readText(SearchResult), "Search Result");
		Assert.assertEquals(readText(Export), "Export");		
		Assert.assertEquals(readText(ReturnButton), "Return");
		//Assert.assertEquals(readText(EventsReturned), "1 event(s) returned.");
		scrolldown();
		Assert.assertEquals(readText(CalenderCourse), "32 hour initial course");
	}

	public void ClickCalender() {
		
		click(CalenderCourse);
	}

	public void CourseNameCheckinPopup() {
	
		Assert.assertEquals(readText(PopupCourseName), "32 hour initial course");
	
	
	}


	public void ClickReturnButton() {
		
		click(ReturnButton);
	}

	public void ClickExport() {
		
		click(Export);
	}

	public void ClickReset() {
		
		click(reset);
	}
}

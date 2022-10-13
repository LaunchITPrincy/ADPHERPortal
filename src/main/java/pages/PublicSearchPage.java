package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PublicSearchPage extends BasePage {

	public PublicSearchPage(WebDriver driver) {
		super(driver);
	}
	
	By SearchCriteria = By.xpath("//h2[contains(text(),'Search Criteria')]");

	By LicenseNumberLabel = By.xpath("//mat-label[contains(text(),'License Number')]");
	By FacilityLabel = By.xpath("//mat-label[contains(text(),'Facility')]");
	By FirstNameLabel = By.xpath("//mat-label[contains(text(),'First Name')]");
	By LastNameLabel = By.xpath("//mat-label[contains(text(),'Last Name')]");
	By ProgramLabel = By.xpath("(//mat-label[contains(text(),'Program')])[1]");
	By ProgramDetailLabel = By.xpath("//mat-label[contains(text(),'Program Detail')]");
	By StatusLabel = By.xpath("//mat-label[contains(text(),'Status')]");
	By ClassificationLabel = By.xpath("//mat-label[contains(text(),'Classification')]");
	By CityLabel = By.xpath("//mat-label[contains(text(),'City')]");
	By CategoryLabel = By.xpath("//mat-label[contains(text(),'Category')]");
	By CountyLabel = By.xpath("//mat-label[contains(text(),'County')]");
	By DisciplinaryActionLabel = By.xpath("//mat-label[contains(text(),'Disciplinary Action')]");
	
	By licenseNumber = By.xpath("//input[@name='licenseNumber']");
	By facility = By.xpath("//input[@name='facility']");
	By firstName = By.xpath("//input[@name='firstName']");
	By lastName = By.xpath("//input[@name='lastName']");
	By program = By.xpath("//mat-select[@name='program']");
	By programDetail = By.xpath("//mat-select[@name='programDetail']");
	By status = By.xpath("//mat-select[@name='status']");
	By classification = By.xpath("//mat-select[@name='classification']");
	By city = By.xpath("//input[@name='city']");
	By category = By.xpath("//mat-select[@name='category']");
	By county = By.xpath("//mat-select[@name='county']");
	By disciplinaryAction = By.xpath("//mat-select[@name='disciplinaryAction']");
	
	By search = By.xpath("(//span[contains(text(),'Search')])[1]");
	By courSearch = By.xpath("//span[contains(text(),'Course Search')]");
	By reset = By.xpath("//span[contains(text(),'Reset')]");

	// Search Results
	By SearchResults = By.xpath("//div[contains(text(),'Search Result')]");

	By Export = By.xpath("//span[contains(text(),'Export')]");
	By License = By.xpath("//mat-header-cell[contains(text(),'License #')]");
	By LicenseNumberResults = By.xpath("//mat-cell[contains(text(),'12345')]");
	By Name = By.xpath("//mat-header-cell[contains(text(),'Name')]");
	By Program = By.xpath("//mat-header-cell[contains(text(),'Program')]");
	By City = By.xpath("//mat-header-cell[contains(text(),'City')]");
	By PublicDetails = By.xpath("//mat-header-cell[contains(text(),'Public Details')]");
	By DisciplinaryAction = By.xpath("//mat-header-cell[contains(text(),'Disciplinary Action')]");
	By DetailsLink = By.xpath("//span[contains(text(),'Details')]");
	
	//Public Search Details
	By PublicSearchDetail = By.xpath("//h2[contains(text(),'Public Search Detail')]");
	
	By LicenseDetail = By.xpath("//div[contains(text(),'License Detail')]");
	By ApplicantFacilityDetail = By.xpath("//div[contains(text(),'Applicant/Facility Details')]");
	By ApplicantFormDetail = By.xpath("//div[contains(text(),'Application Form Details 1')]");
	By LicenseInformation = By.xpath("//div[contains(text(),'License Information')]");
	By LicenseProcesses = By.xpath("//div[contains(text(),'License Processes')]");
	By PublicDocuments = By.xpath("//div[contains(text(),'Public Documents')]");
	
	By Back = By.xpath("//span[contains(text(),'Back')]");
	
	By Checkbox = By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]");
	By ToastMessage = By.xpath("//span[contains(text(),'Please enter your search criteria.')]");

	By NoResult = By.xpath("//div[contains(text(),'There is no result returned for your criteria.')]");
	By InvalidMessage = By.xpath("//span[contains(text(),'You entered an invalid value. Please enter the par')]");
	
	public void AssertEquals_SearchCriteria() {
		
		Assert.assertEquals(readText(SearchCriteria), "Search Criteria");
	}
	
	public void AssertEquals_PublicSearchFields() {
		
		Assert.assertEquals(readText(LicenseNumberLabel), "License Number");

		Assert.assertEquals(readText(FacilityLabel), "Facility");

		Assert.assertEquals(readText(FirstNameLabel), "First Name");

		Assert.assertEquals(readText(LastNameLabel), "Last Name");

		Assert.assertEquals(readText(ProgramLabel), "Program");

		Assert.assertEquals(readText(ProgramDetailLabel), "Program Detail");

		Assert.assertEquals(readText(StatusLabel), "Status");

		Assert.assertEquals(readText(ClassificationLabel), "Classification");

		Assert.assertEquals(readText(CityLabel), "City");

		Assert.assertEquals(readText(CategoryLabel), "Category");

		Assert.assertEquals(readText(CountyLabel), "County");

		Assert.assertEquals(readText(DisciplinaryActionLabel), "Disciplinary Action");
		
		Assert.assertEquals(readText(search), "Search");
		
		Assert.assertEquals(readText(courSearch), "Course Search");
		
		Assert.assertEquals(readText(reset), "Reset");
	}
	
	public void ClickSearch() {
		click(search);
	}
	
	public void AssertEquals_EmptySearchMessage() {
	
		Assert.assertEquals(readText(ToastMessage), "Please enter your search criteria.");
	}
	
	public void EnterLisenseNumber() throws InterruptedException {
		writeText(licenseNumber, "12345");
	}

	public void AssertEquals_SearchResults() throws InterruptedException {

		Assert.assertEquals(readText(SearchResults), "Search Result");

		Assert.assertEquals(readText(Export), "Export");

		Assert.assertEquals(readText(License), "License #");
		
		Assert.assertEquals(readText(LicenseNumberResults), "12345");

		Assert.assertEquals(readText(Name), "Name");

		Assert.assertEquals(readText(Program), "Program");

		Assert.assertEquals(readText(City), "City");

		Assert.assertEquals(readText(PublicDetails), "Public Details");

		Assert.assertEquals(readText(DisciplinaryAction), "Disciplinary Action");
	}

	public void ClickExport() {
		
		click(Export);
	}

	public void ClickCheckBox() throws InterruptedException {

		click(Checkbox);
	}

	public void ClickDetailsLink() {
		
		click(DetailsLink);
	}
	
	public void AssertEquals_PublicSearchDetail() {
		
		Assert.assertEquals(readText(PublicSearchDetail), "Public Search Detail");
		
		Assert.assertEquals(readText(LicenseDetail), "License Detail");

		Assert.assertEquals(readText(ApplicantFacilityDetail), "Applicant/Facility Details");

		Assert.assertEquals(readText(ApplicantFormDetail), "Application Form Details 1");

		Assert.assertEquals(readText(LicenseInformation), "License Information");

		Assert.assertEquals(readText(LicenseProcesses), "License Processes");

		Assert.assertEquals(readText(PublicDocuments), "Public Documents");
		
		Assert.assertEquals(readText(Back), "Back");
	}
	
	public void ClickBack() {
		
		click(Back);
	}
	
	public void ClickReset() {
		
		click(reset);
	}
	
	public void ClearSearchResults() throws InterruptedException {
		
		isDisplayed(SearchResults);
	}
	
	public void InvalidSearchData() {
		
		writeText(licenseNumber, "DGSHSN");
		click(search);
	}
	
	public void AssertEquals_InvalidPublicSearchResult() {
		
		Assert.assertEquals(readText(NoResult), "There is no result returned for your criteria.");
	}
	
	public void InvalidSearchInputValue() {
		
		writeText(licenseNumber, "%");
		click(search);
	}
	
	public void AssertEquals_InvalidPublicSearchMessage() {

		Assert.assertEquals(readText(InvalidMessage),
				"You entered an invalid value. Please enter the part of beginning value and follow a \"%\" sign if you are not sure the full field value.");
	}
	
}

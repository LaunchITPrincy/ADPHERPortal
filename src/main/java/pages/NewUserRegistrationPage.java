package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserRegistrationPage extends BasePage{

	public NewUserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	By name  = By.xpath("//input[@name='organization']");
	
	By TaxId = By.xpath("//input[@name='referenceFile']");
	By CompanyType = By.xpath("//mat-select[@name='companyType']");
	By programType = By.xpath("//mat-select[@name='programType']");
	By preferredAddress = By.xpath("//mat-select[@name='preferredAddress']");
	By emailAddress = By.xpath("//input[@name='emailAddress']");
	
	By addrPrefix = By.xpath("//input[@name='addrPrefix']");
	By addrHouse = By.xpath("//input[@name='addrHouse']");
	By addrStreet = By.xpath("//input[@name='addrStreet']");
	By phone1 = By.xpath("//input[@name='phone1']");
	By phone2 = By.xpath("//input[@name='phone2']");
	By zipCode = By.xpath("//input[@name='zipCode']");
	
	By unitNumber = By.xpath("//input[@name='unitNumber']");

	
}

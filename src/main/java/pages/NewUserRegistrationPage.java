package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewUserRegistrationPage extends BasePage  {

	public NewUserRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
		/**Web Elements*/
		
		By newUserRegistration = By.xpath("//h3[text()='New User Registration']");//from home page navigate to "new user registration page"
		By enterprisetxt = By.xpath("//div[@class='fltxt']");// verify text "Enterprise A&A" on top of the registration page
		By signintab = By.xpath("//li[@id='loginTab']");//verify sign in tab on the top of the page
		By createanaccounttab = By.xpath("//li[@id='createacctTab']");//verify "create an account" on the top of the page
		By forgotpwdtab = By.xpath("//li[@id='forgotpwdTab']");//verify "Forgot Password" on the top of the page
		By forgotid = By.xpath("//li[@id='forgotidTab']");//verify "Forgot ID"on the top of the page
		By heading = By.xpath("//div[@class='tab-content']");//verify "DPH Regulated Communities (Staging AWS)" title in center of the page 
		By fName = By.xpath("//label[contains(text(),'First Name:')]");//"First Name:" text verify
		By lName = By.xpath("//label[contains(text(),'Last Name:')]");//"Last Name:" text verify
		
		By firstname = By.xpath("//input[@id='firstNm']");//"First name" tab location
		By lastname = By.xpath("//input[@id='lastNm']");//"Last Name" tab location
		By registerbutton = By.xpath("//a[contains(text(),'Register')]");//"Register" button
		
		By importantwrd = By.xpath("//h2[contains(text(),'Important')]");//TEXT notion available below the page "Important!"
		By imptxt1 = By.xpath("//i[contains(text(),'You must have a valid email address')]");//TEXT1 notion available below the page "You must have a valid email address."
		By imptxt2 = By.xpath("//i[contains(text(),'Your A&A Account ID may not contain profanity or special characters.')]");//TEXT2 notion available below the page "Your A&A Account ID may not contain profanity or special characters."
		By imptxt3 = By.xpath("//i[contains(text(),'You will be required to complete some Security Baseline Questions and Answers.')]");//TEXT3 notion available below the page "You will be required to complete some Security Baseline Questions and Answers."
		
		By accountid = By.xpath("//input[@name='userId']");//Sign in "account ID" field
		By acIdPassword = By.xpath("//input[@name='xyz']");//account ID password field
		
		By accountdetails = By.xpath("//a[@id='acctDetailsBtn']");//"Account Details" text verify for the sign in tab
		
		By signinbtn = By.xpath("//a[@id='signInBtn']");//signin tab "sign in button" location
		
		By fpaccountid = By.xpath("//input[@id='userIdPwd']");//forgot password tabs account ID
		
		By retrievepassbtn = By.xpath("//a[contains(text(),'Retrieve Password')]");//retrieve password button in forgot password tab
		
		By emailtxt = By.xpath("//label[contains(text(),'Email Address: ')]");//"Email Address:" text verify location under forgot ID tab
		
		By emailtab = By.xpath("//input[@id='email']");//email tab to be filled under forgot ID tab
		
		By retreiveidbtn = By.xpath("//a[contains(text(),'Retrieve Id')]");//retreive ID button under forgot id tab 
		
		//By newUserregistration = By.xpath("//h3[contains(text(),'New User Registration')]");
		
	
		
		/**Page Methods*/
		
		public void navigateToRegPage() {
			click(newUserRegistration);		
		}
		
		public void verifyNavigationToRegPage() {
			
			String icontxt = readText(enterprisetxt);
			Assert.assertEquals(icontxt,"Enterprise A&A");
		}
		
		public void verifyNewUserRegPage() {
			
			String signintabtxt = readText(signintab);
			Assert.assertEquals(signintabtxt,"Sign In");
			
			String createaccounttabtxt = readText(createanaccounttab);
			Assert.assertEquals(createaccounttabtxt,"Create An Account"); 
			
			String forgotPasstabtxt = readText(forgotpwdtab);
			Assert.assertEquals(forgotPasstabtxt,"Forgot Password"); 
			
			String forgotIdtabtxt = readText(forgotid);
			Assert.assertEquals(forgotIdtabtxt,"Forgot ID");
			
			String centerTitletxt = readText(heading);
			Assert.assertEquals(centerTitletxt,"DPH Regulated Communities (Staging AWS)");
			
			String firstNametxt = readText(fName);
			Assert.assertEquals(firstNametxt,"First Name:");
			
			String lastNametxt = readText(lName);
			Assert.assertEquals(lastNametxt,"Last Name:");
			
			String registerbtntxt = readText(registerbutton);
			Assert.assertEquals(registerbtntxt,"Register");
			
			String impwrdtxt = readText(importantwrd);
			Assert.assertEquals(impwrdtxt,"Important!");
			
			String impwrd1txt = readText(imptxt1);
			Assert.assertEquals(impwrd1txt,"You must have a valid email address.");
		
			String impwrd2txt = readText(imptxt2);
			Assert.assertEquals(impwrd2txt,"Your A&A Account ID may not contain profanity or special characters.");
			
			String impwrd3txt = readText(imptxt3);
			Assert.assertEquals(impwrd3txt,"You will be required to complete some Security Baseline Questions and Answers.");
		}
		
		public void verifyRegisterWithoutEnteringCredentials() {
			click(registerbutton);	
		}

		public void verifyRegisteAlerttxt() {
			
			String alertTxt = driver.switchTo().alert().getText();
			Assert.assertEquals(alertTxt,"Please enter First Name.");
		}
		
		
		
		
}
	
	

	



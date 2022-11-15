package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    /**Web Elements*/
    By homepage = By.xpath("//h3[contains(text(),'Home')]"); //"Home" text verify 
    By publicsearch = By.xpath("//h3[contains(text(),'Public Search')]"); //"Public Search" text verify
    By newuserregistration = By.xpath("//h3[contains(text(),'New User Registration')]"); //"New User Registration" text verify
    By help = By.xpath("//h3[contains(text(),'Help')]"); // "Help" text verify
   
    By forgotpassword = By.xpath("//span[contains(text(),' Forgot Password')]"); //"Forgot Password" text verify
    By forgotid = By.xpath("//span[contains(text(),' Forgot ID')]"); //"Forgot ID" text verify
   
    
    By invalidusernamemsg = By.xpath("//span[contains(text(),'Invalid User/Password specified.')]"); //"Invalid User/Password specified." text verify for incorrect credentials
    
    By accountIDtxt = By.xpath("//mat-label[contains(text(),'Account ID:')]");//"Account ID:" text verify in sign in page
    By passwordtxt = By.xpath("//mat-label[contains(text(),'Password')]");//"Password" text verify in sign in page
    
    
    
    By Signin = By.xpath("//h3[contains(text(),'Sign In')]"); //"Sign In" text verify
    By signintxt = By.xpath("//h2[contains(text(),' Sign In')]");//sign in text in sign in in page
    By userNameId = By.xpath("//input[@name='accountID']");
    By passwordId = By.xpath("//input[@type='password']");
    By loginButtonId = By.xpath("//button[@color='primary']");
    
    By errormsg = By.xpath("//span[contains(text(),'Invalid User/Password specified.')]");
    
    By webregssntxt = By.xpath("//h2[contains(text(),' Web Registration SSN')]");//"Web Registration SSN" text verify for correct login
    
    By text = By.xpath("//div[contains(text(),'Registered Use')]");
    By text1 = By.xpath("//div[contains(text(),'Basic Profile Details')]");
    By text2 = By.xpath("//div[@class='mat-box-bp2']/div[1]");
    By nametext = By.xpath("//input[@name='name']");
    By addressbutton = By.xpath("//button[@color='accent']");
    By returnbutton = By.xpath("//span[contains(text(),'Return')]");
    By continuebutton = By.xpath("//button[@type='submit']");
    By loginpagelogo = By.xpath("//img[@alt='Portal']");
    By title = By.xpath("//div[contains(text(),'Programs for eswar  dadad')]");
    By makepayment = By.xpath("//div[@class='mat-tar']/button");
    
  //By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    //By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
    //By userIdElement = By.id("sidebar-content");
    //By signInAlert = By.xpath("//button[@class='btn btn-primary']");
    //By loginConflict = By.xpath("//input[@value='LOGIN_WITH_CONFLICT']");
	

    /**Page Methods
     * @throws InterruptedException */
    
    public void logout() {
    	By signOut = By.xpath("//h3[contains(text(),'Sign Off')]");
    	click(signOut);
    }
    
    public void AssertEquals_firstpage() {
    	
    	String hometxt = readText(homepage);
    	Assert.assertEquals(hometxt,"Home");
    	
    	String publicsearchtxt = readText(publicsearch);
    	Assert.assertEquals(publicsearchtxt,"Public Search");
    	
    	String ExpectedSignIn = readText(Signin);
        Assert.assertEquals(ExpectedSignIn, "Sign In");
    	
    	String newUserRegtxt = readText(newuserregistration);
    	Assert.assertEquals(newUserRegtxt,"New User Registration");
    	
    	String helptxt = readText(help);
    	Assert.assertEquals(helptxt,"Help");
    }
    	
    public void signin_page_txt_verify() {
    	click(Signin);
    	
    	String signintext = readText(signintxt);
    	Assert.assertEquals(signintext,"Sign In");
    	
    	String forgotpasstxt = readText(forgotpassword);
    	Assert.assertEquals(forgotpasstxt,"Forgot Password");
    	
    	String forgotidtxt = readText(forgotid);
    	Assert.assertEquals(forgotidtxt,"Forgot ID");
    	
    	String acIDtxt = readText(accountIDtxt);
    	Assert.assertEquals(acIDtxt,"Account ID:");
    	
    	String passtxt = readText(passwordtxt);
    	Assert.assertEquals(passtxt,"Password");	
    }
    
    public void invalid_credentials_verify() {
    	
    	writeText(userNameId, "test@gmail.com");
        writeText(passwordId, "testing");
        click(loginButtonId);
    }
    
    public void invalidSiginMessage() {
    	
        String invalidmsg = readText(invalidusernamemsg);
        Assert.assertEquals(invalidmsg,"Invalid User/Password specified.");   
    }
    
    public SignInPage sigininToAdpher() {
    	
    	clearText(userNameId);
    	clearText(passwordId);
   
    	writeText(userNameId, "eswar.sanjeeviraj@iowaid");
        writeText(passwordId, "eswar91@LIT");
        click(loginButtonId);
        
        return this;
    }

    public SignInPage verify_Signin(boolean expectedResult) {
    	
    	if (isDisplayed(webregssntxt)) {
            System.out.println("Logged In");	
    }
    	return this;
    }
    	
    	
    	
    	
    	
    	
    	
    	/*String ExpectedSignIn = readText(Signin);
         Assert.assertEquals(ExpectedSignIn, "Sign In");
         
        // String Actualtitle = driver.getTitle();
        // Assert.assertEquals(Actualtitle, "IDPH Board");
         
         String accountID = readText(userNameId);
         Assert.assertEquals(accountID, "account ID");
    	
         String passwordID = readText(passwordId);
         Assert.assertEquals(passwordID, "password");
         
       //  String passwordID = readText(passwordId);
      //   Assert.assertEquals(passwordID, "password");
         
         
         
         
    	
    }
    
   /* public LoginPage loginToAdpher; {
    	click(Signin);	
        writeText(userNameId, "eswar.sanjeeviraj@iowaid");
        writeText(passwordId, "eswar91@LIT");
        click(loginButtonId);
    }
    
    public LoginPage invalidcredentials; {
    	click(Signin);
    	writeText(userNameId, "test.sanjeeviraj@iowaid");
        writeText(passwordId, "test@LIT");
        click(loginButtonId);
        Assert.assertEquals(readText(errormsg), "invalid username or password");
    }
    
    public LoginPage gettitle; {
    	String Actualtitle = driver.getTitle();
		System.out.println("Title of the page:" + Actualtitle);
		Assert.assertEquals(Actualtitle, "IDPH Board");
    }
		
	//	public LoginPage logo() {
		//	boolean logo =(loginpagelogo).isDisplayed();
		//	System.out.println("Logo displayed or not:" + logo);
		//	Assert.assertTrue(logo);	
   // }
		
			

	//	public LoginPage verifytext() {
		
	/*
	 * if (text).isDisplayed()) { System.out.println("Title is displayed"); } else {
	 * System.out.println("Title is not diaplyed"); } }
	 */
		}
	//	public LoginPage verifytext1() {

			/*
			 * String expectedtext = "Basic Profile Details";
			 * 
			 * String actualtext = (text1).getText();
			 * 
			 * if (expectedtext.equalsIgnoreCase(actualtext))
			 * 
			 * System.out.println("The expected text is same as the actual text:" +
			 * actualtext); else
			 * System.out.println("The expected text is not same as the actual text:" +
			 * expectedtext);
			 */
	//	}

		/*
		 * public LoginPage verifytext2() {
		 * 
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * 
		 * jse.executeScript("window.scrollTo(4000)");
		 * 
		 * String expectedtext1 = "Physical Address Details";
		 * 
		 * String actualtext1 = text2.getText();
		 * 
		 * if (actualtext1.equals(actualtext1)) { System.out.
		 * println("The actual and expexted results are same. The Title value is:" +
		 * actualtext1); } else { System.out.
		 * println("The actual and expexted results are not same. The dispayed text is:"
		 * + expectedtext1); } }
		 * 
		 * public LoginPage verifyname() {
		 * 
		 * if (nametext.isDisplayed()) { System.out.println("Title is displayed"); }
		 * else { System.out.println("Title is not diaplyed"); } }
		 * 
		 * public LoginPage address() {
		 * 
		 * boolean address = addressbutton.isDisplayed();
		 * 
		 * System.out.println("address button displayed or not:" + address); }
		 * 
		 * public LoginPage addressclick() {
		 * 
		 * addressbutton.click();
		 * 
		 * returnbutton.click();
		 * 
		 * System.out.println(driver.getCurrentUrl()); }
		 * 
		 * public LoginPage continuebutton() {
		 * 
		 * continuebutton.click(); }
		 * 
		 * public LoginPage verifypaymenttitle() {
		 * 
		 * if (title.isDisplayed()) { System.out.println("Title is displayed"); } else {
		 * System.out.println("Title is not diaplyed"); } }
		 * 
		 * public LoginPage paymentpageverification() {
		 * 
		 * makepayment.click();
		 * 
		 * String expectedtxt = " There are no Fees to Pay.";
		 * 
		 * String actualtxt = nametext.getText();
		 * 
		 * if (actualtxt.equals(expectedtxt)) { System.out.
		 * println("The actual and expexted results are same. The name value is:" +
		 * actualtxt); } else { System.out.
		 * println("The actual and expexted results are not same. The dispayed name is:"
		 * + expectedtxt); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
			
			
    
    	/* public LoginPage verifyLoginUserName(String expectedText) {
    	        waitVisibility(errorMessageUsernameXpath);
    	        Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);

    	
    }

		private void screenshot(String actualtitle) {
			// TODO Auto-generated method stub
			
		}

    
    
    
    
    
   /* public LoginPage verifyLogin(boolean expectedResult) {
        if(isDisplayed(signInAlert)) 
        {
        	click(signInAlert);
        	click(loginConflict);
        }
        //waitVisibility(userIdElement);
        Assert.assertEquals(isDisplayed(userIdElement), expectedResult);
        return this;
    }
    
    public LoginPage verifyLoginUserName(String expectedText) {
        waitVisibility(errorMessageUsernameXpath);
        Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }

    public LoginPage verifyLoginPassword(String expectedText) {
        waitVisibility(errorMessagePasswordXpath);
        Assert.assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
 /*
  *  }
  */
  



package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ApplyProgramPage extends BasePage {

	public ApplyProgramPage(WebDriver driver) {
		
		super(driver);
	}

	By ndnnd = By.xpath("//div[@class=’login-page-container’]/descendant::*");
	
	By myPrograms = By.xpath("//h3[contains(text(),'My Programs')]");
	
	By MyProgramsLicense = By.xpath("//div[contains(text(),'License #')]");

	By ClickApplyProgram = By.xpath("//h3[contains(text(),'Apply for a Program')]");

	By ApplyProgramText = By.xpath("//h2[contains(text(),'Apply for Program')]");

	By ApplyforProgramSubText = By.xpath("//div[contains(text(),'Apply for Program')]");

	By ProgramDropd = By.xpath("//mat-select[@name='program']");

	By ProgramLabel = By.xpath("(//mat-label[contains(text(),'Program')])[1]");

	By ProgramDetailDropd = By.xpath("//mat-select[@name='programDetail']");

	By ProgramDetaiLabel = By.xpath("//mat-label[contains(text(),'Program Detail')]");

	By Cancel = By.xpath("//span[contains(text(),'Cancel')]");
	
	By Continue = By.xpath("//span[contains(text(),'Continue')]");

	By WithoutProgramPopup = By.xpath("//p[contains(text(),'Please select a Program and the Program Detail')]");

	By SureMessage = By.xpath("//p[contains(text(),'Are you sure you really want to apply for this program?')]");

	By Ok = By.xpath("//span[contains(text(),'Ok')]");

	By Cancel2 = By.xpath("(//span[contains(text(),'Cancel')])[2]");

	By EmptyDropd = By.xpath("(//mat-option[@role='option'])[1]");

	// Common Application Form
	By ApplicationForm = By.xpath("//h2[contains(text(),'Application Form')]");
	By ApplicationForm2 = By.xpath("//div[contains(text(),'Application Form')]");

	By Affirmation = By.xpath("//mat-panel-title[contains(text(),'Affirmation')]");
	By ThirdPartyCertification = By.xpath("//mat-panel-title[contains(text(),'Third Party Certification')]");

	By AttachmentsMenu = By.xpath("//div[contains(text(),'Attachments')]");
	By AttachmentDescription = By.xpath("//mat-header-cell[contains(text(),'Attachment Description')]");

	By TypeHeader = By.xpath("//mat-header-cell[contains(text(),'Type')]");
	By DescriptionHeader = By.xpath("//mat-header-cell[contains(text(),'Description')]");
	By FileHeader = By.xpath("//mat-header-cell[contains(text(),'File')]");

	By AddNewAttachment = By.xpath("//span[contains(text(),'Add New Attachment')]");
	By Type = By.xpath("//mat-select[@name='type']");
	By Description = By.xpath("//mat-label[contains(text(),'Description')]");
	By ChooseFile = By.xpath("//input[@name='content']");

	By DescriptionText = By.xpath("//input[@aria-required='true']");

	By Delete = By.xpath("//mat-icon[contains(text(),'delete')]");
	By UploadAttachment = By.xpath("//span[contains(text(),'Upload Attachments')]");

	By UploadMessage = By.xpath("//p[contains(text(),'Please attach your files first and then upload them.')]");

	By TypeRequirError = By.xpath("//mat-error[contains(text(),'Type is required')]");
	By DescriptionRequirError = By.xpath("//mat-error[contains(text(),'Description is required')]");
	By FileRequirError = By.xpath("//mat-error[contains(text(),'File is required')]");

	// Attachment Types
	By CourseMaterials = By.xpath("//span[contains(text(),'CEU Course Materials')]");
	By InstructorMaterials = By.xpath("//span[contains(text(),'CEU Instructor Materials')]");
	By Roster = By.xpath("//span[contains(text(),'CEU Roster')]");
	By CourtDoc = By.xpath("//span[contains(text(),'Court Documents')]");
	By CrystalReport = By.xpath("//span[contains(text(),'Crystal Report')]");
	By License = By.xpath("//mat-option//span[contains(text(),'License')]");
	By NonIowaPermit = By.xpath("//span[contains(text(),'Non-Iowa Permit/Certification/Registration')]");
	By Photo = By.xpath("//span[contains(text(),'Photo')]");
	By Proof = By.xpath("//span[contains(text(),'Proof of Certification')]");
	By Receipt = By.xpath("//span[contains(text(),'Receipt')]");
	By WordMerge = By.xpath("//span[contains(text(),'Word Merge')]");

	By ViewButton = By.xpath("//span[contains(text(),'View')]");

	By SubmitForm = By.xpath("//p[contains(text(),'Are you sure you really want to submit all application form?')]");

	// Terms and Conditions
	By TermsConditions = By.xpath("//h2[contains(text(),'Terms and Conditions')]");

	By Herebytext = By.xpath("//p[contains(text(),'I hereby certify and declare')]");
	By Submittingtext = By.xpath("//p[contains(text(),'In submitting this application')]");
	By UnderstandInfotext = By.xpath("//p[contains(text(),'I understand that this information')]");
	By Admintext = By.xpath("//p[contains(text(),'I have read the Administrative')]");

	By AgreeMessage = By.xpath("//span[contains(text(),'I agree with the terms and conditions.')]");

	By Checkbox = By.xpath("//input[@type='checkbox']");

	By AgreePopup = By.xpath("//p[contains(text(),'Pleae check')]");

	By ErrorMessage = By.xpath("//p[contains(text(),'ERROR')]");

	// Edit
	By EditBackFlowProgram = By.xpath("//mat-cell[contains(text(),'Backflow Tester')]");
	By EditLink = By.xpath("//span[contains(text(),'Edit')]");
	By BackFlowDetails = By.xpath("(//span[contains(.,'Details')])[1]");
	By EditMakePayment = By.xpath("//span[contains(text(),'Make Payment')]");

	// Payments

	By MakePayment = By.xpath("//h2[contains(text(),'Make Payment')]");
	By ThankText = By.xpath("//span[contains(text(),'Thank you')]");
	By Note = By.xpath("//span[contains(text(),'Note:')]");
	By NoteText = By.xpath("//span[contains(text(),'An')]");

	By LicenseDetails = By.xpath("//div[contains(text(),'License Details')]");
	By Reference = By.xpath("//mat-header-cell[contains(.,'Reference(Row ID) #')]");

	By Program = By.xpath("(//mat-header-cell[contains(text(),'Program')])[1]");
	By ProgramDetail = By.xpath("//mat-header-cell[contains(text(),'Program Detail')]");
	By Status = By.xpath("//mat-header-cell[contains(text(),'Status')]");
	By FeeDescription = By.xpath("//mat-header-cell[contains(text(),'Fee Description')]");
	By FeeAmount = By.xpath("//mat-header-cell[contains(text(),'Fee Amount')]");
	By PaidInFull = By.xpath("//mat-header-cell[contains(text(),'Paid in Full')]");

	By FeeDetails = By.xpath("//div[contains(text(),'Fee Details')]");
	By ProductFee = By.xpath("//mat-header-cell[contains(text(),'Product Fee Description')]");

	By PayLater = By.xpath("//button[@type='button']");

	By PayNow = By.xpath("//button//span[contains(text(),'Pay Now')]");

	By LaterOptions = By.xpath("//mat-select[@name='paymentLaterOptions']");
	By CheckDropd = By.xpath("//span[contains(text(),'Check')]");
	By IowaTransfer = By.xpath("//span[contains(text(),'Iowa Transfer')]");
	By OnlinePayment = By.xpath("//span[contains(text(),'Online Payment')]");

	// Payment Website
	By MakeAPayment = By.xpath("//h1[contains(text(),'Make a Payment')]");
	By MyPayment = By.xpath("//h2[contains(text(),'My Payment')]");
	By PaymentInfo = By.xpath("//h4[contains(text(),'Payment Information')]");
	By ContactInfo = By.xpath("//h3[contains(text(),'Contact Information')]");
	By PaymentMeth = By.xpath("//h3[contains(text(),'Payment Method')]");

	By AmountDueLabel = By.xpath("//span[contains(text(),'Amount Due')]");
	By FrequencyLabel = By.xpath("//span[contains(text(),'Frequency')]");
	By PaymentAmouLabel = By.xpath("//span[contains(text(),'Payment Amount')]");
	By PaymentDatLabel = By.xpath("//span[contains(text(),'Payment Date')]");

	By FNameLabel = By.xpath("//label[contains(text(),'First Name')]");
	By LNameLabel = By.xpath("//label[contains(text(),'Last Name')]");
	By CompanyLabel = By.xpath("//label[contains(text(),'Company')]");
	By Address1Label = By.xpath("//label[@for='contactInformation.address.street1']");
	By Address2Label = By.xpath("//label[@for='contactInformation.address.street2']");
	By CityLabel = By.xpath("//label[@for='contactInformation.address.city']");
	By StateLabel = By.xpath("//label[@for='contactInformation.address.state']");
	By ZipLabel = By.xpath("//label[@for='contactInformation.addresspostal_inpt']");
	By CountyLabel = By.xpath("//label[@for='contactInformation.address.country']");
	By PhoneNumLabel = By.xpath("//label[contains(text(),'Phone Number')]");
	By EmailAddrLabel = By.xpath("//label[contains(text(),'Email Address')]");
	By CardNumLabel = By.xpath("//label[contains(text(),'Card Number')]");
	By ExpirationLabel = By.xpath("//label[contains(text(),'Expiration Date')]");
	By CardSecurityLabel = By.xpath("//label[contains(text(),'Card Security Code')]");
	By CardBillLabel = By.xpath("//div[contains(text(),'Card Billing Address')]");

	By CountryTextbox = By.xpath("//input[@id='contactInformation.address.country']");
	By CardNumTextbox = By.xpath("//input[@id='creditCardPaymMethod.creditCardNumber']");
	
	By SelePaymentMethod = By.id("paymentMethodRef");
	
	By SelectExpirationDateMonth = By.xpath("//select[@id='creditCardPaymMethod.creditCardExpMonth']");
	By ExpirationDateMonth = By.xpath("//select[@id='creditCardPaymMethod.creditCardExpMonth']//option[@value='11']");
	By SelectExpirationDateYear = By.xpath("//select[@id='creditCardPaymMethod.creditCardExpYear']");
	By ExpirationDateYear = By.xpath("//select[@id='creditCardPaymMethod.creditCardExpYear']//option[@value='2023']");
	By CardSecurityCode = By.xpath("//input[@id='creditCardPaymMethod.creditCardCvv']");

	By CardNumRequiredError = By.xpath("(//span[contains(text(),'Required Field')])[1]");
	By ExpiryRequiredError = By.xpath("(//span[contains(text(),'Required Field')])[2]");
	//By ExpiryRequiredError = By.xpath("(//span[contains(text(),'Required Field')])[3]");
	
	By InvalidCardNumError = By.xpath("//span[@id='creditCardPaymMethod.creditCardNumber.errors']");

	By PaymentContinue = By.xpath("//input[@value='Continue']");
	By PaymentCancel = By.xpath("//a[contains(text(),'Cancel')]");
	
	//Review Payment
	By ReviewPaym = By.xpath("//h1[contains(text(),'Review Payment')]");
	By ReviewText = By.xpath("//p[contains(text(),'Please review')]");
	By PaymentDetails = By.xpath("//h2[contains(text(),'Payment Details')]");
	By PaymentMetho = By.xpath("//h2[contains(text(),'Payment Method')]");
	By BillingAddres = By.xpath("//h2[contains(text(),'Billing Address')]");
	By ContactInforma = By.xpath("//h2[contains(text(),'Contact Information')]");
	
	By SimilarPayment = By.xpath("//div[contains(text(),'A similar payment')]");
	By ContinuePay = By.xpath("//input[@value='Continue Payment']");
	
	By Confirm = By.xpath("//input[@id='confirm']");
	
	By ConfirmPage = By.xpath("//h1[contains(text(),'Confirmation')]");
	
	//Payment Receipt
	By PaymentReceipt = By.xpath("//span[contains(text(),'Receipt')]");
	
	By PaymentNumber = By.xpath("//mat-header-cell[contains(text(),'Payment Number')]");
	By PaymentType = By.xpath("//mat-header-cell[contains(text(),'Payment Type')]");
	By ReceiptPaymentDate = By.xpath("//mat-header-cell[contains(text(),'Payment Date')]");
	By ReceiptPaymentAmount = By.xpath("//mat-header-cell[contains(text(),'Payment Amount')]");
	
	By ReceiptCopy = By.xpath("//h2[contains(text(),'Payment Receipt')]");
	By ThankOnlineText = By.xpath("//div[contains(text(),'Thank you')]");
	By PrintText = By.xpath("//div[@class='specialdiv']");
	By ReceiptCopyMiddle = By.xpath("//h3[contains(text(),'Receipt')]");
	
	By ReceiptInformation = By.xpath("//div[contains(text(),'Receipt Information')]");
	By ReceiptNo = By.xpath("//td[contains(text(),'Receipt No.:')]");
	By PaymentDate = By.xpath("//td[contains(text(),'Payment Date:')]");
	By InvoiceNo = By.xpath("//td[contains(text(),'Invoice No.:')]");
	
	By PayerInformation = By.xpath("//div[contains(text(),'Payer Information')]");
	By Company = By.xpath("//td[contains(text(),'Company:')]");
	By PaymentMade = By.xpath("//td[contains(text(),'Payment Made By:')]");
	By PhoneNo = By.xpath("//td[contains(text(),'Phone No.:')]");
	By PaymentMethod = By.xpath("//td[contains(text(),'Payment Method:')]");
	By PaymentAmount = By.xpath("//td[contains(text(),'Payment Amount:')]");
	By Comments = By.xpath("//td[contains(text(),'Comments:')]");
		
	By ReceiptDetails = By.xpath("//div[contains(text(),'Receipt Details')]");
	By RDFeeDescription = By.xpath("//mat-header-cell[contains(text(),'Fee Description')]");
	By RDInternal = By.xpath("//mat-header-cell[contains(text(),'Internal Ref. No.')]");
	By RDFeeAmount = By.xpath("//mat-header-cell[contains(text(),'Fee Amount')]");
	By RDMyPrograms = By.xpath("//span[contains(text(),'My Programs')]");
	
	By BackButton = By.xpath("//button[@type='button']");
	
	// Apply for a Program//

	public void ClickMyPrograms() {
		
		click(myPrograms);
	}

	public void ClickApplyForAProgram() {
		
		click(ClickApplyProgram);
	}

	public void AssertEquals_ApplyProgramMenu() {
		
		Assert.assertEquals(readText(ApplyProgramText), "Apply for Program");
	}

	public void AssertEquals_ApplyProgrampage() {
	
		Assert.assertEquals(readText(ApplyforProgramSubText), "Apply for Program");
		Assert.assertEquals(readText(ProgramLabel), "Program");
		Assert.assertEquals(readText(ProgramDetaiLabel), "Program Detail");
		Assert.assertEquals(readText(Cancel), "Cancel");
		Assert.assertEquals(readText(Continue), "Continue");
	}

	public void ClickProgram() {
		
		click(ProgramDropd);
	}

	public void ClickProgramDetail() {
		
		click(ProgramDetailDropd);
	}

	public void ClickContinue() {

		click(Continue);
	}

	public void ClickOk() {
		click(Ok);
	}

	public void ClickCancel() {
		click(Cancel);
	}

	public void AssertEquals_WithoutProgramMessage() {

		Assert.assertEquals(readText(WithoutProgramPopup), "Please select a Program and the Program Detail");
	}

	public void AssertEquals_MyProgram() {
		
		Assert.assertEquals(readText(MyProgramsLicense), "License #");
	}

	public void ApplyProgramPopup() {
	
		Assert.assertEquals(readText(SureMessage), "Are you sure you really want to apply for this program?");
	}

	public void PopupClickCancel() {
		click(Cancel2);
	}

	// Application Forms//

	public void AssertEquals_ApplicationFormMenu() {

		Assert.assertEquals(readText(ApplicationForm), "Application Form");
	}

	public void AssertEquals_ApplicationForm() {

		Assert.assertEquals(readText(ApplicationForm), "Application Form");
		Assert.assertEquals(readText(ApplicationForm2), "Application Form");
		Assert.assertEquals(readText(AttachmentsMenu), "Attachments");
		Assert.assertEquals(readText(AttachmentDescription), "Attachment Description");
		Assert.assertEquals(readText(AddNewAttachment), "Add New Attachment");
		Assert.assertEquals(readText(Cancel), "Cancel");
		Assert.assertEquals(readText(Continue), "Continue");
	}

	public void AssertEquals_Affirmation() {

		Assert.assertEquals(readText(Affirmation), "Affirmation");
	}

	public void ClickAffirmations() throws InterruptedException {
		click(Affirmation);
	}

	public void AssertEquals_ThirdPartyCertification() {

		Assert.assertEquals(readText(ThirdPartyCertification), "Third Party Certification");
	}

	public void ClickThirdPartyCertification() {
		click(ThirdPartyCertification);
	}

	public void ApplyingDuplicateLicese() {

		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500028 - This applicant already has a valid License of this type. (in: defaultfee_afcc_folder)");
	}

	// Attachments//

	public void ClickAddNewAttachment() {
		click(AddNewAttachment);
	}

	public void AssertEquals_Attachment() {

		Assert.assertEquals(readText(TypeHeader), "Type");
		Assert.assertEquals(readText(DescriptionHeader), "Attachment Description");
		Assert.assertEquals(readText(FileHeader), "File");
		//assertEquals(readText(Type), "Type");
		Assert.assertEquals(readText(Description), "Description");
	}

	public void ClickAttachmentType() {
		click(Type);
	}

	public void AssertEquals_AttachmentTypes() {

		Assert.assertEquals(readText(CourseMaterials), "CEU Course Materials");
		Assert.assertEquals(readText(InstructorMaterials), "CEU Instructor Materials");
		Assert.assertEquals(readText(Roster), "CEU Roster");
		Assert.assertEquals(readText(CourtDoc), "Court Documents");
		Assert.assertEquals(readText(CrystalReport), "Crystal Report");
		Assert.assertEquals(readText(License), "License");
		Assert.assertEquals(readText(NonIowaPermit), "Non-Iowa Permit/Certification/Registration");
		Assert.assertEquals(readText(Photo), "Photo");
		Assert.assertEquals(readText(Proof), "Proof of Certification");
		Assert.assertEquals(readText(Receipt), "Receipt");
		Assert.assertEquals(readText(WordMerge), "Word Merge");
	}

	public void Click_Delete() {
		
		click(Delete);
	}

	public void IsNotDisplayed_Delete() {
		
		if (isDisplayed(Delete)) {
			System.out.println("Element not Displayed");
		} else {
			System.out.println("By Clicking Delete button Element got Removed");
		}
	}

	public void ClickUploadAttachment() {
		
		click(UploadAttachment);
	}

	public void WithoutFileUploadAttachment() {

		Assert.assertEquals(readText(UploadMessage), "Please attach your files first and then upload them.");
	}

	public void RequiredFields_Attachment() {

		Assert.assertEquals(readText(TypeRequirError), "Type is required");
		Assert.assertEquals(readText(DescriptionRequirError), "Description is required");
		Assert.assertEquals(readText(FileRequirError), "File is required");
	}

	public void SelectAttachmentType_CourseMaterials() {
		
		click(CourseMaterials);
	}

	public void SelectAttachmentType_InstructorMaterials () {
		
		click(InstructorMaterials);
	}
	
	public void Enter_Description() {
		
		writeText(DescriptionText, "Attachment Type CEU Course Materials Upload");
	}
	
	public void Enter_InstructorMaterials_Desp() {
		
		writeText(DescriptionText, "Attachment Type Instructor Materials Upload");
	}

	public void Click_ChooseFile() {
		
		click(ChooseFile);
	}

	public void UploadFile() throws InterruptedException, IOException {
		
		waitTime();
		FileUpload();
		waitTime();
	}

	public void IsDisplayed_View() throws InterruptedException {
		waitTime();
		isDisplayed(ViewButton);
	}

	public void AssertEquals_ConfirmMessage() {

		Assert.assertEquals(readText(SubmitForm), "Are you sure you really want to submit all application form?");
	}

	// Terms and Conditions Page //

	public void AssertEquals_TermsAndConditions() {

		Assert.assertEquals(readText(TermsConditions), "Terms and Conditions");
	}

	public void AssertEquals_TermsAndConditionsTexts() {

		Assert.assertEquals(readText(Herebytext),
				"I hereby certify and declare under penalty of perjury that the information I provided in this document, including any attachments, is true and correct. I am responsible for the accuracy of the information provided regardless of who completes and submits the application. I understand that providing false and misleading information in or concerning my application may be cause for disciplinary action, denial, revocation, and/or criminal prosecution. I also understand that I am required to update answers or information submitted herewith if the response or the information changes.");


		Assert.assertEquals(readText(Submittingtext),
				"In submitting this application, I consent to any reasonable inquiry that may be necessary to verify or clarify the information I provided on or in conjunction with this application.");

		Assert.assertEquals(readText(UnderstandInfotext),
				"I understand that this information is a public record in accordance with Iowa Code chapter 22 and that application information is public information, subject to the exceptions contained in Iowa law.");

		Assert.assertEquals(readText(Admintext),
				"I have read the Administrative Rules governing this profession and I agree to comply with those provisions.");

		Assert.assertEquals(readText(AgreeMessage), "   I agree with the terms and conditions.");

		Assert.assertEquals(readText(Continue), "Continue");
	}

	public void AssertEquals_AgreePopup() {
	
		Assert.assertEquals(readText(AgreePopup), "Pleae check the 'I agree with the terms and conditions' checkbox first.");
	}

	public void Click_Checkbox() {
		
		click(Checkbox);
	}

	public void Assert_Incomplete_Popup() {
		
		Assert.assertEquals(readText(ErrorMessage),
				"ERROR: Key:500022 - Your application is incomplete please review the Application Form Infos by returning to the My Programs screen and clicking the Edit link on this license application. (in: defaultfee_afcc_100 )");
	}

	// Program Edit//
	public void Click_Edit() {
		
		click(EditLink);
	}

	public void Click_Details() {
		
		click(BackFlowDetails);
	}

	public void Click_EditPayment() {
		
		click(EditMakePayment);
	}

	// Make Payment//
	public void AssertEquals_MakeAPayment() {
		Assert.assertEquals(readText(MakePayment), "Make Payment");
	}
	
	public void AssertEquals_NOPayment() {
		
		Assert.assertEquals(readText(ThankText),
				"Thank you for completing your Application or Request. You may now select the Pay Now button to continue for Payment. If you have additional Licenses to Apply for, Renew, or Reactivate you can select the Pay Later button.");

		Assert.assertEquals(readText(Note), "Note:");
		Assert.assertEquals(readText(NoteText),
				"An application is not considered submitted until payment is made. You may check the status of your License(s) by signing into the website at a Later Date and reviewing on the My Programs page. Application fees are non-refundable.");

	}
	
	public void AssertEquals_Payment() {

		//Assert.assertEquals(readText(MakePayment), "Make Payment");

		Assert.assertEquals(readText(ThankText),
				"Thank you for completing your Application or Request. You may now select the Pay Now button to continue for Payment. If you have additional Licenses to Apply for, Renew, or Reactivate you can select the Pay Later button.");

		Assert.assertEquals(readText(Note), "Note:");
		Assert.assertEquals(readText(NoteText),
				"An application is not considered submitted until payment is made. You may check the status of your License(s) by signing into the website at a Later Date and reviewing on the My Programs page. Application fees are non-refundable.");

		Assert.assertEquals(readText(LicenseDetails), "License Details");
		Assert.assertEquals(readText(Reference), "Reference\n" + "(Row ID) #");
		Assert.assertEquals(readText(Program), "Program");
		Assert.assertEquals(readText(ProgramDetail), "Program Detail");
		Assert.assertEquals(readText(Status), "Status");
		Assert.assertEquals(readText(FeeDescription), "Fee Description");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount");
		Assert.assertEquals(readText(PaidInFull), "Paid in Full");
		Assert.assertEquals(readText(PayLater), "Pay Later");
		Assert.assertEquals(readText(PayNow), "Pay Now");

	}

	public void AssertEquals_MakePayment() {

		Assert.assertEquals(readText(MakePayment), "Make Payment");

		Assert.assertEquals(readText(ThankText),
				"Thank you for completing your Application or Request. You may now select the Pay Now button to continue for Payment. If you have additional Licenses to Apply for, Renew, or Reactivate you can select the Pay Later button.");

		Assert.assertEquals(readText(Note), "Note:");

		Assert.assertEquals(readText(NoteText),
				"An application is not considered submitted until payment is made. You may check the status of your License(s) by signing into the website at a Later Date and reviewing on the My Programs page. Application fees are non-refundable.");

		Assert.assertEquals(readText(FeeDetails), "Fee Details");
		Assert.assertEquals(readText(Reference), "Reference\n" + "(Row ID) #");
		Assert.assertEquals(readText(ProductFee), "Product Fee Description");
		Assert.assertEquals(readText(FeeAmount), "Fee Amount");
		Assert.assertEquals(readText(PaidInFull), "Paid in Full");
		Assert.assertEquals(readText(PayLater), "Pay Later");
		Assert.assertEquals(readText(PayNow), "Pay Now");
	}

	public void Click_PayLater() {
		
		click(PayLater);
	}

	public void Click_PayNow() {
		
		click(PayNow);
	}

	public void Click_PayLaterOption() {
		
		click(LaterOptions);
	}

	public void Alert_Accept() throws InterruptedException {
		
		AlertAccept();
	}

	public void Alert_Dimiss() {
		
		AlertCancel();
	}

	public void Assert_PaymentLater() {

		Assert.assertEquals(readText(CheckDropd), "Check");
		Assert.assertEquals(readText(IowaTransfer), "Iowa Transfer");
		Assert.assertEquals(readText(OnlinePayment), "Online Payment");
	}

	public void Click_Check() {
		
		click(CheckDropd);
	}

	public void Click_IowaTransfer() {
		
		click(IowaTransfer);
	}

	public void Click_OnlinePayment() {
		
		click(OnlinePayment);
	}

	public void IDPPaymentWebsite() throws InterruptedException {

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String ParentWindowAddress = it.next();
		// System.out.println("ParentWindow : " + ParentWindowAddress);
		String ChildWindowAddress = it.next();
		// System.out.println("ChildWindow : " + ChildWindowAddress);

		driver.switchTo().window(ChildWindowAddress);
		String CurrentURL = driver.getCurrentUrl();
		// System.out.println(CurrentURL);
		Assert.assertEquals(CurrentURL,
				"https://epayment.epymtservice.com/main/makePayment/paymentDetails?execution=e1s1");
		// waitTime();
		driver.switchTo().window(ParentWindowAddress);
		// waitTime();
	}

	public void AssertEquals_PaymentWebsite() {

		Assert.assertEquals(readText(MakeAPayment), "Make a Payment");
	}

	public void AssertEquals_MakeAPaymentWebsite() {

		Assert.assertEquals(readText(MyPayment), "My Payment");
		Assert.assertEquals(readText(AmountDueLabel), "Amount Due");

		Assert.assertEquals(readText(PaymentInfo), "Payment Information");
		Assert.assertEquals(readText(FrequencyLabel), "Frequency");
		Assert.assertEquals(readText(PaymentAmouLabel), "Payment Amount");
		Assert.assertEquals(readText(PaymentDatLabel), "Payment Date");

		Assert.assertEquals(readText(ContactInfo), "Contact Information");
		Assert.assertEquals(readText(FNameLabel), "First Name");
		Assert.assertEquals(readText(LNameLabel), "Last Name");
		Assert.assertEquals(readText(CompanyLabel), "Company (Optional)");
		Assert.assertEquals(readText(Address1Label), "Address 1");
		Assert.assertEquals(readText(Address2Label), "Address 2 (Optional)");
		Assert.assertEquals(readText(CityLabel), "City/Town");
		Assert.assertEquals(readText(StateLabel), "State/Province/Region");
		Assert.assertEquals(readText(ZipLabel), "Zip/Postal Code");
		Assert.assertEquals(readText(CountyLabel), "Country");
		Assert.assertEquals(readText(PhoneNumLabel), "Phone Number");
		Assert.assertEquals(readText(EmailAddrLabel), "Email Address");

		Assert.assertEquals(readText(PaymentMeth), "Payment Method");
		Assert.assertEquals(readText(CardNumLabel), "Card Number");
		Assert.assertEquals(readText(ExpirationLabel), "Expiration Date");
		Assert.assertEquals(readText(CardSecurityLabel), "Card Security Code");
		Assert.assertEquals(readText(CardBillLabel), "Card Billing Address");

		// assertEquals(readText(PaymentContinue), "Continue");
		Assert.assertEquals(readText(PaymentCancel), "Cancel");
	}

	public void Click_PaymentContinue() {
		
		click(PaymentContinue);
	}

	public void Assert_RequiredError() {

		//assertEquals(readText(CountryRequiredError), "Required Field");
		Assert.assertEquals(readText(CardNumRequiredError), "Required Field");
		Assert.assertEquals(readText(ExpiryRequiredError), "Required Field");
	}
	
	public void InvalidEnter_CardNum() {
		
		writeText(CardNumTextbox, "4111111111");
	}
	
	public void Assert_InvalidCardNum() {
		
		Assert.assertEquals(readText(InvalidCardNumError), "You have entered an invalid card number. Please try again.");
	}
	
	public void Select_PaymentMethod() {
		
		writeText(SelePaymentMethod, "Credit/Debit Card");
	}

	public void Enter_PaymentDetails() {
		
		//clearText(CountryTextbox);
		//writeText(CountryTextbox, "USA");
		writeText(CardNumTextbox, "4111111111111111");
		writeText(CardSecurityCode, "123");
	}

	public void Select_ExpirationMonth() {

		writeText(SelectExpirationDateMonth, "05");
	}

	public void Select_ExpirationYear() {

		writeText(SelectExpirationDateYear, "2023");
	}
	
	public void Assert_ReviewPayment() {
		
		Assert.assertEquals(readText(ReviewPaym), "Review Payment");
		Assert.assertEquals(readText(ReviewText), "Please review the information below and select Confirm to process your payment. Select Back to return to the previous page to make changes to your payment.");
		Assert.assertEquals(readText(PaymentDetails), "Payment Details");
		Assert.assertEquals(readText(PaymentMetho), "Payment Method");
		Assert.assertEquals(readText(BillingAddres), "Billing Address");
		Assert.assertEquals(readText(ContactInforma), "Contact Information");
	}

	public void Click_Confirm() {
		
		click(Confirm);
	}
	
	public void Click_ContinuePayment() {
		
		if (isDisplayed(SimilarPayment)) {
			click(ContinuePay);
		}
	}
	
	public void Assert_Confirmation() {
		
		Assert.assertEquals(readText(ConfirmPage), "Confirmation");
	}
	
	public void Assert_Payment() {
		
		Assert.assertEquals(readText(PaymentReceipt), "Receipt");
		Assert.assertEquals(readText(PaymentNumber), "Payment Number");
		Assert.assertEquals(readText(PaymentType), "Payment Type");
		Assert.assertEquals(readText(ReceiptPaymentDate), "Payment Date");
		Assert.assertEquals(readText(ReceiptPaymentAmount), "Payment Amount");
	}
	
	public void Click_PaymentReceipt() {
		
		click(PaymentReceipt);
	}

	public void Assert_ReceiptDetails() {
		
		Assert.assertEquals(readText(ReceiptCopy), "Payment Receipt");
		Assert.assertEquals(readText(ThankOnlineText), "Thank you for using the Online Services.");
		Assert.assertEquals(readText(PrintText), "Please PRINT this receipt here.");
		Assert.assertEquals(readText(ReceiptCopyMiddle), "Receipt");
		Assert.assertEquals(readText(ReceiptInformation), "Receipt Information");
		Assert.assertEquals(readText(ReceiptNo), "Receipt No.:");
		Assert.assertEquals(readText(PaymentDate), "Payment Date:");
		Assert.assertEquals(readText(InvoiceNo), "Invoice No.:");
		Assert.assertEquals(readText(PayerInformation), "Payer Information");
		Assert.assertEquals(readText(Company), "Company:");
		Assert.assertEquals(readText(PaymentMade), "Payment Made By:");
		Assert.assertEquals(readText(PhoneNo), "Phone No.:");
		Assert.assertEquals(readText(PaymentMethod), "Payment Method:");
		Assert.assertEquals(readText(PaymentAmount), "Payment Amount:");
		Assert.assertEquals(readText(Comments), "Comments:");
		Assert.assertEquals(readText(ReceiptDetails), "Receipt Details");
		Assert.assertEquals(readText(RDFeeDescription), "Fee Description");
		Assert.assertEquals(readText(RDInternal), "Internal Ref. No.");
		Assert.assertEquals(readText(RDFeeAmount), "Fee Amount");
	//	assertEquals(readText(BackButton), "Back");

	}

}
package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// Click Method
	public void click(By elementLocation) {
		waitVisibility(elementLocation);
		// driver.findElement(elementLocation).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(elementLocation));
	}

	public void doubleClick(By elementLocation) {
		// waitVisibility(elementLocation);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(elementLocation)).doubleClick().perform();
	}

	public void clearText(By elementLocation) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).clear();
	}

	public void tab(By elementLocation) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).sendKeys(Keys.TAB);
	}

	public boolean isDisplayed(By elementLocation) {
		boolean result = false;
		waitVisibility(elementLocation);
		try {
			waitVisibility(elementLocation);
			result = driver.findElement(elementLocation).isDisplayed();
		} catch (Exception e) {

		}
		return result;
	}

	// Write Text
	public void writeText(By elementLocation, String text) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).sendKeys(text);
	}

	// Read Text
	public String readText(By elementLocation) {
		waitVisibility(elementLocation);
		return driver.findElement(elementLocation).getText();
	}

	// Waiting element to be click
	public void waitVisibility(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void waitinVisibility(By by) {
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
	}

	// Wait for element to be visible
	public void waitToBeVisible(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitTillPresence(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public boolean isEnabled(By elementLocation) {

		// waitVisibility(elementLocation);
		return driver.findElement(elementLocation).isEnabled();
	}

	public boolean isSelected(By elementLocation) {
		// waitVisibility(elementLocation);
		return driver.findElement(elementLocation).isSelected();
	}

	public void waitTillPresenceOfText(By by, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
	}

	public boolean isEmpty(By elementLocation) {
		boolean result = false;
		result = driver.findElement(elementLocation).isEnabled();
		return result;
	}

	public void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-10000)");
	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
	}

	public void scrollUntilElementPresent(By elementLocation) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", elementLocation);
	}

	public void waitTime() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void FileUpload() throws IOException {

		Runtime.getRuntime().exec("C:\\Temp\\AttachmentFile.exe");
	}

	public void AlertAccept() throws InterruptedException {
		
		Alert alt = driver.switchTo().alert();
		//String ActualString = alt.getText();
		//System.out.println(ActualString);
		alt.accept();
	}

	public void AlertCancel() {

		Alert alt = driver.switchTo().alert();
		//String ActualString = alt.getText();
		//System.out.println(ActualString);
		alt.dismiss();

	}
	
	public void SelectValue(By elementLocation) {
		
		waitVisibility(elementLocation);
		SelectValue(elementLocation);

	//	driver.findElement(elementLocation).clear();
		
	}
	

	/*
	 * public boolean isAttribtuePresent(By element, String attribute) { Boolean
	 * result = false; try { String value =
	 * driver.findElement(element).getAttribute(attribute); if (value != null) {
	 * result = true; } } catch (Exception e) { }
	 * 
	 * return result; }
	 */

	/*
	 * public boolean isAttribtuePresentWithNull(By element, String attribute) {
	 * Boolean result = false; try { String value =
	 * driver.findElement(element).getAttribute(attribute); if (value == null) {
	 * result = true; } } catch (Exception e) { }
	 * 
	 * return result; }
	 */

}

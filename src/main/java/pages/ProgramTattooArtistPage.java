package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProgramTattooArtistPage  extends BasePage {
	
	public ProgramTattooArtistPage(WebDriver driver) {
		super(driver);
	}
	
	By TattooArtist = By.xpath("//span[contains(text(),'Tattoo Artist')]");
	By ProgramDetailArtist = By.xpath("(//span[contains(text(),'Artist')])[position()=2]");
	
	public void SelectTattooArtist() {
		
		click(TattooArtist);
	}
	
	public void AssertEquals_ProgramDropd() {
	
		Assert.assertEquals(readText(TattooArtist), "Tattoo Artist");
	}
	
	public void TattooArtist_ProgramDetail() {

		Assert.assertEquals(readText(ProgramDetailArtist), "Artist");
	}

	public void SelectPDProgramDetailArtist() {
		
		click(ProgramDetailArtist);
	}
}

package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Shared;

public class HomePage {
	@FindBy(xpath="//*[@id=\"myStore\"]/a/span[2]")WebElement shoppingterminal;
	@FindBy(css="#TasklinkList > li")List<WebElement> links;
	@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.grid--center-verticle > div.Header3__collapser.col__4-12.col__3-12--sm.col__3-12--md.col__3-12--lg > div > div:nth-child(1) > a > svg > g > path:nth-child(3)") WebElement logo;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyLogo() { 
		logo.isDisplayed();
		System.out.println("The logo is verified");
		System.out.println();
	}
	public void clickOn9HeaderLinks() {
		Shared.clickOnMultipleLinks(driver, links);
	}
	public void isShoppingTerminalEnabled() {
		shoppingterminal.isEnabled();
		System.out.println(" You're shopping at Bronx Terminal is enabled");
		System.out.println();
	}

}

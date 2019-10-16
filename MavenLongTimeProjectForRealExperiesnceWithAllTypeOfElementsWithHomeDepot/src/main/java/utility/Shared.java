package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void clickOnMultipleLinks(WebDriver driver,List<WebElement>eles) {
		// eles.size()-2 means we are not going to click on last two elements
		// because those are not intractable 
		for(int x=0; x<eles.size()-2; x++) {
			eles.get(x).click();
			driver.navigate().to("https://www.homedepot.com/");
		}
	}

}

package utilities;//reuse codes

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {//explicit wait
	public void waitforElementToBeClick(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//class
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/*public void waitforElementToBeVisible(WebDriver driver,WebElement) {
		
	}
//	visible()*/

}

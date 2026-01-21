package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {//to help page class
	public void selectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);//index pass cheyan
		
	}
	public void selectByValue(WebElement elements,String values) {
		Select slect=new Select(elements);
		slect.selectByValue(values);//values ollath edukanm
		
	}
	public void selectByVisibletext(WebElement element,String text) {
		Select selct=new Select(element);
		selct.selectByVisibleText(text);//visible ayit olla values edukanm
	}


}

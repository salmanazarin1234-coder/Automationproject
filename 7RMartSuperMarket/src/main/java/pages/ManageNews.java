package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
public WebDriver driver;
public ManageNews(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//@FindBy(xpath="(//a[@class='small-box-footer'])[7]")//at 7th position moreinfo
//WebElement moreinfo;
@FindBy(xpath="//a[@onclick='click_button(1)']")
WebElement newbutton;
@FindBy(xpath="//textarea[@id='news']")
WebElement news;
@FindBy(xpath="//button[@type='submit']")
WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement alert;
//public void clickOnmoreinfo() {
	//moreinfo.click();
//}
public ManageNews clickOnnewButton() {
	newbutton.click();
	return this;
}
public ManageNews enterNews(String newsfield) {
news.sendKeys(newsfield);
return this;
}
public ManageNews clickOnSave() {
	save.click();
	return this;
}
public boolean isalertdisplayed() {
	return alert.isDisplayed();
}


}

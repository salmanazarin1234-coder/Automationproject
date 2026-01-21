package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminuserSearch {
	PageUtility pageutlity=new PageUtility();
	public WebDriver driver;
	public AdminuserSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath="//input[@id='un']")
	WebElement username;
	@FindBy(xpath="//select[@id='ut']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchbutton;
	public AdminuserSearch searchbutton() {
		search.click();
		return this;
	}
	public AdminuserSearch username(String usrname) {
		username.sendKeys(usrname);
		return this;
	}
	public AdminuserSearch usertype() {
		pageutlity.selectByIndex(usertype,2);
		return this;
		
	}
	public AdminuserSearch enterSearch() {
		searchbutton.click();
		return this;
	}

}

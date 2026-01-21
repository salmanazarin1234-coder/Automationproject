package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {//page class
	public WebDriver driver;
	 WaitUtility waitutlity=new WaitUtility();
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath="(//a[@class='small-box-footer'])[2]")
	WebElement dashboard;
	public  LoginPage enterUsernameAndPassword(String usernamefield,String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}
	public HomePage clickOnSigin() {
		//waitutlity.waitforElementToBeClick(driver, signin);
		signin.click();
		return new HomePage(driver);
	}
	public boolean isDahboardisdisplayed() {//assertion
		return dashboard.isDisplayed();
		
	}
	

}

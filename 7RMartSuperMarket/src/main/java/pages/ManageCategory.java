package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileuploadUtility;
import utilities.WaitUtility;

public class ManageCategory {
	WaitUtility wait =new WaitUtility();
	FileuploadUtility file=new FileuploadUtility();
	public WebDriver driver;
	public ManageCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="(//a[@class='small-box-footer'])[9]")
	WebElement moreinfo;*/
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath="//input[@type='text']")
	WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath="//input[@type='file']")
	WebElement choosefile;
	@FindBy(xpath="(//input[@value='yes'])[1]")
	WebElement showontopmenu;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
/*	public void clickOnmoreinfo() {
		moreinfo.click();
	}*/
	public ManageCategory clickOnNewButton() {
		newbutton.click();
		return this;
	}
	public ManageCategory enterCategory(String categoryfield) {
		category.sendKeys(categoryfield);
		return this;
		
	}
	public ManageCategory clickOnDiscount() {
		discount.click();
		return this;
	}
	public ManageCategory uploadChooseFile() {
		file.sendkeysForFileUpload(choosefile, Constant.image);
		return this;
	}
	public ManageCategory clickOnShowTopmenu() {
		showontopmenu.click();
		return this;
	}
	public ManageCategory clickOnSavebutton() {
		wait.waitforElementToBeClick(driver, save);
		save.click();
		return this;
	}
	

}

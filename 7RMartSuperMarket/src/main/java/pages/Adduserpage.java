package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class Adduserpage {
	public WebDriver driver;
	PageUtility pageutlity=new PageUtility();//object creation pageutlitity
	public Adduserpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//@FindBy(xpath="(//a[@class='small-box-footer'])[1]")
//	WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
/*	public Adduserpage clickOnmoreinfo() {
		//moreinfo.click();
		return this;
	}*/
	public Adduserpage clickOnNewbutton() {
		newbutton.click();
		return this;
	}
		

	
	public Adduserpage enterusernamePasswordAndUsertype(String usernamefield,String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
		
	}
	public Adduserpage enterUsertpe() {
		//Select select=new Select(usertype);
			//	select.selectByIndex(1);
		pageutlity.selectByIndex(usertype, 2);//dropdown value
		return this;
		
	
		
	}
	public Adduserpage clickOnSaveButton() {
		
		savebutton.click();
		return this;
	}
public boolean isAlertisDisplayed()
{
	return alert.isDisplayed();
}
	
	
}


	
	



package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo;
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]")
	WebElement logout;
//	@FindBy(xpath="(//a[@class='small-box-footer'])[7]")//at 7th position moreinfo news
//	WebElement moreinfo;
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]")
	WebElement moreinfocategory;
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]")
	WebElement moreinfoContact;//managecontact
	public Adduserpage clickOnmoreinfoadd() {//adduserpage class
		moreinfo.click();
		return new Adduserpage(driver);
	}
public HomePage adminButton() {
	admin.click();
	return this;
}
public HomePage logoutButton() {
	logout.click();
	return this;
}
public ManageNews clickOnmoreinfo() {
	moreinfo.click();
	return new ManageNews(driver);
}
public ManageCategory clickOnmoreinfoCategory() {
	moreinfocategory.click();
	return new ManageCategory(driver);
}

	
}




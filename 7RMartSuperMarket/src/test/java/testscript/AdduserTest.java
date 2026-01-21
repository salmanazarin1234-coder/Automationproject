package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Adduserpage;
import pages.HomePage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdduserTest extends Base {
	public Adduserpage admin;
	public HomePage home;
	FakerUtility faker=new FakerUtility();
  @Test
  public void enterUsenameAndPassword() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	  home=loginpage.clickOnSigin();
	  admin=home.clickOnmoreinfoadd();
	  admin.clickOnNewbutton().enterusernamePasswordAndUsertype(faker.getFakeFirstName() ,faker.getPassword()).enterUsertpe().clickOnSaveButton();
	 boolean alertdisplayed=admin.isAlertisDisplayed();
	  Assert.assertTrue(alertdisplayed, "alert not displayed");
	/*  Adduserpage adduserpage=new Adduserpage(driver);
	  adduserpage.clickOnmoreinfoAndNewButton();
	  adduserpage.enterusernamePasswordAndUsertype("salma", "123");
	  adduserpage.enterUsertpe();
	  adduserpage.clickOnSaveButton();*/
  }
}

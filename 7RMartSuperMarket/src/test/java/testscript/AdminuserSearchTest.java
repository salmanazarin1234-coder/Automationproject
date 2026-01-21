package testscript;

import org.testng.annotations.Test;

import pages.Adduserpage;
import pages.AdminuserSearch;
import pages.HomePage;
import pages.LoginPage;

public class AdminuserSearchTest extends Base{
	public AdminuserSearch admin;
	public HomePage home;
  @Test
  public void enterUsenameAndPassword() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	  home=loginpage.clickOnSigin();
	  admin.enterSearch().username("fyra").usertype().searchbutton();
	 
  }
}

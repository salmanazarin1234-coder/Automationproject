package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	public HomePage home;
  @Test
  public void clickAdminAndLogoutButton() throws IOException {
	LoginPage loginpage=new LoginPage(driver) ;
	loginpage.enterUsernameAndPassword("admin", "admin");
	home=loginpage.clickOnSigin();
	home.adminButton().logoutButton();
	//String username=ExcelUtility.getStringData(1, 0, "homepage");
//	String password=ExcelUtility.getStringData(1, 1, "homepage");
	/*loginpage.enterUsernameAndPassword(username,password);
	loginpage.clickOnSigin();*/
/*	HomePage homepage=new HomePage(driver); {
		homepage.adminButton();
		homepage.logoutButton();*/
	String Expected="Login|7RMart supermarket";
	String actual=driver.getTitle();
	Assert.assertEquals(Expected, actual,"class name failed");
			
		
	}
  }


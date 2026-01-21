package testscript;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategory;

public class ManageCategoryTest extends Base{
	public HomePage home;
	public ManageCategory category;
  @Test
  public void enterUsernameAndPassword() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	  home=loginpage.clickOnSigin();
	  category=home.clickOnmoreinfoCategory();
	  category.clickOnNewButton().enterCategory("orange").clickOnDiscount().uploadChooseFile().clickOnShowTopmenu().clickOnSavebutton();
	/*  ManageCategory category=new ManageCategory(driver);
	  category.clickOnmoreinfo();
	  category.clickOnNewButton();
	  category.enterCategory("orange");
	  category.clickOnDiscount();
	  category.uploadChooseFile();
	  category.clickOnShowTopmenu();
	  category.clickOnSavebutton();
  }*/
}
}

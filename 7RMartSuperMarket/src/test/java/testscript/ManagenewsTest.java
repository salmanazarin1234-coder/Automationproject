package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;

public class ManagenewsTest extends Base{
	public HomePage home;
	public ManageNews news;
  @Test
  public void enterUsenameAndPassword() {
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("admin", "admin");
	 home= loginpage.clickOnSigin();
	 news=home.clickOnmoreinfo();
	 news.clickOnnewButton().enterNews("good morning").clickOnSave();
	 boolean alertdisplayed=news.isalertdisplayed();
	 Assert.assertTrue(alertdisplayed, "alert is not displayed");
	/*  ManageNews managenews=new ManageNews(driver);
	  managenews.clickOnmoreinfo();
	  managenews.clickOnnewButton();
	  managenews.enterNews("new product");
	  managenews.clickOnSave();*/
  }
}

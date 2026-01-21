package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginpageTest extends Base {
	HomePage home;//test class
  @Test(groups = "smoke",description = "verify username and password")
  public void enterCorrectUsernameAndPassword() throws IOException {
	  LoginPage loginpage=new LoginPage(driver);
	  String username=ExcelUtility.getStringData(1, 0,"loginpage");
	  String password=ExcelUtility.getStringData(1, 1,"loginpage");
	  loginpage.enterUsernameAndPassword(username,password);
	  home=loginpage.clickOnSigin();
	  boolean dashboarddisplayed=loginpage.isDahboardisdisplayed();
	  Assert.assertTrue(dashboarddisplayed,"fail to login");
	  
  }
  @Test
  public void enterCorrectUsernameAndWrongPassword() throws IOException  {//no output
	  LoginPage loginpage=new LoginPage(driver);
	  String username=ExcelUtility.getStringData(2,0, "loginpage");
	  String password=ExcelUtility.getStringData(2,1,"loginpage");
	  loginpage.enterUsernameAndPassword(username, password);
	  loginpage.clickOnSigin();
  }
  @Test(groups="smoke")
  public void wrongUsernameAndCorrectPassword() throws IOException {
	  LoginPage loginpage=new LoginPage(driver);
	  String username=ExcelUtility.getStringData(3, 0, "loginpage");
	  String password=ExcelUtility.getStringData(3,1,"loginpage");
	  loginpage.enterUsernameAndPassword(username, password);
	  loginpage.clickOnSigin();
  }
  @Test(dataProvider="cerenditanls")
  public void wrongUsernameAndWrongPassword(String username,String password) throws IOException{
	  LoginPage loginpage=new LoginPage(driver);
	  String usernamefield=ExcelUtility.getStringData(4,0,"loginpage");
	  String passwordfield=ExcelUtility.getStringData(4, 1, "loginpage");
	  loginpage.enterUsernameAndPassword(username,password);
	  loginpage.clickOnSigin();
  }
  @DataProvider(name="cerenditanls")
  public Object[][]data(){
	  Object testdata[][]= {{"admin","1q2w3e"},{"admin","adm"}};
	  return testdata;
}
}

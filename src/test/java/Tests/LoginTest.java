package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends MainClass {
    private WebDriver driver;


    @Test(priority = 0)
    public void openLoginPopUp(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickSignBtn();
        loginPage.typeName("lenok1@appcreative.net");
        loginPage.typePassword("123Qwerty");
        loginPage.clickLoginBtn();
        String profileLink = loginPage.getProfileLink();
        Assert.assertEquals(profileLink, "Lenok1");

    }


}

package Tests;

import Pages.HeaderForAllPages;
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



    @Test(priority = 0)
    public void openLoginPopUp(){
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        headerForAllPages.clickProfileLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String windowHandler = driver.getWindowHandle();
        headerForAllPages.enterEmailForLogin("lenok1@appcreative.net");
        headerForAllPages.enterPasswordForLogin("123Qwerty");
        headerForAllPages.clickLoginBtn();
        /*loginPage.typeName("lenok1@appcreative.net");
        loginPage.typePassword("123Qwerty");
        loginPage.clickLoginBtn();
        String profileLink = loginPage.getProfileLink();*/

        Assert.assertEquals(homePage, "Lenok1");

    }



}

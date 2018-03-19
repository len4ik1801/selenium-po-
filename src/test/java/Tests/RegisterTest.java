package Tests;

import Pages.HomePage;
import Pages.PersonalData;
import Pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterTest extends MainClass{
    private WebDriver driver;


    @Test(priority = 1)
    public void OpenSignUpPage(){
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.clickSignUpLink();
        String headingReg = signUpPage.getHeadingRegText();
        Assert.assertEquals("Регистрация", headingReg);
    }
    @Test(priority = 2)
    public void SignNewUser(){
        SignUpPage signUpPage = new SignUpPage(driver);
        PersonalData personalData = new PersonalData(driver);
        signUpPage.typeName("Lenok4");
        signUpPage.typeEmail("lenok4@appcreative.net");
        signUpPage.typePassword("123Qwerty");
        signUpPage.clickSignupBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String heading = personalData.getHeadingText();
        Assert.assertEquals("Личные данные",heading);


    }

}

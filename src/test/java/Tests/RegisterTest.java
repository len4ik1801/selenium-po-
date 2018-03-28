package Tests;

import Pages.HeaderForAllPages;
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




    @Test
    public void RegisterNewUser(){
        HomePage homePage = new HomePage(driver);


        homePage.clickSignUpLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        String headingReg = signUpPage.getHeadingRegText();
        Assert.assertEquals("Регистрация", headingReg);
        signUpPage.typeName("Lenok4");
        signUpPage.typeEmail("lenok6@appcreative.net");
        signUpPage.typePassword("123Qwerty");
        signUpPage.clickSignupBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PersonalData personalData = new PersonalData(driver);
        String heading = personalData.getHeadingText();
        Assert.assertEquals("Личные данные",heading);


    }

}

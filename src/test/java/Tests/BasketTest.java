package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends MainClass {

    private WebDriver driver;

    @Test(priority = 0)
    public BasketTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickBasketLink();
        String basketTitle = homePage.getBasketTitle();
        Assert.assertEquals("payBtn", basketTitle);
    }
}

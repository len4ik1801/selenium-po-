package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends MainClass {


    @Test
    public BasketTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToBasketLink();
        Assert.assertEquals("Basket is not empty", homePage.getBasketTitle());
    }

}


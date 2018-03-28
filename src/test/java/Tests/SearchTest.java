package Tests;

import Pages.HeaderForAllPages;
import Pages.HomePage;
import Pages.SearchProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchTest extends MainClass {

    @Test
    public void addProductToBasket() {
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        headerForAllPages.enterWordInSearchField("Ложка");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SearchProducts searchProducts = new SearchProducts(driver);
        searchProducts.addGoodToBasket(3);
    }


}

package Tests;

import Pages.SearchProducts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchTest extends MainClass {
    private WebDriver driver;


    @Test
    public void search() {
        SearchProducts searchProducts = new SearchProducts(driver);
        searchProducts.typeSearchProd("ложка");

        List<WebElement> goods = new ArrayList<WebElement>();

        assertTrue(goods.size() > 0);

        goods.get(3).click();

        assertTrue(goods.get(3).getText().equals("1"));
    }

}

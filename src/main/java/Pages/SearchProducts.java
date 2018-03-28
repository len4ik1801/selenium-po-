package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchProducts extends HeaderForAllPages{
    private  WebDriver driver;
    public SearchProducts (WebDriver driver){
        super(driver);
        this.driver = driver;
    }




    By goods = By.xpath("//span[@class = 'sprite-side btn-link g-buy-submit-light']']");


    public void   addGoodToBasket(int number){
        List<WebElement> listofGoods = driver.findElements(goods);
        listofGoods.get(number).click();

    }






}

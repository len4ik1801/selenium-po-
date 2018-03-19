package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchProducts {
    private WebDriver driver;


    By searchField = By.xpath("//input[@class = 'rz-header-search-input-text passive']");
    By goods = By.xpath("//div[@class = 'g-i-tile-l clearfix']/div[@class = 'g-i-tile g-i-tile-catalog']");
    By basket = By.xpath("//button[@name = 'topurchases']");




    public SearchProducts(WebDriver driver){
        this.driver = driver;
    }
    public SearchProducts typeSearchProd(String text){
        driver.findElement(searchField).sendKeys(text);
        return this;
    }
    public SearchProducts  goodsResulrs(){
        driver.findElements(goods);
        return this;
    }
    public SearchProducts clickBasketBtn(){
        driver.findElement(basket).click();
        return this;
    }





}

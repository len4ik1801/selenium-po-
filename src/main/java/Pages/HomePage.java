package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By signUpLink = By.xpath("//a[contains(@href,'https://my.rozetka.com.ua/signup/')]");
    By signBtn = By.xpath("//span[@name =\"auth-btn\"]");
    By basketLink = By.xpath("//a[@class = 'hub-i-link hub-i-cart-link sprite-side whitelink']");
    By basketTitle = By.xpath("//div[@id = 'drop-block']/h2");
    By payBtn = By.xpath("//button[@id = 'popup-checkout']");

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public void clickSignUpLink() {
        driver.findElement(signUpLink).click();
        new SignUpPage(driver);
    }
    public HomePage clickSignBtn(){
        driver.findElement(signBtn).click();
        return this;
    }
    public HomePage clickBasketLink(){
        driver.findElement(basketLink).click();
        return this;
    }
    public  String getBasketTitle(){
        return driver.findElement(basketTitle).getText();
    }


}










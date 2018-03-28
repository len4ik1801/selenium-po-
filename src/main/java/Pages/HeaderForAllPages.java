package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HeaderForAllPages {
    public WebDriver driver;
    //protected WebDriverWait wait = new WebDriverWait(driver,  5);


    By goToProfileLink = By.xpath("//a[@name = 'signin']");
    By baskeBtn = By.xpath("//a[@class = 'hub-i-link hub-i-cart-link sprite-side whitelink']");
    By searchField = By.xpath("//input[@class = 'rz-header-search-input-text passive' and @tabindex = '1']");
    By searchBtn = By.xpath("//button[@class = 'btn-link-i js-rz-search-button']");
    By creditsLink = By.xpath("//a[contains (@href,'https://rozetka.com.ua/credit/')]");
    By registrationLink = By.xpath("//a[contains (@href,'https://my.rozetka.com.ua/signup/')]");
    By logEmailField = By.xpath("//input[@name = 'login']");
    By logPasswordField = By.xpath("//input[@name = 'password'][1]");
    By loginButton = By.xpath("//button[@name = 'auth_submit']");
    By catalogBtn = By.xpath("//a[@id = 'fat_menu_btn']");
    By loginPopUpTitle = By.xpath("//h5[@class = 'auth-title']");

    public HeaderForAllPages(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickProfileLink(){
        driver.findElement(goToProfileLink).click();
        return new LoginPage(driver);
    }
    public HeaderForAllPages openLoginPopUp(){
        driver.findElement(loginPopUpTitle).isDisplayed();
        return this;
    }

    public HeaderForAllPages clickRegistrationLink(){
        driver.findElement(registrationLink).click();
        return new SignUpPage(driver);
    }
    public HeaderForAllPages enterEmailForLogin(String email){
        driver.findElement(logEmailField).sendKeys(email);
        return this;
    }
    public HeaderForAllPages enterPasswordForLogin(String password){
        driver.findElement(logPasswordField).sendKeys(password);
        return this;
    }
    public HomePage clickLoginBtn(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
    public SearchProducts enterWordInSearchField(String text){
        driver.findElement(searchField).sendKeys(text);
        driver.findElement(searchBtn).click();
        return new SearchProducts(driver);
    }

    public HeaderForAllPages clickBasketBtn(){
        driver.findElement(baskeBtn).click();
        return this;
    }
    public CreditsPage clickCreditLink(){
        driver.findElement(creditsLink).click();
        return new CreditsPage(driver);
    }
    public HeaderForAllPages clickCataloBtn(){
        driver.findElement(catalogBtn).click();
        return this;
    }


}

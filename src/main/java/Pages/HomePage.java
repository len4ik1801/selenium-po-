package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class HomePage extends HeaderForAllPages{
    private WebDriver driver;
    By signUpLink = By.xpath("(//a[contains(@href,'https://my.rozetka.com.ua/signup/')])[1]");
    By signBtn = By.xpath("//span[@name =\"auth-btn\"]");
    By basketLink = By.xpath("//div[@id = \"cart_block65867\"]");
    By basketEmptyTitle = By.xpath("//h2[@class = \"empty-cart-title inline sprite-side\"]");



    public HomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public void clickSignUpLink() {
        driver.findElement(signUpLink).click();
        new SignUpPage(driver);
    }
    public HomePage clickSignBtn(){
        driver.findElement(signBtn).click();
        return this;
    }
    public  HomePage clickToBasketLink() {
        driver.findElement(basketLink).click();
        return this;
    }
    public  HomePage getBasketTitle(){
        driver.findElement(basketEmptyTitle);
        return this;
    }




}










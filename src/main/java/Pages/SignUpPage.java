package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends HeaderForAllPages {
    private  WebDriver driver;

    By nameField = By.xpath("//div/input[@name = 'title']");
    By emailField = By.xpath("//div/input[@name = 'login']");
    By passwordField = By.xpath("//div/input[@name = 'password']");
    By signupButton = By.xpath("//div[@class = 'signup-submit']");
    By headingReg = By.xpath("*//div[@class = 'signup']/h1");

    public SignUpPage(WebDriver driver){
        super(driver);
        this.driver = driver;

    }
    public SignUpPage typeName(String name){
        driver.findElement(nameField).sendKeys(name);
        return this;
    }
    public SignUpPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public SignUpPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public void clickSignupBtn(){
        driver.findElement(signupButton).click();
        new PersonalData(driver) ;
    }
    public String getHeadingRegText(){

        return driver.findElement(headingReg).getText();
    }
}

package Pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    By logName = By.xpath("*//input[@name = 'login']");
    By logPassw = By.xpath("*//input[@name = 'password']");
    By loginBtn = By.xpath("*//button[@name = 'auth_submit']");
    By cancelLink = By.xpath("*//a[@name = 'close']");
    By profileLink = By.xpath("//a[@name = 'profile']");


    public LoginPage (WebDriver driver){
//        super(driver);
        this.driver = driver;

    }


    public LoginPage typeName(String name){
        driver.findElement(logName).sendKeys(name);
        return this;
    }
    public LoginPage typePassword(String password){
        driver.findElement(logPassw).sendKeys(password);
        return this;
    }
    public LoginPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return this;
    }

    public LoginPage clickCancelLink(){
        driver.findElement(cancelLink).click();
        return this;
    }
    public  String getProfileLink(){
        return driver.findElement(profileLink).getText();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalData extends HeaderForAllPages{
    private  WebDriver driver;
    public PersonalData(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    By pageTitle = By.xpath("//div[@id ='personal_information']");
    By heading = By.xpath("*//div[@id = 'personal_information']/header[@class = 'profile-heading']");


    public PersonalData getPageTitle(){
        driver.findElement(pageTitle);
        return this;
    }
    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
}

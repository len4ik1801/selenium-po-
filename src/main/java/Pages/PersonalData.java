package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalData {
    WebDriver driver;

    By pageTitle = By.xpath("//div[@id ='personal_information']");
    By heading = By.xpath("*//div[@id = 'personal_information']/header[@class = 'profile-heading']");

    public PersonalData(WebDriver driver) {
        this.driver = driver;
    }

    public PersonalData getPageTitle(){
        driver.findElement(pageTitle);
        return this;
    }
    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
}

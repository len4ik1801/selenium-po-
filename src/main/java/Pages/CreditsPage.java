package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreditsPage extends HeaderForAllPages{
    WebDriver driver;
    public CreditsPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    By creditRulesList = By.xpath("//div[@class = \"credit-rules-list\"]/child::div[@class =\"credit-rules-list-i\"]");
    By creditTableTitle = By.xpath("//div[@class = \"rz-credit-block\"]/child::h2[contains(text(), 'Условия кредитования')]");
    By nameOfCreditPacked = By.xpath("//div[@class = \"c-cols-r-static\"]/div[3]/table/tbody/tr[6]");
    By ageForCreditAlfaBank = By.xpath("//div[@class = \"c-cols-r-static\"]/div[5]/table/tbody/tr[5]/td[5]");

    public CreditsPage checkCreditRulesList(){
        driver.findElement(creditRulesList);
        return this;
    }
    public CreditsPage checkCreditsTableTitle(){
        driver.findElement(creditTableTitle);
        return this;
    }
    public CreditsPage checkCreditPacked(){
        driver.findElement(nameOfCreditPacked);
        return this;
    }
    public CreditsPage checkAlfaBankAgeForCredit(){
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(ageForCreditAlfaBank);
        return this;

    }
}

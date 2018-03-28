package Tests;

import Pages.CreditsPage;
import Pages.HeaderForAllPages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CreditsTests extends MainClass{
    @Test (priority = 0)
    public void CheckCreditList(){
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        CreditsPage creditsPage = new CreditsPage(driver);
        headerForAllPages.clickCreditLink();
        Assert.assertEquals("This is not credit page", creditsPage.checkCreditRulesList());
    }
    @Test (priority = 1)
    public void CheckCreditTableTitle(){
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        CreditsPage creditsPage = new CreditsPage(driver);
        headerForAllPages.clickCreditLink();
        Assert.assertEquals("Credit table is empty", creditsPage.checkCreditsTableTitle());
    }
    @Test (priority = 2)
    public void CheckCreditPacket(){
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        CreditsPage creditsPage = new CreditsPage(driver);
        headerForAllPages.clickCreditLink();
        Assert.assertEquals("Credite table is empty", creditsPage.checkCreditPacked());
    }
    @Test (priority = 3)
    public void CheckAlfaBankCreditAge(){
        HeaderForAllPages headerForAllPages = new HeaderForAllPages(driver);
        CreditsPage creditsPage = new CreditsPage(driver);
        headerForAllPages.clickCreditLink();
        Assert.assertEquals("Age is not true", creditsPage.checkAlfaBankAgeForCredit());
    }

}

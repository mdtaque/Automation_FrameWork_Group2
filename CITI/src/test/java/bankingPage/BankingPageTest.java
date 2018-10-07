package bankingPage;

import base.CommonAPI;
import citiPages.Banking;
import citiPages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class BankingPageTest extends Banking {
    Banking banking;
    @BeforeMethod
    public void AlertHandle(){
        //HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        banking = PageFactory.initElements(driver, Banking.class);
        driver.get("https://online.citi.com/US/banking/citi.action?ID=banking-overview");
    }
    @Test
    public void handleAlert() throws InterruptedException{
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    @Test
    public void learnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LearnMore();
    }

    @Test
    public void CheckingTest(){
        Checking();
    }

}

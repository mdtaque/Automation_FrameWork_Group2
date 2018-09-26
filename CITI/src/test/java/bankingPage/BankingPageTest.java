package bankingPage;

import citiPages.Banking;
import citiPages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankingPageTest extends Banking {
    @BeforeMethod
    public void AlertHandle(){
        Banking banking = PageFactory.initElements(driver, Banking.class);
    }
    @Test
    public void handleAlert() throws InterruptedException{
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}

package lending;

import citiPages.LendingPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicReference;

public class LendingPageTest extends LendingPage {
    @BeforeMethod
    public void Navigating(){
        LendingPage lendingPage = PageFactory.initElements(driver, LendingPage.class);
    }

    @Test
    public void lendingAccountTest()throws Exception{
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        actions.moveToElement(lendingWebElement).perform();

    }
}

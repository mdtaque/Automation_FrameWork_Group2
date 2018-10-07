package creditCards;

import base.CommonAPI;
import citiPages.CreditCards;
import citiPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CreditCardsTest extends CreditCards {

    CreditCards objOfCreditCards;

    @BeforeMethod
    public void Launching(){
        objOfCreditCards = PageFactory.initElements(driver,CreditCards.class);
        driver.get("https://www.citi.com/credit-cards/citi.action");
    }

    @Test
    public void testlogInByUaerInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfCreditCards.logInByUserInput();
    }

    @Test
    public void testSelectCardCatagory() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSelectCardCatagory();
    }

}

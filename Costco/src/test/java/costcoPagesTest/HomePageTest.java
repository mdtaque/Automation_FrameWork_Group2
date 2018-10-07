package costcoPagesTest;

import base.CommonAPI;
import costcoPages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void Launching(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testMouseOverAllDepartment() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseOverShopAllDepartment();
    }
}

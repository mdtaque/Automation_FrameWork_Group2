package homeScreenShot;

import citiPages.HomePage;
import citiPages.HomeScreenShot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeScreenShotTest extends HomeScreenShot {
    @BeforeMethod
    public void HmScreenShot(){
        HomeScreenShot homeScreenShot = PageFactory.initElements(driver, HomeScreenShot.class);
    }

    @Test
    public void screenShotTest() throws IOException {
        takeScreenshot("https://online.citi.com/US/login.do");
    }
}

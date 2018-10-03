package TestHomePage;

import HomepageEbay.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestHome extends HomePage {
    HomePage objOfHomePage;

    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void search(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfHomePage.InputSearchBox();
    }
    @Test(enabled = false)
    public void listOfEl(){
        objOfHomePage.getList();
        objOfHomePage.listOfText();
    }
    @Test(enabled = true)
    public void hover_Test() throws InterruptedException {
        hovercase();
    }
    @Test(enabled = false)
    public void testGoToLoginPage() throws InterruptedException {
        objOfHomePage.goToLoginPage();
    }
    @Test
    public void testScreenShot() throws IOException {
        screenShot();
    }
}

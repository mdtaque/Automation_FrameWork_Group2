package TestHomePage;

import HomepageEbay.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHome extends HomePage {
    HomePage objOfHomePage;

    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void search(){
        objOfHomePage.InputSearchBox();
    }
    @Test(enabled = false)
    public void listOfEl(){
        objOfHomePage.getList();
        objOfHomePage.listOfText();
    }
    @Test(enabled = false)
    public void hover_Test() throws InterruptedException {
        hovercase();
    }

    @Test(enabled = true)
    public void testGoToLoginPage() throws InterruptedException {
        objOfHomePage.goToLoginPage();

    }

    @Test
    public void testScreenShot() throws IOException {
        screenShot();
    }
}

package TestHomePage;

import Homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    @Test
    public void listOfEl(){
        objOfHomePage.getList();
        objOfHomePage.listOfText();
    }
    @Test
    public void hover_Test() throws InterruptedException {
        hovercase();
    }
}

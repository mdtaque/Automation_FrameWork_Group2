package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PharmecyPage;

public class TestPharmacyPage extends CommonAPI {

    HomePage homePage;
    PharmecyPage pharmecyPage;

    @BeforeMethod
    public void intializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        pharmecyPage=PageFactory.initElements(driver, PharmecyPage.class);


    }

    @Test
    public void testLogin() throws InterruptedException{

        homePage.goToLoginPage();

        pharmecyPage.checkLogin();


    }





}

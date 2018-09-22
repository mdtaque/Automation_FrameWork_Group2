package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends CommonAPI {
    HomePage homepage;

     @BeforeMethod
    public void intializePageElements(){
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1, enabled = true)
    public void testSearch(){
       homepage.searchPage();

    }

    @Test(priority = 2, enabled = true)
    public void testPharmacyPage(){
         homepage.nevigatePharmacyPage();

    }

    @Test(priority = 6, enabled = true)
    public void testClinicPage(){
        homepage.nevigateClinicPage();

    }

    @Test(priority = 4, enabled = true)
    public void testShopPage(){
        homepage.nevigateShopPage();

    }

    @Test(priority = 5, enabled = true)
    public void testPhotoPage(){
        homepage.nevigatePhoto();

    }

    @Test(priority = 7, enabled = true)
    public void testNewAccountPage(){
        homepage.nevigateToCreateAccount();

    }
}

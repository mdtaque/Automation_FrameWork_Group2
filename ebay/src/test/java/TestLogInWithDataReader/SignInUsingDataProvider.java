package TestLogInWithDataReader;

import DataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import HomepageEbay.HomePage;
import LogInPage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class SignInUsingDataProvider extends SignIn {

    SignIn objOfSignIn;
    HomePage objOfHomePage;

    @BeforeMethod
    public void init(){
        objOfSignIn = PageFactory.initElements(driver, SignIn.class);
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testLogInManual() throws InterruptedException {
        objOfHomePage.goToLoginPage();
        objOfSignIn.logInManual();
    }
    @DataProvider
    public Iterator<Object[]> supplyData() {
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }
    @Test ( dataProvider = "supplyData")
    public void testLogInDataProvider(String email, String passCode, String message) throws InterruptedException {
        objOfHomePage.goToLoginPage();
        String actual= objOfSignIn.logInByExcelData(email,passCode);
        Assert.assertEquals(actual,message);
    }
}

package costcoPagesTest;

//import org.omg.CORBA.Object;
import costcoPages.LogInPage;
        import dataProvider.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInPageTest extends LogInPage {
    LogInPage objOfLoginPage;
    @BeforeMethod
    public void Launching(){
        objOfLoginPage = PageFactory.initElements(driver,LogInPage.class);
        //driver.get("https://www.citi.com/credit-cards/citi.action");
    }

    /*@Test
    public void testlogInByUserInput() throws InterruptedException {
        objOfLoginPage.logInByUserInput();
    }*/

    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData = XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "supplyData")
    public void testLogInByDataProvider(String email, String passCode, String message){
        objOfLoginPage.logInByExcelData(email, passCode);
        String actual = objOfLoginPage.logInByExcelData(email, passCode);
        Assert.assertEquals(actual,message);
    }
}

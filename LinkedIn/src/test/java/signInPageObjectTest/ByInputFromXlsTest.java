package signInPageObjectTest;

import base.CommonAPI;
import homePageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.SignInPage;
import utility.DataReader;
import java.io.IOException;
import static base.CommonAPI.convertToString;
import static base.CommonAPI.implicitWait;

public class ByInputFromXlsTest extends CommonAPI {
    DataReader dtr = new DataReader();
    HomePage objectHomePage;
    SignInPage objectSignInPage;
    @BeforeMethod
    public void initialization(){
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test
    public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        /*sleepFor(3);
        objectHomePage.clikSignIn();
        sleepFor(3);
        objectSignInPage.switchToSignInForm();
        sleepFor(3);
        String[] expectedItems = objectByInput.getAssertData("DataFile.xls");
        String[] actualItems = objectByInput.getVerificationValue("DataFile.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": T098654    d");
        }*/
        System.out.println("signInWithInvalidIdAndPassword");
        implicitWait(driver, 20);
    }
}



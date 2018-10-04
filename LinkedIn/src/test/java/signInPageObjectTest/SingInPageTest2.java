package signInPageObjectTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.SignInPage;
import signInPageObject.SignInPage2;
public class SingInPageTest2 extends SignInPage2 {

    SignInPage objectSignInPage;
    SignInPage2 objcetSignInPage2;

    @BeforeMethod
    public void initializePageObject() {
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objcetSignInPage2 = PageFactory.initElements(driver, SignInPage2.class);
    }
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInByDataProvider(email,passCode);
        String actual = objcetSignInPage2.getErrorMessage.getText();
        //TestLogger.log("In Sign In Page");
        Assert.assertEquals(actual,message);
    }
}

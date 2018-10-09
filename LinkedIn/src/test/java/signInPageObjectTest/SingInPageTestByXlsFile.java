package signInPageObjectTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.SignInPage;
import signInPageObject.SignInPageByXlsFile;

public class SingInPageTestByXlsFile extends SignInPageByXlsFile {

    SignInPage objectSignInPage;
    SignInPageByXlsFile objcetSignInPage2;

    @BeforeMethod
    public void initializePageObject() {
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objcetSignInPage2 = PageFactory.initElements(driver, SignInPageByXlsFile.class);
    }
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInByDataProvider(email,passCode);
        String actual = objcetSignInPage2.getErrorMessage.getText();
        Assert.assertEquals(actual,message);
    }
}

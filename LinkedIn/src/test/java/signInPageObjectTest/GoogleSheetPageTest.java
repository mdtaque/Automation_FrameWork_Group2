package signInPageObjectTest;

import homePageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.GoogleSheetPage;
import signInPageObject.SignInPage;
import java.io.IOException;
import java.util.List;

import static base.CommonAPI.convertToString;
import static homePageObject.KeyWordSignIn.email;
import static signInPageObject.SignInPage.passWord;

public class GoogleSheetPageTest extends GoogleSheetPage {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    GoogleSheetPage objGoogleSheetsPage;

    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
    }
    // Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfSignInPage.signInWithWebElement(email,passWord);
        int i = 0;
        String spreadsheetId = "1vCl6wADiFCHs4FPclyOGRbTioTyhAJXaZysk_0ce4Eo";
        String range = "Sheet1!A2:B";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}


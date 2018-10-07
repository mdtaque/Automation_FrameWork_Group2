/*
package googleSheetTest;


import LogInPage;
import GoogleSheet.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class GoogleSheetPageTest extends GoogleSheetPage {

    LogInPage objOfLogInPage;
    GoogleSheetPage objGoogleSheetsPage;

    @BeforeMethod
    public void initialization(){
        objOfLogInPage = PageFactory.initElements(driver, LogInPage.class);
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
    }
    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        objOfLogInPage.signInWithWebElement(email,passCode);
        int i = 0;
        String spreadsheetId = "1ALofpbCWuMw-uBbkmzGxKDHAzHlxdadIAXfvBqApPW8";
        String range = "Sheet1!A2:B";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
*/

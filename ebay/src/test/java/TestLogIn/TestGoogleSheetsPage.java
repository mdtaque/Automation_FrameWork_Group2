package TestLogIn;

import LogInPage.GoogleSheetsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    GoogleSheetsPage objGoogleSheetsPage;

    @BeforeMethod
    public void initialization(){
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }
    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        objGoogleSheetsPage.signInn();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1KqovQvwLhzgCGoJv8Ov6ktgrgYkFuyd768Y7Epoka-k";
        String range = "Sheet1!A2:C";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
             Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(2).toString()));
            // System.out.println("expected"+row.get(2).toString());
             System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
             i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}


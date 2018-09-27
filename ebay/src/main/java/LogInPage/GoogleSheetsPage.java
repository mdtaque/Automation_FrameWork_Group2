package LogInPage;

import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GoogleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gh-eb-Alerts\"]/div/button")
    public static WebElement bellButton;
    @FindBy(xpath = "//div[@id='ghn-err']")
    public static WebElement clickOnSignIn;
    @FindBy(xpath = "//input[@id='userid']")
    WebElement emailOrUsername;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement signInButton;
    @FindBy(xpath = "//p[@id='errf']")
    WebElement invalidMsg;
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(emailOrUsername, row.get(1).toString());
            inputValueInTextBoxByWebElement(password, row.get(2).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(invalidMsg));
            System.out.println(getTextByWebElement(invalidMsg));
            clearInputBox(emailOrUsername);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
}

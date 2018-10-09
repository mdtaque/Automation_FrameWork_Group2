package signInPageObject;

import base.CommonAPI;
import dataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;
import java.util.ArrayList;
import java.util.Iterator;

public class SignInPageByXlsFile extends CommonAPI {

    @FindBy(xpath = "//strong[contains(text(),'There were one or more errors')]")
    public static WebElement getErrorMessage;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
}

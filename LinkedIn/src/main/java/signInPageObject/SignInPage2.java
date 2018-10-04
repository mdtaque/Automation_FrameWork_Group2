package signInPageObject;

import base.CommonAPI;
import dataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class SignInPage2 extends CommonAPI {
    @FindBy(xpath = "//strong[contains(text(),'There were one or more errors')]")
    public static WebElement getErrorMessage;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
}

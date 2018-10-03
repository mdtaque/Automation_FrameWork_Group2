package TestTableDataRead;

import ReadingTableData.ReadDataFromTable;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TableDataReadTest extends ReadDataFromTable {

    @Test
    public void tableRead(){
        driver.get("https://www.w3schools.com/sql/sql_select.asp");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readTable();
        Assert.assertEquals("Mataderos 2312",readTable());
    }
}

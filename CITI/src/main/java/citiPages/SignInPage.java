package citiPages;


import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SignInPage extends CommonAPI {
    XSSFWorkbook ExcelWbook;
    XSSFSheet ExcelWSheet;
    XSSFCell cell;

    String path = "/Users/hasan/Desktop/Automation_FrameWork_Group2/CITI/Data/loginInfo.xlsx";
    String sheetName = "Sheet1";
}

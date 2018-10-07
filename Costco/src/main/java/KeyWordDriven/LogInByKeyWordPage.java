package KeyWordDriven;

import costcoPages.LogInPage;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileInputStream;

public class LogInByKeyWordPage extends LogInPage {
    static HSSFWorkbook workbook;
    static HSSFSheet sheet;
    public static void setExcelFile(String path,String sheetName) throws Exception {
        FileInputStream fis=new FileInputStream(path);
        workbook=new HSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);
    }
    public static String getCelldata(int row,int column){
        HSSFCell cell=sheet.getRow(row).getCell(column);
        String cellData=cell.getStringCellValue();
        return cellData;
    }

    /*public String logInByExcelData(String email, String passCode, String errormsg){
        userIdWebElement.sendKeys(email);
        passwordWebElement.sendKeys(passCode);
        signInButtonWebElement.click();
        String actual = invalidMsgWebElement.getText().concat("The email address and/or password you entered are invalid.");
        System.out.println("Sign In error Message: " + actual);
        return actual;
    }*/

    public  void LogInByKeyWord() throws Exception {
        String path = "/Users/hasan/Desktop/Automation_FrameWork_Group2/Costco/Data/KeyWord2.xls";
        LogInByKeyWordPage.setExcelFile(path, "Sheet1");
        for (int i = 1; i <= 4; i++) {
            String actionKeyword = LogInByKeyWordPage.getCelldata(i, 1);
            if (actionKeyword.equals("Username")) {
                inputUserId();
            } else if (actionKeyword.equals("Password")) {
                inputPassword();
            } else if(actionKeyword.equals("Login")) {
                clickOnSignInButton();
            }
            /*if (actionKeyword.equals("By User Input")) {
                logInByUserInput();
            } else if (actionKeyword.equals("By excel data")) {
                String email= null;
                String passCode = null;
                logInByExcelData(email,passCode);
            } else if(actionKeyword.equals("Login")) {
                clickOnSignInButton();
            }*/
        }
    }

}













/*LogInPage costcoPagesTest = PageFactory.initElements(driver,LogInPage.class);

    public void logIn(){
        costcoPagesTest.logInByUserInput();
    }

    public void selectMethod(String methodName) throws IOException, InterruptedException{
        switch (methodName){
            case "logIn":
                logIn();
                break;
                default:
                    throw new InvalidArgumentException("Method is not Valid");
        }
    }
    DataReader reader = new DataReader();
    public String [] getDataFromSignInKeyword(String fileName) throws IOException, InterruptedException {
        String path = "/Users/hasan/Desktop/Automation_FrameWork_Group2/Costco/Data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }

    public void logInByKeyWord() throws IOException, InterruptedException {
        String[] keyWord = getDataFromSignInKeyword("KeyWordData.xls");
    for (int i = 0; i < keyWord.length; i++){
        selectMethod(keyWord[i]);
        }
    }*/
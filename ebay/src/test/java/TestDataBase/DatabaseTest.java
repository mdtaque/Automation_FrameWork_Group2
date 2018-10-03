package TestDataBase;

import Databaselatest.Databaseconnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import databases.ConnectToMongoDB;

import java.util.List;

public class DatabaseTest extends Databaseconnection {

    Databaseconnection databaseObj;
    ConnectToMongoDB con = new ConnectToMongoDB();
    @BeforeMethod
    public void init(){
        databaseObj = PageFactory.initElements(driver, Databaseconnection.class);
    }
    @Test
    public void testy() throws InterruptedException,Exception{
        driver.get("https://www.ebay.com/");
        List<String> expectedList = databaseObj.menulist();
        List<String> actualList = con.readFromMongoDB("CategoryTable","CategoryList");
        for(int index=0; index<actualList.size();index++){
            Assert.assertEquals(actualList.get(index),expectedList.get(index));
        }
    }
}

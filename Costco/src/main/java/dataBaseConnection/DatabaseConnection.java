
package dataBaseConnection;

import base.CommonAPI;

import base.CommonAPI;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import databases.ConnectToMongoDB;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static databases.ConnectToMongoDB.connectToMongoDB;

 public class DatabaseConnection extends CommonAPI {

           /*public void inserDataIntoDatabase(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<WebElement> language = driver.findElements(By.xpath("//select[@onchange='doGTranslate(this);']"));
            insertIntoMongoDB(language,"LanguageList1","Language");
        }
        public void readData(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> languages2 = readLanguageListFromMongoDB("LanguageList1","Language");
            for(String element:languages2){
                System.out.println(element);
            }
        }
        public DatabaseConnection(){

        }
        public DatabaseConnection(WebDriver driver){
               this.driver = driver;
            PageFactory.initElements(driver,this);
           }
*/
 }




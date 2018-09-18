package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(String url){
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver","/Users/mdtaque/eclipse-workspace/GroupFramework/Generic/Browser-driver/geckodriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

//    @AfterMethod
//    public void cleanUp(){
//        driver.close();
//    }
}

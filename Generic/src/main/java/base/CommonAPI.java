package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional ("http://www.foxnews.com/") String url){
        System.setProperty("webdriver.chrome.driver","/Users/mdtaque/eclipse-workspace/GroupFramework/Generic/Browser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.foxnews.com/");
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    public void click3(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
}

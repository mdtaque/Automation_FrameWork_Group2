package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

    public static WebDriver driver = null;
    @BeforeMethod
    public void SetUpDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/mdtaque/eclipse-workspace/GroupFramework/Generic/Browser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void cleanup() {
        driver.close();
    }

    public void switchWindow(WebDriver driver) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}

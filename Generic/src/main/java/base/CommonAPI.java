package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.List;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://online.citi.com/US/login.do") String url){
        System.setProperty("webdriver.gecko.driver","/Users/hasan/Desktop/Automation_FrameWork_Group2/Generic/Browser-driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }


    /*@AfterMethod

//    @AfterMethod
//    public void cleanUp(){
//        driver.close();
//    }


    @AfterMethod

   public void cleanUp(){
        driver.close();
    }*/


    public void clickOnlinkText(String locator){
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }


    public void clickOnClass(String locator){
        driver.findElement(By.className(locator)).click();
    }

    public void typeOnCss1(String locator, String value){
        Select select = new Select(driver.findElement(By.cssSelector(locator)));
        //List <WebElement> list= select.getOptions();
        select.selectByVisibleText(value);
        /*WebElement providers = driver.findElement(By.cssSelector(locator));
        providers.sendKeys();*/
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }


}

package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://online.citi.com/US/login.do") String url) {
        System.setProperty("webdriver.gecko.driver", "/Users/hasan/Desktop/Automation_FrameWork_Group2/Generic/Browser-driver/geckodriver");
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver","/Users/hasan/Desktop/Automation_FrameWork_Group2/Generic/Browser-driver/geckodriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    /*public void clickOnId(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public void clickOnName(String locator){
        driver.findElement(By.name(locator)).click();
    }

    public void clickOnClassName(String locator){
        driver.findElement(By.className(locator)).click();
    }

    public void clickOnClass(String locator){
        driver.findElement(By.className(locator)).click();
    }

    public void clickOnlinkText(String locator){
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath (String locator){
        driver.findElement(By.xpath(locator)).click();
    }*/

    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.id(locator)).click();
        } catch (Exception ex) {
            System.out.println("Id locator didn't work");
        }
        try {
            driver.findElement(By.linkText(locator)).click();
        } catch (Exception ex) {
            System.out.println("link text didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {
            System.out.println("css locator didn't work");
        }
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception ex) {
            System.out.println("x-path didn't work");
        }
    }

    public void typeOnId(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeOnName(String locator, String value) {
        driver.findElement(By.name(locator)).sendKeys(value);
    }

    public void typeOnClassName(String locator, String value) {
        driver.findElement(By.className(locator)).sendKeys(value);
    }

    public void typeOnLinkText(String locator, String value) {
        driver.findElement(By.linkText(locator)).sendKeys(value);
    }

    public void typeOnCssLocator(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys();
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value);
        } catch (Exception ex) {
            System.out.println("Id locator didn't work");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys(value);
        } catch (Exception ex) {
            System.out.println("Name locator didn't work");
        }
        try {
            driver.findElement(By.className(locator)).sendKeys(value);
        } catch (Exception ex) {
            System.out.println("Class Name locator didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            System.out.println("CSS locator didn't work");
        }
        try {
            driver.findElement(By.xpath(locator)).sendKeys();
        } catch (Exception ex) {
            System.out.println("Xpath locator didn't work");
        }
    }

    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    /*public void typeOnCss1(String locator, String value) {
        Select select = new Select(driver.findElement(By.cssSelector(locator)));
        //List <WebElement> list= select.getOptions();
        select.selectByVisibleText(value);
        *//*WebElement providers = driver.findElement(By.cssSelector(locator));
        providers.sendKeys();*//*

    }
*/


    public List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    //handling Alert
    /*public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
*/

    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        alert.dismiss();
    }

    public void mouseHoverByLinkText(String locator) {
        try {
            WebElement element = driver.findElement(By.linkText(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.linkText(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }
    }

    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

        }
    }

    public void takeScreenshot(String fileName) throws IOException{
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/hasan/Desktop/Automation_FrameWork_Group2/CITI/screenShots"+fileName+".png"));
    }
   }


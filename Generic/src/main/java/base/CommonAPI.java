package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("http://www.foxnews.com/") String url) {
        getLocalDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void getLocalDriver(String browser){
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/mdtaque/eclipse-workspace/GroupFramework/Generic/Browser-driver/chromedriver");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/mdtaque/eclipse-workspace/GroupFramework/Generic/Browser-driver/geckodriver");
            driver = new FirefoxDriver();
        }
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    public void commonMethodWithCssForClick(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void commonMethodWithXpathForClick(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void commonMethodWithClassForClick(String locator) {
        driver.findElement(By.className(locator)).click();
    }

    public void clickOnElementTryCatch(String locator){
        try{
            driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex1){
            try {
                driver.findElement(By.xpath(locator)).click();
            }catch (Exception ex2){
                try {
                    driver.findElement(By.id(locator)).click();
                }catch (Exception ex3){
                    try {
                        driver.findElement(By.className(locator)).click();
                    }catch (Exception ex4){
                        System.out.println("All locators failed to locate element!");
                    }
                }
            }

        }
    }

    public void sendKeyOnInputTryCatch(String locator, String value){
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1){
            try {
                driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                try {
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3){
                    try {
                        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
                    }catch (Exception ex4){
                        System.out.println("All locators failed to locate element!");
                    }
                }
            }

        }
    }



    public void commonMethodWithXpathForSendKey(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }

    public void commonMethodWithClassForSendKey(String locator, String value){
        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }

    public void commonMethodWithCssForSendKey(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void clearInputFieldByXpath(String locator){
        driver.findElement(By.xpath(locator)).clear();
    }
    public void clearInputByCss(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void clearInputFieldByClass(String locator){
        driver.findElement(By.className(locator)).clear();
    }
    public void clearInputFieldById(String locator){
        driver.findElement(By.id(locator)).clear();
    }

    public List<WebElement> getListOfWebElementByXpath(String locator){
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }

    public List<String> getTextFromElements(String locator){
        List<WebElement> elements = new ArrayList<>();
        List<String> text = new ArrayList<>();
        elements = driver.findElements(By.cssSelector(locator));
        for(WebElement web : elements){
            String st = web.getText();
            text.add(st);
        }
        return text;
    }
    public List<WebElement> getListOfWebElementByCss(String locator){
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

    public String getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void navigateForward(){
        driver.navigate().forward();
    }

    public String getTextByCss(String locator){
        String text = driver.findElement(By.cssSelector(locator)).getText();
        return text;
    }

    public String getTextByXpath(String locator){
        String text = driver.findElement(By.cssSelector(locator)).getText();
        return text;
    }

    public String getTextById(String locator){
        String text = driver.findElement(By.id(locator)).getText();
        return text;
    }

    public void mouseHoverByCss(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }





}

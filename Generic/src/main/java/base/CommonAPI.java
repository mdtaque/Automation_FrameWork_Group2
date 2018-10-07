package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    public String browserstack_username= "akmtareqhasan1";
    public String browserstack_accesskey = "zCHd517a3Hzyq9Kfq3uj";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";

    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
                      @Optional("OS X") String os,@Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("34")
                              String browserVersion, @Optional("https://online.citi.com/US/login.do") String url)throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/hasan/Desktop/Automation_FrameWork_Group2/Generic/Browser-driver/chromedriver");
        if(useCloudEnv==true){
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os,os_version, browserName, browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,os,os_version, browserName, browserVersion);
            }
        }else{
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }
    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows")){
                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("chrome-options")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows")){
                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        }

        else if(browserName.equalsIgnoreCase("firefox")){
            if(OS.equalsIgnoreCase("OS X")){
                System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver");
            }else if(OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/browser-driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;

    }

    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String os, String os_version,String browserName,
                                    String browserVersion)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    //ExtentReport
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }



    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

    public void clickOnId(String locator){
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
    }

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

    public List<WebElement> getListOfWebElementsByCss(String locator) {
        List<WebElement> list = new ArrayList<>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }

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
    public static void captureScreenshot(WebDriver driver, String screenshotName){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }

    public void clearInput(String locator){
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void keysInput(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }

    //Handling New Tabs
    public static WebDriver handleNewTab(WebDriver driver1){
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1;
    }

    public void takeScreenshot(String fileName) throws IOException{
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/hasan/Desktop/Automation_FrameWork_Group2/CITI/screenShots"+fileName+".png"));
    }
   }


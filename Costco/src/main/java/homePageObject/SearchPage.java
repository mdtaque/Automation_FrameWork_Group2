package homePageObject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import dataBaseConnection.MongoDBConnection;

public class SearchPage extends CommonAPI {
    MongoDBConnection mongoConnect = new MongoDBConnection();

    @FindBy(xpath = "//input[@id='search-field']")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.XPATH, using = "//div[@class='inner-addon right-addon flex-child']//i[@class='co-search-thin']")
    public static WebElement submitButtonWebElement;
    @FindBy(xpath = "//a[@id='slick-slide00']//img[1]")
    public static WebElement shopAllDepartment;
    @FindBy(xpath = "//a[@id='Home_Ancillary_4']")
    public static WebElement serviceTab;
    @FindBy(xpath = "//a[@id='Home_Ancillary_0']")
    public static WebElement groceryTab;
    @FindBy(id = "header_sign_in")
    public static WebElement signInOrRegister;
    @FindBy(xpath = "//h3[contains(text(),'Video Games')]")
    public static WebElement videoGameLink;
    @FindBy(xpath = "//a[@id='Home_Ancillary_1']")
    public static WebElement businessDeleveryLink;
    @FindBy(xpath = "//a[@id='Home_Ancillary_5']")
    public static WebElement pthotoButton;
    @FindBy(xpath = "//a[@id='cart-d']")
    public static WebElement cartIcon;
    @FindBy(xpath = "//*[@id=\"shop-mt\"]/a")
    public static WebElement shopButton;
    //Webelements for drop down with mongo db
    @FindBy(id = "navigation-dropdown")
    public static WebElement getShopAllDepartmentButton;
    @FindBy(id = "primary-category-container")
    public static WebElement shopAllDepartmentDiv; //div that will appear after hovering on shop_all_department
    // end
    @FindBy(xpath = "//*[@id='navigation-dropdown']")
    public static WebElement allDepartment;
    @FindBy(xpath = "//a[@id='WC_CategoriesSidebarDisplayf_links_3_1']")
    public static WebElement electronicLink;
    @FindBy(xpath = "//*[@id=\'navigation-flyout-container\']")
    public static WebElement tvAndTunerFreeDisply;

    public List<String> getShopAllDepartmentMenuList() {
        //get all the list menu from shop_all_department
        waitForShopAllDepartmentDivToAppear();
        List<WebElement> shopAllDepartmentList = driver.findElements(By.xpath("//li[@class='category-level-1']/a"));
        List<String> shopAllDepartmentListText = new ArrayList<>();
        for (WebElement it : shopAllDepartmentList) {
            shopAllDepartmentListText.add(it.getText());
        }
        return shopAllDepartmentListText;
    }

    public void waitForShopAllDepartmentDivToAppear() {
        //after clicking shop_all_department we are waiting for the div to appear.
        driver.navigate().to("https://www.costco.com/");
        getShopAllDepartmentButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(shopAllDepartmentDiv));
    }

    public void compareData() {
        List<String> expectedData = getShopAllDepartmentMenuList();
        List<String> actualData = mongoConnect.readFromMongoDB("ShopAllDepartment", "DepartmentList");
        for (int index = 0; index < actualData.size(); index++) {
            Assert.assertEquals(expectedData.get(index), actualData.get(index));
        }
    }

    public static void mouseHover() throws InterruptedException {
        WebElement element = driver.findElement(By.id("navigation-dropdown"));
        sleepFor(1);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement element1 = driver.findElement(By.xpath("//a[@id='WC_CategoriesSidebarDisplayf_links_3_1']"));
        sleepFor(2);
        action.moveToElement(element1).build().perform();
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\'navigation-flyout-container\']"));
        action.moveToElement(element2).click().perform();
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("diaper");
        itemsList.add("baby wipe");
        itemsList.add("milk");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("water");
        itemsList.add("chicken");
        return itemsList;
    }

    public List<String> listOfText() {
        List<String> elements = new ArrayList<>();
        List<String> text = new ArrayList<>();
        for (String web : elements) {
            text.add(web);
        }
        return text;
    }

    public void screenShot() throws IOException {
        takeScreenShot("https://www.costco.com/");
    }

    public void clickOnAllDepartmentLink() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        allDepartment.click();
    }

    public void shopButtonIsWorking() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        shopButton.isDisplayed();
    }

    public void cartIconIsDysplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        cartIcon.isDisplayed();
    }

    public void pthotoButtonIsEnabled() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        pthotoButton.isEnabled();
    }

    public void navigateToBusinessDeleveryLink() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        businessDeleveryLink.click();
    }

    public void clickOnVideoGameLink() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        videoGameLink.click();
        ;
    }

    public void navigateToSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        signInOrRegister.click();
    }

    public void groceryTabIsDysplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        groceryTab.isDisplayed();
    }

    public void navigateToSignInPageAndNavigateBackToHomePage() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        shopButton.click();
        navigateBackword();
    }

    public void navigateToServicePage() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        serviceTab.click();
    }

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().sendKeys(value);
    }

    public void clearInput() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public WebElement getSearchInputField() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
        this.searchInputWebElement = searchInputField;
    }

    public static void hoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

}





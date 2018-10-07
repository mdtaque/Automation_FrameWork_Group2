package homePageObject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.ConnectDB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {
    @FindBy(xpath = "//input[@id='search-field']")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.XPATH, using ="//div[@class='inner-addon right-addon flex-child']//i[@class='co-search-thin']")
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
    @FindBy(xpath = "//*[@id='navigation-dropdown']")
    public static WebElement allDepartment;
    @FindBy(xpath = "//a[@id='WC_CategoriesSidebarDisplayf_links_3_1']")
    public static WebElement electronicLink;
    @FindBy(xpath = "//*[@id=\'navigation-flyout-container\']")
    public static WebElement tvAndTunerFreeDisply;

    public static void mouseHover()throws InterruptedException{
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
    public static List<String> getItemValue(){
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
    /*public List<String> listOfElements() {
        List<String> list = new ArrayList<>();
        list.add("lotion");
        list.add("watch");
        list.add("sunglass");
        list.add("phone");

        return list;
    }*/
    public List<String> listOfText(){
        List<WebElement> elements = new ArrayList<>();
        List<String> text = new ArrayList<>();
        for(WebElement web : elements){
            text.add(web.getText());
        }
        return text;
    }
    /*public void getList(){
        for(String st : listOfElements()){
            searchInputWebElement.sendKeys(st,Keys.ENTER);
            searchInputWebElement.clear();
        }
    }*/
    public void screenShot() throws IOException {
        takeScreenShot("https://www.costco.com/");
    }

    public void clickOnAllDepartmentLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allDepartment.click();
    }
    public void shopButtonIsWorking(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopButton.isDisplayed();
    }
    public void cartIconIsDysplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cartIcon.isDisplayed();
    }
    public void pthotoButtonIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pthotoButton.isEnabled();
    }
    public void navigateToBusinessDeleveryLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessDeleveryLink.click();
    }
    public void clickOnVideoGameLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        videoGameLink.click();;
    }
    public void navigateToSignInPage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOrRegister.click();
    }
    public void groceryTabIsDysplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groceryTab.isDisplayed();
    }
    public void navigateToSignInPageAndNavigateBackToHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopButton.click();
        navigateBackword();
    }
    public void navigateToServicePage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        serviceTab.click();
    }
    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().sendKeys(value);
    }
    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public WebElement getSearchInputField() {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }
    public void setSearchInputField(WebElement searchInputField) {
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.searchInputWebElement = searchInputField;
    }
    public static void hoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).click(elementToClick).build().perform();
    }
    /*public void searchItems()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }*/
    //************** Methods for searching items with DB data  ************************************
    /*public void searchItemsFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ConnectToSqlDB2.insertDataFromArrayListToMySql(listOfUsername(), "testSearch", "items");
        List<String> itemsToSearch = ConnectToSqlDB2.readDataBase("testSearch", "items");
        for (String e: itemsToSearch){
            typeByXpath("//input[@id='searchbox']",e);
            clearInputBox(searchBox);
        }
    }*/
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.InsertDataFromArryListToMySql(getItemValue(),"myShoppingList", "item");
    }
}





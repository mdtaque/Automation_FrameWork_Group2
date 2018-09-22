package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePageClick extends CommonAPI {

//    public HomePageClick(){
//        PageFactory.initElements(driver, this);
//    }


    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[2]/a")
    public static WebElement searchicon;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[4]/div[1]/div[1]/div/form/fieldset/input[1]")
    public static WebElement searchinputbox;
    @FindBy(className = "resp_site_submit")
    public static WebElement searchbuttonEnter;
    @FindBy(className = "logo")
    public static WebElement clickonlogo;
    @FindBy(tagName = "a")
    public List<WebElement> anchorTag = new ArrayList<>();
    @FindBy(linkText = "World")
    public static WebElement verifyLinkText;
    @FindBy(partialLinkText = "Rosenstein discussed")
    public static WebElement verifyPartialLinkText;
    @FindBy(css = "#main-nav > ul > li.menu-more")
    public static WebElement clickOnMore;


    public void searchBoxClick() {
        searchicon.click();
    }

    //reusable method
    public void searchBoxInput(String input) {
        searchicon.click();
        searchinputbox.sendKeys(input);
    }

    public void searchButtonEnter() {
        searchicon.click();
        searchinputbox.sendKeys("Sports");
        searchbuttonEnter.click();
    }

    public void clicklogo() {
        clickonlogo.click();

    }

    public void getLinks () {
        for (WebElement links : anchorTag) {
            System.out.println(links.getAttribute("href"));
        }
    }

    public void linkText(){
        verifyLinkText.click();
    }

    public void partialLinkText(){
        verifyPartialLinkText.click();
    }

    public List<String> getItemValue(){
        searchBoxClick();
        List<String> itemList = new ArrayList<>();
        itemList.add("Cricket");
        itemList.add("Football");
        itemList.add("Crime");
        itemList.add("Baseball");
        itemList.add("Soccer");

        return itemList;
    }

    public void More() throws InterruptedException {
        clickOnMore.click();
        //driver.manage().wait(10);
        Select select = new Select(driver);
        select.selectByValue("Movies");

    }

    }


//    @FindBy(name = "SearchText")
//    public static WebElement searchBox;
//    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
//    public static WebElement productSearchOption;
//    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
//    public static WebElement suppliersSearchOption;
//    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[2]")
//    public static WebElement quotesSearchOptin;
//    @FindBy(xpath = "//*[@id=\"J_SC_header\"]//input[4]")
//    public static WebElement searchButton;
//    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[1]/span")
//    public static WebElement sourcingSolutions;
//    @FindBy(partialLinkText = "Top Selected")
//    public static WebElement topSelectedSuppliers;
//    @FindBy(partialLinkText = "Sign In")
//    public static WebElement signInButton;
//    @FindBy(partialLinkText = "Get the App")
//    public static WebElement getTheAppLink;
//    @FindBy(partialLinkText = "One Request")
//    public static WebElement oneRequestButton;
//    @FindBy(partialLinkText = "Favorites")
//    public static WebElement favoriteLink;
//    @FindBy(xpath = "//div[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3")
//    public static WebElement categories;
//    @FindBy(partialLinkText = "Machinery")
//    private WebElement machinery;
//    @FindBy(partialLinkText = "Hand Tools")
//    private WebElement handTools;
//    @FindBy(xpath = "//a[@class='more' and @href='javascript:;']")
//    private WebElement seeMore;
//    @FindBy(xpath = "//div/a[text()='Alibaba.com']")
//    private WebElement logo;
//    @FindBy(xpath = "//a[@data-val='ordericon']")
//    private WebElement orderProtectionButton;


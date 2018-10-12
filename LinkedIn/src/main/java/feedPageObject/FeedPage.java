package feedPageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import signInPageObject.SignInPage;

import static signInPageObject.SignInPage.signInToLinkedInAccount;

public class FeedPage extends CommonAPI {

    SignInPage objectSignInPage;

    @FindBy(xpath = "//*[@id=\'feed-tab-icon\']")
    public static WebElement homeIcon;
    @FindBy(xpath = "//*[@id=\'mynetwork-tab-icon\']")
    public static WebElement myNetwork;
    @FindBy(xpath = "//*[@id=\'jobs-tab-icon\']")
    public static WebElement jobIcon;
    @FindBy(css = "#jobs-tab-icon")
    public static WebElement jobText;
    @FindBy(css = "//span[@class='launchpad-card__mini-cta button-tertiary-small']")
    public static WebElement findConnectionBox;
    @FindBy(xpath = "//span[@id='messaging-tab-icon']")
    public static WebElement MessageIcon;
    @FindBy(css = "#messaging-tab-icon")
    public static WebElement MyProfileIcon;
    @FindBy(xpath = "//button[contains(@class,'Sans-17px-black-70%')]")
    public static WebElement statusBox;
    @FindBy(xpath = "//button[@id='ember1715']")
    public static WebElement postStatusButton;
    @FindBy(xpath = "//artdeco-typeahead-deprecated-input[@id='ember911']//input[@placeholder='Search']")
    public static WebElement searchBox;
    @FindBy(xpath = "//div[@id='nav-typeahead-wormhole']")
    public static WebElement searchButton;


    public void navigateToMyProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       objectSignInPage.signInToLinkedInAccount();
        MyProfileIcon.click();
    }
    public void navigateToFindConnection() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInToLinkedInAccount();
        sleepFor(2);
        findConnectionBox.click();
    }
    public void navigateToMessage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MessageIcon.click();
    }
    public void navigateToHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeIcon.click();
    }
    public void mouseHoverOnStatusBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        statusBox.click();
    }
    public void postNewStatus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(statusBox);
        statusBox.sendKeys("In a few weeks New York will have beautiful foliage");
        postStatusButton.click();
    }
    public void searchPeople() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInToLinkedInAccount();
        sleepFor(1);
        searchBox.click();
        searchBox.sendKeys("Barack Obama");
        searchButton.click();
    }
}

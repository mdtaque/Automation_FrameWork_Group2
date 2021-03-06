package signInPageObject;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import static signInPageObject.SignInPageByXlsFile.getErrorMessage;

public class SignInPage extends CommonAPI {
    SignInPage objectSignInPage;

    @FindBy(xpath = "//input[@id='login-email']")
    public static WebElement email;
    @FindBy(css = "#login-password")
    public static WebElement passWord;
    @FindBy(css = "#login-submit")
    public static WebElement signInButton;

    @FindBy(xpath = "//img[@class='lazy-loaded']")
    public static WebElement linkedInLogo;
    @FindBy(xpath = "//*[@id=\'yui-gen0\']")
    public static WebElement forgotPasswordTab;
    @FindBy(xpath = "//*[@id=\'mini-profile--js\']/li[3]/span/a")
    public static WebElement joinNowTab;

    public void signInWithWebElement(WebElement element1, WebElement element2){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        element1.sendKeys();
        element2.sendKeys();
    }
    public static void signInToLinkedInAccount(){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("shamspaa@gmail.com");
        passWord.sendKeys("veryeasy1212");
        signInButton.click();
    }
    public void signInByDataProvider(String userEmail, String passCode) throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys(userEmail);
        passWord.sendKeys(passCode);
        signInButton.click();
        Thread.sleep(3000);
    }
    public String withoutAnUserNameAndPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInButton.click();
        String strn = getErrorMessage.getText();
        return strn;
    }
    public boolean forgotPasswordTabStatus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean bl = forgotPasswordTab.isEnabled();
        return bl;
    }
    public boolean joinNowTabStatus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean bol = joinNowTab.isEnabled();
        return bol;
    }
    public String signInWithInvalidInfo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("wrongUserName");
        passWord.sendKeys("password");
        signInButton.click();
        String errorMess = getErrorMessage.getText();
        System.out.println("Sigh In Error Message " +getErrorMessage);
        return errorMess;
    }
    public String noUsernameAndInvalidPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        passWord.sendKeys("wrongPassword");
        signInButton.click();
        String strn = getErrorMessage.getText();
        return strn;
    }
    public String invalidUsernameAndInvalidPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("wrongUserName");
        passWord.sendKeys("wrongPassword");
        signInButton.click();
        System.out.println(getErrorMessage);
        String strn = getErrorMessage.getText();
        return strn;
    }
    public void validUserNameAndValidPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("shamspaa@gmail.com");
        passWord.sendKeys("veryeasy1212");
        signInButton.click();
    }
    public void signInByValidUsernameAndPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("shamspaa@gmail.com", Keys.ENTER);
        passWord.sendKeys("veryeasy1212", Keys.ENTER);
        signInButton.click();
    }
}

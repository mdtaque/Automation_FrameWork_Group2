package citiPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

import static java.lang.Thread.*;

public class CreditCards  extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"cA-cardsUseridMasked\"]")
    public static WebElement inputUserIdWebElement;
    public void InputUserId() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputUserIdWebElement.sendKeys("pntselenium");
        Thread.sleep(3000);}

     @FindBy(how = How.XPATH, using = "//*[@id=\"PASSWORD\"]")
    public static WebElement inputPasswordWebElement;
    public void InputPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputPasswordWebElement.sendKeys("selenium18");}

    @FindBy(how = How.XPATH, using = "//*[@id=\"logon\"]/div[6]/input")
    public static WebElement clickSignInWebElement;
    public void SignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSignInWebElement.click();}

    public void logInByUserInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InputUserId();
        InputPassword();
        SignIn();
    }

    @FindBy(xpath = "//*[@id=\"cA-DD-cardCategory\"]/div[1]/div/a")
    public static WebElement selectCardCatagory;
    public void clickSelectCardCatagory() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectCardCatagory.click();
        Thread.sleep(3000);
        List<WebElement> DD_Menu = driver.findElements(By.xpath("//div[@class=\"dropdown\"]//ul"));
        for (int i=0; i<DD_Menu.size();i++) {
            WebElement element = DD_Menu.get(i);
            String text = element.getAttribute("innerHTML");
           /* if (text.contentEquals("Travel Cards")){
                element.click();
            }*/
            boolean status = element.isEnabled();
            System.out.println("Values from dromdown is: " + text + "; and the link is: " + status);
        }
    }
}

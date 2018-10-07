package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Banking extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "Banking")
    public static WebElement bankingWebElement;
    public void clickBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bankingWebElement.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"hero-a-2-card\"]/section/div[2]/div/div/div/div/div[2]/div/div/div[2]/button")
    public static WebElement learnMoreWebElement;
    public void LearnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMoreWebElement.click();}

    @FindBy(how = How.XPATH, using = "//*[@id=\"inpagenav-1-1-a-Tab\"]/span")
    public static WebElement checkingWebElement;
    public void Checking(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkingWebElement.click();}


}

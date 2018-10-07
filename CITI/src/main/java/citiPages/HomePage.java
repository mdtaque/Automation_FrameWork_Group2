package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage extends CommonAPI{
    @FindBy(how = How.XPATH, using = "//*[@id=\"navUtility\"]/div/div/ul/li[1]/a")
    public static WebElement openAnAcountWebElement;
    public void OpenAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openAnAcountWebElement.click();
    }

    /*@FindBy(how = How.LINK_TEXT, using = "Español")
    public static WebElement clickEspanolWebElement;
    public void EspanolLang(){ clickEspanolWebElement.click(); }

    @FindBy(how = How.XPATH, using = "//*[@id=\"creditCards\"]/a")
    public static WebElement clickCreditCardsWebElement;
    public void CreditCards(){ clickCreditCardsWebElement.click(); }

    @FindBy(how = How.LINK_TEXT, using = "Banking")
    public static WebElement clickBankingWebElement;
    public void Banking(){ clickBankingWebElement.click(); }

    @FindBy(how = How.LINK_TEXT, using = "Lending")
    public static WebElement clickLendingWebElement;
    public void Lending(){ clickLendingWebElement.click(); }

    @FindBy(how = How.LINK_TEXT, using = "Investing")
    public static WebElement clickInvestingWebElement;
    public void Investing(){ clickInvestingWebElement.click(); }

    @ FindBy(how = How.ID, using = "citigold")
    public static WebElement clickCitiGoldWebElement;
    public void CitiGold(){ clickCitiGoldWebElement.click(); }


    @FindBy(how = How.LINK_TEXT, using = "LearnMore")
    public static WebElement clickLearnMoreWebElement;
    public void LearMore(){ clickLearnMoreWebElement.click(); }*/

   /* @FindBy(how = How.XPATH,using = "//*[@id=\"usernameMasked\"]")
    public static WebElement inputUserIdWebElement;
    public void InUserName() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputUserIdWebElement.sendKeys("peopleandtech");
    Thread.sleep(3000);}*/

   /* @FindBy(how = How.ID,using = "password")
    public static WebElement inputPasswordWebElement;
    public void InputPassword(){ inputPasswordWebElement.sendKeys("selenium123");}

    @FindBy(how = How.XPATH,using = "//input[@id='signInBtn']")
    public static WebElement clickSignInWebElement;
    public void SignIn(){ clickSignInWebElement.click();}

    @FindBy(xpath = "//*[@id=\"headerLoka ogoLink\"]/div")
    WebElement clickCITILogo;
    public void CitiLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickCITILogo.click();
    }*/

    //@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/section/div")
    //WebElement SignOnForm;

    //public void switchToSignOnForm(){driver.switchTo().frame(SignOnForm);}

    @FindBy(className = "btn btn-link removeMobilePadding requestUserIDReminder removeWhiteSpace")
    WebElement clickForgotUserId;

    @FindBy(xpath = "//*[@id=\"logInForm\"]/div[1]/div[4]/div[2]/div[1]")
    WebElement clickActiveCard;

    public void SignOnForm(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickForgotUserId.click();
        clickActiveCard.click();
    }
}

package citiPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI{
    @FindBy(how = How.LINK_TEXT, using = "Open an Account")
    public static WebElement openAnAcountWebElement;
    public void OpenAnAccount(){ openAnAcountWebElement.click(); }

    @FindBy(how = How.LINK_TEXT, using = "Español")
    public static WebElement clickEspanolWebElement;
    public void EspanolLang(){ clickEspanolWebElement.click(); }

    @FindBy(how = How.LINK_TEXT, using = "Credit Cards")
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


    @FindBy(how = How.LINK_TEXT, using = "Learn More")
    public static WebElement clickLearnMoreWebElement;
    public void LearMore(){ clickLearnMoreWebElement.click(); }

    @FindBy(how = How.CLASS_NAME, using = "brandingLogo")
    public static WebElement clickLogoWebElement;
    public void BrandingLogo(){clickLogoWebElement.click();}

    @FindBy(how = How.XPATH,using = "//input[@id='usernameMasked']")
    public static WebElement inputUserIdWebElement;
    public void InputUserId(){ inputUserIdWebElement.sendKeys("peopleandtech");}

    @FindBy(how = How.ID,using = "password")
    public static WebElement inputPasswordWebElement;
    public void InputPassword(){ inputPasswordWebElement.sendKeys("selenium123");}

    @FindBy(how = How.XPATH,using = "//input[@id='signInBtn']")
    public static WebElement clickSignInWebElement;
    public void SignIn(){ clickSignInWebElement.click();}

    @FindBy(how = How.ID,using = "signOnLoginError")
    public static WebElement getErrorMessageWebElement;
    public void ErrorMessage(){ getErrorMessageWebElement.getText();}

}

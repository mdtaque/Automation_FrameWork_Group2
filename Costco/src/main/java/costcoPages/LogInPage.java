package costcoPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"logonId\"]")
    public static WebElement userIdWebElement;
    public void inputUserId(){userIdWebElement.sendKeys("akmhasan@gmail.com");}

    @FindBy(xpath = "//*[@id=\"logonPassword\"]")
    public static WebElement passwordWebElement;
    public void inputPassword(){passwordWebElement.sendKeys("akmhasan");}

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[5]/input")
    public static WebElement signInButtonWebElement;
    public void clickOnSignInButton(){signInButtonWebElement.click();}

    @FindBy(xpath = "//*[@id=\"logon\"]/div/div/div[1]")
    WebElement invalidMsgWebElement;



    public void logInByUserInput(){
        userIdWebElement.sendKeys("pntselenium@gmail.com");
        passwordWebElement.sendKeys("selenium123");
        signInButtonWebElement.click();
//        driver.navigate().to("https://accountonline.citi.com/cards/svc/LoginIntNext.do?SYNC_TOKEN=e6fb72da63e8772e7e1d1298d8b6b5fe&JFP_TOKEN=CNHVMNK0");
        //String actual = invalidMsgWebElement.getText();
        //System.out.println("Sign In error Message: " + actual);
    }

    public String logInByExcelData(String email, String passCode){
        userIdWebElement.sendKeys(email);
        passwordWebElement.sendKeys(passCode);
        signInButtonWebElement.click();
        String actual = invalidMsgWebElement.getText().concat("The email address and/or password you entered are invalid.");
        System.out.println("Sign In error Message: " + actual);
        return actual;
    }
}

package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;

public class SignIn extends CommonAPI {
    @FindBy(css = "#userid")
    WebElement emailOrUsername;
    @FindBy(css = "#pass")
    WebElement password;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement signInButton;
    @FindBy(css = "#errf")
    WebElement invalidMsg;
    @FindBy(css = "#signinContainer")
    WebElement signInFrame;
    @FindBy(xpath = "//div[@id='wrapper']")
    WebElement iframe;

    public void switchToSignInForm(){
        driver.switchTo().frame(signInFrame);
    }
    public void logInManual(){
        emailOrUsername.sendKeys("gvhgv@gmail.com");
        password.sendKeys("5646");
        signInButton.click();
//        String actual =  invalidMsg.getText();
//        System.out.println("SignIn Error Message: " + actual);
    }

    public String logInByExcelData(String email, String passCode){
        emailOrUsername.sendKeys(email);
        password.sendKeys(passCode);
        signInButton.click();
        String actual =  invalidMsg.getText();
        System.out.println("SignIn Error Message: " + actual);
        return actual;
    }

    public void switchToiframe(){
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(iframe));
        iframeHandle(iframe);
    }


}

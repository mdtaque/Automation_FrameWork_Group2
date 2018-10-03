package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;

public class SignIn extends CommonAPI {
    @FindBy(xpath = "//input[@id='userid']")
    WebElement emailOrUsername;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement signInButton;
    @FindBy(xpath = "//p[@id='errf']")
    WebElement invalidMsg;
    @FindBy(css = "#signinContainer")
    WebElement signInFrame;

    public void switchToSignInForm(){
        driver.switchTo().frame(signInFrame);
    }
    public void logInManual(){
        emailOrUsername.sendKeys("gvhgv@gmail.com");
        password.sendKeys("5646");
        signInButton.click();
        String actual =  invalidMsg.getText();
        System.out.println("SignIn Error Message: " + actual);
    }
    public String logInByExcelData(String email, String passCode){
        emailOrUsername.sendKeys(email);
        password.sendKeys(passCode);
        signInButton.click();
        String actual =  invalidMsg.getText();
        System.out.println("SignIn Error Message: " + actual);
        return actual;
    }
}

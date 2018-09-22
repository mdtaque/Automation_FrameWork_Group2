package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmecyPage extends CommonAPI {

    @FindBy(css="#userEmail")
    WebElement userEmail;

    @FindBy(css="password")
    WebElement password;

    @FindBy(className="ice-btn-default-red")
    WebElement login;

    @FindBy(className="ng-star-inserted")
    WebElement errorMessage;



    public void checkLogin(){
        userEmail.click();
        userEmail.sendKeys("testemail1@gmail");
        password.sendKeys("abcd123");
        login.click();
        String loginErrorMassage = errorMessage.getText();
        System.out.println("Login error Message is:"+ loginErrorMassage);


    }
}

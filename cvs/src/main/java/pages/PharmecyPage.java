package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PharmecyPage extends CommonAPI {

    @FindBy(css="#userEmail")
    WebElement userEmail;

    @FindBy(css="password")
    WebElement password;

    @FindBy(className="ice-btn-default-red")
    WebElement login;

    @FindBy(className="ng-star-inserted")
    WebElement errorMessage;

    @FindBy(xpath="//a[contains(text(), 'My Prescriptions')]")
    WebElement myPrescriptionsLink;

//
//    public PharmecyPage(){
//        PageFactory.initElements(driver, this);
//    }

    public void clickonMyPresciption(){
        myPrescriptionsLink.click();

    }









//    public void checkLogin(){
//        userEmail.click();
//        userEmail.sendKeys("testemail1@gmail");
//        password.sendKeys("abcd123");
//        login.click();
//        String loginErrorMassage = errorMessage.getText();
//        System.out.println("Login error Message is:"+ loginErrorMassage);
//
//
//    }
}

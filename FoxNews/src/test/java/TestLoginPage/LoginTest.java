package TestLoginPage;

import LoginPage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends LogIn {

    LogIn objOfLogIn;
    @BeforeMethod
    public void Initialization2(){
        objOfLogIn = PageFactory.initElements(driver, LogIn.class);
    }
    @Test
    public void testLogInButton(){
       objOfLogIn.goToLoginPage();
    }
    @Test
    public void testCreateAccount() throws InterruptedException {
        testLogInButton();
        objOfLogIn.clickCreateAccount();
    }
    @Test
    public void enterEmailOnEmailBox() throws InterruptedException {
        testLogInButton();
        objOfLogIn.inputOnEmailBox();
    }
    @Test
    public void enterPass() throws InterruptedException {
        enterEmailOnEmailBox();
        commonMethodWithXpathForSendKey("//input[@id='password_login']","75674");
    }
    @Test
    public void logInButtonPress() throws InterruptedException {
        enterPass();
        objOfLogIn.pressLogIn();
        Thread.sleep(9000);
    }
}

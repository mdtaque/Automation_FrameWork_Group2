package TestLogIn;

import LogInPage.LoginWithKeyword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeywordDriven extends LoginWithKeyword {

    LoginWithKeyword loginWithKeyword;

    @BeforeMethod
    public void init(){
        loginWithKeyword = PageFactory.initElements(driver, LoginWithKeyword.class);
    }

    @Test
    public void testKeyword() throws IOException, InterruptedException {
        loginWithKeyword.loginByKeyword();
    }
}

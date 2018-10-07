package KeyWordDrivenTest;

import KeyWordDriven.LogInByKeyWordPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogInByKeyWordPageTest extends LogInByKeyWordPage {
    LogInByKeyWordPage logInByKeyWordPage;
    @BeforeMethod
    public void initializeObjects(){logInByKeyWordPage = PageFactory.initElements(driver,LogInByKeyWordPage.class); }

    @Test
    public void testLogInByKeyWord() throws Exception {
        LogInByKeyWordPage logInByKeyWordPage = new LogInByKeyWordPage();
        logInByKeyWordPage.LogInByKeyWord();
    }
}

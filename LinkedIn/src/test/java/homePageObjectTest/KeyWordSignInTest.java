package homePageObjectTest;

import homePageObject.KeyWordSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
import static base.CommonAPI.convertToString;

public class KeyWordSignInTest extends KeyWordSignIn {
    KeyWordSignIn objKeyWordSignIn;
    @BeforeMethod
    public void initializePage(){
        objKeyWordSignIn = PageFactory.initElements(driver, KeyWordSignIn.class);
    }

    @Test
    public void testSignInByKeyWord() throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objKeyWordSignIn.signInByKeyWord();
    }
}

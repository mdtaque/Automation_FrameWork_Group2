package signInPageObjectTest;

import homePageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.SignInPage;

public class SignInPageTest extends SignInPage {
    HomePage objectHomePage;
    SignInPage objectSignInPage;

    @BeforeMethod
    public void initializePageObject() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectSignInPage = new SignInPage();
        objectSignInPage=PageFactory.initElements(driver, SignInPage.class);
    }
    @Test
    public void testWithoutAnUserNameAndPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.gotoSignUpPage();
        String actual = objectSignInPage.withoutAnUserNameAndPassword();
        String expected = "There were one or more errors in your submission" +
                "Please correct the marked fields below.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testEWithoutAnUserNameAndPassword test has passed");
    }
    @Test
    public void testInvalidUserNameAndNoPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = objectSignInPage.signInWithInvalidInfo();
        String expected = "There were one or more errors in your submission" +
                "Please correct the marked fields below.e";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testInvalidUserNameAndNoPassword test has passed");
    }
    @Test
    public void testNoUsernameAndInvalidPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = objectSignInPage.noUsernameAndInvalidPassword();
        String expected = "Everything stays the same, page does not change";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testNoUsernameAndInvalidPassword test has passed");
    }
    @Test
    public void testInvalidUsernameAndInvalidPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = objectSignInPage.invalidUsernameAndInvalidPassword();
        String expected = "There were one or more errors in your submission" +
                "Please correct the marked fields below.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testInvalidUsernameAndInvalidPassword test has passed");
    }
    @Test
    public void testsignInByValidUsernameAndPassword() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInByValidUsernameAndPassword();
        Thread.sleep(100000);
    }
}

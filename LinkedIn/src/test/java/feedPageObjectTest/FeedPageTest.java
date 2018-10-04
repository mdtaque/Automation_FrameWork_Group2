package feedPageObjectTest;

import feedPageObject.FeedPage;
import homePageObject.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import signInPageObject.SignInPage;


public class FeedPageTest extends FeedPage {
    HomePage objectHomePage;
    SignInPage objectSignInPage;
    FeedPage objectFeedPage;

    @BeforeMethod
    public void initializePageObject() {
        objectHomePage = PageFactory.initElements(driver, HomePage.class);
        objectFeedPage = PageFactory.initElements(driver, FeedPage.class);
        objectSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }
    @Test
    public void testSearchPeople(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectSignInPage.signInToLinkedInAccount();
        objectFeedPage.navigateToMyProfile();

    }


//li[@class='nav-dropdown__item nav-settings__dropdown-item Sans-14px-black-60%']



}


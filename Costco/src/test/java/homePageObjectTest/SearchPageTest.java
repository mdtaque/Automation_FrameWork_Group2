package homePageObjectTest;
import homePageObject.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class SearchPageTest extends SearchPage {
    SearchPage objSearchPage;

    @BeforeMethod
    public void initializePage(){
        objSearchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void testGetSubmitButtonWebElement(){
        objSearchPage.getSubmitButtonWebElement();
    }
    @Test
    public void testGetItemValue(){
        objSearchPage.getItemValue();
    }
    @Test
    public void test3() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.mouseHover();
    }
    @Test
    public void testMouseHover()throws IOException,InterruptedException{
        objSearchPage.mouseHover();
        }
    @Test
    public void testclickOnAllDepartmentLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.clickOnAllDepartmentLink();
    }
    @Test
    public void testClickOnAllDepartmentLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.clickOnAllDepartmentLink();
    }
    @Test
    public void testShopButtonIsWorking(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.shopButtonIsWorking();
    }
    @Test
    public void testCartIconIsDysplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.cartIconIsDysplayed();
    }
    @Test
    public void testPthotoButtonIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.pthotoButtonIsEnabled();
    }
    @Test
    public void testNavigateToBusinessDeleveryLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.navigateToBusinessDeleveryLink();
    }
    @Test
    public void testClickOnVideoGameLink(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.clickOnVideoGameLink();
    }
    @Test
    public void testNavigateToSignInPage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.navigateToSignInPage();
    }
    @Test
    public void testGroceryTabIsDysplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.groceryTabIsDysplayed();
    }
    @Test
    public void testNavigateToSignInPageAndNavigateBackToHomePage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.navigateToSignInPageAndNavigateBackToHomePage();
    }
    @Test
    public void testNavigateToServicePage(){
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objSearchPage.navigateToServicePage();
    }
    @Test
    public void testShopAllDepartmentList(){
       compareData();
    }
}

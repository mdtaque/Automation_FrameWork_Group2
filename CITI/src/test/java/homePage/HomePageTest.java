package homePage;

import base.CommonAPI;
import citiPages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {
    HomePage objOfhomePage;
    @BeforeMethod
    public void Navigating(){
       objOfhomePage = PageFactory.initElements(driver, HomePage.class);
    }
    /*@Test
    public void openAnAccountTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OpenAnAccount();
    }*/
    /*@Test
    public void EspanolLangTest(){
        EspanolLang();
    }
    @Test
    public void CreditCardsTest(){
        CreditCards();
    }
    @Test
    public void BankingTest(){
        Banking();
    }
    @Test
    public void LendingTest(){
        Lending();
    }
    @Test
    public void InvestingTest(){
        Investing();
    }
    @Test
    public void CitiGoldTest(){
        CitiGold();
    }*/

  /* @Test
    public void TestUserId() throws InterruptedException {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       InUserName();
   }*/

   /*@Test
    public void TestPassword(){
       InputPassword();
   }

   @Test
    public void TestSignIn(){
       SignIn();
   }*/

   /*@Test
    public void CitiLogoTest(){
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       CitiLogo();
   }*/

   @Test
    public void SignOnFormTest(){
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       //switchToSignOnForm();
       SignOnForm();
   }
}

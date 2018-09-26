package homePage;

import base.CommonAPI;
import citiPages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    @BeforeMethod
    public void Navigating(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    }
   /* @Test
    public void openAnAccountTest(){
        OpenAnAccount();
    }
    @Test
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

   @Test(priority = 1)
    public void userId(){
       InputUserId();
   }

   @Test(priority = 2)
    public void Password(){
       InputPassword();
   }

   @Test(priority = 3)
    public void SignIn(){
       SignIn();
   }

   /*@Test
    public void GetErrormessage(){
       ErrorMessage();
   }*/
}

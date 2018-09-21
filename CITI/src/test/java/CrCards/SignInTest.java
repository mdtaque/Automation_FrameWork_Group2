package CrCards;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {
    @Test
    public void SignIn(){
        clickOnlinkText("Credit Cards");
        typeOnCss("#cA-cardsUseridMasked","Tareq Hasan");
        typeOnCss("#PASSWORD","Tareq Hasan");
        clickOnClass("cA-cardsLoginSubmit");
    }
}

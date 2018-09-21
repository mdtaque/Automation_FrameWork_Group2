package CrCards;

import base.CommonAPI;
import org.testng.annotations.Test;

public class PasswordTest extends CommonAPI {
    @Test
    public void PassWord(){
        clickOnlinkText("Credit Cards");
        typeOnCss("#cA-cardsUseridMasked","Tareq Hasan");
        typeOnCss("#PASSWORD","Tareq Hasan");

    }
}

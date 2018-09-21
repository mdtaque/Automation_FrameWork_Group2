package CrCards;

import base.CommonAPI;
import org.testng.annotations.Test;

public class UserIDTest extends CommonAPI {
    @Test
    public void userID(){
        clickOnlinkText("Credit Cards");
        typeOnCss("#cA-cardsUseridMasked","Tareq Hasan");
    }
}

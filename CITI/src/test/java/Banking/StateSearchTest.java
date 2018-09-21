package Banking;

import base.CommonAPI;
import org.testng.annotations.Test;

public class StateSearchTest extends CommonAPI {
    @Test
    public void SearchState(){
        clickOnlinkText("Banking");
        typeOnCss1("#stateSelectorSelectId", "NY");
        //clickOnCss(".btn btn-invert");
        clickByXpath("//a[contains(@class,'btn btn-primary select-btn__e-2')]");
        //clickOnClass("close");
    }
}

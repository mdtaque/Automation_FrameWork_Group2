package Banking;

import base.CommonAPI;
import org.testng.annotations.Test;

public class selectState extends CommonAPI {

    @Test
    public void SelectState(){
        clickOnlinkText("Banking");
        typeOnCss1("#stateSelectorSelectId", "NY");
        clickOnCss(".btn btn-invert");
    }
}

package Lending;

import base.CommonAPI;
import org.testng.annotations.Test;

public class MortgageTest extends CommonAPI {
    @Test
    public void Mortgage(){
        clickOnlinkText("Lending");
        clickOnlinkText("Mortgage");
    }
}

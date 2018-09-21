package Lending;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomeEquityTest extends CommonAPI {
    @Test
    public void HomeEquity(){
        clickOnlinkText("Lending");
        clickOnlinkText("Home Equity");
    }
}

package CrCards;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreditCards extends CommonAPI {

    @Test
    public void search() {
        clickOnlinkText("Credit Cards");
    }

    /*public void typeOnCss(String locator, String value){

    }*/


}

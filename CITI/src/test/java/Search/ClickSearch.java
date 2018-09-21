package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickSearch extends CommonAPI {

    @Test
    public void search(){
        clickOnCss("#searchicon");
    }


}

package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test
    public void inputSearch(){
        clickOnCss("#searchicon");
        typeOnCss("#citi-autocomplete-content-searchbox-livesearch","Credit Cards");
        clickOnCss(".citi-autocomplete-content-searchbox-go");
    }
}

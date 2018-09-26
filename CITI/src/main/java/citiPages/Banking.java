package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "Banking")
    public static WebElement bankingWebElement;


}

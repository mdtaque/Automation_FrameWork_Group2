package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HmAlertHandle extends CommonAPI {
    @FindBy(how = How.ID, using = "BtnLocationFinder")
    public static WebElement popupWebElement;
    public void PopupAlert(){ popupWebElement.click(); }

}

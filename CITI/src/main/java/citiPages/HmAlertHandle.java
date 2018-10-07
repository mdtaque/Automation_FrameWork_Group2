package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HmAlertHandle extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"modal_subscribe\"]/div/div/div[2]/a/img")
    public static WebElement popupWebElement;
    //public void PopupAlert() throws InterruptedException { popupWebElement.click();}
    //Thread.sleep(3000);}

    @FindBy(how = How.XPATH, using = "//*[@id=\"modal_subscribe\"]/div/div/div[1]/button")
    public static WebElement clickClosePopUpWebElement;
    public void ClosePopUp() throws InterruptedException{clickClosePopUpWebElement.click();}

}

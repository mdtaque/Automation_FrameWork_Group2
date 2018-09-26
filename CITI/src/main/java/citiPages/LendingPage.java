package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.ws.Action;

public class LendingPage extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "Lending")
    public static WebElement lendingWebElement;





}

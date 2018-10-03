package HomepageEbay;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    public static WebElement fashiontab;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[1]/ul/li[3]/a")
    public static WebElement mensclothing;
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement searchinputbox;
    @FindBy(xpath = "//*[@id=\"gh-eb-Alerts\"]/div/button")
    public static WebElement bellButton;
    @FindBy(css = "#ghn-err")
    public static WebElement clickOnSignIn;

    public void InputSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchinputbox.sendKeys("perfume", Keys.ENTER);
    }

    public List<String> listOfElements() {
        List<String> list = new ArrayList<>();
        list.add("lotion");
        list.add("watch");
        list.add("sunglass");
        list.add("phone");

        return list;
    }
    public List<String> listOfText(){
        List<WebElement> elements = new ArrayList<>();
        List<String> text = new ArrayList<>();
        for(WebElement web : elements){
            text.add(web.getText());
        }
        return text;
    }
    public void getList(){
        for(String st : listOfElements()){
            searchinputbox.sendKeys(st,Keys.ENTER);
            searchinputbox.clear();
        }
    }
    public void hovercase() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(fashiontab).perform();
        Thread.sleep(2000);
        actions.moveToElement(mensclothing).click().perform();
    }

    public void goToLoginPage() throws InterruptedException {
        bellButton.click();
        clickOnSignIn.click();
    }

    public void screenShot() throws IOException {
        takeScreenShot("https://www.ebay.com/");
    }
}

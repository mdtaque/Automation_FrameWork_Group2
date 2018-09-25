package Homepage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    public static WebElement fashiontab;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[1]/ul/li[3]/a")
    public static WebElement mensclothing;
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement searchinputbox;

    public void InputSearchBox(){
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
        //elements.add((WebElement) listOfElements());
        List<String> text = new ArrayList<>();
        for(WebElement web : elements){
            web.getText();
            text.add(web.getText());
            System.out.println(text);
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


}

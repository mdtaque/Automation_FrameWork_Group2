package Database;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Databaseconnection extends BaseUtil {

    /*@FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    public static WebElement fashiontab;
    @FindBy(css="#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > div:nth-child(1)")
    public WebElement fashionDiv;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > div:nth-child(2) > span")
   public  List<WebElement> menuu;*/
    // List<WebElement> menu = driver.findElements(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > div:nth-child(2) > span"));

    public List<String> menulist() throws InterruptedException {

        Select dropDown = new Select(driver.findElement(By.cssSelector(".gh-sb.gh-sprRetina")));
        List<WebElement> dropDownList = dropDown.getOptions();
        List<String> dropDownListText = new ArrayList<>();
        for(WebElement it: dropDownList){
           dropDownListText.add(it.getText());
        }
        return  dropDownListText;
    }

//    public void setFashiontab(){
//        fashiontab.click();
//    }
}

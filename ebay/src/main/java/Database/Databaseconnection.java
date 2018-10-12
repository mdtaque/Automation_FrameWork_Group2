package Database;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

public class Databaseconnection extends BaseUtil {

    public List<String> menulist() throws InterruptedException {
        Select dropDown = new Select(driver.findElement(By.cssSelector(".gh-sb.gh-sprRetina")));
        List<WebElement> dropDownList = dropDown.getOptions();
        List<String> dropDownListText = new ArrayList<>();
        for(WebElement it: dropDownList){
           dropDownListText.add(it.getText());
        }
        return  dropDownListText;
    }
}

package citiPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import javax.xml.ws.Action;
import java.util.List;

public class LendingPage extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "Lending")
    public static WebElement lendingWebElement;
    public void mouseOverLending(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(lendingWebElement).perform();
        List<WebElement> list = driver.findElements(By.xpath("//li[@id=\"lendingLi\"]//a"));
        int total_count = list.size();
        for (int i = 0; i < total_count; i++){
            WebElement element = list.get(i);
            String text = element.getAttribute("innerHTML");
            System.out.println("Links name is: " + text);
        }
    }

}

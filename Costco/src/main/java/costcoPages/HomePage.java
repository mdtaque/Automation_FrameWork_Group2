package costcoPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navigation-dropdown\"]")
    public static WebElement shopAllDepartment;
    public void mouseOverShopAllDepartment() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(shopAllDepartment).perform();
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//li[@class=\"category-level-1\"]//a"));
        int total_count = list.size();
        for (int i=0; i<total_count;i++){
            WebElement element = list.get(i);
            String text = element.getAttribute("title");
            boolean status = element.isEnabled();
            System.out.println("Links name is: " +text + "; and the link is: " + status);
            /*if(text.equalsIgnoreCase("Tires & Auto")){
                element.click();
                break;
            }*/
        }
    }
}

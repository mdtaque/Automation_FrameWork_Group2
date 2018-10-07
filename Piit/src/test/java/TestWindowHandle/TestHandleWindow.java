package TestWindowHandle;

import WindowHandling.HandleWindow;
import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHandleWindow extends BaseUtil {

    HandleWindow objOfHandleWindow;

    @BeforeMethod
    public void init(){
        objOfHandleWindow = PageFactory.initElements(driver, HandleWindow.class);
    }

    @Test
    public void testWindowHandling() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.handlingWindow();
    }
    @Test
    public void testWindowHandleByCondition() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.windowSwitchByCondition();
    }
    @Test
    public void switchAgainnn() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.switchWindowAgain();
    }
    @Test
    public void switchMsgWindow() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.switchToMsgWindow();
    }
    @Test
    public void switchTab() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.switchToNewTab();
    }
    @Test
    public void handleAlertBox() throws InterruptedException {
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        objOfHandleWindow.handleAlertBox();
    }
}

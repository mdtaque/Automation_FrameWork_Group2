package alertHandlePage;

import citiPages.HmAlertHandle;
import citiPages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandlePageTest extends HmAlertHandle {
    @BeforeMethod
    public void AlertHandle(){
        HmAlertHandle alertHandle = PageFactory.initElements(driver, HmAlertHandle.class);
    }

   /* @Test
    public void alertHandling() throws InterruptedException {
        PopupAlert();
    }*/
}

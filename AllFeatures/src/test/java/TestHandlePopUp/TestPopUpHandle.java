package TestHandlePopUp;

import PopUpHandle.HandlePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPopUpHandle extends HandlePopUp {
    HandlePopUp objOfHandlePopUp;

    @Test
    public void popUpHandle() throws InterruptedException {
        objOfHandlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        objOfHandlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}

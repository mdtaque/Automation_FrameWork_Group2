package citiPages;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomeScreenShot extends CommonAPI {
    public void screenShot() throws IOException{
        takeScreenshot("https://online.citi.com/US/login.do");
    }

}

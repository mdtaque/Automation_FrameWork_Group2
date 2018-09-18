package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

    @Test
    public void click() {
        driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/li[1]/a")).click();
        //Thread.sleep(5000);
    }

    @Test
    public void click2() {
        driver.findElement(By.cssSelector("#main-nav > ul > li:nth-child(2) > a")).click();
        //Thread.sleep(5000);
    }
}

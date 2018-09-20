package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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

    @Test
    public void main(){
        typeOnCss("#main-nav > ul > li.menu-opinion > a");
    }

    @Test
    public void main2(){
        typeOnXpath("//*[@id=\"main-nav\"]/ul/li[5]/a");
    }

    @Test
    public void main3() {
        typeOnXpath("//li[contains(@class,'menu-more')]");
        }

    @Test
    public void main4() {
        typeOnXpath("//li[contains(@class,'menu-more')]");
        typeOnXpath3("//*[@id=\"wrapper\"]/header/div[4]/div[1]/div[1]/div/form/fieldset/input[1]", "Sports");
    }

    @Test
    public void main5() {
        typeOnXpath("//li[contains(@class,'menu-more')]");
        typeonInputBox("//*[@id=\"wrapper\"]/header/div[4]/div[1]/div[1]/div/form/fieldset/input[1]","Crime");
    }


}

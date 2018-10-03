package TestHomePageClick;

import HomePage.HomePageClick;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ClickHomepage extends HomePageClick {

    HomePageClick objofHomePage;

    @BeforeMethod
    public void initialization() {
        objofHomePage = PageFactory.initElements(driver, HomePageClick.class);
    }
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
    public void main() {
        commonMethodWithCssForClick("#main-nav > ul > li.menu-opinion > a");
    }
    @Test
    public void main2() {
        commonMethodWithXpathForClick("//*[@id=\"main-nav\"]/ul/li[5]/a");
    }
    @Test
    public void main3() {
        commonMethodWithXpathForClick("//li[contains(@class,'menu-more')]");
    }

    @Test
    public void main4() {
        commonMethodWithXpathForClick("//*[@id=\"main-nav\"]/ul/li[7]/a");
    }
    @Test
    public void main5() {
        commonMethodWithClassForClick("subnav-title");
    }
    @Test
    public void clickSearchBox() {
        objofHomePage.searchBoxClick();
    }
    @Test
    public void SearchBoxInput() {
        objofHomePage.searchBoxInput("Sports");
    }
    @Test
    public void searchboxiconEnter() throws InterruptedException {
        objofHomePage.searchButtonEnter();
    }
    @Test
    public void logo() {
        objofHomePage.clicklogo();
    }
    @Test
    public void links() {
        objofHomePage.getLinks();
    }
    @Test
    public void linkTextverify() {
        objofHomePage.linkText();
    }
    @Test
    public void partialLinkTextverify() {
        objofHomePage.partialLinkText();
    }
    @Test
    public void allItemList() {
    }
}


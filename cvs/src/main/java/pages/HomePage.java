package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class HomePage extends CommonAPI {


    @FindBy(xpath="//input[@id='searchbox']")
    WebElement searchBox;

    @FindBy(xpath="//button[@aria-label='Submit Search']")
    WebElement searchButton;

    @FindBy(xpath="//*[@id=\"headCVS\"]/div[3]/div/div[1]/ul/li[1]/a")
    WebElement pharmacyButton;

    @FindBy(xpath="//a[@href='/minuteclinic?icid=CVSHeader:MinuteClinic']")
    WebElement clinicButton;

    @FindBy(xpath="//a[@href=\"http://www.cvs.com/shop/?icid=CVSHeader:Shop\"]")
    WebElement shopButton;

    @FindBy(xpath="//li[@class='navPhoto']")
    WebElement photoButton;

    @FindBy(xpath="//a[contains(text(),'Create an Account')]")
    WebElement createAccountLink;

//    public HomePage(){
//        PageFactory.initElements(driver,this);
//    }

    public void searchPage(){
        searchBox.click();
        searchBox.sendKeys("nyquil");
        searchButton.click();

    }

    public PharmecyPage nevigatePharmacyPage(){
        pharmacyButton.click();
        return new PharmecyPage();


    }

    public void nevigateClinicPage(){
        clinicButton.click();

    }
    public void nevigateShopPage(){
        shopButton.click();

    }

    public void nevigatePhoto(){
        photoButton.click();

    }

    public void nevigateToCreateAccount(){
        createAccountLink.click();

    }

//    public WebElement getPharmacyButton(){
//        return pharmacyButton;
//    }
//
//    public void goToLoginPage() {
//        pharmacyButton.click();
//        String st = driver.getWindowHandle();
//        new WebDriverWait(driver, 50);
//
//    }


}


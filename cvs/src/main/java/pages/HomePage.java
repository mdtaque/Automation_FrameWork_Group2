package pages;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CommonAPI {


    @FindBy(xpath="//input[@id='searchbox']")
    WebElement searchBox;

    @FindBy(xpath="//button[@aria-label='Submit Search']")
    WebElement searchButton;

    @FindBy(xpath="//a[@href='https://www.cvs.com/pharmacy/pharmacy-homepage.jsp']")
    WebElement pharmacyButton;

    @FindBy(xpath="//a[@href='/minuteclinic?icid=CVSHeader:MinuteClinic']")
    WebElement clinicButton;

    @FindBy(xpath="//a[@href=\"http://www.cvs.com/shop/?icid=CVSHeader:Shop\"]")
    WebElement shopButton;

    @FindBy(xpath="//li[@class='navPhoto']")
    WebElement photoButton;

    @FindBy(xpath="//a[contains(text(),'Create an Account')]")
    WebElement createAccountLink;

    public void searchPage(){
        searchBox.click();
        searchBox.sendKeys("nyquil");
        searchButton.click();

    }

    public void nevigatePharmacyPage(){
        pharmacyButton.click();


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

    public WebElement getPharmacyButton(){
        return pharmacyButton;
    }

    public void goToLoginPage() {
        pharmacyButton.click();
        String st = driver.getWindowHandle();
        new WebDriverWait(driver, 50);

    }


}


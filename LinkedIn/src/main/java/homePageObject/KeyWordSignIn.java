package homePageObject;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

import java.io.IOException;

public class KeyWordSignIn extends CommonAPI {
    //   KeyWordSignIn objKeyWordSignIn = PageFactory.initElements(driver, KeyWordSignIn.class);
//   SignInPage objectSignInPage = PageFactory.initElements(driver, SignInPage.class);

    @FindBy(xpath = "//input[@id='login-email']")
    public static WebElement email;
    @FindBy(css = "#login-password")
    public static WebElement passWord;
    @FindBy(css = "#login-submit")
    public static WebElement signInButton;

    public void signInToLinkedInAccount(){
        email.sendKeys("shamspaa@gmail.com");
        passWord.sendKeys("veryeasy1212");
        signInButton.click();
    }
    public void executeActions(String feature) throws IOException, InterruptedException{
        switch (feature){
            case "SignIn":
                signInToLinkedInAccount();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyWord(String fileName) throws IOException{
        String path = "../LinkedIn/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
    public void signInByKeyWord() throws  IOException, InterruptedException{
        String[] keyword = getDataFromSignInKeyWord("KeyWordDriven.xls");
        for (int i = 0; i < keyword.length; i++){
            executeActions(keyword[i]);
        }
    }
}

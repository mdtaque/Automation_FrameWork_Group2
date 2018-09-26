package citiPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI{
    @FindBy(how = How.ID, using = "personetics-citi-menu")
    public static WebElement searchButtonWebElement;
    //public void HomeSearchButton(){searchButtonWebElement.click();}

    @FindBy(how = How.CSS, using = ".citi-autocomplete-content-searchbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = ".citi-autocomplete-content-searchbox-go")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchButtonWebElement() {
        return searchButtonWebElement;
    }

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }

    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButton()throws IOException{
        List<String> list = getItemValue();
            for(int i=0; i<list.size(); i++) {
                searchFor(list.get(i));
                submitSearchButton();
                clearInput();
            }
        }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Credit Cards");
        itemsList.add("Home Equity");
        itemsList.add("Loan");
        itemsList.add("Investment");
        itemsList.add("Mortgage");

        return itemsList;
    }

}

package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.ConnectDB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//input[@id='search-field']")
    public static WebElement searchInputWebElement;
    @FindBy(xpath = "//a[@id='slick-slide00']//img[1]")
    public static WebElement dropDownMenu;
    @FindBy(xpath = "")


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
    public void searchItemsAndSubmitButton()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ItemToBeSearched itemToBeSearched = new ItemToBeSearched();
        String[] value = itemToBeSearched.getDataFromExcelFile();
        for (int i = 0; i < value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("diaper");
        itemsList.add("baby wipe");
        itemsList.add("milk");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("water");
        itemsList.add("chicken");
        return itemsList;
    }

    //public static void main(String[] args) {
       // ConnectDB connectDB = new ConnectDB();
       // connectDB.InsertDataFromArryListToMySql(getItemValue(),"myShoppingList", "item");
   // }
}





package org.fasttrackit.pages;

import io.cucumber.java.bs.I;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(css=".products-grid .product-name")
    private List<WebElementFacade> listOfProductNames;
    @FindBy(css=".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortDropdown;
    @FindBy(css=".products-grid .regular-price")
    private List<WebElementFacade> regularPriceList;

    public boolean isProductInList(String productName){
        waitFor(listOfProductNames.get(0));
        for(WebElementFacade element:listOfProductNames){
            if(element.getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public WebElementFacade selectProductFromSearchPage(int index){
        waitFor(listOfProductNames.get(0));
        return listOfProductNames.get(index);
    }
    public void selectByIndexFromDropdown(int index){
        sortDropdown.selectByIndex(index);
    }

    public boolean isPriceSortedAscending(){
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> regularPriceToInt = new ArrayList<>();
        for(WebElementFacade element:regularPriceList){
            sortedList.add(getIntFromPrice(element.getText()));
        }
        for(WebElementFacade element:regularPriceList){
            regularPriceToInt.add(getIntFromPrice(element.getText()));
        }
        Collections.sort(sortedList);
        return sortedList.equals(regularPriceToInt);

    }
}

package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(css=".products-grid .product-name")
    private List<WebElementFacade> listOfProductNames;

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
}

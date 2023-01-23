package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);

    }
    @Step
    public void clickSearchIcon(){
        homePage.clickOnSearchButton();
    }
    @Step
    public void verifyProductIsInList(String productName){
        Assert.assertTrue("The product was not found in the list !",searchResultsPage.isProductInList(productName));
    }
    @Step
    public void selectProduct(int index){
        searchResultsPage.selectProductFromSearchPage(index).click();
        waitFor(1500);
    }
    @Step
    public void sortByPrice(){
        searchResultsPage.selectByIndexFromDropdown(2);
//        waitABit(2000);
    }
    @Step
        public void isPriceAscending(){
            Assert.assertTrue("Produsele nu sunt sortate crescator dupa pret",searchResultsPage.isPriceSortedAscending());
            waitABit(3000);
    }
    @Step
    public void clickLeftsideBarMenLink(){
        searchResultsPage.clickSideBarMenLink();
    }
}

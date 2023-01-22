package org.fasttrackit.features;

import com.sun.xml.bind.v2.TODO;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{
    @Test
    public void AddToCartFromSearch() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.addProductToCart();
        cartSteps.isCartPageTitleDisplayed();
        //    TODO: nu stiu de ce nu functioneaza verificarea, adica produsul este adaugat, mesajul apare dar totusi testul cade.
    }
    @Test
    public void colorRequiredFieldDisplayed(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.selectProductSize(1);
        productSteps.clickOnAddToCartButton();
        productSteps.isReqFieldMsgDisplayed();
//        TODO: de ce imi cade testul daca nu gaseste elementul, cand el trebuie sa verifice daca este displayed sau nu ?
    }
    @Test
    public void sizeRequiredFieldDisplayed() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.selectProductColor(1);
        productSteps.clickOnAddToCartButton();
        productSteps.isReqFieldMsgDisplayed();
    }
    @Test
    public void sortProductsByPrice(){
//        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.sortByPrice();
        searchSteps.isPriceAscending();
    }
}

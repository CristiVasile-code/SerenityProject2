package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
//    @Test
//    public void addToCartTest(){
//        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
//
//        accountSteps.clickSubMenu();
//
//    }
    @Test
    public void AddToCartFromSearch() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
    //    productSteps.selectProduct();
        productSteps.addProductToCart();
    //    productSteps.selectProductColor(0);
    //    productSteps.selectProductSize(0);
    //    cartSteps.wasProductAdded();
    //    TODO:  ASSERTUL
    }



}

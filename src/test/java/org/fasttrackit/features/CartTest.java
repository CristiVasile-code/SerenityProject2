package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void emptyCart(){
        cartSteps.navigateToCartPage();
        if(!(cartSteps.isCartEmpty())){
            cartSteps.emptyCart();
        }
        cartSteps.emptyCartMsg();
    }
    @Test
    public void totalPrice(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.navigateToCartPage();
        cartSteps.emptyCart();
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.addProductToCart();
//        cartSteps.clickContinueShoppingButton();
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.addProductToCart();
//        cartSteps.clickContinueShoppingButton();
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(0);
        productSteps.addProductToCart();
        cartSteps.compareTotals();
    }
}

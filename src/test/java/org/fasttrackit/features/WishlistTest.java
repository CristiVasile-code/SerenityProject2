package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class WishlistTest extends BaseTest{
    @Test
    public void addProductToWishlist(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.clickSearchIcon();
        searchSteps.selectProduct(1);
        productSteps.clickWishlistLink();
        wishlistSteps.isWishlistTitleDisplayed();
    }
    @Test
    public void WishlistPage(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        homepageSteps.navigateToWishlistPage();



    }
}

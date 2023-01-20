package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps{
    @Step
    public void isWishlistTitleDisplayed(){
        Assert.assertTrue(wishlistPage.succesWishlistMsg());
    }
    @Step
    public void selectWishlistFromAccountMenu(){
        homePage.clickOnWishlistLink();
    }
@Step
    public void clickAddAllToCartButton(){
        wishlistPage.clickAddAllToCartButton();
        waitABit(3000);
    }
}

package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomepageSteps extends BaseSteps{
    @Step
    public void clickAccountButton(){
        homePage.clickOnAccountButton();
    }
    @Step
    public void navigateToWishlistPage(){
        clickAccountButton();
        homePage.clickOnWishlistLink();
    }
    @Step
    public void navigateToRegisterPage(){
        clickAccountButton();
        homePage.clickOnRegisterLink();
    }
    @Step
    public void navigateToLoginPage(){
        clickAccountButton();
        homePage.clickOnLoginLink();
    }
    @Step
    public void navigateToCartPage(){
        clickOnCartIcon();
        clickOnCartLink();
    }
    @Step
    public void goToCartFromDropdown(){
        homePage.clickDropdownCartLink();
    }
    @Step
    public void clickOnCartIcon(){
        homePage.clickCartIcon();
    }
    @Step
    public void clickOnCartLink(){
        homePage.clickViewShoppingcartLink();
    }
    @Step
    public void selectWishlistFromAccountMenu(){
        homePage.clickOnWishlistLink();
    }
    @Step
    public void clickCartLabelLink(){
        homePage.clickCartLabelLink();
    }
    @Step
    public void select(){
        homePage.click();
    }
}

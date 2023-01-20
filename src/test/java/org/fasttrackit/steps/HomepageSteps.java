package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class HomepageSteps extends BaseSteps{
    @Step
    public void navigateToWishlistPage(){
        homePage.clickOnAccountButton();
        homePage.clickOnWishlistLink();
        waitABit(3000);
    }
    @Step
    public void navigateToRegisterPage(){
        homePage.clickOnAccountButton();
        homePage.clickOnRegisterLink();
    }
    @Step
    public void navigateToLoginPage(){
//        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();
    }
}

package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AccountSteps extends BaseSteps{
//    @Step
//    public void clickSubMenu(){
//        accountPage.chooseSubMenu();
//    }
    @Step
    public void clickWishlistLinkSidebar(){
        accountPage.clickWishListLinkSidebar();
    }
}

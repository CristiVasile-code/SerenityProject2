package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage{
    @FindBy(css = ".page-title h1")
    private WebElementFacade succesWishlistMsg;
    @FindBy(css = ".btn-add")
    private WebElementFacade addAllToCartButton;

    public boolean succesWishlistMsg(){
         return succesWishlistMsg.isDisplayed();
    }
    public void clickAddAllToCartButton(){
        addAllToCartButton.click();
    }
}

package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(css=".success-msg span")
    private WebElementFacade succesMsg;
    @FindBy(css=".page-title h1")
    private WebElementFacade cartPageTitle;
    @FindBy(id="empty_cart_button")
    private WebElementFacade emptyCartButton;

    public boolean isSuccesMsgDisplayed(){
        waitFor(succesMsg);
        return succesMsg.isDisabled();
    }
    public boolean isCartPageTitleDisplayed(){
        return cartPageTitle.isDisplayed();
    }
    public String getCartPageTitleText(){
        return cartPageTitle.getText();
    }
    public void clickEmptyCartButton(){
        waitFor(emptyCartButton);
        emptyCartButton.click();
    }

}

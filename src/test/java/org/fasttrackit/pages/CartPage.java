package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(css=".success-msg span")
    private WebElementFacade succesMsg;
    @FindBy(css=".page-title h1")
    private WebElementFacade cartPageTitle;
    @FindBy(id="empty_cart_button")
    private WebElementFacade emptyCartButton;
    @FindBy(css=".btn-continue")
    private WebElementFacade continueShoppingBtn;
    @FindBy(css=".product-cart-total")
    private List<WebElementFacade> productPriceList;
    @FindBy(css=".a-right strong span")
    private WebElementFacade cartTotal;
    @FindBy(css = ".cart-totals .btn-checkout")
    private WebElementFacade bottomCheckOutButton;

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
    public void clickContinueShoppingBtn(){
        continueShoppingBtn.click();
    }
    public int productPriceSum(){
        waitFor(productPriceList.get(0));
        int sum = 0;
        for(WebElementFacade element:productPriceList){
            sum += getIntFromPrice(element.getText());}
        return sum;
    }
    public int getCartTotal(){
       return getIntFromPrice(cartTotal.getText());
    }
    public void clickBottomCheckoutBtn(){
        clickOn(bottomCheckOutButton);
    }
    public String getSuccessMsgText(){
        return succesMsg.getText();
    }
}

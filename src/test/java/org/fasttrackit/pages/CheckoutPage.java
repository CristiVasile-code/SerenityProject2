package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(css = "#billing-buttons-container .button")
    private WebElementFacade billingContinueBtn;
    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElementFacade shippingContinueBtn;
    @FindBy(css = "#s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingRadioBtn;
    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentContinueBtn;
    @FindBy(css = "#review-buttons-container .button")
    private WebElementFacade placeOrderBtn;
    @FindBy(css = ".page-title h1")
    private WebElementFacade checkoutPageTitle;

    public void clickBillingContinueBtn(){
        clickOn(billingContinueBtn);
    }
    public void clickPaymentContinueBtn(){
        waitFor(paymentContinueBtn);
        clickOn(paymentContinueBtn);
    }
    public void clickShippingContinueBtn(){
        waitFor(shippingContinueBtn);
        clickOn(shippingContinueBtn);
    }
    public void clickFreeshippingRBtn(){
        waitFor(freeShippingRadioBtn);
        clickOn(freeShippingRadioBtn);
    }
    public void clickPlaceOrderBtn(){
        clickOn(placeOrderBtn);
    }
    public boolean isCheckoutPageTitleDisplayed(){
        return checkoutPageTitle.isDisplayed();
    }
}

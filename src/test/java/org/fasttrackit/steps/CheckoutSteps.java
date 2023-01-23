package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void clickBillingContinueBtn(){
        checkoutPage.clickBillingContinueBtn();
    }
    @Step
    public void clickShippingContinueBtn(){
        checkoutPage.clickFreeshippingRBtn();
        checkoutPage.clickShippingContinueBtn();
    }
    @Step
    public void clickPaymentContinueBtn(){
        checkoutPage.clickPaymentContinueBtn();
    }
    @Step
    public void clickPlaceOrderBtn(){
        checkoutPage.clickPlaceOrderBtn();
    }
    @Step
    public void doCheckOut(){
        clickBillingContinueBtn();
        clickShippingContinueBtn();
        clickPaymentContinueBtn();
        clickPlaceOrderBtn();
    }
    @Step
    public void isCheckOut(){
        Assert.assertTrue(checkoutPage.isCheckoutPageTitleDisplayed());
    }
}

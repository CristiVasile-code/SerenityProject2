package org.fasttrackit.steps;

import io.cucumber.java.bs.A;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{
    @Step
    public void wasProductAdded(){
        Assert.assertTrue("The product was not added to cart", cartPage.isSuccesMsgDisplayed());
    }
    @Step
    public void isCartPageTitleDisplayed(){
        Assert.assertTrue("The product was not added to cart", cartPage.isCartPageTitleDisplayed());
    }
    @Step
    public void emptyCartMsg(){
        Assert.assertEquals("SHOPPING CART IS EMPTY",cartPage.getCartPageTitleText());
    }
    @Step
    public boolean isCartEmpty(){
        return cartPage.getCartPageTitleText().equalsIgnoreCase("SHOPPING CART IS EMPTY");
        }
    @Step
    public void navigateToCartPage(){
//        homePage.clickOnAccountButton();
//        homePage.clickOnCartLink();
        clickOnCartIcon();
        clickOnCartLink();
    }
    @Step
    public void emptyCart(){
        cartPage.clickEmptyCartButton();
    }
    @Step
    public void clickContinueShoppingButton(){
        cartPage.clickContinueShoppingBtn();
    }
    @Step
    public void compareTotals(){
        Assert.assertEquals(cartPage.productPriceSum(),cartPage.getCartTotal());
    }
    public void clickOnCartIcon(){
        homePage.clickCartIcon();
    }
    public void clickOnCartLink(){
        homePage.clickCartLink();
    }

}

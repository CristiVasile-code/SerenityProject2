package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void emptyCart(){
        cartSteps.navigateToCartPage();
        if(!(cartSteps.isCartEmpty())){
            cartSteps.emptyCart();
        }
        cartSteps.emptyCartMsg();
    }



}

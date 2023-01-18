package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void addToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
    }
}

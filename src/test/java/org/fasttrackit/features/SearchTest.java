package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchForProductTest(){
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("SULLIVAN SPORT COAT");
    }
}

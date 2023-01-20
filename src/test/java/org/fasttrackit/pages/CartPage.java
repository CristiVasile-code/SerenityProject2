package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(css=".success-msg span")
    private WebElementFacade succesMsg;

    public void getSuccesMsg(){
        succesMsg.getText();
    }
}

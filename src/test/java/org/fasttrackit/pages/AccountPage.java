package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(id="search")
    private WebElementFacade searchField;
    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextElement;
    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    }
}

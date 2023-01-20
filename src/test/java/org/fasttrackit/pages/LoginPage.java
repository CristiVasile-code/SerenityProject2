package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElementFacade emailField;
    @FindBy(id =  "pass")
    private WebElementFacade passwordField;
    @FindBy(id = "send2")
    private WebElementFacade loginButton;
    @FindBy(id = "advice-required-entry-pass")
    private WebElementFacade requiredPasswordElement;

    public void setEmailField(String email){typeInto(emailField, email);}
    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }
    public void clickLoginButton(){clickOn(loginButton);}
    public String getRequiredPasswordText(){
        waitFor(requiredPasswordElement);
        return requiredPasswordElement.getText();
    }
}

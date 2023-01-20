package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(id="firstname")
    private WebElementFacade firstName;
    @FindBy(id="lastname")
    private WebElementFacade lastName;
    @FindBy(id="email_address")
    private WebElementFacade emailAdress;
    @FindBy(id="password")
    private WebElementFacade password;
    @FindBy(id="confirmation")
    private WebElementFacade passConfirm;
    @FindBy(id="is_subscribed")
    private WebElementFacade radioButtonIsSubscribed;
    @FindBy(css="[type=\"submit\"][title=\"Register\"]")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstNameField){
        typeInto(firstName,firstNameField);
    }
    public void setLastNameField(String lastNameField){
        typeInto(lastName,lastNameField);
    }
    public void setEmailAdress(String emailAdressField){
        typeInto(emailAdress,emailAdressField);
    }
    public void setPasswordField(String passwordField){
        typeInto(password,passwordField);
    }
    public void setPassConfirmField(String passConfirmField){
        typeInto(passConfirm,passConfirmField);
    }
    public void clickIsSubscribedRB(){clickOn(radioButtonIsSubscribed);}
    public void clickRegisterButton(){clickOn(registerButton);}


}

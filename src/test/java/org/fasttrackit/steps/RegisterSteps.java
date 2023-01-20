package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{
    @Step
    public void typeFirstName(String firstName){
        registerPage.setFirstNameField(firstName);
    }
    @Step
    public void typeLastName(String lastName){registerPage.setLastNameField(lastName);}
    @Step
    public void typeEmailAdress(String emailAdress){registerPage.setEmailAdress(emailAdress);}
    @Step
    public void typePassword(String password){registerPage.setPasswordField(password);}
    @Step
    public void typeConfirmation(String confirmPass){registerPage.setPassConfirmField(confirmPass);}
    @Step
    public void clickSubscribeRB(){registerPage.clickIsSubscribedRB();}
    @Step
    public void clickRegisterButton(){registerPage.clickRegisterButton();}
    @Step
    public void userIsRegistered(){
        Assert.assertTrue("The user was not registered !",accountPage.userIsRegistered());
    }
}

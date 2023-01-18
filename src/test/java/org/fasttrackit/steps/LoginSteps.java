package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToLoginPage(){
//        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();
    }
    @Step
    public void typeUserEmail(String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void typeUserPassword(String pass){
        loginPage.setPasswordField(pass);
    }
    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        typeUserEmail(email);
        typeUserPassword(pass);
        clickLoginButton();
    }
    @Step
    public void userIsLoggedIn(String userName) {
//        Assert.assertTrue(accountPage.isWelcomeText(userName));
//        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
        accountPage.userIsLoggedIn(userName);
    }
}

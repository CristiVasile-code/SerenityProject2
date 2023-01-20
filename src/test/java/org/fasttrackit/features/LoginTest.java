package org.fasttrackit.features;

import org.junit.Test;
import org.fasttrackit.utils.Constants;

public class LoginTest extends BaseTest {
    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typeUserPassword(Constants.USER_PASS);
        loginSteps.clickLoginButton();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
        }
    @Test
    public void verifyPasswordRequiredFieldTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.clickLoginButton();
        loginSteps.checkPasswordFieldRequired();
//        TODO: sa faci o metoda generala care sa verifice daca apare mesajul de this is a required field
    }

}
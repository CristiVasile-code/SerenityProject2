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
}
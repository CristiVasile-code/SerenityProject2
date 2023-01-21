package org.fasttrackit.features;

import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registerTest(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        registerSteps.userIsRegistered();
        }
    @Test
    public void registerTestWithoutFirstName(){
        homepageSteps.navigateToRegisterPage();
//        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        productSteps.isReqFieldMsgDisplayed();
        }
    @Test
    public void registerTestWithoutLastName(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
//        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        productSteps.isReqFieldMsgDisplayed();
    }
    @Test
    public void registerTestWithoutEmail(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
//        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        productSteps.isReqFieldMsgDisplayed();
    }
    @Test
    public void registerTestWithoutPassword(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
//        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        productSteps.isReqFieldMsgDisplayed();
    }
    @Test
    public void registerTestWithoutPassConfirm(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
//        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        productSteps.isReqFieldMsgDisplayed();
    }
    @Test
    public void registerTestWithPassMismatch(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes19@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("12346");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        registerSteps.passMismatchMessage();
    }
    @Test
    public void registerTestWithExistingUser(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecode@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        registerSteps.existingUserMessage();
    }
    }

//TODO: user existent
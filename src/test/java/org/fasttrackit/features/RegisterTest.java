package org.fasttrackit.features;

import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registerTest(){
        homepageSteps.navigateToRegisterPage();
        registerSteps.typeFirstName("Cristi");
        registerSteps.typeLastName("Vasile");
        registerSteps.typeEmailAdress("cristivasilecodes1@gmail.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribeRB();
        registerSteps.clickRegisterButton();
        registerSteps.userIsRegistered();}

    }

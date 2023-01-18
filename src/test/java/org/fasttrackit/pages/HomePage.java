package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


    @DefaultUrl("http://testfasttrackit.info/selenium-test/")
    public class HomePage extends BasePage {
        @FindBy(css = ".skip-account .label")
        private WebElementFacade accountButton;
        @FindBy(css = "[title='Log In']")
        private WebElementFacade loginLink;
        @FindBy(css="[title=\"Register\"]")
        private WebElementFacade registerLink;
        @FindBy(css="[title=\"Log Out\"]")
        private WebElementFacade logoutLink;

        public void clickOnAccountButton(){
            clickOn(accountButton);
        }
        public void clickOnLoginLink(){
            clickOn(loginLink);
        }
        public void clickOnRegisterLink(){clickOn(registerLink);}
        public void clickOnLogoutLink(){clickOn(logoutLink);}

    }

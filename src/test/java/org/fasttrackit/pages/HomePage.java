package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


    @DefaultUrl("http://testfasttrackit.info/selenium-test/")
    public class HomePage extends BasePage {
        @FindBy(css = ".skip-account .label")
        private WebElementFacade accountButton;
        @FindBy(css = "#header-account > div > ul > li:nth-child(2) > a")
        private WebElementFacade wishListLink;
        @FindBy(css = "[title='Log In']")
        private WebElementFacade loginLink;
        @FindBy(css = "[title='My Cart']")
        private WebElementFacade cartLink;
        @FindBy(css="[title='Register']")
        private WebElementFacade registerLink;
        @FindBy(css="[title='Log Out']")
        private WebElementFacade logoutLink;
        @FindBy(id="search")
        private WebElementFacade searchField;
        @FindBy(css=".search-button")
        private WebElementFacade searchButton;
        @FindBy(css=".header-minicart .icon")
        private WebElementFacade cartIcon;
        @FindBy(css=".cart-link")
        private WebElementFacade minicartCartLink;


        public void clickOnAccountButton(){
            clickOn(accountButton);
        }
        public void clickOnLoginLink(){
            clickOn(loginLink);
        }
        public void clickOnCartLink(){
            clickOn(cartLink);
        }
        public void clickOnWishlistLink(){
            wishListLink.click();
        }
        public void clickOnRegisterLink(){clickOn(registerLink);}
        public void clickOnLogoutLink(){clickOn(logoutLink);}
        public void setSearchField(String value){
            typeInto(searchField,value);
        }
        public void clickOnSearchButton(){
            clickOn(searchButton);
        }
//        public void selectWishlist(){
//            accountButton.selectByIndex(1).click();
//        }
        public void clickCartIcon(){
            cartIcon.click();
        }
        public void clickCartLink(){
            minicartCartLink.click();
        }
    }

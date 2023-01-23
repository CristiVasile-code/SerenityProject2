package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
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
        @FindBy(css = ".top-link-cart")
        private WebElementFacade dropDownCartLink;
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
        @FindBy(css = ".skip-cart .label")
        private WebElementFacade cartLabelLink;
        @FindBy(css=".cart-link")
        private WebElementFacade viewShoppingCartLink;


        public void clickOnAccountButton(){
            clickOn(accountButton);
        }
        public void clickOnLoginLink(){
            clickOn(loginLink);
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
        public void clickViewShoppingcartLink(){
            viewShoppingCartLink.click();
        }
        public void clickCartIcon(){
            cartIcon.click();
        }
        public void clickCartLabelLink(){
            cartLabelLink.click();
        }
        public void clickDropdownCartLink(){
            dropDownCartLink.click();
        }

    }

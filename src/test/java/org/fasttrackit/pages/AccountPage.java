package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    Actions builder = new Actions(getDriver());
    @FindBy(id="search")
    private WebElementFacade searchField;
    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextElement;
    @FindBy(css=".nav-2>a")
    private WebElementFacade menMenu;
    @FindBy(css=".nav-2-2.menu-active>a")
    private WebElementFacade subMenuItem;

    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    }
    public boolean userIsRegistered(){
        return welcomeTextElement.isDisplayed();
    }
    public void chooseSubMenu(){
//        withAction().moveToElement(menMenu).moveToElement(subMenuItem).click().build().perform();
       builder.moveToElement(menMenu).contextClick(subMenuItem);
//       builder.moveToElement(subMenuItem).click().build().perform();
//
////        subMenuItem.waitUntilEnabled();
//        subMenuItem.click();
//        builder.moveToElement(menMenu);
//        builder.moveToElement(subMenuItem);
//        builder.click().build().perform();
    }
}

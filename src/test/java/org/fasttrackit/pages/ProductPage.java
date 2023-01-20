package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    @FindBy(id = "product-collection-image-413")
    private WebElementFacade productImg;
    @FindBy(css=".swatch-label>img")
    private WebElementFacade productColor;
    @FindBy(css=".swatch-attr")
    private List<WebElementFacade> listOfProductColors;
    @FindBy(css="#configurable_swatch_size")
    private List<WebElementFacade> listOfProductSizes;
    @FindBy(id="swatch79")
    private WebElementFacade productSize;
    @FindBy(css=".add-to-cart-buttons button")
    private WebElementFacade addToCartButton;
    @FindBy(css=".product-name span")
    private WebElementFacade productName;
    @FindBy(css=".link-wishlist")
    private WebElementFacade wishlistLink;

    public String getProductName(){
        return productName.getText();
    }
    public void clickOnProductImg(){
        clickOn(productImg);
    }
    public void selectProductColor(){
        clickOn(productColor);
    }
    public WebElementFacade selectProductColor(int index){
        waitFor(listOfProductColors.get(0));
        return listOfProductColors.get(index);
    }
    public WebElementFacade selectProductSize(int index){
        waitFor(listOfProductSizes.get(0));
        return listOfProductSizes.get(0);
    }
    public void selectProductSize(){
        clickOn(productSize);
    }
    public void addToCartButton(){
        clickOn(addToCartButton);
    }
    public void addToWishlistLink(){
        clickOn(wishlistLink);
    }
}

package org.fasttrackit.steps;

import com.sun.xml.bind.v2.TODO;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps extends BaseSteps{
    @Step
    public void selectProduct(){
        productPage.clickOnProductImg();
    }
    @Step
    public void selectProductColor(){
        productPage.selectProductColor();
    }
    @Step
    public void selectProductColor(int index){
        productPage.selectProductColor(index).click();
    }
    @Step
    public void selectProductSize(){
        productPage.selectProductSize();
        waitABit(3000);
    }
    @Step
    public void selectProductSize(int index){
        productPage.selectProductSize(index).click();
    }
    @Step
    public void clickOnAddToCartButton(){
        productPage.addToCartButton();
    }
    @Step
    public void addProductToCart(){
        selectProductColor(0);
        selectProductSize(0);
        clickOnAddToCartButton();
    }
//    TODO:sa adaug tratarea erorilor de gen e o singura culoare sau nu e disponibila marimea la culoare aia.
    @Step
    public void clickWishlistLink(){
        productPage.addToWishlistLink();
        waitABit(1000);
    }
    @Step
    public void isReqFieldMsgDisplayed(){
        Assert.assertTrue("Trebuia sa apara mesaj si sa nu ma lase sa trec !", productPage.isReqFieldMsgDisplayed());
    }
    @Step
    public String getProductName(){
        return productPage.getProductName();
    }
    @Step
    public void wasProductAdded(String prodName){
        Assert.assertTrue(cartPage.getSuccessMsgText().equalsIgnoreCase(prodName+" was added to your shopping cart."));
    }
    @Step
    public String getSuccessMsgText(){
        return cartPage.getSuccessMsgText();
    }

}

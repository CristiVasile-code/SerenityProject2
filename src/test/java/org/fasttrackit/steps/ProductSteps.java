package org.fasttrackit.steps;

import com.sun.xml.bind.v2.TODO;
import net.thucydides.core.annotations.Step;

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
        selectProductColor();
//        selectProductColor(0);
        selectProductSize();
//        selectProductSize(0);
        clickOnAddToCartButton();
    }
//    TODO: de ce nu merge sa fol metodele de selectare size si color din lista ?
    @Step
    public void clickWishlistLink(){
        productPage.addToWishlistLink();
        waitABit(3000);
    }
}

package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TShirtPage extends BasePage{

    @FindBy(css = ".product-form__input label")
    WebElement xsSize;

    @FindBy(css = ".product-form__buttons button[type='submit']")
    WebElement addToCartBtn;

    @FindBy(css = ".cart-count-bubble span:first-child")
    WebElement cartIconNumber;

    public void selectSmallSize(){
        xsSize.click();
    }

    public void clickAddToCartBtn(){
        addToCartBtn.click();
    }

    public boolean isItemAddedToCart(){
        return cartIconNumber.getText().equals("1");
    }

}

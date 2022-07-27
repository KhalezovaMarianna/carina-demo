package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasketPageBase extends AbstractPage {
    public BasketPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isBasketPageOpen();
    public abstract BasketPageBase clickGoShoppingBtn();
    public abstract BasketPageBase goToCart();
    public abstract boolean endSumComparison();
    public abstract void removeItemFromCart();
    public abstract boolean isCartEmpty();
}

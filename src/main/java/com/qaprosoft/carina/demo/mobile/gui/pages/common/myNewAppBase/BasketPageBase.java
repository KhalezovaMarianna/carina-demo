package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS.BasketPage;
import org.openqa.selenium.WebDriver;

public abstract class BasketPageBase extends AbstractPage {
    public BasketPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isBasketPageOpen();
    public abstract BasketPage clickGoShoppingBtn();
}

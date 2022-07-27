package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractPage {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isProductPageOpen();

    public abstract BasketPageBase goToCart();

    public abstract boolean rateProduct();


}

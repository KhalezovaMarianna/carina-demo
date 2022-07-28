package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp.BasketPage;
import org.openqa.selenium.WebDriver;

public abstract class MorePageBase extends AbstractPage {
    public MorePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isMorePageOpen();
    public abstract BasketPageBase openCart();

    public abstract PopUpResetPageBase resetApp();
    public abstract AboutPageBase clickAboutBtn();
    public abstract HomePageBase clickCatalogBtn();
}

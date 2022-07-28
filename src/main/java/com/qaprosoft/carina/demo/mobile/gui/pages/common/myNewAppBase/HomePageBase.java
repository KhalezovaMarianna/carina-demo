package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MyPhotoPageBase;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isHomePageOpen();
    public abstract MorePageBase clickMoreBtn();
    public abstract BasketPageBase clickBasketBtn();
    public abstract ProductPageBase clickProductImg(String a);
    public abstract ProductPageBase clickProductByIndex(String a);

    public abstract ProductPageBase clickRandomProduct(String title);
}

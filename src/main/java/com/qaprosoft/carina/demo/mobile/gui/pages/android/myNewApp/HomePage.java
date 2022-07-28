package com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MyPhotoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.ProductPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    ExtendedWebElement catalog;
    @ExtendedFindBy(accessibilityId = "Displays number of items in your cart")
    ExtendedWebElement basketBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isHomePageOpen() {
        return catalog.isElementPresent();
    }

    @Override
    public BasketPageBase clickBasketBtn() {
        basketBtn.click();
        return new BasketPage(getDriver());
    }

    @Override
    public ProductPageBase clickRandomProduct(String title) {

        return initPage(getDriver(), ProductPageBase.class);
    }

}

package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BasketPageBase.class)
public abstract class BasketPage extends BasketPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Go Shopping\"`]")
    ExtendedWebElement goShoppingBtn;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage clickGoShoppingBtn() {
        goShoppingBtn.click();
        return new BasketPage(getDriver()) {
            @Override
            public boolean isBasketPageOpen() {
                return goShoppingBtn.isElementPresent();
            }
        };
    }
}
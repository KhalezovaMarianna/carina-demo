package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BasketPageBase.class)
public abstract class BasketPage extends BasketPageBase implements IMobileUtils  {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Remove Item\"`]")
    ExtendedWebElement removeItemBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Go Shopping\"`]")
    ExtendedWebElement goShoppingBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"%s\"`]")
    ExtendedWebElement finalSum;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean endSumComparison() {
        double sum = Double.parseDouble(StringUtils.substring((finalSum.format("$39.96").getAttribute("value")), 1));
        if (sum > 0) {
            return true;
        }
        return false;

    }

    public void removeItemFromCart() {
        removeItemBtn.click();
        return ;
    }

    public BasketPageBase clickGoShoppingBtn() {
        goShoppingBtn.click();
        return initPage(getDriver(), BasketPageBase.class);
    }
    @Override
    public boolean isCartEmpty(){
        goShoppingBtn.isElementPresent();
        return true;
    }
}

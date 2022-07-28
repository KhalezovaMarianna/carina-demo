package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.MorePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.PopUpResetPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MorePageBase.class)
public class MorePage extends MorePageBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"About-menu-item\"`]")
    ExtendedWebElement aboutBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    ExtendedWebElement openCart;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Catalog-tab-item\"`]")
    ExtendedWebElement catalogBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Drawing-menu-item\"`]")
    ExtendedWebElement drawingBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"ResetAppState-menu-item\"`]")
    ExtendedWebElement resetBtn;
    public MorePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMorePageOpen() {
        return aboutBtn.isElementPresent();
    }

    @Override
    public BasketPageBase openCart() {
        openCart.click();
        return initPage(getDriver(),BasketPageBase.class);
    }

    @Override
    public PopUpResetPageBase resetApp() {
        resetBtn.click();
        return initPage(getDriver(), PopUpResetPageBase.class);
    }

    public AboutPage clickAboutBtn(){
        aboutBtn.click();
        return new AboutPage(getDriver());
    }

    public HomePage clickCatalogBtn(){
        catalogBtn.click();
        return new HomePage(getDriver());
    }
}

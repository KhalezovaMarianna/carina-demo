package com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasketPageBase.class)
public class BasketPage extends BasketPageBase implements IMobileUtils {

    @FindBy(id ="com.saucelabs.mydemoapp.android:id/shoppingBt")
    ExtendedWebElement goShoppingBtn;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isBasketPageOpen() {
        return goShoppingBtn.isElementPresent();
    }

   @Override
    public BasketPageBase clickGoShoppingBtn() {
       goShoppingBtn.click();
        return new BasketPage(getDriver()) {
            @Override
            public boolean isBasketPageOpen() {
                return false;
            }
        };
   }

    @Override
    public BasketPageBase goToCart() {
        return initPage(getDriver(),BasketPageBase.class);
    }

    @Override
    public boolean endSumComparison() {
        return true;
    }

    @Override
    public void removeItemFromCart() {
        clickGoShoppingBtn();
        return ;
    }
    public boolean isCartEmpty(){
        goShoppingBtn.isElementPresent();
        return true;
    }
}

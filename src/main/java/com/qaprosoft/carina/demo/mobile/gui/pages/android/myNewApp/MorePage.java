package com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.MorePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.PopUpResetPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MorePageBase.class)
public class MorePage extends MorePageBase implements IMobileUtils {

    @ExtendedFindBy(accessibilityId = "Displays available colors of selected product")
    ExtendedWebElement product;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Recycler view for menu\"]/android.view.ViewGroup[7]/android.widget.TextView")
    ExtendedWebElement resetBtn;

    public MorePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMorePageOpen() {
        return product.isElementPresent();
    }

    @Override
    public PopUpResetPageBase resetApp() {
        return null;
    }


}

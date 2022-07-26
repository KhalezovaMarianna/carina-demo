package com.qaprosoft.carina.demo.mobile.gui.pages.android.my;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MyBaseHomePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MyPhotoPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyBaseHomePage.class)
public class HomePage extends MyBaseHomePage implements IMobileUtils {
    public HomePage(WebDriver driver) {
        super(driver);

    }

    @ExtendedFindBy(accessibilityId = "Photos")
    private ExtendedWebElement photoBtn;


    @Override
    public MyPhotoPageBase clickPhotoBtn() {
        photoBtn.click();
        return initPage(getDriver(), MyPhotoPageBase.class);
    }

}

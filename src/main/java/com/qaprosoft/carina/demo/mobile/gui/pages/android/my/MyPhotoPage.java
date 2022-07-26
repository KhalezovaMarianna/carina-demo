package com.qaprosoft.carina.demo.mobile.gui.pages.android.my;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MyPhotoPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyPhotoPageBase.class)
public class MyPhotoPage extends MyPhotoPageBase implements IMobileUtils {
    @FindBy(id = "com.google.android.apps.photos:id/recycler_view")
    private ExtendedWebElement title;



    public MyPhotoPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPresentPhotoPage(){
       return title.isElementPresent();
    }
}

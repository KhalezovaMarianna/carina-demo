package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.MorePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.PopUpResetPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PopUpResetPageBase.class)
public class PopUpResetPage extends PopUpResetPageBase{

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label contains \"%s\"`]")
    ExtendedWebElement chosenBtn;

    public PopUpResetPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MorePageBase clickResetBtn(String title) {
        if(title.equals("CANCEL")){
            chosenBtn.format(title).click();
        }
        return initPage(getDriver(),MorePageBase.class);
    }
}

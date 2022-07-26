package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.AboutPageBase;
import org.openqa.selenium.WebDriver;

public class AboutPage extends AboutPageBase implements IMobileUtils {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"About-screen\"`]/XCUIElementTypeImage[3]")
    ExtendedWebElement aboutPicture;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"About-screen\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton")
    ExtendedWebElement backBtn;
    public AboutPage(WebDriver driver) {
        super(driver);
    }
    public HomePage clickBackBtn(){
        backBtn.click();
        return new HomePage(getDriver());

}
    @Override
    public boolean isAboutPageOpen() {
        return aboutPicture.isElementPresent();
    }

}

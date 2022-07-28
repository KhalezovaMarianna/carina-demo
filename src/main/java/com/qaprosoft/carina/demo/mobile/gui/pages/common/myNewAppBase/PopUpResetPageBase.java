package com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp.PopUpResetPage;
import org.openqa.selenium.WebDriver;

public abstract class PopUpResetPageBase extends AbstractPage {
    public PopUpResetPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract MorePageBase clickResetBtn();
    public abstract boolean isPopUpResetPageOpen();
}

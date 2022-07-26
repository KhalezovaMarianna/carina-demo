package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MyBaseHomePage extends AbstractPage {

    public MyBaseHomePage(WebDriver driver) {
        super(driver);

    }

    public abstract MyPhotoPageBase clickPhotoBtn();
}

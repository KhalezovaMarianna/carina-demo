package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.*;
import com.qaprosoft.carina.demo.utils.MobileContextUtils;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class My implements IAbstractTest,IMobileUtils {
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testOpenPhotos() {
        MyBaseHomePage myHomePage = initPage(getDriver(),MyBaseHomePage.class);
        MyPhotoPageBase photoPage = myHomePage.clickPhotoBtn();
        Assert.assertTrue(photoPage.isPresentPhotoPage(),
                "Page isn't opened");

        }
}

package com.qaprosoft.carina.demo.MyTestsNewApp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.myNewApp.HomePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestsAndroid implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testOpenPages() {
        HomePage homePage = new HomePage(getDriver());
        BasketPageBase basketPage = homePage.clickBasketBtn();
        Assert.assertTrue(basketPage.isBasketPageOpen(),
                "Page isn't opened");

    }
}

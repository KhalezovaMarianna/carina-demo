package com.qaprosoft.carina.demo.MyTestsNewApp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestsiOs implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testOpenPages() {
        HomePage homePage = new HomePage(getDriver());
        BasketPageBase basketPage = homePage.clickBasketBtn();
        Assert.assertTrue(basketPage.isBasketPageOpen(),
                "Page isn't opened");
        basketPage.clickGoShoppingBtn();
        Assert.assertFalse(homePage.isHomePageOpen(),
                "homePage is open");
        MorePage morePage = homePage.clickMoreBtn();
        Assert.assertTrue(morePage.isMorePageOpen(),
                "morePage isn't open");
        AboutPage aboutPage = morePage.clickAboutBtn();
        Assert.assertTrue(aboutPage.isAboutPageOpen(),
                "aboutPage isn't open");
        aboutPage.clickBackBtn();
        Assert.assertFalse(homePage.isHomePageOpen(),
                "HOMEPage is not open");
        morePage.clickCatalogBtn();
        Assert.assertFalse(homePage.isHomePageOpen(),
                "Catalog isn't open");
        ProductPage productPage = homePage.clickProductImg("3");
        productPage.addProduct();
        Assert.assertFalse(homePage.isHomePageOpen(), "HomePage isn't open");
        morePage.clickCatalogBtn();
        homePage.clickProductByIndex("5");
        Assert.assertTrue(productPage.isProductPageOpen(), "something don't go");

    }

    @Test
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testRateProduct() {
        HomePage homePage = new HomePage(getDriver());
        Assert.assertTrue(homePage.isHomePageOpen(),"HomePage isn't open");
        ProductPage productPage = homePage.clickProductImg("3");
        Assert.assertTrue(productPage.isProductPageOpen(),"right product isn't open");
        productPage.rateProduct();
        Assert.assertTrue(homePage.isHomePageOpen(),"rate isn't passed");

    }
}


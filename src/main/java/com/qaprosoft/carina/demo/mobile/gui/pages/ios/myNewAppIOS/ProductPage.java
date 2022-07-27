package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.ProductPageBase;
import org.openqa.selenium.WebDriver;

public class ProductPage extends ProductPageBase {
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"AddPlus Icons\"`]")
    ExtendedWebElement plusBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"OK\"`]")
    ExtendedWebElement popUpOkBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Add To Cart\"`]")
    ExtendedWebElement goToBasketBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarSelected Icons\"`][1]")
    ExtendedWebElement firstStar;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`][1]")
    ExtendedWebElement starBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`]")
    ExtendedWebElement finalStarBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductDetails-screen\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton")
    ExtendedWebElement backBtn;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPageOpen() {
        return plusBtn.isElementPresent();
    }


    public BasketPage addProduct() {
        plusBtn.click();
        goToBasketBtn.click();
        return new BasketPage(getDriver()) {
            @Override
            public boolean isBasketPageOpen() {
                return goShoppingBtn.isElementPresent();
            }
        };
    }

    @Override
    public boolean rateProduct() {
        firstStar.click();
        popUpOkBtn.clickIfPresent();
        for (int i = 1; i <= 4; i++) {
            if (starBtn.isElementPresent()) {
                starBtn.click();
                popUpOkBtn.clickIfPresent();
            } else {
                finalStarBtn.click();
                popUpOkBtn.clickIfPresent();
                break;
            }

        }
        backBtn.click();
        return true;

    }


}

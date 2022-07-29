package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.MorePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.ProductPageBase;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {


    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"AddPlus Icons\"`]")
    ExtendedWebElement plusBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    ExtendedWebElement basketBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Add To Cart\"`]")
    ExtendedWebElement addToCartBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"OK\"`]")
    ExtendedWebElement popUpOkBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarSelected Icons\"`][1]")
    ExtendedWebElement firstStar;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`][1]")
    ExtendedWebElement starBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"StarUnSelected Icons\"`]")
    ExtendedWebElement finalStarBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductDetails-screen\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton")
    ExtendedWebElement backBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    ExtendedWebElement moreBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS \"1\"`]")
    ExtendedWebElement amountProducts;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"SubtractMinus Icons\"`]")
    ExtendedWebElement minusBtn;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPageOpen() {
        return addToCartBtn.isElementPresent();
    }


    public void addProduct() {
        plusBtn.click();
        addToCartBtn.click();
    }

    @Override
    public BasketPageBase goToCart() {
        basketBtn.click();
        return initPage(getDriver(), BasketPageBase.class);
    }

    public void deleteSeveralProducts(int count) {
        for (int i = 1; i < count; i++) {
            {
                minusBtn.click();

            }
        }
    }

        public void addSeveralProducts (int count){
            for (int i = 1; i < count; i++) {
                //if (amountProducts.isElementPresent()) {
                    plusBtn.click();
              // }
            }
        }


        public void addToCart () {
            addToCartBtn.click();
        }


        @Override
        public MorePageBase openMorePage () {
            moreBtn.click();
            return initPage(getDriver(), MorePageBase.class);
        }

        @Override
        public boolean rateProduct () {
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

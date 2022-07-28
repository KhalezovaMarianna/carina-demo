package com.qaprosoft.carina.demo.mobile.gui.pages.ios.myNewAppIOS;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.BasketPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.MorePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.myNewAppBase.ProductPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"Catalog-screen\"`]/XCUIElementTypeOther[1]")
    private ExtendedWebElement title;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == 'Catalog-screen`]/XCUIElementTypeOther[3]")
    private ExtendedWebElement catalog;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Cart-tab-item\"`]")
    private ExtendedWebElement basketBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"More-tab-item\"`]")
    private ExtendedWebElement moreBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"ProductItem\"`][%S]/XCUIElementTypeImage")
    private ExtendedWebElement product;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label contains \"%s\"`]")
    private ExtendedWebElement randomProduct;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isHomePageOpen() {
        return title.isElementPresent();
    }

    @Override
    public BasketPageBase clickBasketBtn() {
        basketBtn.click();
        return initPage(getDriver(), BasketPageBase.class);

    }

    @Override
    public ProductPageBase clickRandomProduct(String title) {
        if (swipe(randomProduct.format(title), 10)) {
            randomProduct.format(title).click();
        }
        //return initPage(getDriver(), ProductPageBase.class);
        return initPage(getDriver(), ProductPageBase.class);
    }

    public ProductPage clickProductByIndex(String title) {
        if (swipe(product.format((title), 10), 50, 50)) {
            product.format(title).click();

        }
        return new ProductPage(getDriver());

    }

    public ProductPage clickProductImg(String title) {
        product.format(title).click();
        return new ProductPage(getDriver());
    }

    public MorePage clickMoreBtn() {
        moreBtn.click();
        return new MorePage(getDriver());
    }

}



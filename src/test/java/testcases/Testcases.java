package testcases;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.MainPage;
import util.Util;

public class Testcases extends BaseClass {

    MainPage mainPage;
    Util util;

    public Testcases() {
        mainPage = new MainPage(driver);
        util = new Util();

    }

    @Test
    public void searchTv() {
        util.waitForElement(mainPage.searchBar,10);
        mainPage.searchBar.click();
        mainPage.searchTextBar.sendKeys("LG TV");
        util.waitForElement(mainPage.tv,10);
        mainPage.tv.click();
        util.waitForElement(mainPage.smartTv,10);
        util.scrollToElement(mainPage.smartTv);
        mainPage.smartTv.click();
        util.waitForElement(mainPage.addToCartBtn,10);
        util.scrollToElement(mainPage.addToCartBtn);
        mainPage.addToCartBtn.click();
        driver.navigate().back();
        util.waitForElement(mainPage.basketIcon,10);
        mainPage.basketIcon.click();
        util.waitForElement(mainPage.proceedToCheckoutBtn, 10);
        mainPage.proceedToCheckoutBtn.click();
    }
}

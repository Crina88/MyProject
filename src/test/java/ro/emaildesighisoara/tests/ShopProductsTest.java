package ro.emaildesighisoara.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ro.emaildesighisoara.pages.CartPage;
import ro.emaildesighisoara.pages.ShopProductsPage;
import static ro.emaildesighisoara.pages.ShopProductsPage.Shop_URL;

public class ShopProductsTest extends BaseTest{
    @Test
    public void shopProductsTest() {
        driver.get(Shop_URL);
        ShopProductsPage shopProductsPage = new ShopProductsPage(driver);
        waitForNumberOfSeconds(3);
        shopProductsPage.clickButtonShopBuy();
        waitForNumberOfSeconds(2);
        shopProductsPage.clickEnamelledVessels();
        shopProductsPage.clickClassicBowl();
        waitForNumberOfSeconds(1);
        shopProductsPage.clickCaramelColorButton();
        shopProductsPage.clickAddToCartButton();
        waitForNumberOfSeconds(3);
        shopProductsPage.clickCloseButton();
        waitForNumberOfSeconds(2);
        shopProductsPage.clickHomePage();
        waitForNumberOfSeconds(4);
        shopProductsPage.clickEnamelledPot();
        waitForNumberOfSeconds(2);
        shopProductsPage.clickPinkButton();
        shopProductsPage.clickAdditionButton();
        waitForNumberOfSeconds(1);
        shopProductsPage.clickAddToCart();
        waitForNumberOfSeconds(3);
        shopProductsPage.clickShoppingCartElement();


        CartPage cartPage = new CartPage(driver);
        waitForNumberOfSeconds(3);
        Assert.assertTrue(cartPage.checkIfClassicEnameledBowlIsDisplayed());
        Assert.assertTrue(cartPage.checkIfCreamCaramelColorIsDisplayed());
        Assert.assertTrue(cartPage.checkIfOnePieceIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDeepEnameledBowlIsDisplayed());
        Assert.assertTrue(cartPage.checkIfOpalPinkColorIsDisplayed());
        Assert.assertTrue(cartPage.checkIfTwoPiecesIsDisplayed());

    }
}

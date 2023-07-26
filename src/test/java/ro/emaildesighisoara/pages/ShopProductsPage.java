package ro.emaildesighisoara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopProductsPage extends BasePage{
    public static String Shop_URL = BASE_URL;
    public ShopProductsPage(WebDriver driver) {super(driver);}

    @FindBy (className = "t-buy") private WebElement buttonShopBuy;
    @FindBy(xpath = "//div[@class='tab-content']//span") private WebElement enamelledVessels;
    @FindBy(className = "product-item-link") private WebElement classicBowl;
    @FindBy(xpath = "//div[@class='swatch-opt']//div[@class='swatch-option color'][1]") private WebElement greenButton;
    @FindBy(xpath = "//div[@class='actions']//span") private WebElement addToCartButton;
    @FindBy(className= "mfp-close") private WebElement closeButton;
    @FindBy(xpath ="//div[@class='breadcrumbs']//a") private WebElement homePage;
    @FindBy(xpath = "//div[@class= 'info-box']//a[@href='https://shop.emaildesighisoara.ro/vase-emailate/bol-adanc']") private WebElement enamelPot;
    @FindBy(xpath ="//div[@class='swatch-opt']//div[@option-label='Roz opal']") private WebElement pinkButton;
    @FindBy(xpath = "//div[@class='control']//span[@class='edit-qty plus']")private WebElement additionButton;
    @FindBy(xpath = "//div[@class='actions']//span[text()='Adăugați în coș']")private WebElement addToCart;
    @FindBy(xpath = "//div[@class='mfp-content']//button") private WebElement shoppingCartElement;
    @FindBy(xpath= "//strong[@class= 'product-item-name']/a[contains(@href, '/bol-clasic') and not(@data-bind)]") private WebElement classicEnameledBowl;

    public void clickButtonShopBuy(){buttonShopBuy.click();}
    public void clickEnamelledVessels(){enamelledVessels.click();}
    public void clickClassicBowl(){classicBowl.click();}
    public void clickGreenButton(){greenButton.click();}
    public void clickAddToCartButton(){addToCartButton.click();}
    public void clickCloseButton(){closeButton.click();}
    public void clickHomePage(){homePage.click();}
    public void clickEnamelledPot(){enamelPot.click();}
    public void clickPinkButton(){pinkButton.click();}
    public void clickAdditionButton(){additionButton.click();}
    public void clickAddToCart(){addToCart.click();}
    public void clickShoppingCartElement(){shoppingCartElement.click();}



}

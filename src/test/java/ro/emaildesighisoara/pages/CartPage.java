package ro.emaildesighisoara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//strong[@class= 'product-item-name']/a[contains(@href, '/bol-clasic') and not(@data-bind)]")
    private WebElement classicEnameledBowl;
    @FindBy(xpath = "//dl[@class='item-options']//dd[contains(text(), ' Crem caramel')]")
    private WebElement creamCaramelColor;
    @FindBy(xpath = "//div[@class='control qty']//input")
    private WebElement onePiece;
    @FindBy(xpath = "//strong[@class= 'product-item-name']/a[contains(@href, '/bol-adanc') and not(@data-bind)]")
    private WebElement deepEnameledBowl;
    @FindBy(xpath = "//dl[@class='item-options']//dd[text()=' Roz opal ']")
    private WebElement opalPinkColor;
    @FindBy(xpath = "//div[@class='control qty']//input[@value='2']")
    private WebElement twoPieces;


    public boolean checkIfClassicEnameledBowlIsDisplayed() {
        return classicEnameledBowl.isDisplayed();
    }

    public boolean checkIfCreamCaramelColorIsDisplayed() {
        return creamCaramelColor.isDisplayed();
    }

    public boolean checkIfOnePieceIsDisplayed() {
        return onePiece.isDisplayed();
    }

    public boolean checkIfDeepEnameledBowlIsDisplayed() {
        return deepEnameledBowl.isDisplayed();
    }

    public boolean checkIfOpalPinkColorIsDisplayed() {
        return opalPinkColor.isDisplayed();
    }

    public boolean checkIfTwoPiecesIsDisplayed() {
        return twoPieces.isDisplayed();
    }
}


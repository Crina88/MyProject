package ro.emaildesighisoara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage extends BasePage{
    public static String FILTERS_URL = BASE_URL;
    public FiltersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "t-buy") private WebElement buttonShop;
    @FindBy(xpath = "//div[@class='category-product-actions']//span[@class='icon pe-7s-edit']") private WebElement buttonFilters;
    @FindBy(xpath = "//li[@class='item']/a[contains(@href, 'capacity=69')]") private WebElement twoLiters;
    @FindBy(xpath = "//li[@class= 'item']/a[contains(@href, 'capacity=69&diameter=84')]") private WebElement twoHundredDiameter;
    @FindBy(xpath = "//li[@class= 'item']/a[contains(@href, 'capacity=69&diameter=84&length=100')]") private WebElement seventyFourHigh;
    @FindBy(xpath = "//div[@class='swatch-attribute swatch-layered color']//div[@option-label='Gri']") private WebElement greyColor;
    @FindBy(xpath = "//h5[@class='product name product-item-name']//a")private WebElement literEnamelSaucepan;
    @FindBy(xpath = "//div[@class='swatch-attribute color']//div[@aria-checked='true']") private WebElement greyColorSelect;
    @FindBy(xpath = "//div[@class='technical-details']//span[text()='Detalii tehnice']") private WebElement technicalDetails;
    @FindBy(xpath = "//div[@class='technical-details']//span[text()='2']") private WebElement potCapacity;
    @FindBy(xpath = "//div[@class='technical-details']//span[text()='200']") private WebElement potDiameter;
    @FindBy(xpath = "//div[@class='technical-details']//span[text()='74']") private WebElement potHigh;

    public void clickButtonShop(){buttonShop.click();}
    public void clickButtonFilters(){buttonFilters.click();}
    public void clickTwoLiters(){twoLiters.click();}
    public void clickTwoHundredDiameter(){twoHundredDiameter.click();}
    public void clickSeventyFourHigh(){seventyFourHigh.click();}
    public void clickgreyColor(){greyColor.click();}
    public void clickLiterEnamelSaucepan(){literEnamelSaucepan.click();}
    public boolean checkIfLiterEnamelSaucepanIsDisplayed(){return literEnamelSaucepan.isDisplayed();}
    public boolean checkIfGreyColorSelectIsSelected(){return greyColorSelect.isDisplayed();}
    public boolean checkIfTechnicalDetailsIsDisplayed(){return technicalDetails.isDisplayed();}
    public int getPotCapacity(){ return Integer.valueOf(potCapacity.getText());}
    public int getPotDiameter(){return Integer.valueOf(potDiameter.getText());}
    public int getPotHigh(){return Integer.valueOf(potHigh.getText());}



}

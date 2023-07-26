package ro.emaildesighisoara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAccountPage extends BasePage{
    public static String LOGIN_URL = BASE_URL;
    public LoginAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "t-buy") private WebElement shopBuy;
    @FindBy(className = "pe-7s-user") private WebElement menuButton;
    @FindBy(xpath = "//div[@class='dropdown-menu']//a[contains(text(), 'Contul meu')]") private WebElement myAccountButton;
    @FindBy(xpath = "//div[@class='control']//input") private WebElement emailInputField;
    @FindBy(id = "pass") private WebElement passwordInputField;
    @FindBy(xpath= "//div[@class='actions-toolbar padding-top10']//span") private WebElement connectButton;

    public void clickShopBuy(){shopBuy.click();}
    public void clickMenuButton(){menuButton.click();}
    public void clickMyAccountButton(){myAccountButton.click();}
    public void enterEmail(String email){emailInputField.sendKeys(email);}
    public void enterPassword(String password){passwordInputField.sendKeys(password);}
    public void clickConnectButton(){connectButton.click();}



}

package ro.emaildesighisoara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerAccountPage extends BasePage {
    public static String CUSTOMER_URL = BASE_URL + "customer/account";

    public CustomerAccountPage(WebDriver driver) {
        super(driver);}
        @FindBy(className = "title") private WebElement browsingTheAccount;

        public boolean checkIsBrowsingTheAccountIsPresent(){return browsingTheAccount.isDisplayed();}

    }

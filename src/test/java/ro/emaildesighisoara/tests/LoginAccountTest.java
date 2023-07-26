package ro.emaildesighisoara.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ro.emaildesighisoara.pages.CustomerAccountPage;
import ro.emaildesighisoara.pages.LoginAccountPage;

import static ro.emaildesighisoara.pages.LoginAccountPage.LOGIN_URL;

public class LoginAccountTest extends BaseTest{
    @Test
    public void loginAccountTest(){
        driver.get(LOGIN_URL);
        LoginAccountPage createAccountPage = new LoginAccountPage(driver);
        waitForNumberOfSeconds(3);
        createAccountPage.clickShopBuy();
        waitForNumberOfSeconds(2);
        createAccountPage.clickMenuButton();
        createAccountPage.clickMyAccountButton();
        waitForNumberOfSeconds(1);
        createAccountPage.enterEmail("divirician_crina@yahoo.com");
        createAccountPage.enterPassword("Cr198812!");
        createAccountPage.clickConnectButton();

        CustomerAccountPage customerAccountPage = new CustomerAccountPage(driver);
        Assert.assertTrue(customerAccountPage.checkIsBrowsingTheAccountIsPresent());
    }
}


package ro.emaildesighisoara.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ro.emaildesighisoara.pages.FiltersPage;

import static ro.emaildesighisoara.pages.FiltersPage.FILTERS_URL;

public class FiltersTest extends BaseTest{
    @Test
    public void filtersTest(){
        driver.get(FILTERS_URL);
        FiltersPage filtersPage = new FiltersPage(driver);
        waitForNumberOfSeconds(3);
        filtersPage.clickButtonShop();
        filtersPage.clickButtonFilters();
        filtersPage.clickTwoLiters();
        filtersPage.clickButtonFilters();
        waitForNumberOfSeconds(2);
        filtersPage.clickTwoHundredDiameter();
        filtersPage.clickButtonFilters();
        waitForNumberOfSeconds(2);
        filtersPage.clickSeventyFourHigh();
        filtersPage.clickButtonFilters();
        waitForNumberOfSeconds(2);
        filtersPage.clickgreyColor();

        Assert.assertTrue(filtersPage.checkIfLiterEnamelSaucepanIsDisplayed());
        waitForNumberOfSeconds(2);
        Assert.assertTrue(filtersPage.checkIfGreyColorSelectIsSelected());
        filtersPage.clickLiterEnamelSaucepan();
        Assert.assertTrue(filtersPage.checkIfTechnicalDetailsIsDisplayed());
        Assert.assertEquals(filtersPage.getPotCapacity(), 2, "Pot capacity is not as expected");
        Assert.assertEquals(filtersPage.getPotDiameter(),200,"Pot diameter is not as expected");
        Assert.assertEquals(filtersPage.getPotHigh(),74,"Pot high is not as expected");

    }
}

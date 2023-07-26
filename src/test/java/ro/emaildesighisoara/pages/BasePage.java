package ro.emaildesighisoara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    protected final static String BASE_URL="https://emaildesighisoara.ro/";


    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}

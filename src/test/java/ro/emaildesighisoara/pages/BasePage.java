package ro.emaildesighisoara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    protected final static String BASE_URL="https://emaildesighisoara.ro/";


    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}

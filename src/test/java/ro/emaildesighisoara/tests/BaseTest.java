package ro.emaildesighisoara.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

   @BeforeMethod(alwaysRun = true)
    public void setUp(){
        ChromeOptions setOptions = setupOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, setOptions);
        capabilities.merge(setOptions);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(setOptions);
        driver.manage().window().maximize();
    }

   protected ChromeOptions setupOptions() {
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--incognito");
       return options;
   }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
       driver.manage().deleteAllCookies();
       driver.close();
    }
    public void waitForNumberOfSeconds(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }


}

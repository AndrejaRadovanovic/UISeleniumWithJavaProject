package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import static helper.Constants.BASEURL;

public class TestsSetUp extends PagesSetUp {
    private WebDriver driver;


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        initPages(driver);
        driver.manage().window().maximize();
        driver.get(BASEURL);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    public String getTheCurrentPageUrl(){
        return driver.getCurrentUrl();
    }
}

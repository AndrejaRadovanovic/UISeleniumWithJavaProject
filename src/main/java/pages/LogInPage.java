package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;

    private By UserNameInput = By.id("user-name");
    private By PasswordInput = By.id("password");
    private By LogInButton = By.id("login-button");
    private By ErrorField = By.xpath("//h3[@data-test='error']");

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    public void logIn(String username, String password)
    {
        driver.findElement(UserNameInput).sendKeys(username);
        driver.findElement(PasswordInput).sendKeys(password);
        driver.findElement(LogInButton).click();
    }
    public String getErrorMessage()
    {
        return driver.findElement(ErrorField).getText();
    }

}

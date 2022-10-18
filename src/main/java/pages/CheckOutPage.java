package pages;

import models.CheckOutDto;
import models.ItemDto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;


    private By FirstNameInput = By.xpath("//input[@data-test='firstName']");
    private By LastNameInput = By.xpath("//input[@data-test='lastName']");
    private By PostalCodeInput = By.xpath("//input[@data-test='postalCode']");
    private By ContinueButton = By.xpath("//input[@data-test='continue']");
    private By CartQuantity = By.cssSelector(".cart_quantity");
    private By ItemDescription = By.cssSelector(".inventory_item_desc");
    private By ItemName = By.cssSelector(".inventory_item_name");
    private By ItemPrice = By.cssSelector(".inventory_item_price");
    private By FinishButton = By.xpath("//button[@data-test='finish']");
    private By CheckOutCompleteField = By.xpath("//span[contains(text(),'Checkout: Complete!')]");

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsersDataAndContinueCheckoutFlow(CheckOutDto checkOutDto){
        driver.findElement(FirstNameInput).sendKeys(checkOutDto.FirstName);
        driver.findElement(LastNameInput).sendKeys(checkOutDto.LastName);
        driver.findElement(PostalCodeInput).sendKeys(checkOutDto.PostalCode);

        driver.findElement(ContinueButton).click();
    }
    public void finishCheckoutProcess(){
        driver.findElement(FinishButton).click();
    }

    public boolean checkOutCompleteElementDisplayed(){
        return driver.findElement(CheckOutCompleteField).isDisplayed();
    }
    public ItemDto getCartItemInfo(){
        return new ItemDto(
                driver.findElement(ItemName).getText(),
                driver.findElement(ItemDescription).getText(),
                driver.findElement(ItemPrice).getText(),
                driver.findElement(CartQuantity).getText()
        );
    }

}

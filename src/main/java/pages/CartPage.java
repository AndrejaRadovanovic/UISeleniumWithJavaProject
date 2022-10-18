package pages;

import models.ItemDto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By CartQuantity = By.cssSelector(".cart_quantity");
    private By ItemDescription = By.cssSelector(".inventory_item_desc");
    private By ItemName = By.cssSelector(".inventory_item_name");
    private By ItemPrice = By.cssSelector(".inventory_item_price");
    private By ContinueShoppingButton = By.xpath("//button[@data-test='continue-shopping']");
    private By CheckOutButton = By.xpath("//button[@data-test='checkout']");


    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public ItemDto getCartItemInfo(){
        return new ItemDto(
                driver.findElement(ItemName).getText(),
                driver.findElement(ItemDescription).getText(),
                driver.findElement(ItemPrice).getText(),
                driver.findElement(CartQuantity).getText()
        );
    }

    public void continueShopping(){
        driver.findElement(ContinueShoppingButton).click();
    }
    public void checkOut(){
        driver.findElement(CheckOutButton).click();
    }

}

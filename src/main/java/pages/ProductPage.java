package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By AddToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private By ShoppingCart = By.xpath("//span[@class='shopping_cart_badge']");
    private By Cart = By.cssSelector(".shopping_cart_link");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductPage addItemToCart(){
        driver.findElement(AddToCartButton).click();
        return this;
    }
    public int getNumberOfItemsInCart(){
        String itemsInCart =driver.findElement(ShoppingCart).getText();
        return Integer.parseInt(itemsInCart);
    }
    public void goToCart(){
        driver.findElement(Cart).click();
    }

}

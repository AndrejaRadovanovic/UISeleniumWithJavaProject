package pages;

import org.openqa.selenium.WebDriver;

public class PagesSetUp {
    public static LogInPage logInPage;
    public static InventoryPage inventoryPage;
    public static ProductPage productPage;
    public static CartPage cartPage;
    public static CheckOutPage checkOutPage;

    public static void initPages(WebDriver driver){
        logInPage = new LogInPage(driver);
        inventoryPage = new InventoryPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }
}

package pages;

import models.ItemDto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class InventoryPage {
    private WebDriver driver;

    private By SortButton = By.xpath("//select[@data-test='product_sort_container']");
    private By SortOptionLowToHi = By.xpath("//select[@data-test=\"product_sort_container\"]//option[@value=\"lohi\"]");
    private By ProductPrices = By.xpath("//div[@class=\"inventory_list\"]/div//div[@class=\"inventory_item_price\"]");
    private By FirstProductInInventoryList = By.xpath("//div[@class='inventory_list']/div[1]");
    private By FirstProductInInventoryListName = By.xpath("//div[@class=\"inventory_list\"]/div[1]//div[@class=\"inventory_item_name\"]");
    private By FirstProductInInventoryListPrice = By.xpath("//div[@class=\"inventory_list\"]/div[1]//div[@class=\"inventory_item_price\"]");
    private By FirstProductInInventoryListDescription = By.xpath("//div[@class=\"inventory_list\"]/div[1]//div[@class=\"inventory_item_desc\"]");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }
    public void sortItemsLowToHi(){
        driver.findElement(SortButton).click();
        driver.findElement(SortOptionLowToHi).click();
    }

    public List<Float> getAllInventoryListItemPrices()
    {
        List<Float> results = new ArrayList<Float>();
        List<WebElement> priceElements = driver.findElements(ProductPrices);
        for (WebElement element:priceElements) {
            results.add(Float.parseFloat(element.getText().replace("$", "")));
        }
        return results;
    }
    public void selectFirstProductInInventoryList(){
        driver.findElement(FirstProductInInventoryList).click();
    }
    public ItemDto getFirstItemInInventoryListInfo(){
        return new ItemDto(
                driver.findElement(FirstProductInInventoryListName).getText(),
                driver.findElement(FirstProductInInventoryListDescription).getText(),
                driver.findElement(FirstProductInInventoryListPrice).getText(),
                "1"
                );
    }


}

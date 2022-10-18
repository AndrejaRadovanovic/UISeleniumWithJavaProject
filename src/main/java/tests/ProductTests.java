package tests;

import helper.Constants;
import models.ItemDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class ProductTests extends TestsSetUp {
    @Test
    public void sortProductTest() {
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        inventoryPage.sortItemsLowToHi();
        List<Float> actualPrices = inventoryPage.getAllInventoryListItemPrices();

        List<Float> sortedPrices = new ArrayList<Float>(actualPrices);
        Collections.sort( sortedPrices );
        Assert.assertEqualsNoOrder(actualPrices, sortedPrices);
    }
    @Test
    public void addProductToCartTest(){
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        inventoryPage.selectFirstProductInInventoryList();
        productPage.addItemToCart();
        int actualNumberOfItemsInCart = productPage.getNumberOfItemsInCart();
        Assert.assertEquals(actualNumberOfItemsInCart, 1);
    }
}

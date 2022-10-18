package tests;

import helper.AssertHelper;
import helper.Constants;
import models.ItemDto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends TestsSetUp {
    @Test
    public void itemInCartTest() {
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        ItemDto expectedItemInCart = inventoryPage.getFirstItemInInventoryListInfo();
        inventoryPage.selectFirstProductInInventoryList();
        productPage.addItemToCart().goToCart();
        ItemDto actualItemInCart = cartPage.getCartItemInfo();
        AssertHelper.assertAllCartItemsParameters(expectedItemInCart, actualItemInCart);
    }
    @Test
    public void continueShoppingTest(){
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        inventoryPage.selectFirstProductInInventoryList();
        productPage.addItemToCart().goToCart();
        cartPage.continueShopping();
        Assert.assertEquals(getTheCurrentPageUrl(), Constants.INVENTORYPAGEURL);
        int actualNumberOfItems = productPage.getNumberOfItemsInCart();
        Assert.assertEquals(1, actualNumberOfItems);

    }
}

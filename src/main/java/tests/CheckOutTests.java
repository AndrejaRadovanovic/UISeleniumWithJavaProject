package tests;

import helper.AssertHelper;
import helper.Constants;
import models.CheckOutDto;
import models.CheckOutDtoWithData;
import models.ItemDto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTests extends TestsSetUp{
    @Test
    public void checkOutTest() {
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        ItemDto expectedItemInCart = inventoryPage.getFirstItemInInventoryListInfo();
        inventoryPage.selectFirstProductInInventoryList();
        productPage.addItemToCart().goToCart();
        cartPage.checkOut();
        Assert.assertEquals(getTheCurrentPageUrl(), Constants.CHECKOUTPAGEURL);

        CheckOutDto checkOutDto= new CheckOutDtoWithData("", "", "");
        checkOutPage.enterUsersDataAndContinueCheckoutFlow(checkOutDto);
        ItemDto actualItemInCartDto = checkOutPage.getCartItemInfo();
        AssertHelper.assertAllCartItemsParameters(expectedItemInCart, actualItemInCartDto);
    }
    @Test
    public void finishCheckOutProcessTest()
    {
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        inventoryPage.selectFirstProductInInventoryList();
        productPage.addItemToCart().goToCart();
        cartPage.checkOut();
        CheckOutDto checkOutDto= new CheckOutDtoWithData("", "", "");
        checkOutPage.enterUsersDataAndContinueCheckoutFlow(checkOutDto);
        checkOutPage.finishCheckoutProcess();
        Assert.assertEquals(getTheCurrentPageUrl(), Constants.FINISHPAGEURL);
        Assert.assertTrue(checkOutPage.checkOutCompleteElementDisplayed());
    }
}

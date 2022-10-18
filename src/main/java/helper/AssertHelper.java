package helper;

import models.ItemDto;
import org.testng.Assert;

public class AssertHelper {
    public static void assertAllCartItemsParameters(
            ItemDto expected,
            ItemDto actual
    )
    {
        Assert.assertEquals(expected.CartQuantity, actual.CartQuantity);
        Assert.assertEquals(expected.ItemName, actual.ItemName);
        Assert.assertEquals(expected.ItemDescription, actual.ItemDescription);
        Assert.assertEquals(expected.ItemPrice, actual.ItemPrice);
    }
}

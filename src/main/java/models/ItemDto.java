package models;

public class ItemDto {
    public String ItemName;
    public String ItemDescription;
    public String ItemPrice;
    public String CartQuantity;

    public ItemDto(String itemName, String itemDescription, String itemPrice, String cartQuantity) {
        ItemName = itemName;
        ItemDescription = itemDescription;
        ItemPrice = itemPrice;
        CartQuantity = cartQuantity;
    }


}

package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Products which was added to basket*/
@Entity(tableName = "basket_items")
public class BasketItem {
    //ID of item that was added to basket
    @PrimaryKey(autoGenerate = true)
    public int basketItemId;

    //Basket to which basketItem belongs to
    public int basketId;

    //ID of product that was added to basket
    public int productId;

    //Product quantity
    public int quantity;

    /*Constructor for inserting data*/
    public BasketItem(int basketId, int productId, int quantity) {
        this.basketId = basketId;
        this.productId = productId;
        this.quantity = quantity;
    }

}

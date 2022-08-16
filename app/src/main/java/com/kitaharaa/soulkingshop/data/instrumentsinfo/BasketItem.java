package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Products which was added to basket*/
@Entity(tableName = "basket_items")
public class BasketItem {
    @PrimaryKey(autoGenerate = true)
    public int basketItemId;

    public int basketId;

    public int productId;

    public int quantity;

    public BasketItem(int basketId, int productId, int quantity) {
        this.basketId = basketId;
        this.productId = productId;
        this.quantity = quantity;
    }

}

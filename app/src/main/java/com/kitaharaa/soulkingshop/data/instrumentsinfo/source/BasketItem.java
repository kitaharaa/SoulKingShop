package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Products which was added to basket*/
@Entity
public class BasketItem {
    @PrimaryKey
    public int basketItemId;

    public int basketId;

    public int productId;

    public int quantity;

}

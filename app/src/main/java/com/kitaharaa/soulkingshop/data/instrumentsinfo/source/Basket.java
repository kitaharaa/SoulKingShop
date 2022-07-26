package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Basket {
    @PrimaryKey
    public int basketId;

    public int userId;

    public int productId;

    public int quantity;
}

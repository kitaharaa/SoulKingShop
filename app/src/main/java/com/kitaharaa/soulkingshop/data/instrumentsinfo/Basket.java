package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*A bunch of product which will be a part of Order*/
@Entity(tableName = "baskets")
public class Basket {
    @PrimaryKey(autoGenerate = true)
    public int basketId;

    public int userId;

    public Basket(int userId) {
        this.userId = userId;
    }
}

package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*A bunch of product which will be a part of Order*/
@Entity(tableName = "baskets")
public class Basket {
    //Basket ID
    @PrimaryKey(autoGenerate = true)
    public int basketId;

    //Id of user who owns the basket
    public int userId;

    /*Constructor for inserting data*/
    public Basket(int userId) {
        this.userId = userId;
    }
}

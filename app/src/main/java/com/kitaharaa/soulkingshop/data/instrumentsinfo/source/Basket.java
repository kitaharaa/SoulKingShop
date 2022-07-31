package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*A bunch of product which will be a part of Order*/
@Entity
public class Basket {
    @PrimaryKey
    public int basketId;

    public int userId;
}

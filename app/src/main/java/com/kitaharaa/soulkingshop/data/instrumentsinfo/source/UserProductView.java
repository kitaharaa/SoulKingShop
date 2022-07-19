package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserProductView {
    @PrimaryKey
    public int userProductViewId;

    public int userId;

    public int productId;
}

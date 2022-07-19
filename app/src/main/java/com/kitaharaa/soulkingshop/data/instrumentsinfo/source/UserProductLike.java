package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserProductLike {
    @PrimaryKey
    public int userProductLikeId;

    public int userId;

    public int productId;
}

package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

@Entity
public class Basket {
    @PrimaryKey
    public int basketId;

    public int userId;

    public int productId;

    public int quantity;

    public static class UserAndBasket {
        @Embedded
        public User user;
        @Relation(
                parentColumn = "userId",
                entityColumn = "userId"
        )
        public Basket basket;
    }
}

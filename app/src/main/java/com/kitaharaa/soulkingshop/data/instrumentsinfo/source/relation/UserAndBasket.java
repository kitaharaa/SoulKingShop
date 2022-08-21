package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Basket;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.User;

public class UserAndBasket {
    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userId"
    )
    public Basket basket;
}


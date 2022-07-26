package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Order;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.User;

public class UserAndOrder {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userId"
    )
    public Order order;
}

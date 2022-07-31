package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Order;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.User;

import java.util.List;

public class UserWithOrders {
    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userId"
    )
    public List<Order> orders;
}

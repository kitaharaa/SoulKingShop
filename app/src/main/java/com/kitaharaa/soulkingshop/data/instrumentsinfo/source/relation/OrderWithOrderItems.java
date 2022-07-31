package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Order;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.OrderItem;

import java.util.List;

public class OrderWithOrderItems {
    @Embedded public Order order;
    @Relation(
            parentColumn = "orderId",
            entityColumn = "orderId"
    )
    public List<OrderItem> orderItems;
}

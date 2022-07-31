package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.OrderItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;

import java.util.List;

public class ProductWithOrderItems {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "productId"
    )
    public List<OrderItem> orderItems;
}

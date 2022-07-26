package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.OrderItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;

public class ProductAndOrderItem {
    @Embedded
    public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "productId"
    )
    public OrderItem orderItem;
}

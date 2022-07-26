package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.UserProductView;

public class ProductAndUserProductView {
    @Embedded
    public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "productId"
    )
    public UserProductView userProductView;
}

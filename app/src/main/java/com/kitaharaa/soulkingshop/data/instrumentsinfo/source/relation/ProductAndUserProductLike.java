package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.UserProductLike;

public class ProductAndUserProductLike {
    @Embedded
    public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "productId"
    )
    public UserProductLike userProductLike;
}

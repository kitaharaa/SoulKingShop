package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.BasketItem;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;

import java.util.List;

public class ProductWithBasketItems {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "productId"
    )
    public List<BasketItem> basketItems;
}
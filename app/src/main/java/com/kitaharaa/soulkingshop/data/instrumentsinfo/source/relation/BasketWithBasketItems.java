package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Basket;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.BasketItem;

import java.util.List;

public class BasketWithBasketItems {
    @Embedded public Basket basket;
    @Relation(
            parentColumn = "basketId",
            entityColumn = "basketId"
    )
    public List<BasketItem> basketItems;
}

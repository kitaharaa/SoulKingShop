package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Category;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;

public class CategoryAndProduct {
    @Embedded
    public Category category;
    @Relation(
            parentColumn = "categoryId",
            entityColumn = "categoryId"
    )
    public Product product;
}

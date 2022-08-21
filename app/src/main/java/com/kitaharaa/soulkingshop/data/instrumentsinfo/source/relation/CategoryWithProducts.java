package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Category;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.Product;

import java.util.List;

public class CategoryWithProducts {
    @Embedded public Category category;
    @Relation(
            parentColumn = "categoryId",
            entityColumn = "categoryId"
    )
    public List<Product> products;
}

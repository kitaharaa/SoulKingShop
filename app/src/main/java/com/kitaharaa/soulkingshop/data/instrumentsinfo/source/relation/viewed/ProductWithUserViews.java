package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.viewed;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref.UserProductViewCrossRef;

import java.util.List;

/*Viewed product by users*/
public class ProductWithUserViews {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "userId",
            associateBy = @Junction(UserProductViewCrossRef.class)
    )
    public List<User> users;
}

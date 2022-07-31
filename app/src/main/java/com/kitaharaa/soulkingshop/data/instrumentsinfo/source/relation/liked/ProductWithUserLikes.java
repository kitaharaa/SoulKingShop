package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.liked;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref.UserProductLikeCrossRef;

import java.util.List;

/*Liked product by users*/
public class ProductWithUserLikes {
    @Embedded public Product product;
    @Relation(
            parentColumn = "productId",
            entityColumn = "userId",
            associateBy = @Junction(UserProductLikeCrossRef.class)
    )
    public List<User> users;
}

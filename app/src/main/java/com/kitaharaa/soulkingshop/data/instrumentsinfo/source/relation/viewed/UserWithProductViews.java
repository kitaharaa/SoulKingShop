package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.viewed;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref.UserProductViewCrossRef;

import java.util.List;

/*Viewed products bu User*/
public class UserWithProductViews {
    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "productId",
            associateBy = @Junction(UserProductViewCrossRef.class)
    )
    public List<Product> products;
}

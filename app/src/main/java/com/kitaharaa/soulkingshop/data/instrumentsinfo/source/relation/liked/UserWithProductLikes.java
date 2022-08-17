package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.liked;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.Product;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref.UserProductLikeCrossRef;
import java.util.List;

/*Liked products by User*/
public class UserWithProductLikes {
    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "productId",
            associateBy = @Junction(UserProductLikeCrossRef.class)
    )
    public List<Product> products;
}

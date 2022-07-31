package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref;

import androidx.room.Entity;

@Entity(primaryKeys = {"userId", "productId"})
public class UserProductViewCrossRef {
    public int userid;

    public int productId;
}

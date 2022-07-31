package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation.crossref;

import androidx.room.Entity;

@Entity(primaryKeys = {"userId", "productId"})
public class UserProductLikeCrossRef {
    public int userId;

    public int productId;
}

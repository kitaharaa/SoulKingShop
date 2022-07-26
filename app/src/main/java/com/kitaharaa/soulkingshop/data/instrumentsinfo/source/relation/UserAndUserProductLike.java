package com.kitaharaa.soulkingshop.data.instrumentsinfo.source.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.User;
import com.kitaharaa.soulkingshop.data.instrumentsinfo.source.UserProductLike;

public class UserAndUserProductLike {
    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userId"
    )
    public UserProductLike userProductLike;
}

package com.kitaharaa.soulkingshop.data.instrumentsinfo.source;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*User information*/
@Entity
public class User {
    @PrimaryKey
    public int userId;

    public String name;

    public String email;

    public byte[] picture;
}

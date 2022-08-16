package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/*User information*/
@Entity(tableName = "users")
public class User {
    @PrimaryKey(autoGenerate = true)
    public int userId;

    public String name;

    public String email;

    public byte[] picture;

    public User(String name, String email, byte[] picture){
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    @Ignore
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}

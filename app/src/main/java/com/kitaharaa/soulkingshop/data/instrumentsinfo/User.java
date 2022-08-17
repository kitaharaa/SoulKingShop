package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/*User information*/
@Entity(tableName = "users")
public class User {
    //User ID
    @PrimaryKey(autoGenerate = true)
    public int userId;

    //User name
    public String name;

    //User email
    public String email;

    //User photo
    public byte[] picture;

    /*Constructor for inserting data*/
    public User(String name, String email, byte[] picture){
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    /*Constructor for inserting data without picture*/
    @Ignore
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}

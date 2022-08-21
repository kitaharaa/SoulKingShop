package com.kitaharaa.soulkingshop.data.instrumentsinfo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Product category*/
@Entity(tableName = "categories")
public class Category {
    //Category ID
    @PrimaryKey(autoGenerate = true)
    public int categoryId;

    //Category name
    public String name;

    //Category picture
    public byte[] picture;

    /*Constructor for inserting data*/
    public Category(String name, byte[] picture) {
        this.name = name;
        this.picture = picture;
    }
}
